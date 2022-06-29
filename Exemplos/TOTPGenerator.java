import java.math.BigInteger;
import java.security.GeneralSecurityException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.stereotype.Component;


public class TOTPGenerator {

	private static final int[] DIGITS_POWER = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000 };
	private static long TIMESTEP_MILLISECONDS = 60000;
	private static final String HMACSHA1_CRYPTO = "HmacSHA1";
	private static final int TOTP_SIZE = 6;

	public byte[] generateTOTP(byte[] secretKey) {

		String steps = getTimeSteps(System.currentTimeMillis());

		String result = null;

		while (steps.length() < 16)
			steps = "0" + steps;

		byte[] msg = hexStr2Bytes(steps);
		byte[] hash = hmac_sha(HMACSHA1_CRYPTO, secretKey, msg);

		int offset = hash[hash.length - 1] & 0xf;

		int binary = ((hash[offset] & 0x7f) << 24) | ((hash[offset + 1] & 0xff) << 16)
				| ((hash[offset + 2] & 0xff) << 8) | (hash[offset + 3] & 0xff);

		int otp = binary % DIGITS_POWER[TOTP_SIZE];

		result = Integer.toString(otp);
		while (result.length() < TOTP_SIZE) {
			result = "0" + result;
		}

		return result.getBytes();
	}

	private static String getTimeSteps(long fixedTime) {
		long time = fixedTime / TIMESTEP_MILLISECONDS;
		return Long.toHexString(time).toUpperCase();
	}

	private static byte[] hexStr2Bytes(String hex) {
		byte[] bArray = new BigInteger("10" + hex, 16).toByteArray();

		byte[] ret = new byte[bArray.length - 1];
		for (int i = 0; i < ret.length; i++)
			ret[i] = bArray[i + 1];

		return ret;
	}

	private static byte[] hmac_sha(String crypto, byte[] keyBytes, byte[] text) {
		try {
			Mac hmac = Mac.getInstance(crypto);
			SecretKeySpec macKey = new SecretKeySpec(keyBytes, "RAW");
			hmac.init(macKey);
			return hmac.doFinal(text);
		} catch (GeneralSecurityException gse) {
			throw new UndeclaredThrowableException(gse);
		}
	}

}

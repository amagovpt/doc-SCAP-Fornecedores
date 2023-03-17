
# Documentação técnica relativa ao Sistema de Certificação de Atributos Profissionais - vertente Fornecedor de Atributos


## Introdução
O Sistema de Certificação de Atributos Profissionais possibilita a associação da identidade eletrónica de um cidadão (expressa nos certificados digitais no chip do Cartão do Cidadão e Chave Móvel Digital) aos papéis que o mesmo desempenha na sociedade.

Este sistema permite que, através da autenticação ou assinatura eletrónica de documentos, sejam certificados um conjunto de atributos (qualidades) que o cidadão tem e lhe estão atribuídos por Entidades Fornecedoras de Atributos. 

Mais informação sobre Sistema de Certificação de Atributos Profissionais (SCAP) em https://www.autenticacao.gov.pt/web/guest/a-autenticacao-de-profissionais.

Este repositório contêm a documentação técnica relativamente ao Sistema de Certificação de Atributos Profissionais na vertente de Fornecedor de Atributos.

## Estrutura da documentação

* Na pasta **Documentação Administrativa** disponibiliza-se documento com informação relativamente ao tipo de certificado a adquirir.
* A pasta **Guidelines** contém um documento que elenca as guidelines de integração necessárias para certificação enquanto fornecedor de atributos.
* Na pasta **WSDL** encontram-se as descrições dos web services em formato xml:
	* A pasta **SCAPAttributeRequestService** contém a descrição do web service de pedido de consulta de atributos.
	* A pasta **SCAPAttributeResponseService** contém a descrição do web service de resposta de atributos.
	* A pasta **versões deprecadas** contém descrições deprecadas dos web services acima mencionados.
* Na pasta **iAP-VPN** disponibilizam-se os documentos com os requisitos necessários para a ligação VPN sobre internet e requisitos técnicos para utilização da plataforma de interoperabilidade da administração pública.
* A pasta **Exemplos** contém exemplos de pedidos e respostas dos web services e também um exemplo de geração de OTP em java.
	* A pasta **versões deprecadas** contém exemplos de pedidos e respostas das versões deprecadas dos web services. 
* [Manual de Integração para Fornecedores de Atributos (download pdf)](https://amagovpt.github.io/doc-SCAP-Fornecedores/SCAP&#32;-&#32;Manual&#32;de&#32;Integração&#32;para&#32;Fornecedores&#32;de&#32;Atributos.pdf).

## Certificação
Para a certificação deverão ser fornecidas as seguintes evidências:
* Relatório assinado digitalmente (com LTV) com evidências de cumprimento das guidelines de integração.

Após a receção das evidências, a Agência para a Modernização Administrativa (AMA IP)  precederá à avaliação.
No processo de avaliação está previsto: 
 - Possibilidade de requisição de acesso ao sistema, para validação das evidências e esclarecimento de dúvidas.
 - Possibilidade de solicitar:
	 - Novo relatório corrigido.
	 - Evidências adicionais ou substituição das fornecidas.

**NOTA:** A configuração em ambiente produtivo é precedida da formalização de protocolo e de certificação.

## Outros recursos
A documentação técnica relativa ao Sistema de Certificação de Atributos Profissionais na vertente Consumidor de atributos está disponível em https://github.com/amagovpt/doc-SCAP-Consumidores

## Contactos
Para questões, sugestões ou comentários envie um e-mail para eid@ama.pt.
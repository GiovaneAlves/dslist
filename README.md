# DSList

- __Projeto:__ Elaborar toda aplicação back-end de um sistema de coleção de games.

- __Objetivo:__ Desenvolver através do curso de Java Spring os conhecimentos da linguagem, juntamento com a utilização dos framework. 

- __Descrição:__ A aplicação foi criada respeitando às 3 camadas, sendo a camada de _controller_, _service_ e _repository_.
Foram feito consultas no banco H2 e também pela API Postman. 
  - Na camada de controller, ficam os componentes responsáveis por receber as solicitações HTTP da interface do usuário ou de outras aplicações e direcioná-las para a camada de serviço adequada. Essa camada também pode ser responsável pela validação de entrada e pela transformação de dados de entrada e saída.

  - Na camada de service, ficam os componentes que contêm a lógica de negócios da aplicação. Eles podem utilizar os serviços da camada de acesso a dados para recuperar e persistir informações do banco de dados e retornar os resultados para a camada de controller.

  - Na camada de repository, ficam os componentes responsáveis pelo acesso ao banco de dados. Eles fornecem uma interface para as operações de leitura e gravação de dados, como consulta, inserção, atualização e exclusão.

- Ambientação local com o Docker compose. Procecesso de Homologação local. 

- Foram feito testes no H2 e no postman. Além de uma implementação na nuvem pelo Railway, com uma esteira de CI/CD.

- Endpoint especial para movimentação dos games na lista.


### __Ferramentas utilizadas:__
---
- __Eclipse:__ é uma IDE (Integrated Development Environment) amplamente utilizada para desenvolver programas em Java. Ele fornece um ambiente de desenvolvimento completo que inclui recursos de edição de código, depuração, testes e compilação, além de plugins para outras linguagens de programação.

- __Visual Studio Code:__ é um editor de código-fonte gratuito e de código aberto, desenvolvido pela Microsoft. Ele suporta várias linguagens de programação e inclui recursos como depuração, controle de código-fonte e gerenciamento de extensões.

- __JUnit:__ é um framework de teste de unidade para a linguagem de programação Java. Ele permite criar testes automatizados para verificar se as diferentes partes do código funcionam corretamente e ajudam a detectar erros de forma rápida e eficiente.

- __Git:__ é um sistema de controle de versão distribuído amplamente utilizado para gerenciar mudanças no código-fonte. Ele permite que várias pessoas trabalhem no mesmo projeto simultaneamente, gerenciando conflitos e controlando o histórico de alterações.

- __GitHub:__ é uma plataforma de hospedagem de código-fonte e colaboração que fornece recursos como controle de versão, rastreamento de problemas e gerenciamento de projetos. Ele permite que os desenvolvedores compartilhem e colaborem em projetos de código-fonte aberto e privados.

- __GitDesktop:__ é uma ferramenta de interface gráfica de usuário para gerenciamento de repositórios Git. Ele simplifica a utilização do Git, permitindo que os desenvolvedores visualizem e gerenciem as alterações no código-fonte de forma mais intuitiva.

- __Spring Boot:__ é uma estrutura popular para desenvolvimento de aplicativos Java. Ele simplifica o processo de criação de aplicativos Java, fornecendo uma configuração padrão e permitindo que os desenvolvedores se concentrem na lógica de negócios em vez de na configuração do ambiente.

- __Postman:__ é uma ferramenta de teste de API que permite testar, documentar e compartilhar APIs. Ele fornece uma interface gráfica de usuário para enviar solicitações HTTP e verificar as respostas, além de permitir que os desenvolvedores documentem e compartilhem as APIs com outras pessoas.

- __Docker:__ é uma plataforma de software que permite criar, implantar e executar aplicativos em contêineres de software. Ele fornece uma maneira de empacotar um aplicativo e suas dependências em um contêiner, garantindo a portabilidade do aplicativo em diferentes ambientes. Ele também permite que vários aplicativos compartilhem um mesmo sistema operacional, reduzindo o consumo de recursos e melhorando a eficiência.
<br><br>

##### *_Requisição DTO no Postman_*
![Requisição dto](image/Requisi%C3%A7%C3%A3o.png)
<br>

##### *_Implementação na nuvem_*
![Implementação na nuvem](image/Implatan%C3%A7%C3%A3%20na%20nuvem.png)
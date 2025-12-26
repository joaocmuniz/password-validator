1. Execução do Projeto:
  - Para execução do projeto, é necessário ter o Java 17 instalado;
  - Em relação ao Maven, a instalação não é necessária pois utilizei o Maven Wrapper;
  - No diretório raiz do projeto, execute o comando .\mvnw spring-boot:run

2. Decisões técnicas:
  - Utilizei as seguintes tecnologias:
    - Java 17
    - Spring Boot 3
    - Maven
    - JUnit 5
    - Mockito
    - MockMvc
  - Procurei manter as regras de negócio segregadas no domínio, seguindo alguns princípios de SOLID e Clean Arch, dividindo a estrutura em Domain, Application e Infrastructure;
  - Cada regra de validação foi implementada como uma classe independente que implementa a interface PasswordRule. Dessa forma, o acoplamento de novas regras é facilitado. Aqui, vale destacar que procurei seguir os princípios de TDD, escrevendo os testes antes de escrever as regras.

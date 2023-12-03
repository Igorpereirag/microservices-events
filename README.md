# Sistema de Inscrições em Eventos com Spring Boot

Este repositório contém o código-fonte de um microserviço desenvolvido em Java com o framework Spring Boot. O objetivo é simular o funcionamento de um sistema de inscrições em eventos, proporcionando uma solução robusta e escalável para a gestão de eventos.

## Funcionalidades

- **Lista de Eventos:** O aplicativo fornece uma API REST para acessar a lista de eventos disponíveis, incluindo informações sobre a descrição do evento e a quantidade máxima de participantes permitidos.

- **Inscrição em Eventos:** Os usuários podem se inscrever em eventos através de endpoints específicos da API, respeitando a quantidade máxima de participantes.

- **Envio de E-mail de Confirmação:** Após a inscrição, os participantes receberão automaticamente um e-mail de confirmação, utilizando recursos do Spring Mail.

## Pré-requisitos

Certifique-se de ter os seguintes requisitos instalados antes de executar o aplicativo:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (versão 8 ou superior)
- [Maven](https://maven.apache.org/download.cgi)

## Configuração

Antes de iniciar o aplicativo, configure as informações de envio de e-mails no arquivo `application.properties`:

```properties
spring.mail.host=seu_servidor_de_email
spring.mail.port=sua_porta_de_email
spring.mail.username=seu_usuario_de_email
spring.mail.password=sua_senha_de_email
```

Mantenha essas informações seguras e não as compartilhe publicamente.

## Executando o Aplicativo

Execute o seguinte comando para iniciar o aplicativo:

```bash
mvn spring-boot:run
```

O aplicativo estará acessível em `http://localhost:8080`. Você pode usar ferramentas como [Postman](https://www.postman.com/) ou [curl](https://curl.se/) para interagir com a API REST.

## Contribuição

Contribuições são bem-vindas! Consulte o arquivo [CONTRIBUTING.md](CONTRIBUTING.md) para obter informações sobre como contribuir para este projeto.

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE.md](LICENSE.md) para obter detalhes.

---

**Nota:** Este é um projeto fictício criado para fins de demonstração e aprendizado, utilizando Spring Boot para o desenvolvimento Java.
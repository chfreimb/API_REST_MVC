# API REST com Arquitetura MVC
Esta é uma API RESTful desenvolvida em Java com Spring Boot, estruturada no padrão MVC clássico.
A aplicação gerencia Pedidos, permitindo operações CRUD completas, além de consultas específicas.

**Arquitetura (MVC)**

**Controller**: Camada que expõe os endpoints REST e processa requisições HTTP.

**Service**: Contém as regras de negócio e orquestra as operações.

**Repository**: Responsável pelo acesso a dados (Spring Data JPA).

**Model/Entity**: Estruturas de dados que representam o domínio (Pedido).

**View**: Não aplicável neste caso, pois a aplicação expõe apenas API REST.
***

## **Estrutura de Pastas**
A estrutura de pastas principal pode ser encontrada [aqui](https://github.com/chfreimb/API_REST_MVC/tree/main/src/main/java/com/pedidoMVCCaio/API_Pedidos):
```
📦 src/main/java/com/pedidoMVCCaio/API_Pedidos
 ┣ 📂 controller
 ┃ ┗ 📜 PedidoController.java
 ┃
 ┣ 📂 model
 ┃ ┣ 📂 entity
 ┃ ┃ ┗ 📜 Pedido.java
 ┃ ┃ 
 ┃ ┣ 📂 repository
 ┃ ┃ ┗ 📜 PedidoRepository.java
 ┃ ┃ 
 ┃ ┗ 📂 service
 ┃   ┗ 📜 PedidoService.java
 ┃ 
 ┗ 📜 API_Pedidos.java
```
***

## **Tecnologias Utilizadas**

* Java 17+

* Spring Boot 3+

* Spring Web

* Spring Data JPA

* H2 Database (dev/test)

* Maven
***

**Como Executar**

* Clonar o repositório

* Compilar e rodar a aplicação

* A aplicação estará disponível para teste na porta `http://localhost:8080`

* A aplicação pode ser testada Pelo Swagger através do link abaixo ou através do Postman usando o endpoint `http://localhost:8080/v1/pedidos`
  
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

***
## **Endpoints Disponíveis**

| Método | Endpoint                     | Descrição                          |
|--------|------------------------------|------------------------------------|
| GET    | `/pedidos`                   | Lista todos os pedidos             |
| GET    | `/pedidos/{id}`              | Busca pedido por **ID**            |
| GET    | `/pedidos/numeroPedido/{n}`  | Busca pedidos por **número**       |
| GET    | `/pedidos/count`             | Retorna a contagem de pedidos      |
| POST   | `/pedidos`                   | Cria um novo pedido                |
| DELETE | `/pedidos/{id}`              | Remove pedido por **ID**           |


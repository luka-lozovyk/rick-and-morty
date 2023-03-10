# Rick-and-Morty-app
___
![img_1.png](img_1.png) 

## 📝 Description
___
    This web application is a damonstration of working with third-party api. You can get an info about 
    randomly generated character, or get a list of characters by name part.  Also, application supports
    scheduled fetching to local DB, in case data was modified on the API.

## 💻 Technologies
___
| **Technology** | **Version** |
|----------------|-------------|
| JDK            | 17          |
| Maven          | 4.0.0       |
| Spring Boot    | 2.5.9       |
| Postgres       | 15          |
| Swagger        | 2.7.0       |
| Liquibase      | -           |

* Implemented following N-tire architecture and SOLID principles

## ⚙️Set up and run an application locally
___
1. Clone this project
2. Install PostgreSQL and set properties in [application.properties](https://github.com/luka-lozovyk/rick-and-morty/blob/e304c7986951e0b746475b35664e73d6de5fe98c/src/main/resources/application.properties#L1)
3. Run application 
4. Follow [this link](http://localhost:8080/swagger-ui.html#/) to test features in Swagger 
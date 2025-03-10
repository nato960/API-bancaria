# Banco NotBank
Java RESTful API criada para atender ao banco fictício NotBank

## Diagrama de Classes

``` mermaid
classDiagram
    class User {
        - String name
        - Account account
        - Feature[] features
        - Card card
        - News[] news
    }

    class Account {
        - String number
        - String balance
        - String limit
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String number
        - String limit
    }

    class News {
        - String icon
        - String description
    }

    User *-- > Account
    User "1" *--"N" Feature : has many
    User "1" *--"N" Card
    User"1" *--"N" News : has many

```

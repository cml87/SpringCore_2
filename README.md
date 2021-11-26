### Spring Core 2
# Spring Framework: Spring Fundamentals
By Bryan Hansen **pluralsight**

This is the course on Spring Core on _pluralsight_. It will cover:
- Java Configuration
- Autowiring
- Advanced Bean Configuration

among other topics.

After this course we may continue the Spring learning track with the _pluralsight_ courses
- Spring MVC
- Spring Data JPA
- Spring Security

We'll build a Conference Registration App, focusing in modeling and wiring.

## What is Spring?
Spring started out just and IoC (**Inversion of Control**) container, a technique also called dependency injection. It was conceived to reduce or replace some of the complex configuration in early Java EE applications. **_Later_**, Spring started to build around building enterprise applications without EJBs. They initially were just figuring out how to work better with EJBs, but then discovered that EJBs were actually not needed for a lot of situations.

Dependency injection is removing hard coded wiring in our app. and using a framework to inject dependencies and resources where they are needed.

Spring can essentially be used with or without EJBs, but nowadays it is primarily used without them. No needs of EJBs means no need of an application server, such as Wildfly. So Spring allows developing enterprise applications without an application server. Spring only need a web server, and by defaults uses Tomcat (easy to use and lightweight). Before Spring it was not easy to have enterprise features in an application deployed in Tomcat. 

<u>Spring is completely POJO based and interface driven</u>. Springs uses AOP and Proxies to apply things as transactions to our code to get those 'cross cutting concerns' ? out of our code, producing smaller and lightweight applications.

Spring is built around best practices. It uses well known Design Patterns such as Singleton, Factory, Abstract Factory. Template method is used a lot.

**What problems Spring solves?**
1. Increases Testability
2. Increases Maintainability
3. Helps with Scalability
4. Helps with decoupling
5. Helps in reducing code complexity
6. Helps in focusing in the business logic

Spring allows reducing this
```java
public Car getById(String id) {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        String sql = "select * from CAR where ID = ?";
        con = DriverManager.getConnection("localhost:3306/cars");
        stmt = con.prepareStatement(sql);
        stmt.setString(1, id);
        rs = stmt.executeQuery();
        if (rs.next()) {
            Car car = new Car();
            car.setMake(rs.getString(1));
            return car;
        } else {
            return null;
        }
    } catch (SQLException e) { e.printStackTrace();}
    finally {
        try {
            if(rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (Exception e) {}
    }
    return null;
}
```
to this 
```java
// Spring JDBC template method
public Car findCar(String id) {
    return getEntityManager().find(Car.class, id);
}
```
This is business focus !

Spring allow three types of configuration:
1. Annotation based configuration
2. Xml based configuration
3. Java based configuration

In Spring, the **Application Context** is the configured Spring IoC container with all our dependencies wired up in it. It is mainly a hashmap of objects.

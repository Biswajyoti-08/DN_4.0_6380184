🧠 Objective
This Spring application demonstrates how to configure and retrieve beans using XML-based configuration. It covers:

Basic Spring Bean creation

Singleton and Prototype scopes

Injecting a list of beans using <list> and <ref>

Retrieving beans from ApplicationContext

Logging with SLF4J

📁 Project Structure
css
Copy
src/
├── main/
│   ├── java/
│   │   └── com/cognizant/spring_learn/
│   │       ├── SpringLearnApplication.java
│   │       └── model/
│   │           └── Country.java
│   └── resources/
│       └── country.xml
🧾 Features Demonstrated
Country Bean

Contains code and name properties

Debug logging in constructor, getters, and setters

Singleton vs Prototype Scope

By default, Spring beans are Singleton

Setting scope="prototype" creates a new object every time getBean() is called

List of Beans

countryList bean is created using <list> of references to individual Country beans

🛠 How to Run
Make sure country.xml is in src/main/resources

Run the SpringLearnApplication class

Logs will show:

Constructor calls (indicating instance creation)

Property setter calls

Whether Singleton or Prototype scope is used

List of countries retrieved

⚙️ Key Spring Concepts
<bean>: Declares a Spring-managed object

id: Unique identifier of the bean

class: Fully qualified class name to instantiate

<property>: Sets the value for a bean’s property

<list>: Used to inject a collection of beans or values

<ref>: Refers to another bean declared in the XML

ApplicationContext: Spring's central interface for accessing beans

ClassPathXmlApplicationContext: Loads context from XML in classpath

🧪 Example Output (Singleton Scope)
pgsql
Copy
DEBUG - Inside Country Constructor.
DEBUG - Inside setCode() with value: SG
DEBUG - Inside setName() with value: Singapore
DEBUG - Country 1: Country [code=SG, name=Singapore]
DEBUG - Country 2: Country [code=SG, name=Singapore]
DEBUG - Are both references the same? true
📚 Dependencies
Spring Core (5.x or 6.x)

SLF4J (Logging)

Logback or Log4J for logging backend


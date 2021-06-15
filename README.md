# Automation Practice Test Project with Selenium WebDriver + Java

#### Prerequisites
- Have JDK installed on the machine
- Have maven installed on the machine
- Have Java and Maven environment variables set on machine
- Download the project to the machine in directory "C:"

#### Run project
1. Run the project open cmd
2. Change directory to "C:\automationPractice"
3. Run the mvn clean command:
```sh
mvn clean
```
4. Run mvn test command:
```sh
mvn test
```
##### Run separate features
Run LoginTest:
```sh
mvn -Dtest=LoginTest test
```
Run RegisterCustomerTest:
```sh
mvn -Dtest=RegisterCustomerTest test
```
Run SearchTest:
```sh
mvn -Dtest=SearchTest test
```
Run CartTest:
```sh
mvn -Dtest=CartTest test
```
Run CheckoutTest:
```sh
mvn -Dtest=CheckoutTest test
```
#### View BDDS
Access the following path "C:\automationPractice\src\test\resources\features"
- LoginTest.feature
- RegisterCustomerTest.feature
- SearchTest.feature
- CartTest.feature
- CheckoutTest.feature

#### View logs
Access the following path "C:\automationPractice\target\surefire-reports"
- tests.LoginTest.txt
- TEST-tests.LoginTest.xml
- tests.RegisterCustomerTest.txt
- TEST-tests.RegisterCustomerTest.xml
- tests.SearchTest.txt
- TEST-tests.SearchTest.xml
- tests.CartTest.txt
- TEST-tests.CartTest.xml
- tests.CheckoutTest.txt
- TEST-tests.CheckoutTest.xml
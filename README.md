### Описание
Образец проекта с использованием:
- Java 1.8
- Maven
- Junit 4
- Allure

### Подключение Allure к проекту

В файл 'pom.xml' добавить:
1. Зависимость 'allure-junit4'
2. В секцию 'maven-surefire-plugin':
- в 'argLine' добавить -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"

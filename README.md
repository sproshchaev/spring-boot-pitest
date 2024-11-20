# spring-boot-pitest

Пример мутационного тестирования 

```txt
mvn clean
mvn test pitest:mutationCoverage
```
Результаты: 
```txt
target
├── classes                         
├── generated-sources                
├── generated-test-sources           
├── maven-archiver                   
├── maven-status                   
└── pit-reports                     # Отчёты о мутационном тестировании
    ├── index.html                  # Основной отчёт в формате HTML (основной индексный файл)
    ├── style.css                   
    └── com.prosoft
        ├── StringProcessorService.java.html  # Детальный отчёт для класса StringProcessorService.java
        └── index.html                        # Отчёт для конкретного класса или теста в формате HTML

```
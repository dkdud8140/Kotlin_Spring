# Kotilin Spring Boot Project

## JPA( Java Persistence API, Architecture)
* 일반적인 DBMS CRUD는 SQL을 기반으로 한다
* 가급적 SQL을 적게 사용하기 위하여 mybatis 등의 도구를 사용하기도 하지만  
    완전하게 SQL을 사용하지 않을 수는 없다
* JPA는 최소한 기본 CRUD는 아무런 SQL의 도움없이 구현할 수 있게 만드는 기술이다.
* ORM(object-relational Mapping)의 개념을 Spring에 도입한 것이다.
* DB도 마치 메모리에 변수, 객체를 저장하는 것과 같은 방법으로 기본 class를 사용하여 구현하고자 하는 기술
* JPA는 말 그대로 기술적인 개념이다. Spring 에소는 JPA를 구현하기 위하여 interface 차원에서만 지원한다
* 보통은 JPA와 함꼐 Hibernate라는 구현체를 함께 사용한다,
* boot에서는 Hibernate는 JPA에 포함되어 구현된다.

### jQuery import
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="http://code.jquery.com.jquery-latest.min.js></script>
#끄적이는 공부장

그동안 여러가지 일들을 보내면서 다시 의미있는 프로젝트를 하며 실력을 늘리고 싶은 마음에 다시 포스팅 시작

---

Spring으로 상생몰 퍼블리싱한거에 백을 붙히면서 내가 공부하는 것들을 작성할 예정

단지 나의 공부를 위한 글 작성

정보 제공을 위한 글이 아니므로 '아 얘는 이렇게 했구나로 참고 부탁'

---

1. Spring Project 만들기  
   https://start.spring.io/ Spring Project를 편리하게 만들게도와주는 사이트
    
* Gradle Projcet(코끼리가 좋앙)
* Java Language
* Spring boot version = 2.4.12 선택
* Group, Artifact set
* Packaging = Jar
* java-version = java11
    
2. Dependency 설정
* Spring Web
* Thymeleaf (Spring View Template)
* Spring Data JPA
* Lombok
* MySql Driver
* Validation


---
```
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-validation'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	runtimeOnly 'mysql:mysql-connector-java'
	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

```

---
3. MySql 설정
   
[참고 블로그](https://memostack.tistory.com/163#toc-%EC%8A%A4%ED%82%A4%EB%A7%88%20%EC%83%9D%EC%84%B1)

Spring boot & MySql 연동 참고함


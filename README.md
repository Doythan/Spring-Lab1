# Spring Boot 게시판 CRUD 프로젝트

Spring Boot를 사용하여 게시판 CRUD 기능을 구현한 학습 프로젝트입니다.  
서블릿부터 Spring 핵심 개념, 그리고 실습까지 체계적으로 정리하며 개발 역량을 강화했습니다.

## 프로젝트 정보

- **프로젝트 명**: springv1
- **패키지 경로**: `com.mtcoding.springv1`
- **개발 환경**:
    - **JDK**: OpenJDK 21
    - **Gradle**: Groovy
    - **Spring Boot**: 최신 버전 (start.spring.io 기반)
    - **패키징 방식**: Jar
- **추가된 종속성 (Dependencies)**:
    - Spring Web
    - Mustache
    - H2 Database
    - Spring Data JPA
    - Lombok

## 학습 목차 및 실습 내용

1. **Spring 사전 개념**
    - 소켓, 버퍼, HTTP 통신 구조 등 백엔드 통신 이해

2. **서블릿 기초**
    - Apache, Tomcat과 WAS 구조
    - 서블릿 기반 요청/응답 흐름 이해

3. **Spring 입문**
    - 스프링 프로젝트 초기 세팅 및 구조 파악
    - IoC와 DI 개념 학습

4. **Spring MVC 흐름**
    - HTTP 요청과 응답 구조
    - Controller, Service, Repository 계층 구조

5. **게시판 CRUD 구현**
    - 게시글 목록 조회
    - 게시글 상세 조회
    - 게시글 등록
    - 게시글 수정
    - 게시글 삭제

6. **DB 연동**
    - H2 Database를 활용한 데이터 연동 실습
    - JPA와 Repository 패턴 적용

7. **Service Layer 설계**
    - 비즈니스 로직 분리
    - DTO 객체를 활용한 계층 간 데이터 전달

8. **테스트 코드 작성**
    - 단위 테스트 및 통합 테스트 실습
    - 테스트 작성 패턴 학습

9. **트랜잭션 및 고립 수준(Isolation)**
    - 쿼리 트랜잭션 처리 방식 이해
    - 고립 수준에 따른 데이터 무결성 보장 방식 학습

## 프로젝트 목적

Spring Boot 백엔드의 구조를 이해하고, 실무에서 사용되는 CRUD 패턴과 계층 구조 설계, 트랜잭션 처리, 테스트 작성 등의 핵심 개념을 직접 실습하며 학습하기 위함입니다.

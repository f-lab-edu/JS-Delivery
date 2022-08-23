# JS-Delivery

## 📌 branch
```text
- main
- develop
- feature/7
- setting/mybatis
- soom
```


## 📜 개발 일지

#### ~ 220817
```text
team
- file structure

Soom
- 환경구축
  - docker 연결
  - db 구축
  - git - jenkins 연결
- jwt 의존성 추가
- jwt 개발 ing

Jin
- 환경구축
- mybatis 의존성 추가
```
#### 220818
```text
team
- 

Soom
- jwt 개발 ing

Jin
- 
```

## ✨Structure
```text
api-server-spring-boot
  > build
  > gradle
  > src.main.java.com.flab.jsdelivery
    > config
      | WebSecurityConfig.java // spring-boot-starter-security, jwt 를 사용하기 위한 클래스 
      > secret
        | Secret.java // git에 추적되지 않아야 할 시크릿 키 값들이 작성되어야 하는 곳
    > controller
      | MemberController.java
    > dao
      | MemberDao.java
    > dto
      | MemberDTO.java 
    > service
      | MemberService.java
    > utils
      | JwtService.java // jwt 관련 클래스
    | JsdeliveryApplication // SpringBootApplication 서버 시작 지점
  > resources
    | application.yml // Database 연동을 위한 설정 값 세팅 및 Port 정의 파일
    | logback-spring.xml // logger 사용시 console, file 설정 값 정의 파일
build.gradle // gradle 빌드시에 필요한 dependency 설정하는 곳
.gitignore // git 에 포함되지 않아야 하는 폴더, 파일들을 작성 해놓는 곳
```
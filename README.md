# JS-Delivery

## π branch
```text
- main
- develop
- feature/7
- setting/mybatis
- soom
```


## π κ°λ° μΌμ§

#### ~ 220817
```text
team
- file structure

Soom
- νκ²½κ΅¬μΆ
  - docker μ°κ²°
  - db κ΅¬μΆ
  - git - jenkins μ°κ²°
- jwt μμ‘΄μ± μΆκ°
- jwt κ°λ° ing

Jin
- νκ²½κ΅¬μΆ
- mybatis μμ‘΄μ± μΆκ°
```
#### 220825
```text
team
- 

Soom
- 

Jin
- Mybatis μ μ©
- Owner JWT λ‘κ·ΈμΈ κ΅¬ν ing 
```

## β¨Structure
```text
api-server-spring-boot
  > build
  > gradle
  > src.main.java.com.flab.jsdelivery
    > config
      | WebSecurityConfig.java // spring-boot-starter-security, jwt λ₯Ό μ¬μ©νκΈ° μν ν΄λμ€ 
      > secret
        | Secret.java // gitμ μΆμ λμ§ μμμΌ ν  μν¬λ¦Ώ ν€ κ°λ€μ΄ μμ±λμ΄μΌ νλ κ³³
    > controller
      | MemberController.java
    > dao
      | MemberDao.java
    > dto
      | MemberDTO.java 
    > service
      | MemberService.java
    > utils
      | JwtService.java // jwt κ΄λ ¨ ν΄λμ€
    | JsdeliveryApplication // SpringBootApplication μλ² μμ μ§μ 
  > resources
    | application.yml // Database μ°λμ μν μ€μ  κ° μΈν λ° Port μ μ νμΌ
    | logback-spring.xml // logger μ¬μ©μ console, file μ€μ  κ° μ μ νμΌ
build.gradle // gradle λΉλμμ νμν dependency μ€μ νλ κ³³
.gitignore // git μ ν¬ν¨λμ§ μμμΌ νλ ν΄λ, νμΌλ€μ μμ± ν΄λλ κ³³
```

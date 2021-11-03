# ReadBook Project V3 with Spring Security

* 2021-11-01
* 똑소리 나는 독서록 프로젝트에 Spring Security를 적용하여 로그인 기능 구현
* Spring Security를 적용하면 로그인, 로그인 후 session 관리등을 좀 더 편리하게 구현할 수 있다  
Spring Security는 초기 설정이 다소 어렵고 불편하지만, 초기 설정이 잘 되면 상당 부분을 개발자가 직접 핸들링 하지 않고도 인가, 인증, 권한설정 등을 쉽게 할 수 있다.

## Secirity 관련된 용어 정리
* 인증(Authentication) : username, password를 사용하여 허가된 사용자 인가를 판별하는 것
* 인가(Athorization) : 로그인된 사용자에게 권한을 허락(부여)하는 것
* 권한설정(Athority, Role) : 안증받은 사용자의 인가 정보를 확인하여 접근할 수 있는 곳(페이지)

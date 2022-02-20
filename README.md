# Toy Project - NJ
---
1. 해당 프로젝트는 가산을 탈출하기 위한 NJ의 Level up을 위한 Toy Project이다.
2. 사용한 기술스택은 다음과 같다.
   * spring boot 2.6.3
   * sdk(jdk) openjdk 11
   * gradle 7.2
   * mysql 8.0.20
3. 프로젝트 구성은 Gradle Multi Project 방식으로 구성되어 있다.
4. API 서비스 개발 rule
   * 모든 api 서비스의 컨트롤러는 @RestController annotation을 클래스 상단에 선언
   * @RestController를 사용하는 API의 경우 리턴타입을 ApiResult.java 클래스를 사용해 리턴
   * REST API URL 규칙을 준수하여 URL 정의 (계층구조, CamelCase아닌 하이폰 사용)
   * API를 통해 조회되는 오브젝트의 키값 등은 PathVariable을 이용해 명시
   
REST의 개념

- HTTP 프로토콜에 있는 Method를 활용한 아키텍쳐 스타일
- HTTP Method를 통해서 Resource를 처리
- CRUD를 통한 Resource 조작을 할 때 사용

HTTP Method			동작				URL형태
-----------------------------------------
GET 			조회(SELECT*READ)	/user/{id}
POST			생성(CREATE)			/user
PUT/PATCH		수정(UPDATE)*CREATE	/user
DELETE			삭제(DELETE)			/user/{1}
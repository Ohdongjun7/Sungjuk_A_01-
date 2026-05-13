```mermaid
classDiagram
    class 교수 {
        -교수id: String
        +교수체크(교수id: String) boolean
    }

    class 성적 {
        -학생id: String
        -자바: int
        -DB: int
        -보안: int
        -총점: int
        -평균: double
        +성적입력(교수id: String, 학생id: String, 자바: int, DB: int, 보안: int) void
        +학점조회(교수id: String) String
    }

    교수 "1" <-- "0..*" 성적 : 입력/조회
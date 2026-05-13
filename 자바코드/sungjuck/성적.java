package sungjuck;

public class 성적 {
    private String 학생id;
    private int 자바;
    private int DB;
    private int 보안;
    private int 총점;
    private double 평균;

    // 성적 입력: 교수 객체의 '교수체크' 함수를 사용하여 권한 확인
    public void 성적입력(교수 prof, String 교수id, String 학생id, int 자바, int DB, int 보안) {
        // 교수 클래스의 함수를 호출하여 체크
        if (prof.교수체크(교수id)) {
            this.학생id = 학생id;
            this.자바 = 자바;
            this.DB = DB;
            this.보안 = 보안;
            
            this.총점 = 자바 + DB + 보안;
            this.평균 = this.총점 / 3.0;
            
            System.out.println("성적 입력 성공: " + 학생id);
        } else {
            System.out.println("성적 입력 실패: 교수 권한이 없습니다.");
        }
    }

    // 학점 조회: 교수 객체의 '교수체크' 함수를 사용하여 권한 확인
    public String 학점조회(교수 prof, String 교수id) {
        // 교수 클래스의 함수를 호출하여 체크
        if (prof.교수체크(교수id)) {
            if (평균 >= 90) {
                return "A학점";
            } else if (평균 >= 80) {
                return "B학점";
            } else {
                return "C학점";
            }
        } else {
            return "조회 권한 없음";
        }
    }

    public double get평균() { return 평균; }
    public int get총점() { return 총점; }
}
package sungjuck;

public class 성적 {
    private String 학생id;
    private int 자바;
    private int DB;
    private int 보안;
    private int 총점;
    private double 평균;

    // 성적 입력 행위: 점수 저장 및 자동 계산
    public void 성적입력(String 교수id, String 학생id, int 자바, int DB, int 보안) {
        this.학생id = 학생id;
        this.자바 = 자바;
        this.DB = DB;
        this.보안 = 보안;
        
        // 총점 및 평균 계산
        this.총점 = 자바 + DB + 보안;
        this.평균 = this.총점 / 3.0;
    }

    // 학점 조회 행위: 평균 기준 학점 반환
    public String 학점조회(String 교수id) {
        if (평균 >= 90) {
            return "A학점";
        } else if (평균 >= 80) {
            return "B학점";
        } else {
            return "C학점";
        }
    }

    // 결과 출력을 위한 Getter (선택사항)
    public double get평균() { return 평균; }
    public int get총점() { return 총점; }
}

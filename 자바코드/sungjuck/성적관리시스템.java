package sungjuck;

public class 성적관리시스템 {
    public static void main(String[] args) {
        // 1. 초기 데이터 설정
        교수 professor = new 교수("inha");
        성적 score = new 성적();
        
        // 입력값 가정
        String inputId = "inha";
        String studentId = "2024001";
        int javaScore = 85;
        int dbScore = 90;
        int securityScore = 80;

        System.out.println("=== 성적 입력 프로세스 시작 ===");

        // 2. 교수 체크 (교수id를 반드시 체크)
        if (professor.교수체크(inputId)) {
            System.out.println("[인증 성공] 교수 ID가 확인되었습니다.");

            // 3. 성적 입력 및 계산
            score.성적입력(inputId, studentId, javaScore, dbScore, securityScore);
            System.out.println("성적 입력이 완료되었습니다. (총점: " + score.get총점() + ")");

            // 4. 학점 조회
            String grade = score.학점조회(inputId);
            System.out.println("학생 ID [" + studentId + "]의 조회 결과: " + grade);
            
        } else {
            // 5. 체크 실패 시
            System.out.println("[인증 실패] 교수 ID를 확인하세요.");
        }
    }
}

package sungjuck;

public class 교수 {
    private String 교수id;

    public 교수(String 교수id) {
        this.교수id = 교수id;
    }

    // 교수 ID가 "inha"인지 체크하는 행위
    public boolean 교수체크(String 교수id) {
        return "inha".equals(교수id);
    }
}

package Begin.Ex3;

public class Ex9_log {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)";
        String strary[];

        strary = log.split(" ");
//        log를 배열에 공백을 기준으로 추가

        String ip = strary[0];
//        배열의 첫번째인. 123.123.123.123을 ip로 입력
        System.out.println(ip);

        String time = strary[3].replace("[", "");
//        배열의 4번째인 [12/Apr/2018:17:03:50을 [를 제거하고 time에 입력
//        target을 replacement 로 변환(첫번재 인자를 두번째 인자로 변환)
//        sql의 mv(move) 개념?

        System.out.println(time);

    }
}

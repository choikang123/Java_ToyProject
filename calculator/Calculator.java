import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("계산을 위해 두수와 기호를 입력해주세요. ex)4 + 5");
            String line = sc.nextLine();

            // 빈칸을 기준으로 4 + 5를 나눠서 담아주기
            String[] parts = line.split(" ");
            // +는 나두고 4와 5를 정수형으로 바꿔주기
            double a= Integer.parseInt(parts[0]);
            double b = Integer.parseInt(parts[2]);
            String symbol = parts[1];

            double result = 0;

            // 향상된 switch
            switch (symbol) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
                case "%" -> result = a % b;
                default -> System.out.println("유효하지 않은 기호");
            }
            // 결과 출력
            System.out.println(result);
            System.out.println("다시 한번 입력 받으시겠습니까? (yes)/(no)");
            String isYes = sc.nextLine();
            // YES, yes , Yes 전부 받을 수 있게 수정
            if (isYes.equalsIgnoreCase("yes")) {
                continue;
            } else {
                System.out.println("계산기를 종료합니다");
                break;
            }
        }
    }
}

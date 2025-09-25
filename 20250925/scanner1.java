import java.util.Scanner;

public class scanner1 {
     public static void main(String[] args) {

        //Scanner 객체 생성하기
        Scanner scanner = new Scanner(System.in);       
        System.out.println("=== 자기소개 프로그램 ===");

        System.out.print("이름을 입력하세요: ");

        // 한 줄 전체 입력받기 (공백 포함)
        String name = scanner.nextLine();

        // 나이 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        
        // 키 입력받기
        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();


        // 결과 출력하기
        System.out.println("\n=== 당신의 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");

         // 인사말
        System.out.println("\n안녕하세요, " + name + "님! 반갑습니다! 🎉");
        add_method(scanner);
        circle_area_circumference(scanner);
        //Scanner 객체 닫기
        scanner.close();
     }

      public static void add_method(Scanner scanner1) {      
        int result;
        System.out.print("첫번째 숫자를 입력하세요: "); 
        int number1 = scanner1.nextInt();

        System.out.print("두번째 숫자를 입력하세요: "); 
        int number2 = scanner1.nextInt();
        result = number1 + number2;

        System.out.println("\n=== 간단한 덧샘 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
      }

      public static void circle_area_circumference(Scanner scanner1) {
        System.out.print("반지름을 입력하세요: ");
        double radius = scanner1.nextDouble();
        double area = radius * radius * Math.PI ;   
        double circumference = 2.0 * Math.PI * radius; // 여기에 원의 둘레구하는 코드 완료 할 것
       
        System.out.println("\n=== 원의 면적과 원의 둘레 계산 ===");
        System.out.println("\n원의 면적 : " + area + "[m^2]");     
        System.out.println("\n원의 둘레 : " + circumference + "[m]");     
      }


}

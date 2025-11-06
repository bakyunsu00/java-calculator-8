package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        int result = 0;
        SeparatorSumCalculator ssc = new SeparatorSumCalculator();

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        ssc.checkCustomSeparator(input);
        result = ssc.cal();
        System.out.println("결과 : "+result);
    }
}

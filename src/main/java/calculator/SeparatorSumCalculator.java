package calculator;


import java.util.ArrayList;
import java.util.List;


public class SeparatorSumCalculator {

    List<String> inputStrings = new ArrayList<>();
    String stringWithSeparator;
    String defaultSeparator = ",:";
    String customSeparator;
    boolean haveCustomSeparator;


    //커스텀 구분자 유무
    void checkCustom(String input){
        for (String str : input.replace("\\n", "\n").replace("//","").split("\n")) {
            inputStrings.add(str);
        }

        if (inputStrings.size() == 2) {
            customSeparator = defaultSeparator + inputStrings.get(0);
            stringWithSeparator = inputStrings.get(1);
            haveCustomSeparator = true;
        }
        else{
            stringWithSeparator = inputStrings.get(0);
        }
    }
    //계산 실행
}

package calculator;

import java.util.ArrayList;
import java.util.List;


public class SeparatorSumCalculator {

  private List<String> inputStrings = new ArrayList<>();
  private String stringWithSeparator;
  private static final String DEFAULT_SEPARATOR = ",:";
  private String customSeparator;
  private boolean haveCustomSeparator;
  private int calculateResult = 0;

  // 커스텀 구분자 유무 확인
  void checkCustomSeparator(String input) {
    try {
      for (String str : input.replace("\\n", "\n").replace("//", "").split("\n")) {
        inputStrings.add(str);
      }

      if (inputStrings.size() == 2) {
        customSeparator = DEFAULT_SEPARATOR + inputStrings.get(0);
        stringWithSeparator = inputStrings.get(1);
        haveCustomSeparator = true;
      } else if (inputStrings.size() == 1) {
        stringWithSeparator = inputStrings.get(0);
      }
    } catch (Exception e) {
      throw new IllegalArgumentException("입력값이 맞지 않습니다.");
    }
  }

  // 계산 실행
  int cal() {
      if(stringWithSeparator.equals("")){return calculateResult = 0;}

    if (haveCustomSeparator) {
      for (String element : stringWithSeparator.split("[" + customSeparator + "]")) {
        if (Integer.parseInt(element) > 0) {
          calculateResult += Integer.parseInt(element);
        } else {
          throw new IllegalArgumentException();
        }
      }
    } else {
      for (String element : stringWithSeparator.split("[" + DEFAULT_SEPARATOR + "]")) {
        if (Integer.parseInt(element) > 0) {
          calculateResult += Integer.parseInt(element);
        } else {
          throw new IllegalArgumentException();
        }
      }
    }
    return calculateResult;
  }
}

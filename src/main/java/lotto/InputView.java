package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {

    public static int getPurchaseAmount() {
        while (true) {
            try {
                System.out.println("구입금액을 입력해 주세요.");
                String inputAmount = Console.readLine();
                int amount = Integer.parseInt(inputAmount);

                Validator.validateAmount(amount);

                return amount;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<String> getWinningNumber() {
        while (true) {
            try {
                System.out.println("당첨 번호를 입력해 주세요.");
                String inputWinningNumber = Console.readLine();
                List<String> winningNumbers = Arrays.asList(inputWinningNumber.split(","));

                Validator.validateWinningNumbers(winningNumbers);
                return winningNumbers;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getBonusNumber() {
        while (true) {
            try {
                System.out.println("보너스 번호를 입력해 주세요.");
                String inputBonusNumber = Console.readLine();
                int bonusNumber = Integer.parseInt(inputBonusNumber);

                Validator.validateBonus(bonusNumber);

                return bonusNumber;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

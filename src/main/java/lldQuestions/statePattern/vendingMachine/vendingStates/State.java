package lldQuestions.statePattern.vendingMachine.vendingStates;

import lldQuestions.statePattern.vendingMachine.Coin;
import lldQuestions.statePattern.vendingMachine.Item;
import lldQuestions.statePattern.vendingMachine.VendingMachine;

import java.util.List;

public interface State {
    void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    int getChange(int returnChangeMoney) throws Exception;

    List<Coin> refundFullAmount(VendingMachine machine) throws Exception;

    void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;

}

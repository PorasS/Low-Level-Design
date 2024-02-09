package lldQuestions.statePattern.vendingMachine.vendingStates.impl;

import lldQuestions.statePattern.vendingMachine.Coin;
import lldQuestions.statePattern.vendingMachine.Item;
import lldQuestions.statePattern.vendingMachine.VendingMachine;
import lldQuestions.statePattern.vendingMachine.vendingStates.State;
import lldQuestions.statePattern.vendingMachine.vendingStates.impl.HasMoneyState;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Vending Machine Is In Idle State");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently VendingMachine Is In Idle State");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        //The state of the VM is change here when there are enough coins
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You Can Not Insert Coins In Idle State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("First You Need To Click On Insert Coins Button");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You Can Not Choose Product In Idle State");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You Can Not Get Change In Idle State");
    }

    @Override
    public List<Coin> refundFullAmount(VendingMachine machine) throws Exception {
        throw new Exception("No Refund Will Be Processed, As The Machine Is In Idle State");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}

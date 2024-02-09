package lldQuestions.statePattern.vendingMachine.vendingStates.impl;

import lldQuestions.statePattern.vendingMachine.Coin;
import lldQuestions.statePattern.vendingMachine.Item;
import lldQuestions.statePattern.vendingMachine.VendingMachine;
import lldQuestions.statePattern.vendingMachine.vendingStates.State;

import java.util.List;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Currently Vending Machine in Selection State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Not Allowed");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Not Allowed");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Not Allowed");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        //1. get item Of this codeNumber
        Item item = machine.getInventory().getItem(codeNumber);

        //2. total amount paid by user
        int paidByUser = 0;
        for (Coin coin : machine.getCoinList()) {
            paidByUser += coin.value;
        }

        //3. compare product price and the amount paid by user
        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount: " + paidByUser +
                    ", Actual Product Price: " + item.getPrice());
            refundFullAmount(machine);
            throw new Exception("Insufficient Amount");
        } else if (paidByUser >= item.getPrice()) {
            if (paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }

            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product Can Not Be Dispensed In Selection State");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Collect the Change : " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refundFullAmount(VendingMachine machine) throws Exception {
        System.out.println("Collect Full Amount: ");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Not Allowed");
    }
}

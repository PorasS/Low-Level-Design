package lldQuestions.statePattern.vendingMachine;

public class Inventory {
    ItemShelf[] inventory = null;

    public Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for (ItemShelf shelfItem : inventory) {
            if (shelfItem.getCode() == codeNumber) {
                shelfItem.setItem(item);
                shelfItem.setSoldOut(false);
            } else {
                throw new Exception("Item Is Already Present");
            }
        }
    }

    public Item getItem(int itemCode) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == itemCode) {
                return itemShelf.getItem();
            }
        }

        return null;
    }

    public void setSoldOutItem(int itemCode) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == itemCode) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}

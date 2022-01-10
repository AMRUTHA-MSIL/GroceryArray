package supermarket;

public class BonusCustomer extends SimpleCustomer {

    private supermarket.BonusCard card;

    public BonusCustomer(String nm, String usernm, String passwd) {
        super(nm,usernm,passwd);
        setCard(new supermarket.BonusCard());
    }

    public void setCard(supermarket.BonusCard cd) {
        card = cd;
    }

    public supermarket.BonusCard getCard() {
        return card;
    }

}

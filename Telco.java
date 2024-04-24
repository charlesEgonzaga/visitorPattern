package visitorPattern;

public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo) {
        return promo.showAllowance(this);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage) {
        return unliPackage.showUnliCallsTextOffer(this);
    }
}
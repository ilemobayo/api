package com.openbanking.api.ng.payload.card;
import com.openbanking.api.ng.definition.CardBrand;
import com.openbanking.api.ng.definition.CardType;
import com.openbanking.api.ng.definition.Currency;
public class CardType {
    private CardBrand cardBrand;
    private String productId;
    private com.openbanking.api.ng.definition.CardType cardType;
    private String productName;
    private Currency currency;
    private String purchasePrice;
    private int validityPeriod;
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public com.openbanking.api.ng.definition.CardType getCardType() {
        return cardType;
    }

    public void setCardType(com.openbanking.api.ng.definition.CardType cardType) {
        this.cardType = cardType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;

    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public int getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(int validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


}

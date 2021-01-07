package com.adjust.sdk;

import java.util.LinkedHashMap;
import java.util.Map;

public class AdjustPlayStoreSubscription {
    private static ILogger logger = AdjustFactory.getLogger();
    private String billingStore = "GooglePlay";
    private Map<String, String> callbackParameters;
    private String currency;
    private String orderId;
    private Map<String, String> partnerParameters;
    private long price;
    private long purchaseTime = -1;
    private String purchaseToken;
    private String signature;
    private String sku;

    public AdjustPlayStoreSubscription(long j, String str, String str2, String str3, String str4, String str5) {
        this.price = j;
        this.currency = str;
        this.sku = str2;
        this.orderId = str3;
        this.signature = str4;
        this.purchaseToken = str5;
    }

    public void addCallbackParameter(String str, String str2) {
        if (Util.isValidParameter(str, "key", "Callback") && Util.isValidParameter(str2, "value", "Callback")) {
            if (this.callbackParameters == null) {
                this.callbackParameters = new LinkedHashMap();
            }
            if (this.callbackParameters.put(str, str2) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public void addPartnerParameter(String str, String str2) {
        if (Util.isValidParameter(str, "key", "Partner") && Util.isValidParameter(str2, "value", "Partner")) {
            if (this.partnerParameters == null) {
                this.partnerParameters = new LinkedHashMap();
            }
            if (this.partnerParameters.put(str, str2) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String getBillingStore() {
        return this.billingStore;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> getCallbackParameters() {
        return this.callbackParameters;
    }

    /* access modifiers changed from: package-private */
    public String getCurrency() {
        return this.currency;
    }

    /* access modifiers changed from: package-private */
    public String getOrderId() {
        return this.orderId;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> getPartnerParameters() {
        return this.partnerParameters;
    }

    /* access modifiers changed from: package-private */
    public long getPrice() {
        return this.price;
    }

    /* access modifiers changed from: package-private */
    public long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* access modifiers changed from: package-private */
    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* access modifiers changed from: package-private */
    public String getSignature() {
        return this.signature;
    }

    /* access modifiers changed from: package-private */
    public String getSku() {
        return this.sku;
    }

    public void setPurchaseTime(long j) {
        this.purchaseTime = j;
    }
}

package com.samsung.android.sdk.customizationservice.result;

public class CustomizationServiceException extends Exception {
    public int type;

    public CustomizationServiceException(String str) {
        super(str);
        this.type = 999;
    }

    public CustomizationServiceException(String str, int i) {
        super(str);
        this.type = i;
    }
}

package com.spotify.ubi.specification.factories;

import com.adjust.sdk.Constants;

public enum MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled {
    EMAIL("email"),
    PUSH(Constants.PUSH);
    
    public final String value;

    private MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled(String str) {
        this.value = str;
    }
}

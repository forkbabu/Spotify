package com.spotify.ubi.specification.factories;

import com.adjust.sdk.Constants;

public enum MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled {
    EMAIL("email"),
    PUSH(Constants.PUSH);
    
    public final String value;

    private MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled(String str) {
        this.value = str;
    }
}

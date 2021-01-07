package com.adjust.sdk;

public interface ISdkClickHandler {
    void init(IActivityHandler iActivityHandler, boolean z);

    void pauseSending();

    void resumeSending();

    void sendPreinstallPayload(String str, String str2);

    void sendReftagReferrers();

    void sendSdkClick(ActivityPackage activityPackage);

    void teardown();
}

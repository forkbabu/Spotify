package com.adjust.sdk;

import android.content.Context;

public interface IPackageHandler {
    void addPackage(ActivityPackage activityPackage);

    void closeFirstPackage(ResponseData responseData, ActivityPackage activityPackage);

    void flush();

    String getBasePath();

    String getGdprPath();

    String getSubscriptionPath();

    void init(IActivityHandler iActivityHandler, Context context, boolean z);

    void pauseSending();

    void resumeSending();

    void sendFirstPackage();

    void sendNextPackage(ResponseData responseData);

    void teardown();

    void updatePackages(SessionParameters sessionParameters);
}

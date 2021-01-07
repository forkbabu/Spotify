package com.adjust.sdk;

public interface IRequestHandler {
    void init(IActivityHandler iActivityHandler, IPackageHandler iPackageHandler);

    void sendPackage(ActivityPackage activityPackage, int i);

    void teardown();
}

package com.spotify.libs.connect.providers;

import com.spotify.libs.connect.model.GaiaDevice;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ActiveDeviceProviderImpl$onStart$1$1 extends FunctionReferenceImpl implements nmf<GaiaDevice, Boolean> {
    public static final ActiveDeviceProviderImpl$onStart$1$1 a = new ActiveDeviceProviderImpl$onStart$1$1();

    ActiveDeviceProviderImpl$onStart$1$1() {
        super(1, GaiaDevice.class, "isActive", "isActive()Z", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(GaiaDevice gaiaDevice) {
        GaiaDevice gaiaDevice2 = gaiaDevice;
        h.e(gaiaDevice2, "p1");
        return Boolean.valueOf(gaiaDevice2.isActive());
    }
}

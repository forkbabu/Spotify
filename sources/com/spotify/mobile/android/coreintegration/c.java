package com.spotify.mobile.android.coreintegration;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.i;

public final /* synthetic */ class c implements i {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        CoreAutoShutdownHelper$AutoShutdownAction coreAutoShutdownHelper$AutoShutdownAction;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        if (!(!booleanValue && !booleanValue2 && !booleanValue3)) {
            coreAutoShutdownHelper$AutoShutdownAction = CoreAutoShutdownHelper$AutoShutdownAction.SHUTDOWN_CANCELLED;
        } else if (booleanValue4) {
            coreAutoShutdownHelper$AutoShutdownAction = CoreAutoShutdownHelper$AutoShutdownAction.SHUTDOWN_IMMEDIATE;
        } else {
            coreAutoShutdownHelper$AutoShutdownAction = CoreAutoShutdownHelper$AutoShutdownAction.SHUTDOWN_DELAYED;
        }
        Logger.g("computedAutoShutdownAction: %s as isUiInForeground=%b, hasForegroundServices=%b, hasBackgroundFeatureStackRunning=%b, isTaskRemoved=%b", coreAutoShutdownHelper$AutoShutdownAction.name(), Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2), Boolean.valueOf(booleanValue3), Boolean.valueOf(booleanValue4));
        return coreAutoShutdownHelper$AutoShutdownAction;
    }
}

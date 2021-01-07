package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class f0 extends c0 implements g0 {
    public static g0 D3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof g0 ? (g0) queryLocalInterface : new e0(iBinder);
    }
}

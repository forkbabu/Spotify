package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.dynamic.a;

public final class y {
    private static final b b = new b("DiscoveryManager");
    private final f0 a;

    y(f0 f0Var) {
        this.a = f0Var;
    }

    public final a a() {
        try {
            return this.a.w();
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "getWrappedThis", f0.class.getSimpleName());
            return null;
        }
    }
}

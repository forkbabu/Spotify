package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

public interface z extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.cast.a implements z {
        public static z D3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof z) {
                return (z) queryLocalInterface;
            }
            return new b0(iBinder);
        }
    }

    f0 g0();

    boolean o();

    k0 p();
}

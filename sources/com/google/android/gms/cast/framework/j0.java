package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

public interface j0 extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.cast.a implements j0 {
        public static j0 D3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof j0) {
                return (j0) queryLocalInterface;
            }
            return new l0(iBinder);
        }
    }

    void Y2(int i);

    boolean h();

    boolean p1();

    com.google.android.gms.dynamic.a q1();

    boolean s();

    void t1(int i);

    void y2(int i);
}

package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

public interface a extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0099a extends rt implements a {

        /* renamed from: com.google.android.gms.dynamic.a$a$a  reason: collision with other inner class name */
        public static class C0100a extends st implements a {
            C0100a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public AbstractBinderC0099a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static a D3(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C0100a(iBinder);
        }
    }
}

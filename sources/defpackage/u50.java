package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.t50;

/* renamed from: u50  reason: default package */
public interface u50 extends IInterface {

    /* renamed from: u50$a */
    public static abstract class a extends Binder implements u50 {
        public static final /* synthetic */ int a = 0;

        /* renamed from: u50$a$a  reason: collision with other inner class name */
        private static class C0686a implements u50 {
            private IBinder a;

            C0686a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // defpackage.u50
            public String L2(String str, String str2, String str3, t50 t50) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder((t50.a) t50);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.u50
            public boolean d3(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = true;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.a.transact(6, obtain, obtain2, 0)) {
                        int i2 = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.u50
            public boolean m2(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static u50 C3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.msc.sa.aidl.ISAService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof u50)) {
                return new C0686a(iBinder);
            }
            return (u50) queryLocalInterface;
        }
    }

    String L2(String str, String str2, String str3, t50 t50);

    boolean d3(int i, String str, Bundle bundle);

    boolean m2(String str);
}

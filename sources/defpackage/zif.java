package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: zif  reason: default package */
public interface zif extends IInterface {

    /* renamed from: zif$a */
    public static abstract class a extends Binder implements zif {

        /* renamed from: zif$a$a  reason: collision with other inner class name */
        private static class C0705a implements zif {
            private IBinder a;

            C0705a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // defpackage.zif
            public void G2(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.waze.IServiceAIDL");
                    obtain.writeString(str);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static zif C3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.waze.IServiceAIDL");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof zif)) {
                return new C0705a(iBinder);
            }
            return (zif) queryLocalInterface;
        }
    }

    void G2(String str);
}

package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0004a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: android.support.v4.app.a$a$a  reason: collision with other inner class name */
        private static class C0005a implements a {
            private IBinder a;

            C0005a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.support.v4.app.a
            public void Q0(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (!this.a.transact(2, obtain, null, 1)) {
                        int i2 = AbstractBinderC0004a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.v4.app.a
            public void v3(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(1, obtain, null, 1)) {
                        int i2 = AbstractBinderC0004a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a C3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0005a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    void Q0(String str, int i, String str2);

    void v3(String str, int i, String str2, Notification notification);
}

package com.waze.sdk;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: com.waze.sdk.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0584a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* access modifiers changed from: private */
        /* renamed from: com.waze.sdk.a$a$a  reason: collision with other inner class name */
        public static class C0585a implements a {
            private IBinder a;

            C0585a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.waze.sdk.a
            public boolean C2() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.waze.sdk.ISdkService");
                    boolean z = false;
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0584a.a;
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

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.waze.sdk.a
            public Messenger l1(String str, Bundle bundle, Messenger messenger) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.waze.sdk.ISdkService");
                    obtain.writeString(str);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (messenger != null) {
                        obtain.writeInt(1);
                        messenger.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0584a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Messenger) Messenger.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a C3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.waze.sdk.ISdkService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0585a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    boolean C2();

    Messenger l1(String str, Bundle bundle, Messenger messenger);
}

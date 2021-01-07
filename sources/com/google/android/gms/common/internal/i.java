package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;

public interface i extends IInterface {

    public static abstract class a extends rt implements i {

        /* renamed from: com.google.android.gms.common.internal.i$a$a  reason: collision with other inner class name */
        public static class C0098a extends st implements i {
            C0098a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.i
            public final Account a() {
                Parcel a0 = a0(2, T());
                Account account = (Account) tt.a(a0, Account.CREATOR);
                a0.recycle();
                return account;
            }
        }

        @RecentlyNonNull
        public static i D3(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof i) {
                return (i) queryLocalInterface;
            }
            return new C0098a(iBinder);
        }
    }

    @RecentlyNonNull
    Account a();
}

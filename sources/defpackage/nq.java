package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nq  reason: default package */
public interface nq extends IInterface {

    /* renamed from: nq$a */
    public static abstract class a extends hg implements nq {

        /* renamed from: nq$a$a  reason: collision with other inner class name */
        public static class C0644a extends gg implements nq {
            C0644a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // defpackage.nq
            public final Bundle j(Bundle bundle) {
                Parcelable parcelable;
                Parcel T = T();
                int i = ig.a;
                T.writeInt(1);
                bundle.writeToParcel(T, 0);
                Parcel a0 = a0(T);
                Parcelable.Creator creator = Bundle.CREATOR;
                if (a0.readInt() == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(a0);
                }
                Bundle bundle2 = (Bundle) parcelable;
                a0.recycle();
                return bundle2;
            }
        }

        public static nq C3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof nq) {
                return (nq) queryLocalInterface;
            }
            return new C0644a(iBinder);
        }
    }

    Bundle j(Bundle bundle);
}

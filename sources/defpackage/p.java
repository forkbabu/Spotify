package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.o;

/* renamed from: p  reason: default package */
public class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();
    o a;

    /* renamed from: p$a */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public p[] newArray(int i) {
            return new p[i];
        }
    }

    /* renamed from: p$b */
    class b extends o.a {
        b() {
        }

        @Override // defpackage.o
        public void J1(int i, Bundle bundle) {
            p.this.getClass();
            p.this.a(i, bundle);
        }
    }

    p(Parcel parcel) {
        o oVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = o.a.a;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof o)) {
                oVar = new o.a.C0645a(readStrongBinder);
            } else {
                oVar = (o) queryLocalInterface;
            }
        }
        this.a = oVar;
    }

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
    }

    public void b(int i, Bundle bundle) {
        o oVar = this.a;
        if (oVar != null) {
            try {
                oVar.J1(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new b();
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}

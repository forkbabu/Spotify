package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();
    final String a;
    final String b;
    final boolean c;
    final int f;
    final int n;
    final String o;
    final boolean p;
    final boolean q;
    final boolean r;
    final Bundle s;
    final boolean t;
    final int u;
    Bundle v;

    static class a implements Parcelable.Creator<u> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public u[] newArray(int i) {
            return new u[i];
        }
    }

    u(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.n;
        this.c = fragment.v;
        this.f = fragment.E;
        this.n = fragment.F;
        this.o = fragment.G;
        this.p = fragment.J;
        this.q = fragment.u;
        this.r = fragment.I;
        this.s = fragment.o;
        this.t = fragment.H;
        this.u = fragment.Y.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder T0 = je.T0(128, "FragmentState{");
        T0.append(this.a);
        T0.append(" (");
        T0.append(this.b);
        T0.append(")}:");
        if (this.c) {
            T0.append(" fromLayout");
        }
        if (this.n != 0) {
            T0.append(" id=0x");
            T0.append(Integer.toHexString(this.n));
        }
        String str = this.o;
        if (str != null && !str.isEmpty()) {
            T0.append(" tag=");
            T0.append(this.o);
        }
        if (this.p) {
            T0.append(" retainInstance");
        }
        if (this.q) {
            T0.append(" removing");
        }
        if (this.r) {
            T0.append(" detached");
        }
        if (this.t) {
            T0.append(" hidden");
        }
        return T0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeBundle(this.s);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.u);
    }

    u(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z = true;
        this.c = parcel.readInt() != 0;
        this.f = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt() != 0;
        this.r = parcel.readInt() != 0;
        this.s = parcel.readBundle();
        this.t = parcel.readInt() == 0 ? false : z;
        this.v = parcel.readBundle();
        this.u = parcel.readInt();
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qhe;

/* access modifiers changed from: package-private */
/* renamed from: mhe  reason: default package */
public final class mhe extends rge {
    public static final Parcelable.Creator<mhe> CREATOR = new a();
    private static final nme n = new nme();

    /* renamed from: mhe$a */
    static class a implements Parcelable.Creator<mhe> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public mhe createFromParcel(Parcel parcel) {
            nme unused = mhe.n;
            String readString = parcel.readString();
            readString.getClass();
            String readString2 = parcel.readString();
            readString2.getClass();
            int readInt = parcel.readInt();
            qhe qhe = null;
            if (readString.equals(qhe.a.class.getCanonicalName())) {
                qhe = qhe.a();
            } else if (readString.equals(qhe.b.class.getCanonicalName())) {
                qhe = qhe.b(readString2, readInt);
            } else if (readString.equals(qhe.c.class.getCanonicalName())) {
                qhe = qhe.e(readString2);
            } else if (readString.equals(qhe.f.class.getCanonicalName())) {
                qhe = qhe.g(readString2);
            } else if (readString.equals(qhe.d.class.getCanonicalName())) {
                qhe = qhe.f(readString2);
            }
            qhe.getClass();
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new mhe(qhe, z2, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public mhe[] newArray(int i) {
            return new mhe[i];
        }
    }

    mhe(qhe qhe, boolean z, boolean z2) {
        super(qhe, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b().d(new qle(parcel), new sle(parcel), new tle(parcel), new rle(parcel), new ple(parcel), new ule(parcel));
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(f() ? 1 : 0);
    }
}

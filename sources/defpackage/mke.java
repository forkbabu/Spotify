package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qke;

/* access modifiers changed from: package-private */
/* renamed from: mke  reason: default package */
public final class mke extends yje {
    public static final Parcelable.Creator<mke> CREATOR = new a();
    private static final qme f = new qme();

    /* renamed from: mke$a */
    static class a implements Parcelable.Creator<mke> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public mke createFromParcel(Parcel parcel) {
            qme unused = mke.f;
            String readString = parcel.readString();
            readString.getClass();
            String readString2 = parcel.readString();
            readString2.getClass();
            qke qke = null;
            if (readString.equals(qke.b.class.getCanonicalName())) {
                qke = qke.b();
            } else if (readString.equals(qke.d.class.getCanonicalName())) {
                qke = qke.d(readString2);
            } else if (readString.equals(qke.f.class.getCanonicalName())) {
                qke = qke.h(readString2);
            } else if (readString.equals(qke.e.class.getCanonicalName())) {
                qke = qke.e(readString2);
            } else if (readString.equals(qke.g.class.getCanonicalName())) {
                qke = qke.i(readString2);
            } else if (readString.equals(qke.i.class.getCanonicalName())) {
                qke = qke.k(readString2);
            } else if (readString.equals(qke.h.class.getCanonicalName())) {
                qke = qke.j(readString2);
            } else if (readString.equals(qke.a.class.getCanonicalName())) {
                qke = qke.a(readString2);
            } else if (readString.equals(qke.c.class.getCanonicalName())) {
                qke = qke.c(readString2, parcel.readString());
            }
            qke.getClass();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new mke(qke, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public mke[] newArray(int i) {
            return new mke[i];
        }
    }

    mke(qke qke, boolean z) {
        super(qke, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c().g(new dme(parcel), new gme(parcel), new bme(parcel), new ime(parcel), new fme(parcel), new cme(parcel), new hme(parcel), new eme(parcel), new jme(parcel));
        parcel.writeInt(a() ? 1 : 0);
    }
}

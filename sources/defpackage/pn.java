package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;

/* renamed from: pn  reason: default package */
public final class pn extends on {
    public static final Parcelable.Creator<pn> CREATOR = new a();
    public final String b;
    public final String c;
    public final String f;

    /* renamed from: pn$a */
    static class a implements Parcelable.Creator<pn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public pn createFromParcel(Parcel parcel) {
            return new pn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public pn[] newArray(int i) {
            return new pn[i];
        }
    }

    public pn(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.f = str3;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pn.class != obj.getClass()) {
            return false;
        }
        pn pnVar = (pn) obj;
        if (!f0.a(this.c, pnVar.c) || !f0.a(this.b, pnVar.b) || !f0.a(this.f, pnVar.f)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // defpackage.on, java.lang.Object
    public String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f);
    }

    pn(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = f0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.f = parcel.readString();
    }
}

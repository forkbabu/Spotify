package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;

/* renamed from: sn  reason: default package */
public final class sn extends on {
    public static final Parcelable.Creator<sn> CREATOR = new a();
    public final String b;
    public final String c;

    /* renamed from: sn$a */
    static class a implements Parcelable.Creator<sn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public sn createFromParcel(Parcel parcel) {
            return new sn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public sn[] newArray(int i) {
            return new sn[i];
        }
    }

    public sn(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sn.class != obj.getClass()) {
            return false;
        }
        sn snVar = (sn) obj;
        if (!this.a.equals(snVar.a) || !f0.a(this.b, snVar.b) || !f0.a(this.c, snVar.c)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int Y0 = je.Y0(this.a, 527, 31);
        String str = this.b;
        int i = 0;
        int hashCode = (Y0 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @Override // defpackage.on, java.lang.Object
    public String toString() {
        return this.a + ": description=" + this.b + ": value=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    sn(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.exoplayer2.util.f0.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.b = r0
            java.lang.String r3 = r3.readString()
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn.<init>(android.os.Parcel):void");
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;

/* renamed from: tn  reason: default package */
public final class tn extends on {
    public static final Parcelable.Creator<tn> CREATOR = new a();
    public final String b;
    public final String c;

    /* renamed from: tn$a */
    static class a implements Parcelable.Creator<tn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public tn createFromParcel(Parcel parcel) {
            return new tn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public tn[] newArray(int i) {
            return new tn[i];
        }
    }

    public tn(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tn.class != obj.getClass()) {
            return false;
        }
        tn tnVar = (tn) obj;
        if (!this.a.equals(tnVar.a) || !f0.a(this.b, tnVar.b) || !f0.a(this.c, tnVar.c)) {
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
        return this.a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    tn(android.os.Parcel r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn.<init>(android.os.Parcel):void");
    }
}

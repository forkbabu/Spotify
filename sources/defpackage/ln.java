package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;

/* renamed from: ln  reason: default package */
public final class ln extends on {
    public static final Parcelable.Creator<ln> CREATOR = new a();
    public final String b;
    public final String c;
    public final String f;

    /* renamed from: ln$a */
    static class a implements Parcelable.Creator<ln> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ln createFromParcel(Parcel parcel) {
            return new ln(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ln[] newArray(int i) {
            return new ln[i];
        }
    }

    public ln(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.f = str3;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ln.class != obj.getClass()) {
            return false;
        }
        ln lnVar = (ln) obj;
        if (!f0.a(this.c, lnVar.c) || !f0.a(this.b, lnVar.b) || !f0.a(this.f, lnVar.f)) {
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
        return this.a + ": language=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f);
    }

    ln(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = f0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.f = parcel.readString();
    }
}

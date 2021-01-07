package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

/* renamed from: mn  reason: default package */
public final class mn extends on {
    public static final Parcelable.Creator<mn> CREATOR = new a();
    public final String b;
    public final String c;
    public final String f;
    public final byte[] n;

    /* renamed from: mn$a */
    static class a implements Parcelable.Creator<mn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public mn createFromParcel(Parcel parcel) {
            return new mn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public mn[] newArray(int i) {
            return new mn[i];
        }
    }

    public mn(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = bArr;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mn.class != obj.getClass()) {
            return false;
        }
        mn mnVar = (mn) obj;
        if (!f0.a(this.b, mnVar.b) || !f0.a(this.c, mnVar.c) || !f0.a(this.f, mnVar.f) || !Arrays.equals(this.n, mnVar.n)) {
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
        return Arrays.hashCode(this.n) + ((hashCode2 + i) * 31);
    }

    @Override // defpackage.on, java.lang.Object
    public String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.n);
    }

    mn(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = f0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.n = parcel.createByteArray();
    }
}

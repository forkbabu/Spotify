package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

/* renamed from: hn  reason: default package */
public final class hn extends on {
    public static final Parcelable.Creator<hn> CREATOR = new a();
    public final String b;
    public final String c;
    public final int f;
    public final byte[] n;

    /* renamed from: hn$a */
    static class a implements Parcelable.Creator<hn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public hn createFromParcel(Parcel parcel) {
            return new hn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public hn[] newArray(int i) {
            return new hn[i];
        }
    }

    public hn(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.f = i;
        this.n = bArr;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hn.class != obj.getClass()) {
            return false;
        }
        hn hnVar = (hn) obj;
        if (this.f != hnVar.f || !f0.a(this.b, hnVar.b) || !f0.a(this.c, hnVar.c) || !Arrays.equals(this.n, hnVar.n)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = (527 + this.f) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.n) + ((hashCode + i2) * 31);
    }

    @Override // defpackage.on, java.lang.Object
    public String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.f);
        parcel.writeByteArray(this.n);
    }

    hn(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = f0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.f = parcel.readInt();
        this.n = parcel.createByteArray();
    }
}

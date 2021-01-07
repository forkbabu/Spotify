package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

/* renamed from: rn  reason: default package */
public final class rn extends on {
    public static final Parcelable.Creator<rn> CREATOR = new a();
    public final String b;
    public final byte[] c;

    /* renamed from: rn$a */
    static class a implements Parcelable.Creator<rn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public rn createFromParcel(Parcel parcel) {
            return new rn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public rn[] newArray(int i) {
            return new rn[i];
        }
    }

    public rn(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rn.class != obj.getClass()) {
            return false;
        }
        rn rnVar = (rn) obj;
        if (!f0.a(this.b, rnVar.b) || !Arrays.equals(this.c, rnVar.c)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.on, java.lang.Object
    public String toString() {
        return this.a + ": owner=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    rn(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = f0.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}

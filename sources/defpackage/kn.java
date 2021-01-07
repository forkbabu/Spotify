package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

/* renamed from: kn  reason: default package */
public final class kn extends on {
    public static final Parcelable.Creator<kn> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean f;
    public final String[] n;
    private final on[] o;

    /* renamed from: kn$a */
    static class a implements Parcelable.Creator<kn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public kn createFromParcel(Parcel parcel) {
            return new kn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public kn[] newArray(int i) {
            return new kn[i];
        }
    }

    public kn(String str, boolean z, boolean z2, String[] strArr, on[] onVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.f = z2;
        this.n = strArr;
        this.o = onVarArr;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kn.class != obj.getClass()) {
            return false;
        }
        kn knVar = (kn) obj;
        if (this.c != knVar.c || this.f != knVar.f || !f0.a(this.b, knVar.b) || !Arrays.equals(this.n, knVar.n) || !Arrays.equals(this.o, knVar.o)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        parcel.writeStringArray(this.n);
        parcel.writeInt(this.o.length);
        for (on onVar : this.o) {
            parcel.writeParcelable(onVar, 0);
        }
    }

    kn(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = f0.a;
        this.b = readString;
        boolean z = true;
        this.c = parcel.readByte() != 0;
        this.f = parcel.readByte() == 0 ? false : z;
        this.n = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.o = new on[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.o[i2] = (on) parcel.readParcelable(on.class.getClassLoader());
        }
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

/* renamed from: jn  reason: default package */
public final class jn extends on {
    public static final Parcelable.Creator<jn> CREATOR = new a();
    public final String b;
    public final int c;
    public final int f;
    public final long n;
    public final long o;
    private final on[] p;

    /* renamed from: jn$a */
    static class a implements Parcelable.Creator<jn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public jn createFromParcel(Parcel parcel) {
            return new jn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public jn[] newArray(int i) {
            return new jn[i];
        }
    }

    public jn(String str, int i, int i2, long j, long j2, on[] onVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.f = i2;
        this.n = j;
        this.o = j2;
        this.p = onVarArr;
    }

    @Override // defpackage.on, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jn.class != obj.getClass()) {
            return false;
        }
        jn jnVar = (jn) obj;
        if (this.c == jnVar.c && this.f == jnVar.f && this.n == jnVar.n && this.o == jnVar.o && f0.a(this.b, jnVar.b) && Arrays.equals(this.p, jnVar.p)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.f) * 31) + ((int) this.n)) * 31) + ((int) this.o)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
        parcel.writeLong(this.n);
        parcel.writeLong(this.o);
        parcel.writeInt(this.p.length);
        for (on onVar : this.p) {
            parcel.writeParcelable(onVar, 0);
        }
    }

    jn(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = f0.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.f = parcel.readInt();
        this.n = parcel.readLong();
        this.o = parcel.readLong();
        int readInt = parcel.readInt();
        this.p = new on[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.p[i2] = (on) parcel.readParcelable(on.class.getClassLoader());
        }
    }
}

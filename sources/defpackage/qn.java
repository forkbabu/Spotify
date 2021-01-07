package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

/* renamed from: qn  reason: default package */
public final class qn extends on {
    public static final Parcelable.Creator<qn> CREATOR = new a();
    public final int b;
    public final int c;
    public final int f;
    public final int[] n;
    public final int[] o;

    /* renamed from: qn$a */
    static class a implements Parcelable.Creator<qn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public qn createFromParcel(Parcel parcel) {
            return new qn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public qn[] newArray(int i) {
            return new qn[i];
        }
    }

    public qn(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.n = iArr;
        this.o = iArr2;
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
        if (obj == null || qn.class != obj.getClass()) {
            return false;
        }
        qn qnVar = (qn) obj;
        if (this.b == qnVar.b && this.c == qnVar.c && this.f == qnVar.f && Arrays.equals(this.n, qnVar.n) && Arrays.equals(this.o, qnVar.o)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = Arrays.hashCode(this.n);
        return Arrays.hashCode(this.o) + ((hashCode + ((((((527 + this.b) * 31) + this.c) * 31) + this.f) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
        parcel.writeIntArray(this.n);
        parcel.writeIntArray(this.o);
    }

    qn(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.f = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = f0.a;
        this.n = createIntArray;
        this.o = parcel.createIntArray();
    }
}

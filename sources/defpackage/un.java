package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.v;

/* renamed from: un  reason: default package */
public final class un extends vn {
    public static final Parcelable.Creator<un> CREATOR = new a();
    public final long a;
    public final long b;
    public final byte[] c;

    /* renamed from: un$a */
    static class a implements Parcelable.Creator<un> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public un createFromParcel(Parcel parcel) {
            return new un(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public un[] newArray(int i) {
            return new un[i];
        }
    }

    private un(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    static un a(v vVar, int i, long j) {
        long z = vVar.z();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        vVar.g(bArr, 0, i2);
        return new un(z, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c.length);
        parcel.writeByteArray(this.c);
    }

    un(Parcel parcel, a aVar) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.c = bArr;
        parcel.readByteArray(bArr);
    }
}

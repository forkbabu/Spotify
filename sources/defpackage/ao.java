package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;

/* renamed from: ao  reason: default package */
public final class ao extends vn {
    public static final Parcelable.Creator<ao> CREATOR = new a();
    public final long a;
    public final long b;

    /* renamed from: ao$a */
    static class a implements Parcelable.Creator<ao> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ao createFromParcel(Parcel parcel) {
            return new ao(parcel.readLong(), parcel.readLong(), null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ao[] newArray(int i) {
            return new ao[i];
        }
    }

    private ao(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static ao a(v vVar, long j, e0 e0Var) {
        long b2 = b(vVar, j);
        return new ao(b2, e0Var.b(b2));
    }

    static long b(v vVar, long j) {
        long x = (long) vVar.x();
        if ((128 & x) != 0) {
            return 8589934591L & ((((x & 1) << 32) | vVar.z()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    ao(long j, long j2, a aVar) {
        this.a = j;
        this.b = j2;
    }
}

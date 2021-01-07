package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: xn  reason: default package */
public final class xn extends vn {
    public static final Parcelable.Creator<xn> CREATOR = new a();
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean f;
    public final boolean n;
    public final long o;
    public final long p;
    public final List<b> q;
    public final boolean r;
    public final long s;
    public final int t;
    public final int u;
    public final int v;

    /* renamed from: xn$a */
    static class a implements Parcelable.Creator<xn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public xn createFromParcel(Parcel parcel) {
            return new xn(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public xn[] newArray(int i) {
            return new xn[i];
        }
    }

    private xn(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.f = z3;
        this.n = z4;
        this.o = j2;
        this.p = j3;
        this.q = Collections.unmodifiableList(list);
        this.r = z5;
        this.s = j4;
        this.t = i;
        this.u = i2;
        this.v = i3;
    }

    static xn a(v vVar, long j, e0 e0Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        long z6 = vVar.z();
        boolean z7 = (vVar.x() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z7) {
            int x = vVar.x();
            boolean z8 = (x & 128) != 0;
            boolean z9 = (x & 64) != 0;
            boolean z10 = (x & 32) != 0;
            boolean z11 = (x & 16) != 0;
            long b2 = (!z9 || z11) ? -9223372036854775807L : ao.b(vVar, j);
            if (!z9) {
                int x2 = vVar.x();
                ArrayList arrayList = new ArrayList(x2);
                for (int i4 = 0; i4 < x2; i4++) {
                    int x3 = vVar.x();
                    long b3 = !z11 ? ao.b(vVar, j) : -9223372036854775807L;
                    arrayList.add(new b(x3, b3, e0Var.b(b3), null));
                }
                emptyList = arrayList;
            }
            if (z10) {
                long x4 = (long) vVar.x();
                boolean z12 = (128 & x4) != 0;
                j4 = ((((x4 & 1) << 32) | vVar.z()) * 1000) / 90;
                z5 = z12;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = vVar.D();
            z = z9;
            i2 = vVar.x();
            i = vVar.x();
            list = emptyList;
            z2 = z5;
            j2 = j4;
            z3 = z11;
            z4 = z8;
            j3 = b2;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new xn(z6, z7, z4, z, z3, j3, e0Var.b(j3), list, z2, j2, i3, i2, i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        parcel.writeByte(this.n ? (byte) 1 : 0);
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        int size = this.q.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.q.get(i2);
            parcel.writeInt(bVar.a);
            parcel.writeLong(bVar.b);
            parcel.writeLong(bVar.c);
        }
        parcel.writeByte(this.r ? (byte) 1 : 0);
        parcel.writeLong(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
    }

    /* renamed from: xn$b */
    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        private b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        b(int i, long j, long j2, a aVar) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    xn(Parcel parcel, a aVar) {
        this.a = parcel.readLong();
        boolean z = false;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.f = parcel.readByte() == 1;
        this.n = parcel.readByte() == 1;
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.q = Collections.unmodifiableList(arrayList);
        this.r = parcel.readByte() == 1 ? true : z;
        this.s = parcel.readLong();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
    }
}

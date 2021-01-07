package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zn  reason: default package */
public final class zn extends vn {
    public static final Parcelable.Creator<zn> CREATOR = new a();
    public final List<c> a;

    /* access modifiers changed from: package-private */
    /* renamed from: zn$a */
    public static class a implements Parcelable.Creator<zn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public zn createFromParcel(Parcel parcel) {
            return new zn(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public zn[] newArray(int i) {
            return new zn[i];
        }
    }

    private zn(List<c> list) {
        this.a = Collections.unmodifiableList(list);
    }

    static zn a(v vVar) {
        int x = vVar.x();
        ArrayList arrayList = new ArrayList(x);
        for (int i = 0; i < x; i++) {
            arrayList.add(c.b(vVar));
        }
        return new zn(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.a.get(i2);
            parcel.writeLong(cVar.a);
            parcel.writeByte(cVar.b ? (byte) 1 : 0);
            parcel.writeByte(cVar.c ? (byte) 1 : 0);
            parcel.writeByte(cVar.d ? (byte) 1 : 0);
            int size2 = cVar.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                b bVar = cVar.f.get(i3);
                parcel.writeInt(bVar.a);
                parcel.writeLong(bVar.b);
            }
            parcel.writeLong(cVar.e);
            parcel.writeByte(cVar.g ? (byte) 1 : 0);
            parcel.writeLong(cVar.h);
            parcel.writeInt(cVar.i);
            parcel.writeInt(cVar.j);
            parcel.writeInt(cVar.k);
        }
    }

    /* renamed from: zn$b */
    public static final class b {
        public final int a;
        public final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        b(int i, long j, a aVar) {
            this.a = i;
            this.b = j;
        }
    }

    zn(Parcel parcel, a aVar) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(c.a(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: zn$c */
    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private c(long j2, boolean z, boolean z2, boolean z3, List<b> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.a = j2;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j3;
            this.g = z4;
            this.h = j4;
            this.i = i2;
            this.j = i3;
            this.k = i4;
        }

        static c a(Parcel parcel) {
            return new c(parcel);
        }

        static c b(v vVar) {
            boolean z;
            int i2;
            int i3;
            int i4;
            long j2;
            boolean z2;
            long j3;
            ArrayList arrayList;
            boolean z3;
            long j4;
            boolean z4;
            long z5 = vVar.z();
            boolean z6 = (vVar.x() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z6) {
                int x = vVar.x();
                boolean z7 = (x & 128) != 0;
                boolean z8 = (x & 64) != 0;
                boolean z9 = (x & 32) != 0;
                long z10 = z8 ? vVar.z() : -9223372036854775807L;
                if (!z8) {
                    int x2 = vVar.x();
                    ArrayList arrayList3 = new ArrayList(x2);
                    for (int i5 = 0; i5 < x2; i5++) {
                        arrayList3.add(new b(vVar.x(), vVar.z(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long x3 = (long) vVar.x();
                    boolean z11 = (128 & x3) != 0;
                    j4 = ((((x3 & 1) << 32) | vVar.z()) * 1000) / 90;
                    z4 = z11;
                } else {
                    z4 = false;
                    j4 = -9223372036854775807L;
                }
                int D = vVar.D();
                int x4 = vVar.x();
                z = z8;
                i2 = vVar.x();
                j2 = j4;
                arrayList = arrayList2;
                i4 = D;
                i3 = x4;
                j3 = z10;
                z2 = z4;
                z3 = z7;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j3 = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                z = false;
            }
            return new c(z5, z6, z3, z, arrayList, j3, z2, j2, i4, i3, i2);
        }

        private c(Parcel parcel) {
            this.a = parcel.readLong();
            boolean z = false;
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(b.a(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1 ? true : z;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }
}

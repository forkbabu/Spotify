package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.video.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();
    public final float A;
    public final int B;
    public final byte[] C;
    public final i D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final String J;
    public final int K;
    public final Class<? extends q> L;
    private int M;
    public final String a;
    public final String b;
    public final int c;
    public final int f;
    public final int n;
    public final String o;
    public final um p;
    public final String q;
    public final String r;
    public final int s;
    public final List<byte[]> t;
    public final l u;
    public final long v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    static class a implements Parcelable.Creator<d0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d0[] newArray(int i) {
            return new d0[i];
        }
    }

    d0(String str, String str2, int i, int i2, int i3, String str3, um umVar, String str4, String str5, int i4, List<byte[]> list, l lVar, long j, int i5, int i6, float f2, int i7, float f3, byte[] bArr, int i8, i iVar, int i9, int i10, int i11, int i12, int i13, String str6, int i14, Class<? extends q> cls) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = i2;
        this.n = i3;
        this.o = str3;
        this.p = umVar;
        this.q = str4;
        this.r = str5;
        this.s = i4;
        this.t = list == null ? Collections.emptyList() : list;
        this.u = lVar;
        this.v = j;
        this.w = i5;
        this.x = i6;
        this.y = f2;
        int i15 = 0;
        int i16 = i7;
        this.z = i16 == -1 ? 0 : i16;
        this.A = f3 == -1.0f ? 1.0f : f3;
        this.C = bArr;
        this.B = i8;
        this.D = iVar;
        this.E = i9;
        this.F = i10;
        this.G = i11;
        int i17 = i12;
        this.H = i17 == -1 ? 0 : i17;
        this.I = i13 != -1 ? i13 : i15;
        this.J = f0.E(str6);
        this.K = i14;
        this.L = cls;
    }

    public static d0 A(String str, String str2, String str3, int i, int i2, int i3, int i4, float f2, List<byte[]> list, int i5, float f3, byte[] bArr, int i6, i iVar, l lVar) {
        return new d0(str, null, 0, 0, i, str3, null, null, str2, i2, list, lVar, Long.MAX_VALUE, i3, i4, f2, i5, f3, bArr, i6, iVar, -1, -1, -1, -1, -1, null, -1, null);
    }

    @Deprecated
    public static d0 k(String str, String str2, String str3, String str4, int i, int i2, int i3, List<byte[]> list, int i4, String str5) {
        return l(str, null, str2, str3, str4, null, i, i2, i3, null, i4, 0, null);
    }

    public static d0 l(String str, String str2, String str3, String str4, String str5, um umVar, int i, int i2, int i3, List<byte[]> list, int i4, int i5, String str6) {
        return new d0(str, str2, i4, i5, i, str5, umVar, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, str6, -1, null);
    }

    public static d0 m(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, l lVar, int i8, String str4, um umVar) {
        return new d0(str, null, i8, 0, i, str3, umVar, null, str2, i2, list, lVar, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, str4, -1, null);
    }

    public static d0 n(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, l lVar, int i6, String str4) {
        return m(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, lVar, i6, str4, null);
    }

    public static d0 o(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, l lVar, int i5, String str4) {
        return n(str, str2, null, i, i2, i3, i4, -1, list, lVar, i5, str4);
    }

    public static d0 p(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return new d0(str, null, i2, i3, i, null, null, str3, null, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static d0 q(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, l lVar) {
        return new d0(str, null, i2, 0, i, null, null, null, str2, -1, list, lVar, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1, null);
    }

    public static d0 r(String str, String str2, long j) {
        return new d0(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static d0 s(String str, String str2, String str3, int i, l lVar) {
        return new d0(str, null, 0, 0, i, null, null, null, str2, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static d0 t(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4) {
        return new d0(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i4, null);
    }

    public static d0 u(String str, String str2, int i, String str3, l lVar) {
        return v(str, str2, null, -1, i, str3, -1, lVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static d0 v(String str, String str2, String str3, int i, int i2, String str4, int i3, l lVar, long j, List<byte[]> list) {
        return new d0(str, null, i2, 0, i, str3, null, null, str2, -1, list, lVar, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i3, null);
    }

    public static d0 w(String str, String str2, String str3, int i, int i2, String str4, l lVar, long j) {
        return v(str, str2, str3, i, i2, str4, -1, null, j, Collections.emptyList());
    }

    @Deprecated
    public static d0 x(String str, String str2, String str3, String str4, int i, int i2, int i3, float f2, List<byte[]> list, int i4) {
        return y(str, null, str2, str3, str4, null, i, i2, i3, f2, null, i4, 0);
    }

    public static d0 y(String str, String str2, String str3, String str4, String str5, um umVar, int i, int i2, int i3, float f2, List<byte[]> list, int i4, int i5) {
        return new d0(str, str2, i4, i5, i, str5, umVar, str3, str4, -1, list, null, Long.MAX_VALUE, i2, i3, f2, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static d0 z(String str, String str2, String str3, int i, int i2, int i3, int i4, float f2, List<byte[]> list, int i5, float f3, l lVar) {
        return A(str, str2, str3, i, i2, i3, i4, f2, list, i5, f3, null, -1, null, null);
    }

    public int B() {
        int i;
        int i2 = this.w;
        if (i2 == -1 || (i = this.x) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean C(d0 d0Var) {
        if (this.t.size() != d0Var.t.size()) {
            return false;
        }
        for (int i = 0; i < this.t.size(); i++) {
            if (!Arrays.equals(this.t.get(i), d0Var.t.get(i))) {
                return false;
            }
        }
        return true;
    }

    public d0 a(l lVar, um umVar) {
        if (lVar == this.u) {
            if (umVar == this.p) {
                return this;
            }
        }
        return new d0(this.a, this.b, this.c, this.f, this.n, this.o, umVar, this.q, this.r, this.s, this.t, lVar, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    public d0 b(int i) {
        return new d0(this.a, this.b, this.c, this.f, i, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    public d0 c(String str, String str2, String str3, String str4, um umVar, int i, int i2, int i3, int i4, int i5, String str5) {
        um umVar2 = this.p;
        return new d0(str, str2, i5, this.f, i, str4, umVar2 != null ? umVar2.b(umVar) : umVar, this.q, str3, this.s, this.t, this.u, this.v, i2, i3, this.y, this.z, this.A, this.C, this.B, this.D, i4, this.F, this.G, this.H, this.I, str5, this.K, this.L);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public d0 e(Class<? extends q> cls) {
        return new d0(this.a, this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, cls);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i2 = this.M;
        if ((i2 == 0 || (i = d0Var.M) == 0 || i2 == i) && this.c == d0Var.c && this.f == d0Var.f && this.n == d0Var.n && this.s == d0Var.s && this.v == d0Var.v && this.w == d0Var.w && this.x == d0Var.x && this.z == d0Var.z && this.B == d0Var.B && this.E == d0Var.E && this.F == d0Var.F && this.G == d0Var.G && this.H == d0Var.H && this.I == d0Var.I && this.K == d0Var.K && Float.compare(this.y, d0Var.y) == 0 && Float.compare(this.A, d0Var.A) == 0 && f0.a(this.L, d0Var.L) && f0.a(this.a, d0Var.a) && f0.a(this.b, d0Var.b) && f0.a(this.o, d0Var.o) && f0.a(this.q, d0Var.q) && f0.a(this.r, d0Var.r) && f0.a(this.J, d0Var.J) && Arrays.equals(this.C, d0Var.C) && f0.a(this.p, d0Var.p) && f0.a(this.D, d0Var.D) && f0.a(this.u, d0Var.u) && C(d0Var)) {
            return true;
        }
        return false;
    }

    public d0 f(float f2) {
        return new d0(this.a, this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, f2, this.z, this.A, this.C, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    public d0 g(int i, int i2) {
        return new d0(this.a, this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.B, this.D, this.E, this.F, this.G, i, i2, this.J, this.K, this.L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.d0 h(com.google.android.exoplayer2.d0 r35) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d0.h(com.google.android.exoplayer2.d0):com.google.android.exoplayer2.d0");
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (this.M == 0) {
            String str = this.a;
            int i = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.f) * 31) + this.n) * 31;
            String str3 = this.o;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            um umVar = this.p;
            int hashCode4 = (hashCode3 + (umVar == null ? 0 : umVar.hashCode())) * 31;
            String str4 = this.q;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.r;
            int floatToIntBits = (((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.s) * 31) + ((int) this.v)) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.B) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31;
            String str6 = this.J;
            int hashCode6 = (((floatToIntBits + (str6 == null ? 0 : str6.hashCode())) * 31) + this.K) * 31;
            Class<? extends q> cls = this.L;
            if (cls != null) {
                i = cls.hashCode();
            }
            this.M = hashCode6 + i;
        }
        return this.M;
    }

    public d0 i(int i) {
        return new d0(this.a, this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r, i, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    public d0 j(long j) {
        return new d0(this.a, this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, j, this.w, this.x, this.y, this.z, this.A, this.C, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Format(");
        V0.append(this.a);
        V0.append(", ");
        V0.append(this.b);
        V0.append(", ");
        V0.append(this.q);
        V0.append(", ");
        V0.append(this.r);
        V0.append(", ");
        V0.append(this.o);
        V0.append(", ");
        V0.append(this.n);
        V0.append(", ");
        V0.append(this.J);
        V0.append(", [");
        V0.append(this.w);
        V0.append(", ");
        V0.append(this.x);
        V0.append(", ");
        V0.append(this.y);
        V0.append("], [");
        V0.append(this.E);
        V0.append(", ");
        return je.B0(V0, this.F, "])");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        int i2 = 0;
        parcel.writeParcelable(this.p, 0);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        int size = this.t.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.t.get(i3));
        }
        parcel.writeParcelable(this.u, 0);
        parcel.writeLong(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeFloat(this.y);
        parcel.writeInt(this.z);
        parcel.writeFloat(this.A);
        if (this.C != null) {
            i2 = 1;
        }
        int i4 = f0.a;
        parcel.writeInt(i2);
        byte[] bArr = this.C;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.B);
        parcel.writeParcelable(this.D, i);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeInt(this.K);
    }

    d0(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.f = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readString();
        this.p = (um) parcel.readParcelable(um.class.getClassLoader());
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        int readInt = parcel.readInt();
        this.t = new ArrayList(readInt);
        boolean z2 = false;
        for (int i = 0; i < readInt; i++) {
            this.t.add(parcel.createByteArray());
        }
        this.u = (l) parcel.readParcelable(l.class.getClassLoader());
        this.v = parcel.readLong();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readFloat();
        this.z = parcel.readInt();
        this.A = parcel.readFloat();
        int i2 = f0.a;
        this.C = parcel.readInt() != 0 ? true : z2 ? parcel.createByteArray() : null;
        this.B = parcel.readInt();
        this.D = (i) parcel.readParcelable(i.class.getClassLoader());
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.K = parcel.readInt();
        this.L = null;
    }
}

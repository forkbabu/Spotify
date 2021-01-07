package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class o extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<o> CREATOR = new h1();
    boolean A;
    c B;
    r C;
    i D;
    l E;
    private final SparseArray<Integer> F = new SparseArray<>();
    private final a G = new a();
    MediaInfo a;
    private long b;
    int c;
    double f;
    int n;
    int o;
    long p;
    long q;
    double r;
    boolean s;
    long[] t;
    int u;
    int v;
    String w;
    JSONObject x;
    int y;
    private final List<m> z = new ArrayList();

    public class a {
        public a() {
        }
    }

    static {
        new b("MediaStatus");
    }

    public o(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z2, long[] jArr, int i4, int i5, String str, int i6, List<m> list, boolean z3, c cVar, r rVar, i iVar, l lVar) {
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.f = d;
        this.n = i2;
        this.o = i3;
        this.p = j2;
        this.q = j3;
        this.r = d2;
        this.s = z2;
        this.t = jArr;
        this.u = i4;
        this.v = i5;
        this.w = str;
        if (str != null) {
            try {
                this.x = new JSONObject(this.w);
            } catch (JSONException unused) {
                this.x = null;
                this.w = null;
            }
        } else {
            this.x = null;
        }
        this.y = i6;
        if (list != null && !list.isEmpty()) {
            D2(list);
        }
        this.A = z3;
        this.B = cVar;
        this.C = rVar;
        this.D = iVar;
        this.E = lVar;
    }

    private static boolean C2(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    private final void D2(List<m> list) {
        this.z.clear();
        this.F.clear();
        for (int i = 0; i < list.size(); i++) {
            m mVar = list.get(i);
            this.z.add(mVar);
            this.F.put(mVar.Q1(), Integer.valueOf(i));
        }
    }

    public boolean A2() {
        return this.A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02f9, code lost:
        if (r15 == false) goto L_0x0318;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0399  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B2(org.json.JSONObject r14, int r15) {
        /*
        // Method dump skipped, instructions count: 931
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.o.B2(org.json.JSONObject, int):int");
    }

    public final long E2() {
        return this.b;
    }

    public final boolean F2() {
        MediaInfo mediaInfo = this.a;
        return C2(this.n, this.o, this.u, mediaInfo == null ? -1 : mediaInfo.p2());
    }

    public long[] I1() {
        return this.t;
    }

    public int Q1() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if ((this.x == null) == (oVar.x == null) && this.b == oVar.b && this.c == oVar.c && this.f == oVar.f && this.n == oVar.n && this.o == oVar.o && this.p == oVar.p && this.r == oVar.r && this.s == oVar.s && this.u == oVar.u && this.v == oVar.v && this.y == oVar.y && Arrays.equals(this.t, oVar.t) && com.google.android.gms.cast.internal.a.d(Long.valueOf(this.q), Long.valueOf(oVar.q)) && com.google.android.gms.cast.internal.a.d(this.z, oVar.z) && com.google.android.gms.cast.internal.a.d(this.a, oVar.a)) {
            JSONObject jSONObject2 = this.x;
            if ((jSONObject2 == null || (jSONObject = oVar.x) == null || g.a(jSONObject2, jSONObject)) && this.A == oVar.A && com.google.android.gms.cast.internal.a.d(this.B, oVar.B) && com.google.android.gms.cast.internal.a.d(this.C, oVar.C) && com.google.android.gms.cast.internal.a.d(this.D, oVar.D) && m.a(this.E, oVar.E)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.f), Integer.valueOf(this.n), Integer.valueOf(this.o), Long.valueOf(this.p), Long.valueOf(this.q), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.t)), Integer.valueOf(this.u), Integer.valueOf(this.v), String.valueOf(this.x), Integer.valueOf(this.y), this.z, Boolean.valueOf(this.A), this.B, this.C, this.D, this.E});
    }

    public int o2() {
        return this.o;
    }

    public Integer p2(int i) {
        return this.F.get(i);
    }

    public m q2(int i) {
        Integer num = this.F.get(i);
        if (num == null) {
            return null;
        }
        return this.z.get(num.intValue());
    }

    public i r2() {
        return this.D;
    }

    public int s2() {
        return this.u;
    }

    public MediaInfo t2() {
        return this.a;
    }

    public double u2() {
        return this.f;
    }

    public int v2() {
        return this.n;
    }

    public int w2() {
        return this.z.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.x;
        this.w = jSONObject == null ? null : jSONObject.toString();
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 2, this.a, i, false);
        SafeParcelReader.P(parcel, 3, this.b);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.H(parcel, 5, this.f);
        SafeParcelReader.M(parcel, 6, this.n);
        SafeParcelReader.M(parcel, 7, this.o);
        SafeParcelReader.P(parcel, 8, this.p);
        SafeParcelReader.P(parcel, 9, this.q);
        SafeParcelReader.H(parcel, 10, this.r);
        SafeParcelReader.C(parcel, 11, this.s);
        SafeParcelReader.Q(parcel, 12, this.t, false);
        SafeParcelReader.M(parcel, 13, this.u);
        SafeParcelReader.M(parcel, 14, this.v);
        SafeParcelReader.T(parcel, 15, this.w, false);
        SafeParcelReader.M(parcel, 16, this.y);
        SafeParcelReader.X(parcel, 17, this.z, false);
        SafeParcelReader.C(parcel, 18, this.A);
        SafeParcelReader.S(parcel, 19, this.B, i, false);
        SafeParcelReader.S(parcel, 20, this.C, i, false);
        SafeParcelReader.S(parcel, 21, this.D, i, false);
        SafeParcelReader.S(parcel, 22, this.E, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    public int x2() {
        return this.y;
    }

    public long y2() {
        return this.p;
    }

    public boolean z2(long j) {
        return (j & this.q) != 0;
    }
}

package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.d;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.b;
import java.util.List;
import java.util.Locale;

public class Layer {
    private final List<b> a;
    private final d b;
    private final String c;
    private final long d;
    private final LayerType e;
    private final long f;
    private final String g;
    private final List<Mask> h;
    private final mc i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final kc q;
    private final lc r;
    private final cc s;
    private final List<fe<Float>> t;
    private final MatteType u;
    private final boolean v;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public Layer(List<b> list, d dVar, String str, long j2, LayerType layerType, long j3, String str2, List<Mask> list2, mc mcVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, kc kcVar, lc lcVar, List<fe<Float>> list3, MatteType matteType, cc ccVar, boolean z) {
        this.a = list;
        this.b = dVar;
        this.c = str;
        this.d = j2;
        this.e = layerType;
        this.f = j3;
        this.g = str2;
        this.h = list2;
        this.i = mcVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f2;
        this.n = f3;
        this.o = i5;
        this.p = i6;
        this.q = kcVar;
        this.r = lcVar;
        this.t = list3;
        this.u = matteType;
        this.s = ccVar;
        this.v = z;
    }

    /* access modifiers changed from: package-private */
    public d a() {
        return this.b;
    }

    public long b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public List<fe<Float>> c() {
        return this.t;
    }

    public LayerType d() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public List<Mask> e() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public MatteType f() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public long h() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public List<b> l() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public float p() {
        return this.n / this.b.e();
    }

    /* access modifiers changed from: package-private */
    public kc q() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public lc r() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public cc s() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public float t() {
        return this.m;
    }

    public String toString() {
        return w("");
    }

    /* access modifiers changed from: package-private */
    public mc u() {
        return this.i;
    }

    public boolean v() {
        return this.v;
    }

    public String w(String str) {
        StringBuilder V0 = je.V0(str);
        V0.append(this.c);
        V0.append("\n");
        Layer s2 = this.b.s(this.f);
        if (s2 != null) {
            V0.append("\t\tParents: ");
            V0.append(s2.c);
            Layer s3 = this.b.s(s2.f);
            while (s3 != null) {
                V0.append("->");
                V0.append(s3.c);
                s3 = this.b.s(s3.f);
            }
            V0.append(str);
            V0.append("\n");
        }
        if (!this.h.isEmpty()) {
            V0.append(str);
            V0.append("\tMasks: ");
            V0.append(this.h.size());
            V0.append("\n");
        }
        if (!(this.j == 0 || this.k == 0)) {
            V0.append(str);
            V0.append("\tBackground: ");
            V0.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)));
        }
        if (!this.a.isEmpty()) {
            V0.append(str);
            V0.append("\tShapes:\n");
            for (b bVar : this.a) {
                V0.append(str);
                V0.append("\t\t");
                V0.append(bVar);
                V0.append("\n");
            }
        }
        return V0.toString();
    }
}

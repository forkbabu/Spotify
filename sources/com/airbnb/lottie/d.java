package com.airbnb.lottie;

import android.graphics.Rect;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.c;
import com.airbnb.lottie.model.g;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class d {
    private final o a = new o();
    private final HashSet<String> b = new HashSet<>();
    private Map<String, List<Layer>> c;
    private Map<String, g> d;
    private Map<String, b> e;
    private List<g> f;
    private u1<c> g;
    private q1<Layer> h;
    private List<Layer> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private int o = 0;

    public void a(String str) {
        ae.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public u1<c> c() {
        return this.g;
    }

    public float d() {
        return (float) ((long) ((e() / this.m) * 1000.0f));
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, b> g() {
        return this.e;
    }

    public float h() {
        return this.m;
    }

    public Map<String, g> i() {
        return this.d;
    }

    public List<Layer> j() {
        return this.i;
    }

    public g k(String str) {
        this.f.size();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            g gVar = this.f.get(i2);
            if (gVar.a(str)) {
                return gVar;
            }
        }
        return null;
    }

    public int l() {
        return this.o;
    }

    public o m() {
        return this.a;
    }

    public List<Layer> n(String str) {
        return this.c.get(str);
    }

    public float o() {
        return this.k;
    }

    public boolean p() {
        return this.n;
    }

    public void q(int i2) {
        this.o += i2;
    }

    public void r(Rect rect, float f2, float f3, float f4, List<Layer> list, q1<Layer> q1Var, Map<String, List<Layer>> map, Map<String, g> map2, u1<c> u1Var, Map<String, b> map3, List<g> list2) {
        this.j = rect;
        this.k = f2;
        this.l = f3;
        this.m = f4;
        this.i = list;
        this.h = q1Var;
        this.c = map;
        this.d = map2;
        this.g = u1Var;
        this.e = map3;
        this.f = list2;
    }

    public Layer s(long j2) {
        return this.h.j(j2, null);
    }

    public void t(boolean z) {
        this.n = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.i) {
            sb.append(layer.w("\t"));
        }
        return sb.toString();
    }

    public void u(boolean z) {
        this.a.b(z);
    }
}

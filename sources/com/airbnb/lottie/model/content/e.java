package com.airbnb.lottie.model.content;

import com.airbnb.lottie.f;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.b;
import java.util.List;

public class e implements b {
    private final String a;
    private final GradientType b;
    private final dc c;
    private final ec d;
    private final gc e;
    private final gc f;
    private final cc g;
    private final ShapeStroke.LineCapType h;
    private final ShapeStroke.LineJoinType i;
    private final float j;
    private final List<cc> k;
    private final cc l;
    private final boolean m;

    public e(String str, GradientType gradientType, dc dcVar, ec ecVar, gc gcVar, gc gcVar2, cc ccVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f2, List<cc> list, cc ccVar2, boolean z) {
        this.a = str;
        this.b = gradientType;
        this.c = dcVar;
        this.d = ecVar;
        this.e = gcVar;
        this.f = gcVar2;
        this.g = ccVar;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f2;
        this.k = list;
        this.l = ccVar2;
        this.m = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new ya(fVar, bVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.h;
    }

    public cc c() {
        return this.l;
    }

    public gc d() {
        return this.f;
    }

    public dc e() {
        return this.c;
    }

    public GradientType f() {
        return this.b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.i;
    }

    public List<cc> h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.a;
    }

    public ec k() {
        return this.d;
    }

    public gc l() {
        return this.e;
    }

    public cc m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}

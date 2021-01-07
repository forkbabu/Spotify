package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class a implements b {
    private final String a;
    private final nc<PointF, PointF> b;
    private final gc c;
    private final boolean d;
    private final boolean e;

    public a(String str, nc<PointF, PointF> ncVar, gc gcVar, boolean z, boolean z2) {
        this.a = str;
        this.b = ncVar;
        this.c = gcVar;
        this.d = z;
        this.e = z2;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new va(fVar, bVar, this);
    }

    public String b() {
        return this.a;
    }

    public nc<PointF, PointF> c() {
        return this.b;
    }

    public gc d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}

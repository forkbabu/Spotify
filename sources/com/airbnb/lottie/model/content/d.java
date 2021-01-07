package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class d implements b {
    private final GradientType a;
    private final Path.FillType b;
    private final dc c;
    private final ec d;
    private final gc e;
    private final gc f;
    private final String g;
    private final boolean h;

    public d(String str, GradientType gradientType, Path.FillType fillType, dc dcVar, ec ecVar, gc gcVar, gc gcVar2, cc ccVar, cc ccVar2, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.c = dcVar;
        this.d = ecVar;
        this.e = gcVar;
        this.f = gcVar2;
        this.g = str;
        this.h = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new xa(fVar, bVar, this);
    }

    public gc b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public dc d() {
        return this.c;
    }

    public GradientType e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public ec g() {
        return this.d;
    }

    public gc h() {
        return this.e;
    }

    public boolean i() {
        return this.h;
    }
}

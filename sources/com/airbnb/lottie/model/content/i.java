package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class i implements b {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final bc d;
    private final ec e;
    private final boolean f;

    public i(String str, boolean z, Path.FillType fillType, bc bcVar, ec ecVar, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = bcVar;
        this.e = ecVar;
        this.f = z2;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new wa(fVar, bVar, this);
    }

    public bc b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public ec e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return je.O0(je.V0("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}

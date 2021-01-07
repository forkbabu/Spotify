package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.layer.b;

public class f implements b {
    private final String a;
    private final nc<PointF, PointF> b;
    private final gc c;
    private final cc d;
    private final boolean e;

    public f(String str, nc<PointF, PointF> ncVar, gc gcVar, cc ccVar, boolean z) {
        this.a = str;
        this.b = ncVar;
        this.c = gcVar;
        this.d = ccVar;
        this.e = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(com.airbnb.lottie.f fVar, b bVar) {
        return new eb(fVar, bVar, this);
    }

    public cc b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public nc<PointF, PointF> d() {
        return this.b;
    }

    public gc e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RectangleShape{position=");
        V0.append(this.b);
        V0.append(", size=");
        V0.append(this.c);
        V0.append('}');
        return V0.toString();
    }
}

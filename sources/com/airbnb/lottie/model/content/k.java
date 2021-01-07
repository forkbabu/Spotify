package com.airbnb.lottie.model.content;

import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class k implements b {
    private final String a;
    private final int b;
    private final ic c;
    private final boolean d;

    public k(String str, int i, ic icVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = icVar;
        this.d = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new gb(fVar, bVar, this);
    }

    public ic b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShapePath{name=");
        V0.append(this.a);
        V0.append(", index=");
        return je.A0(V0, this.b, '}');
    }
}

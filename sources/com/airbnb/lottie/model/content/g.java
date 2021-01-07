package com.airbnb.lottie.model.content;

import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class g implements b {
    private final String a;
    private final cc b;
    private final cc c;
    private final mc d;
    private final boolean e;

    public g(String str, cc ccVar, cc ccVar2, mc mcVar, boolean z) {
        this.a = str;
        this.b = ccVar;
        this.c = ccVar2;
        this.d = mcVar;
        this.e = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new fb(fVar, bVar, this);
    }

    public cc b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public cc d() {
        return this.c;
    }

    public mc e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}

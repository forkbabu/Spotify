package com.airbnb.lottie.model.content;

import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class ShapeTrimPath implements b {
    private final String a;
    private final Type b;
    private final cc c;
    private final cc d;
    private final cc e;
    private final boolean f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY
    }

    public ShapeTrimPath(String str, Type type, cc ccVar, cc ccVar2, cc ccVar3, boolean z) {
        this.a = str;
        this.b = type;
        this.c = ccVar;
        this.d = ccVar2;
        this.e = ccVar3;
        this.f = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new ib(bVar, this);
    }

    public cc b() {
        return this.d;
    }

    public cc c() {
        return this.e;
    }

    public cc d() {
        return this.c;
    }

    public Type e() {
        return this.b;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Trim Path: {start: ");
        V0.append(this.c);
        V0.append(", end: ");
        V0.append(this.d);
        V0.append(", offset: ");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}

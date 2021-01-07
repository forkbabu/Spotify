package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class PolystarShape implements b {
    private final String a;
    private final Type b;
    private final cc c;
    private final nc<PointF, PointF> d;
    private final cc e;
    private final cc f;
    private final cc g;
    private final cc h;
    private final cc i;
    private final boolean j;

    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        public static Type d(int i) {
            Type[] values = values();
            for (int i2 = 0; i2 < 2; i2++) {
                Type type = values[i2];
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, cc ccVar, nc<PointF, PointF> ncVar, cc ccVar2, cc ccVar3, cc ccVar4, cc ccVar5, cc ccVar6, boolean z) {
        this.a = str;
        this.b = type;
        this.c = ccVar;
        this.d = ncVar;
        this.e = ccVar2;
        this.f = ccVar3;
        this.g = ccVar4;
        this.h = ccVar5;
        this.i = ccVar6;
        this.j = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new db(fVar, bVar, this);
    }

    public cc b() {
        return this.f;
    }

    public cc c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public cc e() {
        return this.g;
    }

    public cc f() {
        return this.i;
    }

    public cc g() {
        return this.c;
    }

    public nc<PointF, PointF> h() {
        return this.d;
    }

    public cc i() {
        return this.e;
    }

    public Type j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }
}

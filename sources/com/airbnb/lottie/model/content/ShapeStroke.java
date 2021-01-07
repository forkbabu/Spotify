package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;
import java.util.List;

public class ShapeStroke implements b {
    private final String a;
    private final cc b;
    private final List<cc> c;
    private final bc d;
    private final ec e;
    private final cc f;
    private final LineCapType g;
    private final LineJoinType h;
    private final float i;
    private final boolean j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap d() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Cap.BUTT;
            }
            if (ordinal != 1) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join d() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Join.MITER;
            }
            if (ordinal == 1) {
                return Paint.Join.ROUND;
            }
            if (ordinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, cc ccVar, List<cc> list, bc bcVar, ec ecVar, cc ccVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f2, boolean z) {
        this.a = str;
        this.b = ccVar;
        this.c = list;
        this.d = bcVar;
        this.e = ecVar;
        this.f = ccVar2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f2;
        this.j = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new hb(fVar, bVar, this);
    }

    public LineCapType b() {
        return this.g;
    }

    public bc c() {
        return this.d;
    }

    public cc d() {
        return this.b;
    }

    public LineJoinType e() {
        return this.h;
    }

    public List<cc> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public ec i() {
        return this.e;
    }

    public cc j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}

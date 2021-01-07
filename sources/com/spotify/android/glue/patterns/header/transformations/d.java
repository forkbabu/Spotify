package com.spotify.android.glue.patterns.header.transformations;

import android.animation.TimeInterpolator;
import com.spotify.android.glue.patterns.header.transformations.e;
import java.util.Arrays;

public class d<T extends e> extends c<T> {
    private h f;
    private c<T> g;

    public d(float f2, float f3, int i, T t, TransformationSet transformationSet) {
        super(f2, f3, i, t);
        this.e = transformationSet;
    }

    static <T extends e> d<T> g(c<T> cVar, h hVar) {
        d<T> dVar = new d<>(cVar.a, cVar.b, cVar.d, cVar.c, cVar.e);
        ((d) dVar).g = cVar;
        ((d) dVar).f = hVar;
        return dVar;
    }

    public d<T> e(TimeInterpolator timeInterpolator) {
        this.f.e = timeInterpolator;
        return this;
    }

    public c<T> f(g... gVarArr) {
        this.f.f = Arrays.asList(gVarArr);
        return this.g;
    }
}

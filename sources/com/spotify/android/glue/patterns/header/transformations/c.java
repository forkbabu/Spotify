package com.spotify.android.glue.patterns.header.transformations;

import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.glue.patterns.header.transformations.e;
import com.spotify.android.glue.patterns.header.transformations.h;

public class c<T extends e> extends e {
    T c;
    private final int d;
    protected TransformationSet e;

    public c(float f, float f2, int i, T t) {
        super(f, f2);
        this.d = i;
        this.c = t;
        TransformationSet transformationSet = new TransformationSet();
        this.e = transformationSet;
        transformationSet.a = i == 0 ? TransformationSet.ExecutionOrder.SEQUENTIAL : TransformationSet.ExecutionOrder.INDEPENDENT;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.transformations.e
    public void a(TransformationSet transformationSet, float f, float f2) {
        this.e.b.add(transformationSet);
        if (this.d == 0) {
            this.a = f;
            this.b = f2;
        }
    }

    public T c() {
        this.c.a(this.e, this.a, this.b);
        return this.c;
    }

    public d<T> d(float f, float f2) {
        h a = new h.a(this.a, this.b, f, f2).a();
        this.e.b.add(a);
        if (this.d == 0) {
            this.a = f;
            this.b = f2;
        }
        return d.g(this, a);
    }
}

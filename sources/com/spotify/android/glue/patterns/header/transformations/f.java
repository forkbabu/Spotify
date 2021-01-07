package com.spotify.android.glue.patterns.header.transformations;

public class f extends e {
    private TransformationSet c;

    public f(float f, float f2) {
        super(f, f2);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.transformations.e
    public void a(TransformationSet transformationSet, float f, float f2) {
        this.c = transformationSet;
    }

    public TransformationSet b() {
        return this.c;
    }

    public c<f> c() {
        return new c<>(this.a, this.b, 0, this);
    }
}

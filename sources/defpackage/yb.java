package defpackage;

import java.util.Collections;

/* renamed from: yb  reason: default package */
public class yb<K, A> extends jb<K, A> {
    private final A i;

    public yb(he<A> heVar, A a) {
        super(Collections.emptyList());
        this.e = heVar;
        this.i = a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.jb
    public float c() {
        return 1.0f;
    }

    @Override // defpackage.jb
    public A g() {
        he<A> heVar = this.e;
        A a = this.i;
        float f = this.d;
        return heVar.a(0.0f, 0.0f, a, a, f, f, f);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.jb
    public A h(fe<K> feVar, float f) {
        return g();
    }

    @Override // defpackage.jb
    public void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // defpackage.jb
    public void k(float f) {
        this.d = f;
    }
}

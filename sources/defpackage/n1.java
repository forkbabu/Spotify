package defpackage;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: n1  reason: default package */
public class n1 extends s1<E, E> {
    final /* synthetic */ o1 d;

    n1(o1 o1Var) {
        this.d = o1Var;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public void a() {
        this.d.clear();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public Object b(int i, int i2) {
        return this.d.b[i];
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public int d() {
        return this.d.c;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public int e(Object obj) {
        return this.d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public int f(Object obj) {
        return this.d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public void g(E e, E e2) {
        this.d.add(e);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public void h(int i) {
        this.d.h(i);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s1
    public E i(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }
}

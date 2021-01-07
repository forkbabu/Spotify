package defpackage;

import java.util.List;

/* renamed from: lb  reason: default package */
public class lb extends ob<Float> {
    public lb(List<fe<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.jb
    public Object h(fe feVar, float f) {
        return Float.valueOf(n(feVar, f));
    }

    public float m() {
        return n(b(), d());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    /* access modifiers changed from: package-private */
    public float n(fe<Float> feVar, float f) {
        A a;
        if (feVar.b == null || feVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        he<A> heVar = this.e;
        if (heVar == null || (a = heVar.a(feVar.e, feVar.f.floatValue(), feVar.b, feVar.c, f, e(), this.d)) == null) {
            return de.f(feVar.f(), feVar.c(), f);
        }
        return a.floatValue();
    }
}

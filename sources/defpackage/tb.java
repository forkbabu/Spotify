package defpackage;

import java.util.List;

/* renamed from: tb  reason: default package */
public class tb extends ob<ie> {
    private final ie i = new ie();

    public tb(List<fe<ie>> list) {
        super(list);
    }

    @Override // defpackage.jb
    public Object h(fe feVar, float f) {
        T t;
        A a;
        T t2 = feVar.b;
        if (t2 == null || (t = feVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t3 = t2;
        T t4 = t;
        he<A> heVar = this.e;
        if (heVar != null && (a = heVar.a(feVar.e, feVar.f.floatValue(), t3, t4, f, e(), this.d)) != null) {
            return a;
        }
        this.i.d(de.f(t3.b(), t4.b(), f), de.f(t3.c(), t4.c(), f));
        return this.i;
    }
}

package defpackage;

import java.util.List;

/* renamed from: kb  reason: default package */
public class kb extends ob<Integer> {
    public kb(List<fe<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.jb
    public Object h(fe feVar, float f) {
        return Integer.valueOf(n(feVar, f));
    }

    public int m() {
        return n(b(), d());
    }

    public int n(fe<Integer> feVar, float f) {
        A a;
        T t = feVar.b;
        if (t == null || feVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = t.intValue();
        int intValue2 = feVar.c.intValue();
        he<A> heVar = this.e;
        if (heVar == null || (a = heVar.a(feVar.e, feVar.f.floatValue(), (A) Integer.valueOf(intValue), (A) Integer.valueOf(intValue2), f, e(), this.d)) == null) {
            return yd.c(de.b(f, 0.0f, 1.0f), intValue, intValue2);
        }
        return a.intValue();
    }
}

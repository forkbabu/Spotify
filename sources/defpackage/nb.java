package defpackage;

import java.util.List;

/* renamed from: nb  reason: default package */
public class nb extends ob<Integer> {
    public nb(List<fe<Integer>> list) {
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

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    /* access modifiers changed from: package-private */
    public int n(fe<Integer> feVar, float f) {
        A a;
        if (feVar.b == null || feVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        he<A> heVar = this.e;
        if (heVar != null && (a = heVar.a(feVar.e, feVar.f.floatValue(), feVar.b, feVar.c, f, e(), this.d)) != null) {
            return a.intValue();
        }
        int g = feVar.g();
        int d = feVar.d();
        int i = de.b;
        return (int) ((f * ((float) (d - g))) + ((float) g));
    }
}

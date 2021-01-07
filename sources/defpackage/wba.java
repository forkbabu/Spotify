package defpackage;

import com.google.common.base.Supplier;

/* renamed from: wba  reason: default package */
public abstract class wba extends vba {
    private Supplier<Integer> n;

    public int c0(int i) {
        qu0 qu0 = this.f.get(Y(i));
        Integer num = this.n.get();
        if (!(qu0 instanceof xba)) {
            return num.intValue();
        }
        int g = ((xba) qu0).g(i);
        return g == 0 ? num.intValue() : g;
    }

    public void f0(Supplier<Integer> supplier) {
        this.n = supplier;
    }
}

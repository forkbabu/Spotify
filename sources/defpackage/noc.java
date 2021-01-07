package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;

/* renamed from: noc  reason: default package */
public final class noc implements fjf<moc> {
    private final wlf<Context> a;
    private final wlf<goc> b;
    private final wlf<ImmutableList<Integer>> c;
    private final wlf<ioc> d;
    private final wlf<koc> e;

    public noc(wlf<Context> wlf, wlf<goc> wlf2, wlf<ImmutableList<Integer>> wlf3, wlf<ioc> wlf4, wlf<koc> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static noc a(wlf<Context> wlf, wlf<goc> wlf2, wlf<ImmutableList<Integer>> wlf3, wlf<ioc> wlf4, wlf<koc> wlf5) {
        return new noc(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new moc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

package defpackage;

import com.spotify.searchview.proto.Entity;

/* renamed from: lua  reason: default package */
public final class lua implements fjf<kua> {
    private final wlf<qua> a;
    private final wlf<mua> b;
    private final wlf<owa<Entity>> c;
    private final wlf<Integer> d;

    public lua(wlf<qua> wlf, wlf<mua> wlf2, wlf<owa<Entity>> wlf3, wlf<Integer> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        qua qua = this.a.get();
        return new kua(qua, this.b.get(), this.c.get(), this.d.get().intValue());
    }
}

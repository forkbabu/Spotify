package defpackage;

import android.content.pm.ShortcutInfo;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: yi2  reason: default package */
public final class yi2 implements fjf<g<ShortcutInfo>> {
    private final wlf<g<cj2>> a;
    private final wlf<aj2> b;
    private final wlf<y> c;

    public yi2(wlf<g<cj2>> wlf, wlf<aj2> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().o(new ii2(this.b.get(), this.c.get()));
    }
}

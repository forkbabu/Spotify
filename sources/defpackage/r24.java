package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;

/* renamed from: r24  reason: default package */
public final class r24 implements fjf<e61> {
    private final wlf<Context> a;
    private final wlf<i5b> b;
    private final wlf<w51> c;
    private final wlf<m> d;

    public r24(wlf<Context> wlf, wlf<i5b> wlf2, wlf<w51> wlf3, wlf<m> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        w51 w51 = this.c.get();
        e61 b2 = HubsGlueViewBinderFactories.b(this.d.get()).b(this.a.get(), w51, this.b.get());
        yif.g(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}

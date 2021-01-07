package defpackage;

import android.content.Context;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.ui.layout_traits.a;

/* renamed from: n17  reason: default package */
public final class n17 implements fjf<a> {
    private final wlf<Context> a;
    private final wlf<w51> b;

    public n17(wlf<Context> wlf, wlf<w51> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return GlueLayoutTraits.a(this.a.get(), new com.spotify.mobile.android.hubframework.defaults.a(this.b.get().g()), false);
    }
}

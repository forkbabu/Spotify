package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.music.features.charts.ChartsFragment;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

/* renamed from: dk4  reason: default package */
public final class dk4 implements fjf<e61> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<ChartsFragment> c;
    private final wlf<w51> d;
    private final wlf<m> e;

    public dk4(wlf<Context> wlf, wlf<c> wlf2, wlf<ChartsFragment> wlf3, wlf<w51> wlf4, wlf<m> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        c cVar = this.b.get();
        ChartsFragment chartsFragment = this.c.get();
        w51 w51 = this.d.get();
        m mVar = this.e.get();
        h.e(context, "context");
        h.e(cVar, "viewUri");
        h.e(chartsFragment, "fragment");
        h.e(w51, "config");
        h.e(mVar, "layoutManagerFactory");
        e61 a2 = HubsGlueViewBinderFactories.c(cVar).d(HubsGlueViewBinderFactories.HeaderPolicy.ALWAYS_ON_TOP).a(mVar).c(chartsFragment).a(context, w51);
        h.d(a2, "HubsGlueViewBinderFactor… .create(context, config)");
        return a2;
    }
}

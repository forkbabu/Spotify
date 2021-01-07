package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.music.libs.podcast.chartsv2.PodcastChartsFragment;
import com.spotify.music.libs.viewuri.c;

/* renamed from: jma  reason: default package */
public final class jma implements fjf<e61> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<w51> c;
    private final wlf<PodcastChartsFragment> d;
    private final wlf<m> e;

    public jma(wlf<Context> wlf, wlf<c.a> wlf2, wlf<w51> wlf3, wlf<PodcastChartsFragment> wlf4, wlf<m> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        e61 a2 = HubsGlueViewBinderFactories.c(this.b.get().getViewUri()).d(HubsGlueViewBinderFactories.HeaderPolicy.ALWAYS_ON_TOP).a(this.e.get()).c(this.d.get()).a(this.a.get(), this.c.get());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}

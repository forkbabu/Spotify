package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.music.features.freetiertrack.FreeTierTrackFragment;
import com.spotify.music.libs.viewuri.c;

/* renamed from: d95  reason: default package */
public final class d95 implements fjf<e61> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<FreeTierTrackFragment> c;
    private final wlf<w51> d;
    private final wlf<m> e;

    public d95(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<FreeTierTrackFragment> wlf3, wlf<w51> wlf4, wlf<m> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        e61 a2 = HubsGlueViewBinderFactories.c(this.b.get().getViewUri()).d(HubsGlueViewBinderFactories.HeaderPolicy.ALWAYS_ON_TOP).a(this.e.get()).c(this.c.get()).a(this.a.get(), this.d.get());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}

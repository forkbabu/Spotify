package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.music.libs.viewuri.c;

/* renamed from: t24  reason: default package */
public final class t24 implements fjf<e61> {
    private final wlf<c.a> a;
    private final wlf<Fragment> b;
    private final wlf<w51> c;
    private final wlf<Activity> d;
    private final wlf<m> e;

    public t24(wlf<c.a> wlf, wlf<Fragment> wlf2, wlf<w51> wlf3, wlf<Activity> wlf4, wlf<m> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.d.get();
        e61 a2 = HubsGlueViewBinderFactories.c(this.a.get().getViewUri()).d(HubsGlueViewBinderFactories.HeaderPolicy.ALWAYS_ON_TOP).a(this.e.get()).c(this.b.get()).a(activity, this.c.get());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}

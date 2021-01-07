package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import defpackage.w51;
import java.util.Map;

/* renamed from: w24  reason: default package */
public final class w24 implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<Map<String, a71>> c;
    private final wlf<i> d;
    private final wlf<v> e;
    private final wlf<vqa> f;
    private final wlf<m24> g;

    public w24(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<Map<String, a71>> wlf3, wlf<i> wlf4, wlf<v> wlf5, wlf<vqa> wlf6, wlf<m24> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        v.b a2 = this.e.get().a(this.a.get(), this.b.get());
        int i = p71.a;
        w51.b a3 = a2.c(i71.b).a(this.c.get()).a(this.d.get());
        a3.j(C0707R.id.hub_clear_search_history_component, "search:clearSearchHistory", new n68());
        a3.j(C0707R.id.hubs_assisted_curation_track, "ac:track", this.g.get());
        a3.j(C0707R.id.search_empty_state, "search:EmptyState", this.f.get());
        return a3.a();
    }
}

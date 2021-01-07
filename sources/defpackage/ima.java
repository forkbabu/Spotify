package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import defpackage.w51;

/* renamed from: ima  reason: default package */
public final class ima implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<v> b;
    private final wlf<c.a> c;
    private final wlf<v3> d;
    private final wlf<p71> e;
    private final wlf<vma> f;
    private final wlf<sma> g;
    private final wlf<ana> h;
    private final wlf<xma> i;

    public ima(wlf<Context> wlf, wlf<v> wlf2, wlf<c.a> wlf3, wlf<v3> wlf4, wlf<p71> wlf5, wlf<vma> wlf6, wlf<sma> wlf7, wlf<ana> wlf8, wlf<xma> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        w51.b b2 = this.b.get().a(this.a.get(), this.c.get()).b(this.d.get(), this.e.get()).b();
        b2.j(C0707R.id.hubs_podcast_charts_header, "podcastcharts:header", this.f.get());
        b2.j(C0707R.id.hubs_podcast_charts_card, "podcastcharts:card", this.g.get());
        b2.j(C0707R.id.hubs_podcast_charts_row, "podcastcharts:indexedImageRankRow", this.h.get());
        b2.j(C0707R.id.hubs_podcast_charts_list_header, "podcastcharts:chartHeader", this.i.get());
        return b2.a();
    }
}

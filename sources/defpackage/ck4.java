package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.C0707R;
import com.spotify.music.features.charts.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import defpackage.w51;
import kotlin.jvm.internal.h;

/* renamed from: ck4  reason: default package */
public final class ck4 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<v> b;
    private final wlf<c.a> c;
    private final wlf<v3> d;
    private final wlf<p71> e;
    private final wlf<p64> f;
    private final wlf<sma> g;
    private final wlf<nk4> h;
    private final wlf<a> i;

    public ck4(wlf<Context> wlf, wlf<v> wlf2, wlf<c.a> wlf3, wlf<v3> wlf4, wlf<p71> wlf5, wlf<p64> wlf6, wlf<sma> wlf7, wlf<nk4> wlf8, wlf<a> wlf9) {
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
        Context context = this.a.get();
        v vVar = this.b.get();
        c.a aVar = this.c.get();
        v3 v3Var = this.d.get();
        p71 p71 = this.e.get();
        p64 p64 = this.f.get();
        sma sma = this.g.get();
        nk4 nk4 = this.h.get();
        a aVar2 = this.i.get();
        h.e(context, "context");
        h.e(vVar, "config");
        h.e(aVar, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(v3Var, "contextMenuProvider");
        h.e(p71, "hubsLogger");
        h.e(p64, "tertiaryButtonComponent");
        h.e(sma, "podcastChartsCardComponent");
        h.e(nk4, "gradientHeaderComponent");
        h.e(aVar2, "albumChartRowComponent");
        w51.b b2 = vVar.a(context, aVar).c(p71).b(v3Var, p71).b();
        b2.j(C0707R.id.find_tertiary_button, "find:tertiaryButton", p64);
        b2.j(C0707R.id.find_header, "find:header", nk4);
        b2.j(C0707R.id.hubs_podcast_charts_card, "podcastcharts:card", sma);
        b2.j(C0707R.id.album_charts_row, "charts:albumChartRow", aVar2);
        w51 a2 = b2.a();
        h.d(a2, "config.getDefault(contex…   )\n            .build()");
        return a2;
    }
}

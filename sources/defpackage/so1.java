package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import defpackage.w51;
import kotlin.jvm.internal.h;

/* renamed from: so1  reason: default package */
public final class so1 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<v3> c;
    private final wlf<p71> d;
    private final wlf<v> e;
    private final wlf<xo1> f;
    private final wlf<vo1> g;
    private final wlf<zo1> h;
    private final wlf<dp1> i;

    public so1(wlf<Context> wlf, wlf<c.a> wlf2, wlf<v3> wlf3, wlf<p71> wlf4, wlf<v> wlf5, wlf<xo1> wlf6, wlf<vo1> wlf7, wlf<zo1> wlf8, wlf<dp1> wlf9) {
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
        c.a aVar = this.b.get();
        v3 v3Var = this.c.get();
        p71 p71 = this.d.get();
        v vVar = this.e.get();
        xo1 xo1 = this.f.get();
        vo1 vo1 = this.g.get();
        zo1 zo1 = this.h.get();
        dp1 dp1 = this.i.get();
        h.e(context, "context");
        h.e(aVar, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(v3Var, "contextMenuProvider");
        h.e(p71, "hubsInteractionLogger");
        h.e(vVar, "spotifyHubsConfig");
        h.e(xo1, "headerComponent");
        h.e(vo1, "headerCloseComponent");
        h.e(zo1, "headerParentComponent");
        h.e(dp1, "rowComponent");
        w51.b b2 = vVar.a(context, aVar).b(v3Var, p71).b();
        b2.j(C0707R.id.on_demand_playlists_row_component, "skipLimitSuggestions:imageRow", dp1);
        b2.j(C0707R.id.on_demand_playlists_header_component, "header", xo1);
        b2.j(C0707R.id.on_demand_playlists_header_close_component, "closeButton", vo1);
        b2.j(C0707R.id.on_demand_playlists_header_parent_component, "parent", zo1);
        w51 a2 = b2.a();
        h.d(a2, "spotifyHubsConfig\n      …ent\n            ).build()");
        return a2;
    }
}

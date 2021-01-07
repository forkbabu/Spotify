package com.spotify.music.features.playlistentity.viewbinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.t;
import com.spotify.pageloader.s0;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import com.spotify.ubi.specification.factories.k2;
import io.reactivex.y;
import java.util.Collections;

public class o0 implements s0 {
    private final String a;
    private final t b;
    private final y c;
    private final p f;
    private final ere n;
    private final v o;
    private final k2.g p;
    private final com.spotify.rxjava2.p q = new com.spotify.rxjava2.p();
    private final com.spotify.rxjava2.p r = new com.spotify.rxjava2.p();
    private gb0 s;

    public interface a {
    }

    public o0(t tVar, p pVar, v vVar, ere ere, y yVar, String str) {
        this.a = str;
        this.b = tVar;
        this.c = yVar;
        this.f = pVar;
        this.o = vVar;
        this.n = ere;
        this.p = new k2(PageIdentifiers.PLAYLIST_NOTLOADED.path(), str, "404 not found").h();
    }

    public /* synthetic */ void a(View view) {
        this.n.a(this.p.g().c().a(this.a));
        com.spotify.rxjava2.p pVar = this.q;
        io.reactivex.a A = this.o.d(this.a).B().A(this.c);
        t tVar = this.b;
        tVar.getClass();
        pVar.b(A.subscribe(new b0(tVar)));
    }

    public /* synthetic */ void b(Boolean bool) {
        this.s.b2(bool.booleanValue());
        if (bool.booleanValue()) {
            this.n.a(this.p.g().c().b());
        }
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.s.getView();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        gb0 a2 = e90.c().a(context, viewGroup);
        this.s = a2;
        a2.setTitle(C0707R.string.playlist_entity_not_found_placeholder_title);
        this.s.A2(C0707R.string.playlist_entity_not_found_placeholder_subtitle);
        this.s.b2(false);
        this.s.w(C0707R.string.playlist_entity_not_found_placeholder_button);
        this.s.i().setOnClickListener(new h(this));
        this.s.getView().setId(C0707R.id.not_found);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.r.b(this.f.c(Collections.singletonList(this.a)).E(g.a).A(f.a).B(this.c).subscribe(new i(this)));
        this.n.a(this.p.g().b());
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.q.a();
        this.r.a();
    }
}

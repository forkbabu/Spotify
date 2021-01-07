package com.spotify.music.features.playlistentity.viewbinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.t;
import com.spotify.pageloader.s0;
import com.spotify.ubi.specification.factories.k2;

public class l0 implements s0 {
    private final t a;
    private final ere b;
    private final k2.g c;
    private gb0 f;

    public interface a {
    }

    public l0(t tVar, ere ere, String str) {
        this.a = tVar;
        this.b = ere;
        this.c = new k2(PageIdentifiers.PLAYLIST_NOTLOADED.path(), str, "personal playlist lookup failed").h();
    }

    public /* synthetic */ void a(View view) {
        nqe a2 = this.c.f().b().a("spotify:made-for-you");
        this.b.a(a2);
        this.a.b("spotify:made-for-you", a2.b());
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.f.getView();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        gb0 a2 = e90.c().a(context, viewGroup);
        this.f = a2;
        a2.setTitle(C0707R.string.playlist_entity_lookup_failed_placeholder_title);
        this.f.A2(C0707R.string.playlist_entity_lookup_failed_placeholder_subtitle);
        this.f.w(C0707R.string.playlist_entity_lookup_failed_placeholder_button);
        this.f.b2(true);
        this.f.i().setOnClickListener(new b(this));
        this.f.getView().setId(C0707R.id.lookup_failed);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.a(this.c.f().c());
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}

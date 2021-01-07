package com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.premiummini.a;
import com.spotify.music.premiummini.ui.b;
import com.spotify.rxjava2.p;
import kotlin.jvm.internal.h;

public final class PremiumMiniRemoveAllSongsItem implements gu6 {
    private final p a = new p();
    private final b b;
    private final a c;

    public PremiumMiniRemoveAllSongsItem(b bVar, a aVar) {
        h.e(bVar, "dialogManager");
        h.e(aVar, "offlinePlaylistManager");
        this.b = bVar;
        this.c = aVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        h.e(a0Var, "menu");
        h.e(h76, "playlistMetadata");
        a0Var.j(C0707R.id.premium_mini_remove_all_songs_toolbar_menu_item, C0707R.string.premium_mini_toolbar_remove_all_song_title, l70.i(a0Var.getContext(), SpotifyIconV2.DOWNLOAD)).a(new PremiumMiniRemoveAllSongsItem$bind$1(this));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        h.e(toolbarConfiguration, "toolbarConfiguration");
        h.e(h76, "playlistMetadata");
        return h76.k() > 0;
    }

    @Override // defpackage.gu6
    public /* synthetic */ void f() {
        fu6.b(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void h() {
        fu6.a(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void onStart() {
        fu6.c(this);
    }

    @Override // defpackage.gu6
    public void onStop() {
        this.a.a();
    }
}

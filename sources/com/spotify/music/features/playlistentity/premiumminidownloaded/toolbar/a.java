package com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import defpackage.iq6;
import kotlin.jvm.internal.h;

public final class a implements gu6 {
    private final kq6 a;

    /* renamed from: com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar.a$a  reason: collision with other inner class name */
    static final class RunnableC0245a implements Runnable {
        final /* synthetic */ a a;

        RunnableC0245a(a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.a(new iq6.a(0, 1));
        }
    }

    public a(kq6 kq6) {
        h.e(kq6, "addRemoveAction");
        this.a = kq6;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        h.e(a0Var, "menu");
        h.e(h76, "playlistMetadata");
        a0Var.j(C0707R.id.premium_mini_add_songs_toolbar_menu_item, C0707R.string.premium_mini_toolbar_add_song_title, l70.i(a0Var.getContext(), SpotifyIconV2.PLUS_ALT)).a(new RunnableC0245a(this));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        h.e(toolbarConfiguration, "toolbarConfiguration");
        h.e(h76, "playlistMetadata");
        return h76.k() < 30;
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
    public /* synthetic */ void onStop() {
        fu6.d(this);
    }
}

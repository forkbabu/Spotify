package com.spotify.music.lyrics.fullscreen;

import com.spotify.music.lyrics.core.experience.contract.a;
import com.spotify.music.lyrics.share.common.sharebutton.b;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class n {
    public static void a(LyricsFullscreenFragment lyricsFullscreenFragment, cqe cqe) {
        lyricsFullscreenFragment.A0 = cqe;
    }

    public static void b(LyricsFullscreenFragment lyricsFullscreenFragment, a aVar) {
        lyricsFullscreenFragment.B0 = aVar;
    }

    public static void c(LyricsFullscreenFragment lyricsFullscreenFragment, t tVar) {
        lyricsFullscreenFragment.v0 = tVar;
    }

    public static void d(LyricsFullscreenFragment lyricsFullscreenFragment, o oVar) {
        lyricsFullscreenFragment.y0 = oVar;
    }

    public static void e(LyricsFullscreenFragment lyricsFullscreenFragment, e eVar) {
        lyricsFullscreenFragment.x0 = eVar;
    }

    public static void f(LyricsFullscreenFragment lyricsFullscreenFragment, com.spotify.nowplaying.ui.components.controls.seekbar.e eVar) {
        lyricsFullscreenFragment.w0 = eVar;
    }

    public static void g(LyricsFullscreenFragment lyricsFullscreenFragment, b bVar) {
        lyricsFullscreenFragment.C0 = bVar;
    }

    public static void h(LyricsFullscreenFragment lyricsFullscreenFragment, qfb qfb) {
        lyricsFullscreenFragment.z0 = qfb;
    }

    public static t i(m mVar, g<PlayerState> gVar, g<Long> gVar2, y yVar, edb edb) {
        return new t(mVar, gVar, gVar2, yVar, edb);
    }
}

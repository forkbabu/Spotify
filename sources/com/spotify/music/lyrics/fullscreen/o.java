package com.spotify.music.lyrics.fullscreen;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.lyrics.fullscreen.views.LyricsFullscreenHeaderView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import io.reactivex.g;

public class o {
    private final g<PlayerState> a;
    private final Picasso b;
    private final p c = new p();
    private LyricsFullscreenHeaderView d;

    public o(g<PlayerState> gVar, Picasso picasso) {
        this.a = gVar;
        this.b = picasso;
    }

    public static void a(o oVar, PlayerState playerState) {
        oVar.getClass();
        ContextTrack contextTrack = playerState.track().get();
        Drawable d2 = yc0.d(oVar.d.getContext(), SpotifyIconV2.TRACK, (float) nud.g(32.0f, oVar.d.getContext().getResources()));
        oVar.b.d(o.class.getName());
        String c2 = kxd.c(contextTrack);
        z l = oVar.b.l(!TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY);
        l.t(d2);
        l.g(d2);
        l.w(o.class.getName());
        l.m(oVar.d.getCoverArtImageView());
        oVar.d.a(contextTrack.metadata().get("artist_name"), contextTrack.metadata().get("title"));
    }

    public void b(LyricsFullscreenHeaderView lyricsFullscreenHeaderView) {
        this.d = lyricsFullscreenHeaderView;
        this.c.b(this.a.subscribe(new e(this)));
    }

    public void c() {
        this.c.a();
    }
}

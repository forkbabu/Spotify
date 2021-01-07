package com.spotify.music.features.playlistentity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.intentrouter.m;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.playlistwebview.PlaylistWebViewFragment;
import com.spotify.music.features.playlistwebview.e;
import com.spotify.remoteconfig.h6;

public class v implements blb {
    private final h6 a;
    private final e b;
    private final epd c;

    class a implements m<l0> {
        a(v vVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.intentrouter.m
        public boolean a(l0 l0Var) {
            l0 l0Var2 = l0Var;
            return l0Var2.t() && l0Var2.q() == LinkType.PLAYLIST_FORMAT;
        }

        @Override // com.spotify.intentrouter.m
        public String description() {
            return "is playlist format and external";
        }
    }

    public v(h6 h6Var, e eVar, epd epd) {
        this.a = h6Var;
        this.b = eVar;
        this.c = epd;
    }

    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        Uri parse;
        if (this.b.b(l0Var)) {
            String B = l0Var.B();
            int i = PlaylistWebViewFragment.A0;
            Bundle E = je.E("PLAYLIST_ARGUMENT", B);
            PlaylistWebViewFragment playlistWebViewFragment = new PlaylistWebViewFragment();
            playlistWebViewFragment.r4(E);
            return playlistWebViewFragment;
        }
        String str2 = null;
        if (!this.c.b(intent)) {
            boolean s = l0Var.s();
            String e = l0Var.e();
            String F = l0Var.F();
            F.getClass();
            PlaylistFragment K4 = PlaylistFragment.K4(F, intent.getBooleanExtra("open_all_songs_dialog", false), s, Optional.fromNullable(e));
            Bundle k4 = K4.e().k4();
            String queryParameter = l0Var.a.getQueryParameter("prid");
            if (!TextUtils.isEmpty(queryParameter)) {
                str2 = queryParameter;
            } else {
                String queryParameter2 = l0Var.a.getQueryParameter("target_url");
                if (!(queryParameter2 == null || (parse = Uri.parse(queryParameter2)) == null || !parse.isHierarchical())) {
                    str2 = parse.getQueryParameter("prid");
                }
            }
            k4.putString("key_algotorial_identifier", str2);
            K4.e().r4(k4);
            return K4;
        }
        this.c.a(intent, l0Var);
        throw null;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        d dVar = new d(this);
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.TOPLIST, "Playlist Entity: V1 Toplist", dVar);
        xkb.i(LinkType.PLAYLIST_V2, "Playlist Entity: V2", dVar);
        xkb.i(LinkType.PROFILE_PLAYLIST, "Playlist Entity: V1", dVar);
        xkb.i(LinkType.PLAYLIST_AUTOPLAY, "Playlist Entity: V1 Autoplay", dVar);
        xkb.i(LinkType.PLAYLIST_V2_AUTOPLAY, "Playlist Entity: V2 Autoplay", dVar);
        if (this.a.a()) {
            xkb.k(new a(this), "Playlist Entity: Personal Playlist Lookup URI", c.a);
        }
    }
}

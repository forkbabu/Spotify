package com.spotify.music.features.podcast.entity.find;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import kotlin.jvm.internal.h;

public final class b implements blb {

    static final class a implements k {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            String str2;
            h.d(l0Var, "link");
            h.e(l0Var, "spotifyLink");
            if (l0Var.q() == LinkType.SHOW_FIND) {
                String k = l0Var.k();
                if (h.a(k, "find")) {
                    str2 = "";
                } else {
                    str2 = je.x0("spotify:show:", k);
                }
                h.e(str2, "showUri");
                FindInShowFragment findInShowFragment = new FindInShowFragment();
                Bundle bundle = new Bundle();
                bundle.putString("uri", str2);
                findInShowFragment.r4(bundle);
                return findInShowFragment;
            }
            throw new IllegalArgumentException("SpotifyLink " + l0Var + " should be LinkType.SHOW_FIND");
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).i(LinkType.SHOW_FIND, "Handle routing to a page to find episodes within a specific show.", a.a);
    }
}

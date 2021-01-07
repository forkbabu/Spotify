package com.spotify.music.features.listeninghistory;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
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
            h.e(cVar, "flags");
            h.e(cVar, "flags");
            ListeningHistoryFragment listeningHistoryFragment = new ListeningHistoryFragment();
            d.a(listeningHistoryFragment, cVar);
            return listeningHistoryFragment;
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.LISTENING_HISTORY, "Display the Listening History fragment", a.a);
    }
}

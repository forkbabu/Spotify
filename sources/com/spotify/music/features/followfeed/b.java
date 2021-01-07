package com.spotify.music.features.followfeed;

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
            FollowFeedFragment followFeedFragment = new FollowFeedFragment();
            d.a(followFeedFragment, cVar);
            return followFeedFragment;
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.FOLLOWFEED, "Display the follow feed fragment", a.a);
    }
}

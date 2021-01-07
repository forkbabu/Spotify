package com.spotify.music.features.yourepisodes;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import kotlin.jvm.internal.h;

public final class c0 implements blb {
    private final lbb a;

    static final class a implements flb {
        final /* synthetic */ c0 a;

        a(c0 c0Var) {
            this.a = c0Var;
        }

        @Override // defpackage.flb
        public final elb a(Intent intent, c cVar, SessionState sessionState) {
            if (!this.a.a.a()) {
                return elb.a();
            }
            YourEpisodesFragment yourEpisodesFragment = YourEpisodesFragment.n0;
            h.d(cVar, "flags");
            String currentUser = sessionState.currentUser();
            h.d(currentUser, "sessionState.currentUser()");
            h.e(cVar, "flags");
            h.e(currentUser, "username");
            YourEpisodesFragment yourEpisodesFragment2 = new YourEpisodesFragment();
            Bundle bundle = new Bundle();
            bundle.putString("username", currentUser);
            yourEpisodesFragment2.r4(bundle);
            d.a(yourEpisodesFragment2, cVar);
            return elb.d(yourEpisodesFragment2);
        }
    }

    static final class b implements flb {
        public static final b a = new b();

        b() {
        }

        @Override // defpackage.flb
        public final elb a(Intent intent, c cVar, SessionState sessionState) {
            return elb.c(l0.z("spotify:collection:your-episodes"));
        }
    }

    public c0(lbb lbb) {
        h.e(lbb, "yourEpisodesFlags");
        this.a = lbb;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.k(mlb.b(LinkType.COLLECTION_YOUR_EPISODES), "Your Episodes: Podcast episodes saved by the user", new fkb(new a(this)));
        xkb.k(mlb.b(LinkType.COLLECTION_YOUR_EPISODES_CORE), "Your Episodes: Podcast episodes saved by the user bucket", new fkb(b.a));
    }
}

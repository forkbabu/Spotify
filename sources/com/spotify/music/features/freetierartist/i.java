package com.spotify.music.features.freetierartist;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

public class i implements blb {
    private final mfa a;

    public i(mfa mfa) {
        this.a = mfa;
    }

    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String F = l0Var.F();
        F.getClass();
        return this.a.b(F, intent.getExtras(), cVar);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.ARTIST_CONCERT, "Show artist concert fragment", new a(this));
    }
}

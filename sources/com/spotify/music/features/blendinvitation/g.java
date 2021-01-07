package com.spotify.music.features.blendinvitation;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import kotlin.jvm.internal.h;

public final class g implements blb {

    static final class a implements k {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            h.d(intent, "intent");
            Bundle extras = intent.getExtras();
            BlendInvitationFragment blendInvitationFragment = new BlendInvitationFragment();
            blendInvitationFragment.r4(extras);
            return blendInvitationFragment;
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).i(LinkType.BLEND_INVITATION, "Blend Invitation page", a.a);
    }
}

package com.spotify.music.carmodehome;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import com.spotify.music.sociallistening.participantlist.impl.m;
import kotlin.jvm.internal.h;

public final class a implements blb {

    /* renamed from: com.spotify.music.carmodehome.a$a  reason: collision with other inner class name */
    static final class C0207a implements k {
        public static final C0207a a = new C0207a();

        C0207a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            h.d(cVar, "flags");
            String currentUser = sessionState.currentUser();
            h.d(currentUser, "sessionState.currentUser()");
            h.e(cVar, "flags");
            h.e(currentUser, "username");
            CarModeHomeFragment carModeHomeFragment = new CarModeHomeFragment();
            d.a(carModeHomeFragment, cVar);
            m.d(carModeHomeFragment, yn0.a(kfd.q));
            carModeHomeFragment.k4().putString("username", currentUser);
            return carModeHomeFragment;
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.CAR_MODE_HOME, "Car Mode Home", C0207a.a);
    }
}

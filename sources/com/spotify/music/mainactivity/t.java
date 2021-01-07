package com.spotify.music.mainactivity;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.marquee.q;
import com.spotify.music.navigation.g;
import com.spotify.music.navigation.h;
import com.spotify.music.navigation.o;
import com.spotify.music.navigation.r;
import com.spotify.music.navigation.w;
import com.spotify.music.z0;

public class t {
    private final Context a;
    private final gha b;
    private final h c;
    private final z0 d;
    private final m e;
    private final r f;
    private final w g;

    public t(Context context, gha gha, h hVar, z0 z0Var, m mVar, r rVar, w wVar) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(gha, "homeFeatureIntentResolver");
        kotlin.jvm.internal.h.e(hVar, "backStackFragmentDescriptionFactory");
        kotlin.jvm.internal.h.e(z0Var, "viewIntentBuilder");
        kotlin.jvm.internal.h.e(mVar, "navigationLogger");
        kotlin.jvm.internal.h.e(rVar, "navigationManagerBackStack");
        kotlin.jvm.internal.h.e(wVar, "referrerApplicator");
        this.a = context;
        this.b = gha;
        this.c = hVar;
        this.d = z0Var;
        this.e = mVar;
        this.f = rVar;
        this.g = wVar;
    }

    public void a(c cVar, SessionState sessionState) {
        kotlin.jvm.internal.h.e(cVar, "flags");
        kotlin.jvm.internal.h.e(sessionState, "sessionState");
        Intent a2 = this.d.a(this.a).a();
        kotlin.jvm.internal.h.d(a2, "intent");
        s a3 = ((sf5) this.b).a(a2, l0.z(a2.getDataString()), "home", cVar, sessionState);
        g a4 = this.c.a(a2, a3);
        com.spotify.music.navigation.c a5 = q.a(a2);
        this.g.a(a3, a2);
        m mVar = this.e;
        f a6 = o.a(a2);
        kotlin.jvm.internal.h.d(a6, "NavigationIntentToIntent…tNavigationAction(intent)");
        mVar.c(a6, "NavigationManagerBackStack.pushFragment");
        r rVar = this.f;
        kotlin.jvm.internal.h.d(a3, "identifier");
        rVar.b(a3.e(), a4.d(), a4.b(), a4.c(), a4.a(), false, a5);
    }
}

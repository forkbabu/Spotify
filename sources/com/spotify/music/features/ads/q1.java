package com.spotify.music.features.ads;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.fragment.app.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.q0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.web.RxWebToken;

public class q1 implements blb {
    private final String a;
    private final gha b;
    private final RxWebToken c;
    private final c d;

    public q1(c cVar, gha gha, RxWebToken rxWebToken) {
        Resources resources = cVar.getResources();
        this.d = cVar;
        this.b = gha;
        this.c = rxWebToken;
        this.a = resources.getString(C0707R.string.ad_partner_preferences_url);
    }

    public static elb c(q1 q1Var, Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        new q0(q1Var.c).b(q1Var.a, new v(q1Var));
        return ((sf5) q1Var.b).c(intent, cVar, sessionState);
    }

    public /* synthetic */ void a(Uri uri) {
        this.d.startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).f(jlb.b(this.a), "Ads partner reference URL", new w(this));
    }
}

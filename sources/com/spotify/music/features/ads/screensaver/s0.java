package com.spotify.music.features.ads.screensaver;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.ads.model.Ad;

public class s0 implements blb {
    private final j0 a;

    public s0(j0 j0Var) {
        this.a = j0Var;
    }

    public void a(Intent intent, c cVar, SessionState sessionState) {
        j0 j0Var = this.a;
        Bundle extras = intent.getExtras();
        MoreObjects.checkNotNull(extras, "Expected ad in extras");
        j0Var.b((Ad) extras.getParcelable("screensaver_ad"));
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).d("com.spotify.mobile.android.ui.action.ads.screensaver.SHOW", "Show a screensaver ad", new v(this));
    }
}

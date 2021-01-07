package com.spotify.feature.speakerdeeplink;

import android.content.Intent;
import androidx.appcompat.app.g;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;

public class SpeakerDeepLinkPlugin implements ygb, m {
    private final s a;

    SpeakerDeepLinkPlugin(g gVar, s sVar) {
        this.a = sVar;
        gVar.A().a(this);
    }

    @Override // defpackage.ygb
    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("DEVICE_ID");
        if (stringExtra != null) {
            this.a.a(stringExtra);
        }
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.a.stop();
    }
}

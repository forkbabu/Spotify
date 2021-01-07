package com.spotify.music.features.voice;

import android.content.Intent;
import androidx.fragment.app.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.a;

final class o implements flb {
    private final c a;
    private final ifd b;
    private final a c;

    o(a aVar, c cVar, ifd ifd) {
        this.c = aVar;
        this.a = cVar;
        this.b = ifd;
    }

    @Override // defpackage.flb
    public elb a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        this.c.a(this.a, VoiceSourceElement.DEEPLINK, this.b, l0.z(intent.getDataString()).B());
        return elb.a();
    }
}

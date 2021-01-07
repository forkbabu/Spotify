package com.spotify.music.features.voice;

import android.content.Intent;
import androidx.fragment.app.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.b;
import com.spotify.player.model.PlayerState;
import io.reactivex.a;
import io.reactivex.d0;
import io.reactivex.g;
import io.reactivex.z;
import java.util.Collections;
import java.util.List;

final class t implements vkb {
    private final c a;
    private final y b;
    private final ifd c;
    private final b d;
    private final g<PlayerState> e;

    t(b bVar, c cVar, y yVar, g<PlayerState> gVar, ifd ifd) {
        this.d = bVar;
        this.a = cVar;
        this.b = yVar;
        this.e = gVar;
        this.c = ifd;
    }

    @Override // defpackage.vkb
    public z<elb> a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        return z.R(this.b.d().R(Boolean.FALSE), this.e.E(), b.a).s(new k(this, intent));
    }

    public /* synthetic */ void b(Intent intent) {
        List<String> list;
        List<String> pathSegments = l0.z(intent.getDataString()).a.getPathSegments();
        b bVar = this.d;
        c cVar = this.a;
        VoiceSourceElement voiceSourceElement = VoiceSourceElement.DEEPLINK;
        ifd ifd = this.c;
        if (pathSegments.size() > 1) {
            list = pathSegments.subList(1, pathSegments.size());
        } else {
            list = Collections.emptyList();
        }
        bVar.a(cVar, voiceSourceElement, ifd, list);
    }

    public /* synthetic */ d0 c(Intent intent, u3 u3Var) {
        S s = u3Var.b;
        S s2 = s == null ? PlayerState.EMPTY : s;
        String stringExtra = intent.getStringExtra("com.spotify.voice.experience.KEY_EXTRA_ELEMENT_ID");
        VoiceSourceElement voiceSourceElement = VoiceSourceElement.WAKEWORD;
        boolean equals = voiceSourceElement.d().equals(stringExtra);
        if (!u3Var.a.booleanValue()) {
            return a.u(new j(this, intent)).h(z.z(elb.a()));
        }
        if (!equals) {
            voiceSourceElement = VoiceSourceElement.CAR_MODE_MIC_BUTTON;
        }
        return z.z(elb.d(new gw8(voiceSourceElement, this.c, s2, "Active")));
    }
}

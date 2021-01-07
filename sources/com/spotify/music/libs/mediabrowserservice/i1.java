package com.spotify.music.libs.mediabrowserservice;

import com.spotify.mobile.android.service.media.b3;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.genie.p;
import com.spotify.music.libs.audio.focus.o;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;

public class i1 extends a2 {
    private final l1 q;
    private final o r;

    public i1(v1 v1Var, PlayOrigin playOrigin, cqe cqe, d dVar, pea pea, e0 e0Var, p pVar, b3 b3Var, l1 l1Var, o oVar, v1 v1Var2) {
        super(v1Var, playOrigin, cqe, dVar, pea, e0Var, pVar, b3Var, v1Var2);
        this.q = l1Var;
        l1Var.c();
        this.r = oVar;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.a2, android.support.v4.media.session.MediaSessionCompat.a
    public void e() {
        super.e();
        if (this.q.d()) {
            this.f.Z2().c();
            this.r.abandonAudioFocus();
        }
    }

    @Override // com.spotify.music.libs.mediabrowserservice.a2
    public void u() {
        this.p.dispose();
        this.q.a();
    }
}

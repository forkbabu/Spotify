package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.service.media.b3;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.genie.p;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediabrowserservice.a2;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;

/* renamed from: p04  reason: default package */
public class p04 extends a2 {
    public p04(v1 v1Var, PlayOrigin playOrigin, cqe cqe, d dVar, pea pea, e0 e0Var, p pVar, b3 b3Var, com.spotify.music.libs.mediabrowserservice.v1 v1Var2) {
        super(v1Var, playOrigin, cqe, dVar, pea, e0Var, pVar, b3Var, v1Var2);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.a2, android.support.v4.media.session.MediaSessionCompat.a
    public void f() {
        this.f.A3().h();
        super.f();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.a2, android.support.v4.media.session.MediaSessionCompat.a
    public void g(String str, Bundle bundle) {
        this.f.A3().h();
        super.g(str, bundle);
    }
}

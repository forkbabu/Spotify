package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.radiohub.view.RadioHubFragment;

/* renamed from: i38  reason: default package */
public final /* synthetic */ class i38 implements flb {
    public static final /* synthetic */ i38 a = new i38();

    private /* synthetic */ i38() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        return elb.d(new RadioHubFragment());
    }
}

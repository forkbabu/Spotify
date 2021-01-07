package defpackage;

import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.http.contentaccesstoken.c;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.mobile.android.video.v;

/* renamed from: ec1  reason: default package */
public class ec1 implements SpotifyServiceIntentProcessor {
    private final aw8 a;
    private final SessionClient b;
    private final e0e c;
    private final c f;

    public ec1(aw8 aw8, SessionClient sessionClient, e0e e0e, c cVar) {
        this.a = aw8;
        this.b = sessionClient;
        this.c = e0e;
        this.f = cVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        MoreObjects.checkArgument(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.session.LOGOUT"));
        v vVar = new v(new xb1(new wb1(this)));
        v.b d = vVar.d();
        this.a.c(vVar);
        d.a();
        if (this.f.f()) {
            this.f.a();
        }
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }

    public /* synthetic */ void c() {
        this.c.c().i();
        this.b.logoutAndForgetCredentials().i();
    }
}

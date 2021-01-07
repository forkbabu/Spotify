package defpackage;

import android.content.Intent;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.playback.api.f;
import com.spotify.player.controls.c;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ly5  reason: default package */
public final class ly5 implements d, SpotifyServiceIntentProcessor {
    private final g<PlayerState> a;
    private final wlf<com.spotify.player.controls.d> b;
    private final g<Boolean> c;
    private final hy5 f;
    private final f n;
    private final y o;
    private final q p = new q();
    private boolean q;

    public ly5(y yVar, g<PlayerState> gVar, wlf<com.spotify.player.controls.d> wlf, hy5 hy5, ConnectManager connectManager, f fVar) {
        this.o = yVar;
        this.a = gVar;
        this.b = wlf;
        this.f = hy5;
        this.c = connectManager.g().b0(Boolean.FALSE);
        this.n = fVar;
    }

    private void e() {
        if (this.q) {
            this.f.stop();
            this.q = false;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        if (!this.n.b() && this.b.get() != null) {
            this.p.a(this.b.get().a(c.c()).subscribe());
        }
        e();
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }

    public void c(u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s = u3Var.b;
        s.getClass();
        boolean booleanValue = s.booleanValue();
        if (!f3.isPlaying() || f3.isPaused() || booleanValue) {
            if (!f3.isPlaying() || booleanValue) {
                e();
            }
        } else if (!this.q) {
            this.q = true;
            this.f.start();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.p.a(g.i(this.a, this.c, sx5.a).Q(this.o).subscribe(new nx5(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        e();
        this.p.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PlaybackNotificationManager";
    }
}

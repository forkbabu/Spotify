package defpackage;

import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.player.controls.c;
import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.z;

/* renamed from: ny5  reason: default package */
public class ny5 implements SpotifyServiceIntentProcessor, d {
    private final q a = new q();
    private final wlf<com.spotify.player.controls.d> b;
    private final g<PlayerState> c;
    private final mz5 f;
    private final cqe n;
    private final h o;
    private com.spotify.player.controls.d p;
    private String q = "";

    ny5(wlf<com.spotify.player.controls.d> wlf, g<PlayerState> gVar, mz5 mz5, h hVar, cqe cqe) {
        this.b = wlf;
        this.c = gVar;
        this.f = mz5;
        this.o = hVar;
        this.n = cqe;
    }

    private String c() {
        GaiaDevice b2 = this.o.b();
        return (b2 == null || b2.isSelf()) ? "local_device" : b2.getLoggingIdentifier();
    }

    private z<zwd> h(int i) {
        g<PlayerState> gVar = this.c;
        gVar.getClass();
        z A = new v(gVar).N0(1).B0().A(new qx5(this, i)).A(hx5.a);
        com.spotify.player.controls.d dVar = this.p;
        dVar.getClass();
        return A.s(new ix5(dVar));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        SpotifyServiceIntentProcessor.Result result = SpotifyServiceIntentProcessor.Result.NOT_PROCESSED;
        if (this.p == null) {
            return result;
        }
        intent.getAction().getClass();
        String stringExtra = intent.getStringExtra("mode");
        stringExtra.getClass();
        String action = intent.getAction();
        action.hashCode();
        action.hashCode();
        char c2 = 65535;
        switch (action.hashCode()) {
            case -1841495602:
                if (action.equals("com.spotify.music.features.playbacknotification.RESUME")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1668979960:
                if (action.equals("com.spotify.music.features.playbacknotification.SEEK_BACK_15_SEC")) {
                    c2 = 1;
                    break;
                }
                break;
            case -730021774:
                if (action.equals("com.spotify.music.features.playbacknotification.SKIP_NEXT")) {
                    c2 = 2;
                    break;
                }
                break;
            case -729950286:
                if (action.equals("com.spotify.music.features.playbacknotification.SKIP_PREV")) {
                    c2 = 3;
                    break;
                }
                break;
            case -558735594:
                if (action.equals("com.spotify.music.features.playbacknotification.SEEK_FORWARD_15_SEC")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1185558549:
                if (action.equals("com.spotify.music.features.playbacknotification.PAUSE")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.f.c(stringExtra, c(), this.q);
                this.a.a(this.p.a(c.e()).subscribe());
                break;
            case 1:
                this.f.d(stringExtra, c(), this.q);
                this.a.a(h(-15000).subscribe());
                break;
            case 2:
                this.f.f(stringExtra, c(), this.q);
                this.a.a(this.p.a(c.i()).subscribe());
                break;
            case 3:
                this.f.g(stringExtra, c(), this.q);
                this.a.a(this.p.a(c.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).subscribe());
                break;
            case 4:
                this.f.e(stringExtra, c(), this.q);
                this.a.a(h(15000).subscribe());
                break;
            case 5:
                this.f.b(stringExtra, c(), this.q);
                this.a.a(this.p.a(c.c()).subscribe());
                break;
            default:
                Assertion.g(String.format("PlaybackNotificationPlayerIntentProcessor cannot handle %s", intent));
                return result;
        }
        return SpotifyServiceIntentProcessor.Result.PROCESSED;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.p = this.b.get();
        this.a.a(this.c.l(PlayerStateTransformers.c()).O(ox5.a).subscribe(new px5(this)));
    }

    public /* synthetic */ void e(String str) {
        this.q = str;
    }

    public /* synthetic */ Long f(int i, PlayerState playerState) {
        return Long.valueOf(playerState.position(this.n.d()).or((Optional<Long>) 0L).longValue() + ((long) i));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.p = null;
        this.a.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PlaybackNotificationPlayerIntentProcessor";
    }
}

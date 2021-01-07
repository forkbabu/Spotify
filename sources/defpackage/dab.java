package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.spotify.android.flags.c;
import com.spotify.http.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: dab  reason: default package */
public class dab implements blb {
    private final Player a;
    private final nsb b;
    private final u c;
    private final y d;
    private final fab e;

    public dab(u uVar, y yVar, nsb nsb, PlayerFactory playerFactory, fab fab) {
        this.c = uVar;
        this.d = yVar;
        this.b = nsb;
        this.a = playerFactory.create(ViewUris.g0.toString(), kfd.K0, bu9.t);
        this.e = fab;
    }

    public z a(Intent intent, c cVar, SessionState sessionState) {
        if (this.e.a()) {
            String uri = intent.getData().toString();
            l0 z = l0.z(uri);
            if (!TextUtils.isEmpty(uri) && z.q() == LinkType.LIVE_EVENT) {
                return cab.a(z.k(), new bab("Live event", "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8"), this.c).B(this.d).I(5, TimeUnit.SECONDS).t(new x9b(this)).h(z.z(elb.a()));
            }
        }
        return z.z(elb.a());
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).k(mlb.b(LinkType.LIVE_EVENT), "Play live stream and navigate to NPV", new y9b(this));
    }

    public void c(PlayerContext playerContext) {
        this.a.play(playerContext, new PlayOptions.Builder().skipToIndex(0, 0).build());
        this.b.a();
    }
}

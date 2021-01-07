package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.Lyrics150CharactersSeen;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.ubi.specification.factories.q1;
import kotlin.jvm.internal.h;

/* renamed from: fdb  reason: default package */
public final class fdb implements edb {
    private final wlf<LegacyPlayerState> a;
    private final ere b;
    private final q1 c;
    private final gl0<u> d;

    public fdb(wlf<LegacyPlayerState> wlf, ere ere, q1 q1Var, gl0<u> gl0) {
        h.e(wlf, "playerStateProvider");
        h.e(ere, "userBehaviourEventLogger");
        h.e(q1Var, "mobileLyricsEventFactory");
        h.e(gl0, "eventPublisher");
        this.a = wlf;
        this.b = ere;
        this.c = q1Var;
        this.d = gl0;
    }

    private final String e() {
        String playbackId = this.a.get().playbackId();
        if (playbackId == null) {
            playbackId = null;
        }
        return playbackId != null ? playbackId : "";
    }

    private final String f() {
        String trackUri = PlayerStateUtil.getTrackUri(this.a.get());
        h.d(trackUri, "PlayerStateUtil.getTrack…layerStateProvider.get())");
        return trackUri;
    }

    @Override // defpackage.edb
    public void a() {
        this.b.a(this.c.b(f()).a());
    }

    @Override // defpackage.edb
    public void b() {
        gl0<u> gl0 = this.d;
        Lyrics150CharactersSeen.b m = Lyrics150CharactersSeen.m();
        m.o(f());
        m.n(e());
        m.m("card");
        gl0.c(m.build());
    }

    @Override // defpackage.edb
    public void c() {
        gl0<u> gl0 = this.d;
        Lyrics150CharactersSeen.b m = Lyrics150CharactersSeen.m();
        m.o(f());
        m.n(e());
        m.m("fullscreen");
        gl0.c(m.build());
    }

    @Override // defpackage.edb
    public void d() {
        this.b.a(this.c.c(f()).d().b().a(""));
    }
}

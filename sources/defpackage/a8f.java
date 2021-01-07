package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.VoicePlaybackAction;
import com.spotify.messages.VoicePlaybackError;
import com.spotify.player.model.PlayerState;
import com.spotify.player.sub.l;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: a8f  reason: default package */
public class a8f {
    private final g<PlayerState> a;
    private final gl0<u> b;
    private final p c = new p();

    public a8f(l lVar, gl0<u> gl0) {
        this.a = lVar.d();
        this.b = gl0;
    }

    public void a(String str, PlayerState playerState) {
        if (playerState.playbackId().isPresent()) {
            String str2 = playerState.playbackId().get();
            Logger.b("VoicePlaybackAction %s %s", str, str2);
            gl0<u> gl0 = this.b;
            VoicePlaybackAction.b l = VoicePlaybackAction.l();
            l.n(str);
            l.m(ByteString.h(z42.u(str2)));
            gl0.c((VoicePlaybackAction) l.build());
        }
    }

    public void b(String str, boolean z) {
        this.c.b(this.a.C(v7f.a).C(u7f.a).C(new s7f(z)).h0(1).a0().subscribe(new t7f(this, str), r7f.a));
    }

    public void c(String str, String str2, String str3, String str4) {
        gl0<u> gl0 = this.b;
        VoicePlaybackError.b n = VoicePlaybackError.n();
        n.p(str);
        n.o(str2);
        n.n(str3);
        n.m(str4);
        gl0.c(n.build());
    }
}

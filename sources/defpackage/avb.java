package defpackage;

import com.spotify.android.flags.c;
import com.spotify.music.feedback.b;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: avb  reason: default package */
public class avb {
    private final g<PlayerState> a;
    private final c b;
    private final b c;
    private final fm9 d;
    private final p e = new p();
    private String f = "";
    private rvb g;

    public avb(g<PlayerState> gVar, c cVar, b bVar, fm9 fm9) {
        this.a = gVar;
        this.b = cVar;
        this.c = bVar;
        this.d = fm9;
    }

    public static void a(avb avb, PlayerState playerState) {
        avb.getClass();
        String uri = playerState.track().get().uri();
        if (!avb.f.equals(uri)) {
            avb.f = uri;
            if (avb.d.a(avb.b)) {
                avb.g.a();
            } else if (avb.c.a(playerState) || agd.i(playerState.contextUri()) || agd.h(playerState.contextUri())) {
                avb.g.a();
            } else {
                avb.g.b();
            }
        }
    }

    public void b(rvb rvb) {
        rvb.getClass();
        this.g = rvb;
        this.e.b(this.a.subscribe(new pub(this)));
    }

    public void c() {
        this.e.a();
    }
}

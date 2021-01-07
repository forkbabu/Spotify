package defpackage;

import com.spotify.music.nowplaying.videoads.overlay.b;
import com.spotify.nowplaying.ui.components.overlay.k;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.q;
import defpackage.e5c;
import io.reactivex.g;

/* renamed from: c5c  reason: default package */
public class c5c implements k.a, e5c.a {
    private final g<Boolean> a;
    private final g<ContextTrack> b;
    private final q c = new q();
    private boolean d;
    private b e;

    public c5c(g<Boolean> gVar, g<ContextTrack> gVar2) {
        this.a = gVar;
        this.b = gVar2;
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k.a
    public void a(boolean z) {
        if (!this.d) {
            this.e.f(false);
        } else if (this.e.c()) {
            this.e.e();
        } else {
            this.e.f(true);
        }
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k.a
    public void b() {
    }

    public /* synthetic */ void c(Boolean bool) {
        this.d = bool.booleanValue();
    }

    public /* synthetic */ void d(ContextTrack contextTrack) {
        if (this.d) {
            this.e.e();
        } else {
            this.e.f(false);
        }
    }

    public void e() {
        if (this.d) {
            this.e.e();
        } else {
            this.e.f(false);
        }
    }

    public void f(b bVar) {
        bVar.getClass();
        this.e = bVar;
        this.c.a(this.a.subscribe(new a5c(this)));
        this.c.a(this.b.subscribe(new z4c(this)));
        this.e.g(this);
    }

    public void g() {
        this.c.c();
    }
}

package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.s;
import com.spotify.playlist.models.Episode;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: ftc  reason: default package */
public final class ftc implements etc {
    private dtc a = new dtc(null, null, null, null, false, 0, 63);
    private final c b;
    private final s c;

    public ftc(c cVar, s sVar) {
        h.e(cVar, "viewUri");
        h.e(sVar, "itemConfig");
        this.b = cVar;
        this.c = sVar;
    }

    private final boolean f(Episode episode) {
        return (this.a.d().length() > 0) && h.a(this.a.d(), episode.getUri());
    }

    @Override // defpackage.etc
    public boolean a(Episode episode) {
        h.e(episode, "episode");
        return f(episode) && this.a.f();
    }

    @Override // defpackage.etc
    public boolean b(Episode episode) {
        h.e(episode, "episode");
        if ((this.c.a() && episode.C()) || !episode.B()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.etc
    public int c() {
        dtc dtc = this.a;
        if (dtc.e() > 0) {
            return (int) TimeUnit.MILLISECONDS.toSeconds(dtc.e());
        }
        return 0;
    }

    @Override // defpackage.etc
    public void d(dtc dtc) {
        h.e(dtc, "state");
        if (!h.a(this.a, dtc)) {
            this.a = dtc;
        }
    }

    @Override // defpackage.etc
    public boolean e(Episode episode) {
        h.e(episode, "episode");
        if (f(episode)) {
            if (h.a(this.a.a(), this.b.toString())) {
                return true;
            }
            dtc dtc = this.a;
            if (h.a(dtc.c(), "queue") && h.a(dtc.b(), this.b.toString())) {
                return true;
            }
        }
        return false;
    }
}

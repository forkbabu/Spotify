package defpackage;

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.volume.l;
import com.spotify.rxjava2.p;
import io.reactivex.y;

/* renamed from: bda  reason: default package */
public class bda implements dda {
    private final l a;
    private final y b;
    private final p c = new p();
    private final Handler d = new Handler();
    private final Runnable e = new tca(this);
    private final Object f = new Object();
    private Optional<uca> g = Optional.absent();
    private boolean h;

    public bda(l lVar, y yVar) {
        this.a = lVar;
        this.b = yVar;
    }

    @Override // defpackage.dda
    public void a() {
        Logger.b("Volume updates interrupted", new Object[0]);
        this.h = true;
        this.d.removeCallbacks(this.e);
        this.d.postDelayed(this.e, 200);
    }

    public void b(uca uca) {
        this.g = Optional.of(uca);
        this.c.b(this.a.a().o0(this.b).subscribe(new sca(this)));
    }

    public void c() {
        this.c.a();
        this.d.removeCallbacks(this.e);
    }

    public /* synthetic */ void d(Float f2) {
        if (this.h) {
            Logger.b("Volume update ignored", new Object[0]);
        } else if (this.g.isPresent()) {
            this.g.get().j(f2.floatValue());
        }
    }

    public /* synthetic */ void e() {
        synchronized (this.f) {
            this.h = false;
        }
    }
}

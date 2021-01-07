package defpackage;

import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: c9c  reason: default package */
public class c9c implements ahb {
    private final b9c a;
    private final r8c b;
    private final v c;
    private final i f;
    private final y n;
    final q o = new q();
    private b p = EmptyDisposable.INSTANCE;
    private boolean q;

    public c9c(b9c b9c, r8c r8c, v vVar, i iVar, y yVar) {
        this.a = b9c;
        this.b = r8c;
        this.c = vVar;
        this.f = iVar;
        this.n = yVar;
    }

    @Override // defpackage.ahb
    public void a() {
        this.o.c();
        if (!this.q) {
            this.o.a(s.W0(2000, TimeUnit.MILLISECONDS).o0(this.n).subscribe(new t8c(this)));
        }
    }

    public /* synthetic */ void b() {
        Logger.b("User Mix successfully marked offline", new Object[0]);
        this.p.dispose();
    }

    @Override // defpackage.ahb
    public void c() {
    }

    public void d(Long l) {
        if (this.b.c()) {
            this.p = this.c.c("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne").D(u8c.a).d(this.f.c("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne", Optional.absent(), true)).subscribe(new v8c(this), w8c.a);
        }
        this.a.a();
        this.q = true;
    }

    @Override // defpackage.ahb
    public void e() {
        this.o.c();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
        this.o.c();
    }
}

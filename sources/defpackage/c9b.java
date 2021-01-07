package defpackage;

import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.v;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: c9b  reason: default package */
public class c9b {
    private final t a;
    private final fm9 b;
    private final vwc c;
    private final v d;
    private b e = EmptyDisposable.INSTANCE;
    private Optional<Boolean> f = Optional.absent();

    public c9b(t tVar, fm9 fm9, vwc vwc, v vVar) {
        this.a = tVar;
        this.b = fm9;
        this.c = vwc;
        this.d = vVar;
    }

    public u3 a(c cVar) {
        Boolean valueOf = Boolean.valueOf(this.b.a(cVar));
        this.c.getClass();
        return new u3(valueOf, Boolean.valueOf("1".equals(cVar.M0(uwc.c))));
    }

    public void b(u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        boolean booleanValue = f2.booleanValue();
        S s = u3Var.b;
        s.getClass();
        boolean booleanValue2 = s.booleanValue();
        if (booleanValue && this.f.isPresent() && !this.f.get().booleanValue()) {
            String cVar = booleanValue2 ? ViewUris.b1.toString() : "spotify:home";
            t tVar = this.a;
            n.a a2 = n.a(cVar);
            a2.b(true);
            tVar.e(a2.a());
        }
        this.f = Optional.of(Boolean.valueOf(booleanValue));
    }

    public void c() {
        this.e.dispose();
        this.e = this.d.b().O(new w8b(this)).s().subscribe(new x8b(this));
    }

    public void d() {
        this.e.dispose();
        Logger.b("LeakedSubPreventionLog: Successfully called unsubscribe. IsUnsubscribed(): %s ", Boolean.valueOf(this.e.d()));
    }
}

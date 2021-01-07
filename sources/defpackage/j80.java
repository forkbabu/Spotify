package defpackage;

import android.content.ComponentName;
import com.spotify.base.java.logging.Logger;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.x;
import io.reactivex.s;

/* access modifiers changed from: package-private */
/* renamed from: j80  reason: default package */
public class j80 {
    private final l80 a;
    private final j1 b = new b(null);
    private final io.reactivex.subjects.a<g1> c = io.reactivex.subjects.a.h1();

    /* renamed from: j80$b */
    private class b extends j1 {
        b(a aVar) {
        }

        @Override // defpackage.j1
        public void a(ComponentName componentName, g1 g1Var) {
            Logger.b("onCustomTabsServiceConnected %s", componentName);
            j80.this.c.onNext(g1Var);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.b("onServiceDisconnected %s", componentName);
            j80.this.c.onComplete();
        }
    }

    j80(l80 l80) {
        this.a = l80;
    }

    public static void d(j80 j80) {
        j80.getClass();
        Logger.b("doUnbindService", new Object[0]);
        j80.a.b(j80.b);
    }

    /* access modifiers changed from: package-private */
    public s<g1> b() {
        return new x(this.c.M(new d80(this), Functions.c).I(new e80(this)));
    }

    public void c(io.reactivex.disposables.b bVar) {
        Logger.b("doBindService", new Object[0]);
        this.a.a(this.b);
    }
}

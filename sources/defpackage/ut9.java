package defpackage;

import com.spotify.cosmos.session.SessionClient;
import com.spotify.http.m;
import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.service.plugininterfaces.c;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.dc;
import io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: ut9  reason: default package */
public class ut9 implements b, c, d {
    private final m a;
    private final dc b;
    private final SessionClient c;
    io.reactivex.disposables.b f = EmptyDisposable.INSTANCE;

    public ut9(m mVar, dc dcVar, SessionClient sessionClient) {
        this.a = mVar;
        this.b = dcVar;
        this.c = sessionClient;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.a.d();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public void b() {
        this.a.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.b.a()) {
            this.f = this.c.disableProductStateFromUcs().subscribe(tt9.a);
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "HttpLifecycleListener";
    }
}

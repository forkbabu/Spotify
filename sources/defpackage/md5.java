package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.go.connection.ConnectionState;
import com.spotify.music.features.go.connection.b;
import com.spotify.music.features.go.socket.e;
import defpackage.ge5;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: md5  reason: default package */
public class md5 implements ld5 {
    private final b a;
    private final e b;
    private final ye5 c;
    private final ge5.b d;
    final a e = new a();
    final c<com.spotify.music.features.go.connection.a> f = PublishSubject.h1();

    public md5(b bVar, e eVar, ye5 ye5, ge5.b bVar2) {
        this.a = bVar;
        this.b = eVar;
        this.c = ye5;
        this.d = bVar2;
    }

    @Override // defpackage.ld5
    public void a(ae5 ae5) {
        com.spotify.music.features.go.connection.a c2 = this.a.c(ae5);
        if (c2 != null) {
            Logger.g("Go: Ending go session for device: %s", ae5.a());
            this.e.a(c2.b());
        }
    }

    @Override // defpackage.ld5
    public s<com.spotify.music.features.go.connection.a> b() {
        return this.f;
    }

    @Override // defpackage.ld5
    public List<com.spotify.music.features.go.connection.a> c() {
        return this.a.b();
    }

    @Override // defpackage.ld5
    public void d() {
        Logger.g("Go: Ending go session for all devices", new Object[0]);
        this.e.dispose();
    }

    @Override // defpackage.ld5
    public void e(ae5 ae5) {
        Logger.g("Go: Starting go session for device: %s", ae5.a());
        com.spotify.music.features.go.connection.a a2 = this.a.a(ae5);
        if (a2 == null) {
            Logger.g("Go: Device is already connecting/connected", new Object[0]);
            return;
        }
        a2.f(ConnectionState.CONNECTING);
        this.f.onNext(a2);
        io.reactivex.disposables.b subscribe = this.b.a(a2).f(new id5(this, a2)).v().q(this.c).q(this.d.a()).I(new jd5(this, a2)).I(new kd5(this, ae5)).subscribe();
        a2.e(subscribe);
        this.e.b(subscribe);
    }

    @Override // defpackage.ld5
    public boolean f() {
        return ((ArrayList) this.a.b()).isEmpty();
    }

    public /* synthetic */ void g(ae5 ae5) {
        Logger.g("Go: Session ended for device: %s", ae5.a());
        this.a.d(ae5);
    }
}

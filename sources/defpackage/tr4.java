package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.a;
import com.spotify.libs.connect.volume.controllers.p;
import io.reactivex.disposables.b;
import io.reactivex.s;

/* renamed from: tr4  reason: default package */
public class tr4 implements sr4 {
    private final s<ConnectManager> a;
    private final p b;
    private final cs0 c;

    public tr4(s<ConnectManager> sVar, p pVar, cs0 cs0) {
        this.a = sVar.v0(1).h1();
        this.b = pVar;
        this.c = cs0;
    }

    private s<ConnectManager> d() {
        return this.a.W(or4.a, false, Integer.MAX_VALUE);
    }

    @Override // defpackage.sr4
    public b a() {
        return d().subscribe(qr4.a);
    }

    @Override // defpackage.sr4
    public b b() {
        return d().subscribe(rr4.a);
    }

    @Override // defpackage.sr4
    public b c(a aVar) {
        return d().subscribe(new mr4(aVar));
    }
}

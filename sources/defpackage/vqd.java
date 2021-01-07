package defpackage;

import com.spotify.rxjava2.p;
import io.reactivex.functions.g;

/* renamed from: vqd  reason: default package */
public final class vqd {
    private final g<uqd> a;
    private final p b = new p();

    public vqd(g<uqd> gVar) {
        this.a = gVar;
    }

    public void a(io.reactivex.g<uqd> gVar) {
        this.b.b(gVar.subscribe(this.a));
    }

    public void b() {
        this.b.a();
    }
}

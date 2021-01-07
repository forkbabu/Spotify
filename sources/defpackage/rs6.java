package defpackage;

import com.spotify.music.features.playlistentity.t;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.c;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;

/* renamed from: rs6  reason: default package */
class rs6 {
    private final q a = new q();
    private final y b;
    private final CompletableSubject c = CompletableSubject.R();
    private final a<h76> d = a.h1();
    private final p e = new p();
    private us6 f;

    public rs6(y yVar) {
        this.b = yVar;
    }

    public static void c(rs6 rs6, h76 h76) {
        ((vs6) rs6.f).i(!h76.m());
    }

    public void a(us6 us6) {
        this.f = us6;
        if (us6 != null) {
            this.e.b(this.d.subscribe(new os6(this)));
        } else {
            this.e.b(c.a());
        }
    }

    public io.reactivex.a b() {
        return this.c;
    }

    public /* synthetic */ void d(h76 h76) {
        this.d.onNext(h76);
        this.c.onComplete();
    }

    public void e(t.b bVar) {
        this.a.c();
        this.a.a(bVar.a().b().F(ns6.a).o0(this.b).subscribe(new ls6(this), ms6.a));
    }

    public void f() {
        this.a.c();
    }
}

package com.spotify.music.features.playlistentity.additionaladapters;

import com.spotify.music.features.playlistentity.t;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class m {
    private final y a;
    private final q b = new q();
    private final p c = new p();
    private final CompletableSubject d = CompletableSubject.R();
    private final io.reactivex.subjects.a<h76> e = io.reactivex.subjects.a.h1();
    private q f;

    public interface a {
        m create();
    }

    m(y yVar) {
        this.a = yVar;
    }

    public static void c(m mVar, h76 h76) {
        ((r) mVar.f).b(h76);
    }

    public void a(q qVar) {
        this.f = qVar;
        if (qVar != null) {
            this.c.b(this.e.subscribe(new c(this)));
        } else {
            this.c.b(c.a());
        }
    }

    public io.reactivex.a b() {
        return this.d;
    }

    public /* synthetic */ void d(h76 h76) {
        this.e.onNext(h76);
        this.d.onComplete();
    }

    public void e(t.b bVar) {
        this.b.c();
        q qVar = this.b;
        s<h76> o0 = bVar.a().b().E().o0(this.a);
        b bVar2 = new b(this);
        CompletableSubject completableSubject = this.d;
        completableSubject.getClass();
        qVar.a(o0.subscribe(bVar2, new j(completableSubject)));
    }

    public void f() {
        this.b.c();
    }
}

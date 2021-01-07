package com.spotify.intentrouter;

import com.spotify.intentrouter.CommandRunner;
import io.reactivex.subjects.UnicastSubject;

/* access modifiers changed from: package-private */
public class i<T> {
    private final UnicastSubject<g<T>> a;
    private final CommandRunner<T> b;

    i() {
        UnicastSubject<g<T>> h1 = UnicastSubject.h1();
        this.a = h1;
        this.b = new CommandRunner<>(h1);
    }

    public void a(g<T> gVar) {
        this.a.onNext(gVar);
    }

    public void b(CommandRunner.b<T> bVar) {
        this.b.g(bVar);
    }
}

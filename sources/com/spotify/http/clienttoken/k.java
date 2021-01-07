package com.spotify.http.clienttoken;

import com.google.common.base.Optional;
import com.spotify.cosmos.clienttoken.ClientTokenClient;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h;

public final class k implements g {
    private final p a = new p();
    private final PublishSubject<ng0> b;
    private final AtomicReference<Runnable> c;
    private final ClientTokenClient d;
    private final c e;

    public k(ClientTokenClient clientTokenClient, c cVar) {
        h.e(clientTokenClient, "clientTokenClient");
        h.e(cVar, "clientTokenPersistentStorage");
        this.d = clientTokenClient;
        this.e = cVar;
        PublishSubject<ng0> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.b = h1;
        this.c = new AtomicReference<>();
    }

    public static final void e(k kVar, Optional optional) {
        kVar.getClass();
        if (optional.isPresent()) {
            c cVar = kVar.e;
            Object obj = optional.get();
            h.d(obj, "encryptedClientToken.get()");
            cVar.a((String) obj);
            return;
        }
        kVar.e.c();
        Runnable runnable = kVar.c.get();
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.spotify.http.clienttoken.g
    public void a() {
        this.a.b(this.d.encryptedClientTokenSubscription().subscribe(new j(this)));
    }

    @Override // com.spotify.http.clienttoken.g
    public void b() {
        this.a.a();
    }

    @Override // com.spotify.http.clienttoken.g
    public a c(int i) {
        try {
            s<R> P = this.d.getToken((long) i).j0(new h(this)).O0(this.b).T().E(i.a).P();
            h.d(P, "clientTokenClient\n      …          .toObservable()");
            R d2 = P.d();
            h.d(d2, "token");
            if (d2.isPresent()) {
                return (a) d2.get();
            }
            return null;
        } catch (RuntimeException e2) {
            if (e2.getCause() != null) {
                Throwable cause = e2.getCause();
                h.c(cause);
                if (cause.getClass().equals(InterruptedException.class)) {
                    this.b.onNext(ng0.a());
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            throw e2;
        }
    }

    @Override // com.spotify.http.clienttoken.g
    public void cancel() {
        this.b.onNext(ng0.a());
    }

    @Override // com.spotify.http.clienttoken.g
    public void d(Runnable runnable) {
        h.e(runnable, "callback");
        this.c.set(runnable);
    }
}

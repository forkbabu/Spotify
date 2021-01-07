package com.spotify.music.podcastinteractivity.qna.datasource;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

public final class j {
    private final PublishSubject<i> a;
    private final y b;

    static final class a<V> implements Callable<v<? extends i>> {
        final /* synthetic */ j a;

        a(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public v<? extends i> call() {
            return this.a.a;
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ j a;
        final /* synthetic */ i b;

        b(j jVar, i iVar) {
            this.a = jVar;
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.onNext(this.b);
        }
    }

    public j(y yVar) {
        h.e(yVar, "mainScheduler");
        this.b = yVar;
        PublishSubject<i> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<QnAEvent>()");
        this.a = h1;
    }

    public final s<i> b() {
        s<i> I0 = s.B(new a(this)).I0(this.b);
        h.d(I0, "Observable.defer<QnAEven…ubscribeOn(mainScheduler)");
        return I0;
    }

    public final void c(i iVar) {
        h.e(iVar, "event");
        this.b.b(new b(this, iVar));
    }
}

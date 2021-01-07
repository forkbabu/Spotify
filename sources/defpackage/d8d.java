package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

/* renamed from: d8d  reason: default package */
public final class d8d {
    private final PublishSubject<com.spotify.music.sociallistening.models.a> a;
    private final y b;

    /* access modifiers changed from: package-private */
    /* renamed from: d8d$a */
    public static final class a<V> implements Callable<v<? extends com.spotify.music.sociallistening.models.a>> {
        final /* synthetic */ d8d a;

        a(d8d d8d) {
            this.a = d8d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public v<? extends com.spotify.music.sociallistening.models.a> call() {
            return this.a.a;
        }
    }

    /* renamed from: d8d$b */
    static final class b implements Runnable {
        final /* synthetic */ d8d a;
        final /* synthetic */ com.spotify.music.sociallistening.models.a b;

        b(d8d d8d, com.spotify.music.sociallistening.models.a aVar) {
            this.a = d8d;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.onNext(this.b);
        }
    }

    public d8d(y yVar) {
        h.e(yVar, "mainThreadScheduler");
        this.b = yVar;
        PublishSubject<com.spotify.music.sociallistening.models.a> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<SocialListeningEvent>()");
        this.a = h1;
    }

    public final s<com.spotify.music.sociallistening.models.a> b() {
        s<com.spotify.music.sociallistening.models.a> I0 = s.B(new a(this)).I0(this.b);
        h.d(I0, "Observable.defer { event…beOn(mainThreadScheduler)");
        return I0;
    }

    public final void c(com.spotify.music.sociallistening.models.a aVar) {
        h.e(aVar, "event");
        this.b.b(new b(this, aVar));
    }
}

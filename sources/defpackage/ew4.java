package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.c;
import io.reactivex.disposables.b;

/* renamed from: ew4  reason: default package */
public class ew4 {
    private static final c c = new a();
    private final uda a;
    private final com.spotify.music.settings.a b;

    /* renamed from: ew4$a */
    static class a implements c {
        a() {
        }

        @Override // io.reactivex.c
        public void onComplete() {
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            Logger.d("Failed to subscribe to completable", new Object[0]);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
        }
    }

    ew4(uda uda, com.spotify.music.settings.a aVar) {
        uda.getClass();
        this.a = uda;
        aVar.getClass();
        this.b = aVar;
    }

    public static void a(ew4 ew4) {
        int a2 = ew4.a.a("stream_quality", -1);
        if (a2 != -1) {
            ew4.b.b(com.spotify.music.settings.a.i, Integer.valueOf(a2));
        }
    }

    public /* synthetic */ void b(Integer num) {
        if (num.intValue() != -1) {
            this.a.f("stream_quality", num.intValue());
        }
        this.b.b(com.spotify.music.settings.a.i, 1);
    }

    public void c(boolean z) {
        c cVar = c;
        if (z) {
            this.b.a().j0(xv4.a).r0(zv4.a).T().t(new aw4(this)).subscribe(cVar);
        } else {
            io.reactivex.a.u(new yv4(this)).subscribe(cVar);
        }
    }
}

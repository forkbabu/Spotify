package com.spotify.music.playlist.synchronizer;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class a implements Runnable {
    final /* synthetic */ PlaylistCoreSynchronizer a;

    /* renamed from: com.spotify.music.playlist.synchronizer.a$a  reason: collision with other inner class name */
    static final class C0323a implements io.reactivex.functions.a {
        final /* synthetic */ a a;

        C0323a(a aVar) {
            this.a = aVar;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            Handler e = PlaylistCoreSynchronizer.e(this.a.a);
            a aVar = this.a;
            e.postDelayed(aVar, PlaylistCoreSynchronizer.f(aVar.a));
        }
    }

    static final class b<T> implements g<Throwable> {
        final /* synthetic */ a a;
        final /* synthetic */ String b;

        b(a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "t");
            Logger.e(th2, "Failed to schedule playlist %s for resync", this.b);
            PlaylistCoreSynchronizer.k(this.a.a, this.b);
            Handler e = PlaylistCoreSynchronizer.e(this.a.a);
            a aVar = this.a;
            e.postDelayed(aVar, PlaylistCoreSynchronizer.f(aVar.a));
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    a(PlaylistCoreSynchronizer playlistCoreSynchronizer) {
        this.a = playlistCoreSynchronizer;
    }

    @Override // java.lang.Runnable
    public void run() {
        String h = PlaylistCoreSynchronizer.h(this.a);
        if (h == null) {
            synchronized (PlaylistCoreSynchronizer.g(this.a)) {
                PlaylistCoreSynchronizer.l(this.a, false);
            }
            return;
        }
        PlaylistCoreSynchronizer.c(this.a, h);
        this.a.b(h);
        PlaylistCoreSynchronizer.d(this.a).c();
        PlaylistCoreSynchronizer.d(this.a).a(PlaylistCoreSynchronizer.i(this.a).d(h).J((long) 500, TimeUnit.MILLISECONDS, PlaylistCoreSynchronizer.j(this.a)).A(PlaylistCoreSynchronizer.j(this.a)).subscribe(new C0323a(this), new b(this, h)));
    }
}

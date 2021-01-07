package com.spotify.music.features.followfeed.views;

import android.os.Handler;
import com.spotify.music.features.followfeed.views.FollowRecsView;
import kotlin.jvm.internal.h;

public final class b implements FollowRecsView.c {
    final /* synthetic */ c a;
    final /* synthetic */ int b;
    final /* synthetic */ Handler c;

    static final class a implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ String b;

        a(b bVar, String str) {
            this.a = bVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FollowRecsView.c cVar = this.a.a.c;
            if (cVar != null) {
                cVar.a(this.b);
            }
            this.a.a.n = false;
        }
    }

    /* renamed from: com.spotify.music.features.followfeed.views.b$b  reason: collision with other inner class name */
    static final class RunnableC0232b implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ String b;

        /* renamed from: com.spotify.music.features.followfeed.views.b$b$a */
        static final class a implements Runnable {
            final /* synthetic */ RunnableC0232b a;

            a(RunnableC0232b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FollowRecsView.c cVar = this.a.a.a.c;
                if (cVar != null) {
                    cVar.c(this.a.b);
                }
                this.a.a.a.n = false;
            }
        }

        RunnableC0232b(b bVar, String str) {
            this.a = bVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.a;
            c.Z(bVar.a, bVar.b);
            this.a.c.postDelayed(new a(this), 500);
        }
    }

    b(c cVar, int i, Handler handler) {
        this.a = cVar;
        this.b = i;
        this.c = handler;
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void a(String str) {
        h.e(str, "artistUri");
        if (!c.Y(this.a)) {
            c.Z(this.a, this.b);
            this.c.postDelayed(new a(this, str), 500);
        }
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void b(String str, int i) {
        h.e(str, "artistUri");
        FollowRecsView.c cVar = this.a.c;
        if (cVar != null) {
            cVar.b(str, this.b);
        }
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void c(String str) {
        h.e(str, "artistUri");
        if (!c.Y(this.a)) {
            this.c.postDelayed(new RunnableC0232b(this, str), 200);
        }
    }
}

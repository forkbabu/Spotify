package com.spotify.http.clienttoken;

import kotlin.jvm.internal.h;

public final class d {
    private a a;
    private final g b;
    private final cqe c;

    static final class a implements Runnable {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.b();
        }
    }

    public d(g gVar, cqe cqe) {
        h.e(gVar, "tokenRequester");
        h.e(cqe, "clock");
        this.b = gVar;
        this.c = cqe;
        gVar.d(new a(this));
    }

    public final a a() {
        return this.a;
    }

    public final synchronized void b() {
        this.a = null;
    }

    public final synchronized a c(int i) {
        a aVar = this.a;
        boolean z = true;
        if (aVar != null) {
            if (this.c.d() <= aVar.c()) {
                z = false;
            }
        }
        if (z) {
            this.a = this.b.c(i);
        }
        return this.a;
    }
}

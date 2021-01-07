package com.spotify.http.contentaccesstoken;

import kotlin.jvm.internal.h;

public final class e {
    private d a;
    private final h b;
    private final cqe c;

    static final class a implements Runnable {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.b();
        }
    }

    public e(h hVar, cqe cqe) {
        h.e(hVar, "tokenRequester");
        h.e(cqe, "clock");
        this.b = hVar;
        this.c = cqe;
        hVar.e(new a(this));
    }

    public final d a() {
        return this.a;
    }

    public final synchronized void b() {
        this.a = null;
    }

    public final synchronized d c(int i) {
        d dVar = this.a;
        boolean z = true;
        if (dVar != null) {
            if (this.c.d() <= dVar.b()) {
                z = false;
            }
        }
        if (z) {
            this.a = this.b.c(i);
        }
        return this.a;
    }
}

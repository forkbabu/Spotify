package com.spotify.music.features.employeepodcasts.view;

import com.spotify.http.contentaccesstoken.c;
import kotlin.jvm.internal.h;

public final class b implements f {
    private int a;
    private final c b;
    private final d c;

    public b(c cVar, d dVar) {
        h.e(cVar, "contentAccessRefreshTokenPersistentStorage");
        h.e(dVar, "viewBinder");
        this.b = cVar;
        this.c = dVar;
        dVar.d(this);
    }

    @Override // com.spotify.music.features.employeepodcasts.view.f
    public void a() {
        this.c.e("https://shelter.spotify.com/login?platform=android");
    }

    @Override // com.spotify.music.features.employeepodcasts.view.f
    public void b() {
        int i = this.a + 1;
        this.a = i;
        if (i % 5 == 0) {
            this.c.a();
        }
    }

    @Override // com.spotify.music.features.employeepodcasts.view.f
    public void c() {
        this.b.a();
        this.c.b();
    }

    public final void d() {
        if (this.b.f()) {
            this.c.c();
        } else {
            this.c.b();
        }
    }
}

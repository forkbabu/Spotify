package com.spotify.music.libs.performance.tracking;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.libs.instrumentation.performance.k;
import com.spotify.rxjava2.p;

public class m implements k {
    private final ColdStartTracker a;
    private final o b;
    private final p c = new p();

    public m(ColdStartTracker coldStartTracker, o oVar) {
        this.a = coldStartTracker;
        this.b = oVar;
    }

    @Override // com.spotify.libs.instrumentation.performance.k
    public void a(String str, boolean z) {
        this.c.b(this.b.a(str, z).subscribe(b.a, c.a));
    }

    public void b() {
        if (!this.a.h() || !this.a.f().isPresent()) {
            this.a.a(this);
            return;
        }
        boolean g = this.a.g();
        this.c.b(this.b.a(this.a.f().get(), g).subscribe(b.a, c.a));
    }

    public void c() {
        this.a.w(this);
        this.c.a();
    }
}

package com.spotify.music.features.carmode.optin;

import com.spotify.music.features.carmode.optin.j;
import com.spotify.ubi.specification.factories.f0;

/* access modifiers changed from: package-private */
public class p implements j {
    private final j a;
    private final ere b;
    private final f0 c;
    private OptInButtonState f = OptInButtonState.HIDDEN;

    p(ere ere, j jVar) {
        this.b = ere;
        this.c = new f0();
        this.a = jVar;
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void a(boolean z) {
        this.b.a(this.c.c().b());
        this.a.a(z);
        this.f = OptInButtonState.OPTOUT;
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void b() {
        this.a.b();
        this.f = OptInButtonState.HIDDEN;
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void c(boolean z) {
        this.b.a(this.c.b().b());
        this.a.c(z);
        this.f = OptInButtonState.OPTIN;
    }

    public void d(j.a aVar) {
        OptInButtonState optInButtonState = this.f;
        if (optInButtonState == OptInButtonState.OPTIN) {
            this.b.a(this.c.b().a());
        } else if (optInButtonState == OptInButtonState.OPTOUT) {
            this.b.a(this.c.c().a());
        }
        aVar.a();
    }

    @Override // com.spotify.music.features.carmode.optin.j
    public void setListener(j.a aVar) {
        this.a.setListener(new b(this, aVar));
    }
}

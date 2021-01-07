package com.spotify.music.libs.external_integration.instrumentation;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.external_integration.instrumentation.a;
import java.util.Map;

public class b implements d {
    private final ere a;
    private final Map<Page, bea> b;

    public b(ere ere, Map<Page, bea> map) {
        this.a = ere;
        this.b = map;
    }

    @Override // com.spotify.music.libs.external_integration.instrumentation.d
    public void a(e eVar) {
        Page c = eVar.c();
        bea bea = this.b.get(c);
        if (bea != null) {
            Logger.l("Impression: %s", eVar);
            this.a.a(bea.b(eVar));
            return;
        }
        Logger.n("Unable to log impression. Page is missing dagger binding: %s", c);
    }

    @Override // com.spotify.music.libs.external_integration.instrumentation.d
    public Optional<nqe> b(String str, Bundle bundle) {
        String string = bundle.getString("com.spotify.eis.ubi.page");
        String string2 = bundle.getString("com.spotify.eis.ubi.id");
        e eVar = null;
        if (!(string == null || string2 == null)) {
            try {
                Page valueOf = Page.valueOf(bundle.getString("com.spotify.eis.ubi.page"));
                a.b bVar = new a.b();
                bVar.d(valueOf);
                bVar.b(string2);
                bVar.c(Integer.valueOf(bundle.getInt("com.spotify.eis.ubi.position")));
                eVar = bVar.build();
            } catch (IllegalArgumentException unused) {
                Logger.n("Invalid UBI page: %s", bundle.getString("com.spotify.eis.ubi.page"));
            }
        }
        if (eVar == null) {
            return Optional.absent();
        }
        Page c = eVar.c();
        bea bea = this.b.get(c);
        if (bea != null) {
            return Optional.of(bea.a(str, eVar));
        }
        Logger.n("Unable to create interaction event. Page is missing dagger binding: %s", c);
        return Optional.absent();
    }
}

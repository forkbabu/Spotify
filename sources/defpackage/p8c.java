package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.offlinetrials.capped.n;

/* renamed from: p8c  reason: default package */
public class p8c implements d {
    private final r8c a;
    private final n b;

    p8c(r8c r8c, n nVar) {
        this.a = r8c;
        this.b = nVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.a.b()) {
            this.b.c();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.b.d();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "OfflineTrialsPlugin";
    }
}

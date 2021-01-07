package defpackage;

import com.google.android.gms.auth.api.credentials.f;
import com.google.android.gms.common.internal.n;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.plugininterfaces.c;

/* renamed from: tb1  reason: default package */
public class tb1 implements c {
    private final Optional<f> a;

    public tb1(Optional<f> optional) {
        this.a = optional;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public void b() {
        if (this.a.isPresent()) {
            f fVar = this.a.get();
            fVar.getClass();
            n.b(((ws) oq.g).b(fVar.c()));
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public String name() {
        return "Smartlock";
    }
}

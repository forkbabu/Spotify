package defpackage;

import com.spotify.remoteconfig.mc;
import kotlin.jvm.internal.h;

/* renamed from: afc  reason: default package */
public final class afc implements zec {
    private final mc a;

    public afc(mc mcVar) {
        h.e(mcVar, "properties");
        this.a = mcVar;
    }

    @Override // defpackage.zec
    public boolean c() {
        return this.a.b();
    }

    @Override // defpackage.zec
    public boolean d() {
        return this.a.a();
    }
}

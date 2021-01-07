package defpackage;

import com.spotify.music.onboarding.freetier.education.a;
import com.spotify.remoteconfig.j9;
import kotlin.jvm.internal.h;

/* renamed from: j9c  reason: default package */
public final class j9c implements fjf<a> {
    private final wlf<o9c> a;
    private final wlf<k9c> b;
    private final wlf<j9> c;

    public j9c(wlf<o9c> wlf, wlf<k9c> wlf2, wlf<j9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static a a(o9c o9c, k9c k9c, j9 j9Var) {
        h.e(o9c, "snackbarManager");
        h.e(k9c, "dialogManager");
        h.e(j9Var, "properties");
        return j9Var.a() ? k9c : o9c;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get());
    }
}

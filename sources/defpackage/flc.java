package defpackage;

import com.spotify.ubi.specification.factories.t4;
import kotlin.jvm.internal.h;

/* renamed from: flc  reason: default package */
public final class flc implements alc {
    private final ere a;
    private final t4 b;

    public flc(ere ere, t4 t4Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(t4Var, "mobileYourLibraryShowsEventFactory");
        this.a = ere;
        this.b = t4Var;
    }

    @Override // defpackage.alc
    public void a(String str, int i) {
        h.e(str, "uri");
        this.a.a(this.b.b(Integer.valueOf(i), str).a(str));
    }
}

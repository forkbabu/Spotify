package defpackage;

import com.spotify.ubi.specification.factories.q2;
import kotlin.jvm.internal.h;

/* renamed from: o57  reason: default package */
public final class o57 implements u57 {
    private final ere a;
    private final q2 b;

    public o57(ere ere, q2 q2Var) {
        h.e(ere, "mUserBehaviourEventLogger");
        h.e(q2Var, "mMobilePodcastEntityEventFactory");
        this.a = ere;
        this.b = q2Var;
    }

    @Override // defpackage.u57
    public void g() {
        this.a.a(this.b.b().b().b().a());
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.ubi.specification.factories.q3;

/* renamed from: uc8  reason: default package */
public class uc8 implements rc8 {
    private final q3 a;

    public uc8(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // defpackage.rc8
    public rqe a(Optional<String> optional) {
        return this.a.c().b(optional.orNull()).b().a();
    }
}

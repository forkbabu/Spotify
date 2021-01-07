package defpackage;

import com.google.common.base.Optional;
import com.spotify.ubi.specification.factories.p3;

/* renamed from: sc8  reason: default package */
public class sc8 implements rc8 {
    private final p3 a;

    public sc8(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // defpackage.rc8
    public rqe a(Optional<String> optional) {
        return this.a.c(optional.or((Optional<String>) "")).b().a();
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.ubi.specification.factories.v;

/* renamed from: pc8  reason: default package */
public class pc8 implements rc8 {
    private final v a;

    pc8(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.rc8
    public rqe a(Optional<String> optional) {
        return this.a.c().b(optional.orNull()).b().a();
    }
}

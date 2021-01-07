package defpackage;

import defpackage.oia;
import defpackage.zwd;
import io.reactivex.functions.g;
import java.util.Collections;

/* renamed from: fia  reason: default package */
public final /* synthetic */ class fia implements g {
    public final /* synthetic */ oia.a a;

    public /* synthetic */ fia(oia.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        oia.a aVar = this.a;
        zwd zwd = (zwd) obj;
        zwd.getClass();
        if (zwd instanceof zwd.a) {
            ((ub1) aVar).a.a(Collections.singletonList(((zwd.a) zwd).c()));
            return;
        }
        aVar.getClass();
    }
}

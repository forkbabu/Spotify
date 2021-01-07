package defpackage;

import com.google.common.base.Optional;
import defpackage.qe8;
import defpackage.zwd;
import io.reactivex.functions.g;

/* renamed from: me8  reason: default package */
public final /* synthetic */ class me8 implements g {
    public final /* synthetic */ Optional a;

    public /* synthetic */ me8(Optional optional) {
        this.a = optional;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Optional optional = this.a;
        zwd zwd = (zwd) obj;
        zwd.getClass();
        if ((zwd instanceof zwd.b) && optional.isPresent()) {
            ((qe8.a) optional.get()).run();
        }
    }
}

package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

/* renamed from: lpb  reason: default package */
public final /* synthetic */ class lpb implements g {
    public final /* synthetic */ eqb a;

    public /* synthetic */ lpb(eqb eqb) {
        this.a = eqb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        eqb.a(this.a, (Optional) obj);
    }
}

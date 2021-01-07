package defpackage;

import defpackage.vub;
import io.reactivex.functions.g;

/* renamed from: lub  reason: default package */
public final /* synthetic */ class lub implements g {
    public final /* synthetic */ vub a;

    public /* synthetic */ lub(vub vub) {
        this.a = vub;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        vub.a(this.a, (vub.a) obj);
    }
}

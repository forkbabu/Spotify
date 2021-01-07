package defpackage;

import defpackage.rbd;
import io.reactivex.functions.g;

/* renamed from: jcd  reason: default package */
public final /* synthetic */ class jcd implements g {
    public final /* synthetic */ f4d a;

    public /* synthetic */ jcd(f4d f4d) {
        this.a = f4d;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        rbd.e eVar = (rbd.e) obj;
        this.a.f();
    }
}

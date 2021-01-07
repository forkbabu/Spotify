package defpackage;

import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: an7  reason: default package */
public final /* synthetic */ class an7 implements g {
    public final /* synthetic */ gu7 a;

    public /* synthetic */ an7(gu7 gu7) {
        this.a = gu7;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        km7.a aVar = (km7.a) obj;
        this.a.cancel();
    }
}

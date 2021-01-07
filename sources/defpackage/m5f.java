package defpackage;

import io.reactivex.functions.l;

/* renamed from: m5f  reason: default package */
public final /* synthetic */ class m5f implements l {
    public final /* synthetic */ q7f a;

    public /* synthetic */ m5f(q7f q7f) {
        this.a = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        zwd zwd = (zwd) obj;
        return this.a.dismiss();
    }
}

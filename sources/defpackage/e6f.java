package defpackage;

import io.reactivex.functions.l;

/* renamed from: e6f  reason: default package */
public final /* synthetic */ class e6f implements l {
    public final /* synthetic */ q7f a;

    public /* synthetic */ e6f(q7f q7f) {
        this.a = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        zwd zwd = (zwd) obj;
        return this.a.dismiss();
    }
}

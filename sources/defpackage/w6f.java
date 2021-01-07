package defpackage;

import defpackage.p2f;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

/* renamed from: w6f  reason: default package */
public final /* synthetic */ class w6f implements l {
    public final /* synthetic */ p2f.v a;
    public final /* synthetic */ q7f b;

    public /* synthetic */ w6f(p2f.v vVar, q7f q7f) {
        this.a = vVar;
        this.b = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.v vVar = this.a;
        q7f q7f = this.b;
        zwd zwd = (zwd) obj;
        if (vVar.a()) {
            return q7f.dismiss();
        }
        return b.a;
    }
}

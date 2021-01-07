package defpackage;

import io.reactivex.functions.l;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.v0;
import io.reactivex.s;

/* renamed from: pg1  reason: default package */
public final /* synthetic */ class pg1 implements l {
    public final /* synthetic */ aj1 a;

    public /* synthetic */ pg1(aj1 aj1) {
        this.a = aj1;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        aj1 aj1 = this.a;
        ryd ryd = (ryd) obj;
        aj1.getClass();
        s j0 = s.d0(ryd.getItems()).j0(new qg1(aj1));
        int size = ryd.getItems().size();
        a.d(size, "capacityHint");
        return new v0(j0, size);
    }
}

package defpackage;

import io.reactivex.h;
import io.reactivex.i;

/* renamed from: nd4  reason: default package */
public final /* synthetic */ class nd4 implements i {
    public final /* synthetic */ lf4 a;
    public final /* synthetic */ ec4 b;

    public /* synthetic */ nd4(lf4 lf4, ec4 ec4) {
        this.a = lf4;
        this.b = ec4;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        this.a.b(this.b, hVar);
    }
}

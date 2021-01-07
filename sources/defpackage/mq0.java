package defpackage;

import defpackage.fq0;
import io.reactivex.functions.l;

/* renamed from: mq0  reason: default package */
public final /* synthetic */ class mq0 implements l {
    public final /* synthetic */ fq0.a a;

    public /* synthetic */ mq0(fq0.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return gq0.e(String.format("Error fetching creative Id %s. %s", this.a.a(), ((Throwable) obj).getMessage()));
    }
}

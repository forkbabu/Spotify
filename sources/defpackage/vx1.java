package defpackage;

import defpackage.gx1;
import defpackage.yx1;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: vx1  reason: default package */
final class vx1<T> implements g<Integer> {
    final /* synthetic */ yx1.a a;

    vx1(yx1.a aVar) {
        this.a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Integer num) {
        Integer num2 = num;
        nmf nmf = this.a.a.b;
        h.d(num2, "storyCount");
        nmf.invoke(new gx1.a(num2.intValue()));
    }
}

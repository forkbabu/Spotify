package defpackage;

import com.google.common.collect.FluentIterable;
import io.reactivex.functions.l;

/* renamed from: vc4  reason: default package */
public final /* synthetic */ class vc4 implements l {
    public final /* synthetic */ ze4 a;

    public /* synthetic */ vc4(ze4 ze4) {
        this.a = ze4;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ze4 ze4 = this.a;
        b91 b91 = (b91) obj;
        ze4.getClass();
        return b91.toBuilder().e(FluentIterable.from(b91.body()).transform(new wc4(ze4)).toList()).g();
    }
}

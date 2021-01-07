package defpackage;

import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: f81  reason: default package */
public final /* synthetic */ class f81 implements l {
    public final /* synthetic */ h81 a;
    public final /* synthetic */ String b;

    public /* synthetic */ f81(h81 h81, String str) {
        this.a = h81;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        h81 h81 = this.a;
        String str = this.b;
        Long l = (Long) obj;
        h81.getClass();
        return g.K(new g81(h81, str));
    }
}

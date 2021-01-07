package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

/* renamed from: hk9  reason: default package */
public final /* synthetic */ class hk9 implements Function {
    public static final /* synthetic */ hk9 a = new hk9();

    private /* synthetic */ hk9() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        s81 s81 = (s81) obj;
        return s81 != null ? s81.toBuilder().m(FluentIterable.from(s81.children()).transform(fk9.a).toList()).l() : s81;
    }
}

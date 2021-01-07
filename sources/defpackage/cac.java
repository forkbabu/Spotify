package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

/* renamed from: cac  reason: default package */
public final /* synthetic */ class cac implements Function {
    public static final /* synthetic */ cac a = new cac();

    private /* synthetic */ cac() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return (s81) FluentIterable.from(((s81) obj).children()).firstMatch(dac.a).orNull();
    }
}

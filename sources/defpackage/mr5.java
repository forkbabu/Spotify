package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.g;

/* renamed from: mr5  reason: default package */
public final /* synthetic */ class mr5 implements g {
    public final /* synthetic */ es5 a;

    public /* synthetic */ mr5(es5 es5) {
        this.a = es5;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        es5.c(this.a, (ImmutableMap) obj);
    }
}

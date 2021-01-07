package defpackage;

import io.reactivex.functions.n;

/* renamed from: jq8  reason: default package */
public final /* synthetic */ class jq8 implements n {
    public final /* synthetic */ lq8 a;

    public /* synthetic */ jq8(lq8 lq8) {
        this.a = lq8;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.b((Boolean) obj);
    }
}

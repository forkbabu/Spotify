package defpackage;

import io.reactivex.functions.l;

/* renamed from: knd  reason: default package */
public final /* synthetic */ class knd implements l {
    public final /* synthetic */ aod a;
    public final /* synthetic */ String b;

    public /* synthetic */ knd(aod aod, String str) {
        this.a = aod;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, (Boolean) obj);
    }
}

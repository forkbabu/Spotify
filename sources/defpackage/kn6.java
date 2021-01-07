package defpackage;

import io.reactivex.functions.l;

/* renamed from: kn6  reason: default package */
public final /* synthetic */ class kn6 implements l {
    public final /* synthetic */ bo6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean n;

    public /* synthetic */ kn6(bo6 bo6, String str, String str2, boolean z, boolean z2) {
        this.a = bo6;
        this.b = str;
        this.c = str2;
        this.f = z;
        this.n = z2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, this.c, this.f, this.n, (Boolean) obj);
    }
}

package defpackage;

import io.reactivex.functions.l;

/* renamed from: h16  reason: default package */
public final /* synthetic */ class h16 implements l {
    public final /* synthetic */ o16 a;
    public final /* synthetic */ String b;

    public /* synthetic */ h16(o16 o16, String str) {
        this.a = o16;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (Boolean) obj);
    }
}

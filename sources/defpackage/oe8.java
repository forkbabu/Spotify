package defpackage;

import io.reactivex.functions.g;

/* renamed from: oe8  reason: default package */
public final /* synthetic */ class oe8 implements g {
    public final /* synthetic */ re8 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ oe8(re8 re8, String str, String str2) {
        this.a = re8;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, this.c, (Boolean) obj);
    }
}

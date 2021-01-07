package defpackage;

import io.reactivex.functions.g;

/* renamed from: jw9  reason: default package */
public final /* synthetic */ class jw9 implements g {
    public final /* synthetic */ fx9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qg0 c;

    public /* synthetic */ jw9(fx9 fx9, String str, qg0 qg0) {
        this.a = fx9;
        this.b = str;
        this.c = qg0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, this.c, (String) obj);
    }
}

package defpackage;

import io.reactivex.functions.l;

/* renamed from: hg1  reason: default package */
public final /* synthetic */ class hg1 implements l {
    public final /* synthetic */ fi1 a;
    public final /* synthetic */ String b;

    public /* synthetic */ hg1(fi1 fi1, String str) {
        this.a = fi1;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (u3) obj);
    }
}

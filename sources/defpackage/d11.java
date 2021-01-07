package defpackage;

import io.reactivex.functions.l;
import retrofit2.v;

/* renamed from: d11  reason: default package */
public final /* synthetic */ class d11 implements l {
    public final /* synthetic */ g11 a;
    public final /* synthetic */ String b;

    public /* synthetic */ d11(g11 g11, String str) {
        this.a = g11;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (v) obj);
    }
}

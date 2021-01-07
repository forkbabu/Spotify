package defpackage;

import defpackage.b1a;
import io.reactivex.functions.l;

/* renamed from: m0a  reason: default package */
public final /* synthetic */ class m0a implements l {
    public final /* synthetic */ b1a a;
    public final /* synthetic */ String b;

    public /* synthetic */ m0a(b1a b1a, String str) {
        this.a = b1a;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (b1a.b) obj);
    }
}

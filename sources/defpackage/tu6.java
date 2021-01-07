package defpackage;

import defpackage.eu6;
import io.reactivex.functions.g;

/* renamed from: tu6  reason: default package */
public final /* synthetic */ class tu6 implements g {
    public final /* synthetic */ cv6 a;
    public final /* synthetic */ eu6.a b;

    public /* synthetic */ tu6(cv6 cv6, eu6.a aVar) {
        this.a = cv6;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, (Boolean) obj);
    }
}

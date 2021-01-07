package defpackage;

import defpackage.jv4;
import defpackage.pv4;
import io.reactivex.functions.l;

/* renamed from: kv4  reason: default package */
public final /* synthetic */ class kv4 implements l {
    public static final /* synthetic */ kv4 a = new kv4();

    private /* synthetic */ kv4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        pv4.b bVar = (pv4.b) obj;
        jv4.a e = ((jv4) bVar.b()).e();
        e.a(bVar.a() > 0);
        return e.build();
    }
}

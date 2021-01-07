package defpackage;

import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: o24  reason: default package */
public final /* synthetic */ class o24 implements l {
    public final /* synthetic */ p24 a;
    public final /* synthetic */ String b;

    public /* synthetic */ o24(p24 p24, String str) {
        this.a = p24;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}

package defpackage;

import defpackage.t45;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: x45  reason: default package */
public final /* synthetic */ class x45 implements l {
    public final /* synthetic */ t45 a;

    public /* synthetic */ x45(t45 t45) {
        this.a = t45;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        t45.a f = this.a.f();
        f.b((Map) obj);
        return f.build();
    }
}

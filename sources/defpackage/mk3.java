package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: mk3  reason: default package */
public final /* synthetic */ class mk3 implements Callable {
    public final /* synthetic */ cl3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Map f;

    public /* synthetic */ mk3(cl3 cl3, String str, String str2, Map map) {
        this.a = cl3;
        this.b = str;
        this.c = str2;
        this.f = map;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.b, this.c, this.f);
    }
}

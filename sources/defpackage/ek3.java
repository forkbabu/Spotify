package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: ek3  reason: default package */
public final /* synthetic */ class ek3 implements Callable {
    public final /* synthetic */ tk3 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String f;

    public /* synthetic */ ek3(tk3 tk3, Map map, String str, String str2) {
        this.a = tk3;
        this.b = map;
        this.c = str;
        this.f = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.b, this.c, this.f);
    }
}

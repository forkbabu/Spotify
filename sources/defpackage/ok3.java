package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: ok3  reason: default package */
public final /* synthetic */ class ok3 implements Callable {
    public final /* synthetic */ il3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;

    public /* synthetic */ ok3(il3 il3, String str, Map map) {
        this.a = il3;
        this.b = str;
        this.c = map;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b, this.c);
    }
}

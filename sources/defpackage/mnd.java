package defpackage;

import java.util.concurrent.Callable;

/* renamed from: mnd  reason: default package */
public final /* synthetic */ class mnd implements Callable {
    public final /* synthetic */ aod a;
    public final /* synthetic */ String b;

    public /* synthetic */ mnd(aod aod, String str) {
        this.a = aod;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d(this.b);
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dga  reason: default package */
public final /* synthetic */ class dga implements Callable {
    public final /* synthetic */ lga a;

    public /* synthetic */ dga(lga lga) {
        this.a = lga;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.a.a());
    }
}

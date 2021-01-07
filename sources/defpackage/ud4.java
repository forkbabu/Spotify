package defpackage;

import io.reactivex.functions.f;

/* renamed from: ud4  reason: default package */
public final /* synthetic */ class ud4 implements f {
    public final /* synthetic */ t54 a;

    public /* synthetic */ ud4(t54 t54) {
        this.a = t54;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.b(null);
    }
}

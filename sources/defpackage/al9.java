package defpackage;

import io.reactivex.functions.f;
import io.reactivex.h;

/* renamed from: al9  reason: default package */
public final /* synthetic */ class al9 implements f {
    public final /* synthetic */ ll9 a;
    public final /* synthetic */ h b;

    public /* synthetic */ al9(ll9 ll9, h hVar) {
        this.a = ll9;
        this.b = hVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.a(this.b);
    }
}

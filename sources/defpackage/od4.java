package defpackage;

import io.reactivex.functions.f;

/* renamed from: od4  reason: default package */
public final /* synthetic */ class od4 implements f {
    public final /* synthetic */ lf4 a;

    public /* synthetic */ od4(lf4 lf4) {
        this.a = lf4;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.a();
    }
}

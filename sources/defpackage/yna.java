package defpackage;

import io.reactivex.functions.f;

/* renamed from: yna  reason: default package */
public final /* synthetic */ class yna implements f {
    public final /* synthetic */ aoa a;

    public /* synthetic */ yna(aoa aoa) {
        this.a = aoa;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.e();
    }
}

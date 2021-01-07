package defpackage;

import defpackage.adc;
import io.reactivex.functions.g;

/* renamed from: edc  reason: default package */
public final /* synthetic */ class edc implements g {
    public final /* synthetic */ e92 a;

    public /* synthetic */ edc(e92 e92) {
        this.a = e92;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        adc.f fVar = (adc.f) obj;
        this.a.b();
    }
}

package defpackage;

import io.reactivex.functions.g;

/* renamed from: xvb  reason: default package */
public final /* synthetic */ class xvb implements g {
    public final /* synthetic */ zvb a;

    public /* synthetic */ xvb(zvb zvb) {
        this.a = zvb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(((Float) obj).floatValue());
    }
}

package defpackage;

import io.reactivex.functions.g;

/* renamed from: mc6  reason: default package */
public final /* synthetic */ class mc6 implements g {
    public final /* synthetic */ zc6 a;

    public /* synthetic */ mc6(zc6 zc6) {
        this.a = zc6;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zc6.c(this.a, ((Boolean) obj).booleanValue());
    }
}

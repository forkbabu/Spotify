package defpackage;

import io.reactivex.functions.g;

/* renamed from: eac  reason: default package */
public final /* synthetic */ class eac implements g {
    public final /* synthetic */ lac a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ eac(lac lac, s81 s81) {
        this.a = lac;
        this.b = s81;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Boolean) obj);
    }
}

package defpackage;

import io.reactivex.functions.l;

/* renamed from: ihf  reason: default package */
public final /* synthetic */ class ihf implements l {
    public final /* synthetic */ phf a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ihf(phf phf, Object obj) {
        this.a = phf;
        this.b = obj;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (Boolean) obj);
    }
}

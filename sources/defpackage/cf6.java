package defpackage;

import io.reactivex.functions.g;

/* renamed from: cf6  reason: default package */
public final /* synthetic */ class cf6 implements g {
    public final /* synthetic */ kf6 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ cf6(kf6 kf6, boolean z) {
        this.a = kf6;
        this.b = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (xe6) obj);
    }
}

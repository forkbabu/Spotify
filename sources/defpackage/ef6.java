package defpackage;

import io.reactivex.functions.l;

/* renamed from: ef6  reason: default package */
public final /* synthetic */ class ef6 implements l {
    public final /* synthetic */ kf6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ef6(kf6 kf6, String str) {
        this.a = kf6;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (xe6) obj);
    }
}

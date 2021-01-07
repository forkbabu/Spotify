package defpackage;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;

/* renamed from: ljd  reason: default package */
public final /* synthetic */ class ljd implements g {
    public final /* synthetic */ qjd a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ ljd(qjd qjd, String str, String str2) {
        this.a = qjd;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, this.c, (b) obj);
    }
}

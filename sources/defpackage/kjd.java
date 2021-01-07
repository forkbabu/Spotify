package defpackage;

import io.reactivex.functions.g;

/* renamed from: kjd  reason: default package */
public final /* synthetic */ class kjd implements g {
    public final /* synthetic */ qjd a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ kjd(qjd qjd, String str, String str2) {
        this.a = qjd;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, this.c, (Throwable) obj);
    }
}

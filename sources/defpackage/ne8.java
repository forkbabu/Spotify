package defpackage;

import defpackage.qe8;
import io.reactivex.functions.g;

/* renamed from: ne8  reason: default package */
public final /* synthetic */ class ne8 implements g {
    public final /* synthetic */ re8 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qe8.a f;

    public /* synthetic */ ne8(re8 re8, String str, String str2, qe8.a aVar) {
        this.a = re8;
        this.b = str;
        this.c = str2;
        this.f = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, this.c, this.f, (Boolean) obj);
    }
}

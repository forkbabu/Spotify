package defpackage;

import io.reactivex.b;
import io.reactivex.d;

/* renamed from: rd2  reason: default package */
public final /* synthetic */ class rd2 implements d {
    public final /* synthetic */ sd2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ rd2(sd2 sd2, String str, String str2) {
        this.a = sd2;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        this.a.a(this.b, this.c, bVar);
    }
}

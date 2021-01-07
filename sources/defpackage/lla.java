package defpackage;

import io.reactivex.functions.a;

/* renamed from: lla  reason: default package */
public final /* synthetic */ class lla implements a {
    public final /* synthetic */ mla a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lla(mla mla, String str, boolean z) {
        this.a = mla;
        this.b = str;
        this.c = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.b(this.b, this.c);
    }
}

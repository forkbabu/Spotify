package defpackage;

import io.reactivex.functions.a;

/* renamed from: iv6  reason: default package */
public final /* synthetic */ class iv6 implements a {
    public final /* synthetic */ rw6 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ iv6(rw6 rw6, boolean z) {
        this.a = rw6;
        this.b = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.c(this.b);
    }
}

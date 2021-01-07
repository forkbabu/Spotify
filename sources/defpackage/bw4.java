package defpackage;

import io.reactivex.functions.a;

/* renamed from: bw4  reason: default package */
public final /* synthetic */ class bw4 implements a {
    public final /* synthetic */ ew4 a;
    public final /* synthetic */ Integer b;

    public /* synthetic */ bw4(ew4 ew4, Integer num) {
        this.a = ew4;
        this.b = num;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.b(this.b);
    }
}

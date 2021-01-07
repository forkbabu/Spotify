package defpackage;

import io.reactivex.functions.a;

/* renamed from: ws7  reason: default package */
public final /* synthetic */ class ws7 implements a {
    public final /* synthetic */ at7 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ws7(at7 at7, String str, boolean z) {
        this.a = at7;
        this.b = str;
        this.c = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b, this.c);
    }
}

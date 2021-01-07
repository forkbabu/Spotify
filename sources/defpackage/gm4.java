package defpackage;

import io.reactivex.functions.f;
import io.reactivex.h;

/* renamed from: gm4  reason: default package */
public final /* synthetic */ class gm4 implements f {
    public final /* synthetic */ wm4 a;
    public final /* synthetic */ h b;

    public /* synthetic */ gm4(wm4 wm4, h hVar) {
        this.a = wm4;
        this.b = hVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.A(this.b);
    }
}

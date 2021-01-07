package defpackage;

import io.reactivex.functions.f;

/* renamed from: ehd  reason: default package */
public final /* synthetic */ class ehd implements f {
    public final /* synthetic */ ihd a;

    public /* synthetic */ ehd(ihd ihd) {
        this.a = ihd;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.a();
    }
}

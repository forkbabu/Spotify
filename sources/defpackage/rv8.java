package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

/* renamed from: rv8  reason: default package */
public final /* synthetic */ class rv8 implements g {
    public final /* synthetic */ uv8 a;

    public /* synthetic */ rv8(uv8 uv8) {
        this.a = uv8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        uv8.a(this.a, (Optional) obj);
    }
}

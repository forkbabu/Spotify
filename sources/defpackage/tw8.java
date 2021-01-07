package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

/* renamed from: tw8  reason: default package */
public final /* synthetic */ class tw8 implements g {
    public final /* synthetic */ qx8 a;
    public final /* synthetic */ Optional b;

    public /* synthetic */ tw8(qx8 qx8, Optional optional) {
        this.a = qx8;
        this.b = optional;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, (Boolean) obj);
    }
}

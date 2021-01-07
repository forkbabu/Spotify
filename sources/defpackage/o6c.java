package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

/* renamed from: o6c  reason: default package */
public final /* synthetic */ class o6c implements g {
    public final /* synthetic */ x6c a;

    public /* synthetic */ o6c(x6c x6c) {
        this.a = x6c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        x6c.a(this.a, (Optional) obj);
    }
}

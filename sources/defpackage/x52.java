package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: x52  reason: default package */
public final /* synthetic */ class x52 implements l {
    public final /* synthetic */ Optional a;

    public /* synthetic */ x52(Optional optional) {
        this.a = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((Optional) obj));
    }
}

package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: lia  reason: default package */
public final /* synthetic */ class lia implements l {
    public final /* synthetic */ ria a;

    public /* synthetic */ lia(ria ria) {
        this.a = ria;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((Optional) obj);
    }
}

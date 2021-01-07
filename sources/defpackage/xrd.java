package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: xrd  reason: default package */
public final /* synthetic */ class xrd implements l {
    public final /* synthetic */ bsd a;

    public /* synthetic */ xrd(bsd bsd) {
        this.a = bsd;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b((Optional) obj);
    }
}

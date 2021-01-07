package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: c70  reason: default package */
public final /* synthetic */ class c70 implements l {
    public final /* synthetic */ g70 a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ c70(g70 g70, j70 j70) {
        this.a = g70;
        this.b = j70;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Optional) obj);
    }
}

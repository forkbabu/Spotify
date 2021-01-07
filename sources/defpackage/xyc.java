package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: xyc  reason: default package */
public final /* synthetic */ class xyc implements l {
    public static final /* synthetic */ xyc a = new xyc();

    private /* synthetic */ xyc() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ej9 ej9 = (ej9) obj;
        if (ej9 instanceof fj9) {
            return Optional.of((fj9) ej9);
        }
        return Optional.absent();
    }
}

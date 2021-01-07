package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: uo0  reason: default package */
public final /* synthetic */ class uo0 implements l {
    public static final /* synthetic */ uo0 a = new uo0();

    private /* synthetic */ uo0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return jo0.c((u3) optional.get());
        }
        return jo0.b();
    }
}

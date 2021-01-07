package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: gza  reason: default package */
public final /* synthetic */ class gza implements n {
    public static final /* synthetic */ gza a = new gza();

    private /* synthetic */ gza() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}

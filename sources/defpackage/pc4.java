package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: pc4  reason: default package */
public final /* synthetic */ class pc4 implements n {
    public static final /* synthetic */ pc4 a = new pc4();

    private /* synthetic */ pc4() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}

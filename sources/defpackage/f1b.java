package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: f1b  reason: default package */
public final /* synthetic */ class f1b implements n {
    public static final /* synthetic */ f1b a = new f1b();

    private /* synthetic */ f1b() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}

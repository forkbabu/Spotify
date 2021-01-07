package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: am2  reason: default package */
public final /* synthetic */ class am2 implements n {
    public static final /* synthetic */ am2 a = new am2();

    private /* synthetic */ am2() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}

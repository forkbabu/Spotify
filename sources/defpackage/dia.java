package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: dia  reason: default package */
public final /* synthetic */ class dia implements n {
    public static final /* synthetic */ dia a = new dia();

    private /* synthetic */ dia() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}

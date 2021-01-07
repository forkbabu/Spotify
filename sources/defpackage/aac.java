package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: aac  reason: default package */
public final /* synthetic */ class aac implements n {
    public static final /* synthetic */ aac a = new aac();

    private /* synthetic */ aac() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}

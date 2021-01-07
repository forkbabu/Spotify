package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: vaa  reason: default package */
public final /* synthetic */ class vaa implements n {
    public static final /* synthetic */ vaa a = new vaa();

    private /* synthetic */ vaa() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}

package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: x2b  reason: default package */
public final /* synthetic */ class x2b implements l {
    public static final /* synthetic */ x2b a = new x2b();

    private /* synthetic */ x2b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((Optional) obj).get();
    }
}

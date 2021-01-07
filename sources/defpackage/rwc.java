package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: rwc  reason: default package */
public final /* synthetic */ class rwc implements l {
    public static final /* synthetic */ rwc a = new rwc();

    private /* synthetic */ rwc() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.i0(Boolean.valueOf("premium".equals(((Optional) obj).orNull())));
    }
}

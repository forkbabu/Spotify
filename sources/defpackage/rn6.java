package defpackage;

import com.google.common.base.Optional;
import defpackage.zwd;
import io.reactivex.functions.l;

/* renamed from: rn6  reason: default package */
public final /* synthetic */ class rn6 implements l {
    public static final /* synthetic */ rn6 a = new rn6();

    private /* synthetic */ rn6() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        zwd zwd = (zwd) obj;
        zwd.getClass();
        if (zwd instanceof zwd.b) {
            return Optional.of(Boolean.FALSE);
        }
        return Optional.absent();
    }
}

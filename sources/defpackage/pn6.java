package defpackage;

import com.google.common.base.Optional;
import defpackage.zwd;
import io.reactivex.functions.l;

/* renamed from: pn6  reason: default package */
public final /* synthetic */ class pn6 implements l {
    public static final /* synthetic */ pn6 a = new pn6();

    private /* synthetic */ pn6() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        zwd zwd = (zwd) obj;
        zwd.getClass();
        if (zwd instanceof zwd.b) {
            return Optional.of(Boolean.TRUE);
        }
        return Optional.absent();
    }
}

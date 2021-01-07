package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: twc  reason: default package */
public final /* synthetic */ class twc implements l {
    public static final /* synthetic */ twc a = new twc();

    private /* synthetic */ twc() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return s.i0(Boolean.valueOf(optional.isPresent() && ((String) optional.get()).startsWith("opt-in-trial")));
    }
}

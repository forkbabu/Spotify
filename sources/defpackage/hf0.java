package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: hf0  reason: default package */
public final /* synthetic */ class hf0 implements l {
    public static final /* synthetic */ hf0 a = new hf0();

    private /* synthetic */ hf0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe Session Server Time.", new Object[0]);
        return s.i0(lf0.a);
    }
}

package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

/* renamed from: pe9  reason: default package */
public final /* synthetic */ class pe9 implements l {
    public static final /* synthetic */ pe9 a = new pe9();

    private /* synthetic */ pe9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Requesting recs failed!", new Object[0]);
        return ge9.d(ImmutableList.of());
    }
}

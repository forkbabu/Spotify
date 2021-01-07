package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import defpackage.vy1;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: ez1  reason: default package */
public final class ez1<T, R> implements l<PauseState, vy1> {
    public static final ez1 a = new ez1();

    ez1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public vy1 apply(PauseState pauseState) {
        PauseState pauseState2 = pauseState;
        h.e(pauseState2, "pauseState");
        return new vy1.b(pauseState2);
    }
}

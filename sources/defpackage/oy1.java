package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import defpackage.rx1;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: oy1  reason: default package */
public final class oy1<T, R> implements l<PauseState, rx1> {
    public static final oy1 a = new oy1();

    oy1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public rx1 apply(PauseState pauseState) {
        PauseState pauseState2 = pauseState;
        h.e(pauseState2, "pauseState");
        return new rx1.b(pauseState2);
    }
}

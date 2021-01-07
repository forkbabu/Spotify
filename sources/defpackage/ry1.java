package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: ry1  reason: default package */
public final class ry1 {
    public static final q<rx1> a(s<kx1> sVar, s<PauseState> sVar2, s<ox1> sVar3) {
        h.e(sVar, "storyStartUpdates");
        h.e(sVar2, "pauseStateUpdates");
        h.e(sVar3, "storyUserRequests");
        h.e(sVar, "storyStartUpdates");
        s<R> j0 = sVar.j0(py1.a);
        s<Object> sVar4 = o.a;
        h.e(sVar2, "pauseStateUpdates");
        h.e(sVar3, "storyUserRequests");
        return i.a(j0.p0(sVar4), sVar2.j0(oy1.a).p0(sVar4), sVar3.j0(qy1.a).p0(sVar4));
    }
}

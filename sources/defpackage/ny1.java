package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobile.android.storytelling.common.d;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import defpackage.qx1;
import io.reactivex.a;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: ny1  reason: default package */
public final class ny1 {
    public static final w<qx1, rx1> a(z<Integer> zVar, nmf<Integer, a> nmf, nmf<? super Integer, f> nmf2, nmf<gx1, f> nmf3, nmf<PauseState, f> nmf4, cmf<f> cmf, d dVar, cmf<f> cmf2, t31 t31, sy1 sy1) {
        h.e(zVar, "storiesLoadSingle");
        h.e(nmf, "storyPreLoader");
        h.e(nmf2, "showCurrentStoryAction");
        h.e(nmf3, "storiesUpdateConsumer");
        h.e(nmf4, "pauseStateConsumer");
        h.e(cmf, "exitContainerAction");
        h.e(dVar, "storiesShareProvider");
        h.e(cmf2, "openShareMenuAction");
        h.e(t31, "audioPlayer");
        h.e(sy1, "storytellingContainerLogger");
        m f = i.f();
        h.e(zVar, "storiesLoadSingle");
        h.e(nmf3, "storiesUpdateConsumer");
        f.h(qx1.b.class, new yx1(zVar, nmf3));
        h.e(nmf2, "showCurrentStoryAction");
        h.e(nmf3, "storiesUpdateConsumer");
        h.e(t31, "audioPlayer");
        f.e(qx1.n.class, new ky1(t31, nmf2, nmf3), io.reactivex.android.schedulers.a.b());
        h.e(cmf, "exitContainerAction");
        f.c(qx1.a.class, new ux1(cmf), io.reactivex.android.schedulers.a.b());
        h.e(nmf3, "storiesUpdateConsumer");
        f.e(qx1.i.class, new ly1(nmf3), io.reactivex.android.schedulers.a.b());
        h.e(nmf3, "storiesUpdateConsumer");
        h.e(t31, "audioPlayer");
        f.e(qx1.j.class, new fy1(nmf3, t31), io.reactivex.android.schedulers.a.b());
        h.e(nmf3, "storiesUpdateConsumer");
        h.e(t31, "audioPlayer");
        f.e(qx1.l.class, new iy1(nmf3, t31), io.reactivex.android.schedulers.a.b());
        h.e(nmf, "storyPreLoader");
        f.h(qx1.k.class, new hy1(nmf));
        h.e(dVar, "storiesShareProvider");
        h.e(cmf2, "openShareMenuAction");
        h.e(nmf3, "storiesUpdateConsumer");
        h.e(nmf4, "pauseStateConsumer");
        f.e(qx1.m.class, new jy1(nmf3, nmf4, dVar, cmf2), io.reactivex.android.schedulers.a.b());
        h.e(sy1, "storytellingContainerLogger");
        f.b(qx1.c.class, new zx1(sy1));
        h.e(sy1, "storytellingContainerLogger");
        f.b(qx1.d.class, new ay1(sy1));
        h.e(sy1, "storytellingContainerLogger");
        f.b(qx1.e.class, new by1(sy1));
        h.e(nmf4, "pauseStateConsumer");
        f.b(qx1.g.class, new dy1(nmf4));
        h.e(nmf4, "pauseStateConsumer");
        f.b(qx1.h.class, new ey1(nmf4));
        h.e(t31, "audioPlayer");
        h.e(sy1, "storytellingContainerLogger");
        f.c(qx1.f.class, new cy1(t31, sy1), io.reactivex.android.schedulers.a.b());
        h.e(t31, "audioPlayer");
        h.e(sy1, "storytellingContainerLogger");
        f.c(qx1.o.class, new my1(t31, sy1), io.reactivex.android.schedulers.a.b());
        return f.i();
    }
}

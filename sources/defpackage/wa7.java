package defpackage;

import com.spotify.music.pageloader.skeleton.SkeletonComponents;
import com.spotify.pageloader.w0;
import kotlin.jvm.internal.h;

/* renamed from: wa7  reason: default package */
public final class wa7 implements fjf<w0> {
    private final va7 a;

    public wa7(va7 va7) {
        this.a = va7;
    }

    @Override // defpackage.wlf
    public Object get() {
        this.a.getClass();
        SkeletonComponents skeletonComponents = SkeletonComponents.SECTION_HEADER;
        SkeletonComponents skeletonComponents2 = SkeletonComponents.ROW;
        SkeletonComponents skeletonComponents3 = SkeletonComponents.TRACK_PREVIEW;
        w0 c = fbc.c(skeletonComponents, skeletonComponents2, skeletonComponents3, skeletonComponents, skeletonComponents2, skeletonComponents3, skeletonComponents, skeletonComponents2, skeletonComponents3);
        h.d(c, "PageLoaderViewDefaults.s…ents.TRACK_PREVIEW,\n    )");
        return c;
    }
}

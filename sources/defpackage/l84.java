package defpackage;

import android.view.animation.AccelerateInterpolator;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;

/* renamed from: l84  reason: default package */
public class l84 implements o84 {
    @Override // defpackage.o84
    public void a(GlueHeaderViewV2 glueHeaderViewV2) {
        glueHeaderViewV2.setScrollObserver(new w74(glueHeaderViewV2, new AccelerateInterpolator(3.0f)));
    }
}

package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;

/* renamed from: w74  reason: default package */
public final /* synthetic */ class w74 implements e {
    public final /* synthetic */ GlueHeaderViewV2 a;
    public final /* synthetic */ Interpolator b;

    public /* synthetic */ w74(GlueHeaderViewV2 glueHeaderViewV2, Interpolator interpolator) {
        this.a = glueHeaderViewV2;
        this.b = interpolator;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public final void a(float f) {
        GlueHeaderViewV2 glueHeaderViewV2 = this.a;
        l70.k(glueHeaderViewV2.getContext()).o(this.b.getInterpolation(f));
        glueHeaderViewV2.setAlpha(Math.max(0.7f, 1.0f - f));
    }
}

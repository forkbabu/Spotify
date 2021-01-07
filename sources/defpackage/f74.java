package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.behavior.e;

/* renamed from: f74  reason: default package */
public final /* synthetic */ class f74 implements e {
    public final /* synthetic */ h74 a;
    public final /* synthetic */ Interpolator b;

    public /* synthetic */ f74(h74 h74, Interpolator interpolator) {
        this.a = h74;
        this.b = interpolator;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public final void a(float f) {
        this.a.f(this.b, f);
    }
}

package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.behavior.e;

/* access modifiers changed from: package-private */
/* renamed from: tr8  reason: default package */
public final class tr8 implements e {
    final /* synthetic */ sr8 a;
    final /* synthetic */ Interpolator b;

    tr8(sr8 sr8, Interpolator interpolator) {
        this.a = sr8;
        this.b = interpolator;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public final void a(float f) {
        this.a.b.o(this.b.getInterpolation(f));
    }
}

package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.behavior.e;

/* renamed from: rc6  reason: default package */
public final /* synthetic */ class rc6 implements e {
    public final /* synthetic */ fd6 a;
    public final /* synthetic */ Interpolator b;

    public /* synthetic */ rc6(fd6 fd6, Interpolator interpolator) {
        this.a = fd6;
        this.b = interpolator;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public final void a(float f) {
        this.a.w(this.b, f);
    }
}

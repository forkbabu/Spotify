package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.behavior.e;

/* renamed from: m65  reason: default package */
public final /* synthetic */ class m65 implements e {
    public final /* synthetic */ o65 a;
    public final /* synthetic */ Interpolator b;

    public /* synthetic */ m65(o65 o65, Interpolator interpolator) {
        this.a = o65;
        this.b = interpolator;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public final void a(float f) {
        this.a.f(this.b, f);
    }
}

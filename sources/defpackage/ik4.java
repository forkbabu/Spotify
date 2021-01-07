package defpackage;

import android.view.animation.AccelerateInterpolator;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.glue.patterns.prettylist.u;

/* renamed from: ik4  reason: default package */
final class ik4 implements e {
    final /* synthetic */ u a;
    final /* synthetic */ AccelerateInterpolator b;

    ik4(u uVar, AccelerateInterpolator accelerateInterpolator) {
        this.a = uVar;
        this.b = accelerateInterpolator;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public final void a(float f) {
        this.a.o(this.b.getInterpolation(f));
        this.a.c(f);
    }
}

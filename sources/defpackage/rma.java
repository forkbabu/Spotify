package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.glue.patterns.prettylist.u;

/* renamed from: rma  reason: default package */
public final /* synthetic */ class rma implements e {
    public final /* synthetic */ u a;
    public final /* synthetic */ Interpolator b;

    public /* synthetic */ rma(u uVar, Interpolator interpolator) {
        this.a = uVar;
        this.b = interpolator;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public final void a(float f) {
        u uVar = this.a;
        uVar.o(this.b.getInterpolation(f));
        uVar.c(f);
    }
}

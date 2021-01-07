package defpackage;

import android.view.View;
import androidx.fragment.app.c;
import com.spotify.mobile.android.spotlets.tooltip.a;
import kotlin.jvm.internal.h;

/* renamed from: bxc  reason: default package */
public final class bxc implements lxc {
    private final c a;
    private final a b;
    private final exc c;

    public bxc(c cVar, a aVar, exc exc) {
        h.e(cVar, "activity");
        h.e(aVar, "tooltipManager");
        h.e(exc, "tooltipConfiguration");
        this.a = cVar;
        this.b = aVar;
        this.c = exc;
    }

    @Override // defpackage.lxc
    public void a(View view) {
        h.e(view, "anchorView");
        a.C0193a a2 = this.b.a(this.a);
        a2.b(this.c);
        a2.c(view);
    }
}

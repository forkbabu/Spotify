package defpackage;

import android.view.View;
import com.spotify.mobile.android.spotlets.tooltip.TooltipContainer;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.share.common.tooltip.a;
import kotlin.jvm.internal.h;

/* renamed from: zeb  reason: default package */
public final class zeb {
    private final a a;
    private final yeb b;

    public zeb(a aVar, yeb yeb) {
        h.e(aVar, "tooltipManager");
        h.e(yeb, "tooltipConfiguration");
        this.a = aVar;
        this.b = yeb;
    }

    public final void a(View view, View view2) {
        h.e(view, "parentView");
        h.e(view2, "anchorView");
        this.b.p(view);
        this.a.getClass();
        h.e(view, "parentView");
        h.e(view, "parentView");
        View findViewById = view.findViewById(C0707R.id.tooltip_container);
        h.d(findViewById, "parentView.findViewById(R.id.tooltip_container)");
        a.C0308a aVar = new a.C0308a((TooltipContainer) findViewById);
        aVar.a(this.b);
        aVar.b(view2);
    }
}

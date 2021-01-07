package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.a;
import androidx.fragment.app.c;
import com.spotify.mobile.android.spotlets.tooltip.TooltipContainer;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: yeb  reason: default package */
public final class yeb extends tu1 {
    private View d;
    private final c e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yeb(c cVar) {
        super(true);
        h.e(cVar, "activity");
        this.e = cVar;
    }

    @Override // defpackage.uu1
    public Integer b() {
        return Integer.valueOf(a.b(this.e, 17170443));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public int l() {
        return C0707R.layout.share_education_tooltip;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public void n(View view) {
        h.e(view, "rootView");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setOnClickListener(new web(this));
        }
        View view2 = this.d;
        if (view2 != null) {
            h.e(view2, "parentView");
            View findViewById = view2.findViewById(C0707R.id.tooltip_container);
            h.d(findViewById, "parentView.findViewById(R.id.tooltip_container)");
            TooltipContainer tooltipContainer = (TooltipContainer) findViewById;
            tooltipContainer.setOnClickListener(new xeb(this, tooltipContainer));
            return;
        }
        h.k("parentView");
        throw null;
    }

    public final void p(View view) {
        h.e(view, "parentView");
        this.d = view;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.a;
import androidx.fragment.app.c;
import com.spotify.mobile.android.spotlets.tooltip.TooltipContainer;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: exc  reason: default package */
public final class exc extends tu1 {
    private final c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public exc(c cVar) {
        super(true);
        h.e(cVar, "activity");
        this.d = cVar;
    }

    @Override // defpackage.uu1
    public Integer b() {
        return Integer.valueOf(a.b(this.d, 17170443));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public int l() {
        return C0707R.layout.premium_mini_tooltip;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public void n(View view) {
        h.e(view, "rootView");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setOnClickListener(new cxc(this));
        }
        c cVar = this.d;
        int i = TooltipContainer.z;
        cVar.getClass();
        View findViewById = cVar.findViewById(C0707R.id.tooltip_container);
        findViewById.getClass();
        TooltipContainer tooltipContainer = (TooltipContainer) findViewById;
        h.d(tooltipContainer, "TooltipContainer.getInstance(activity)");
        tooltipContainer.setOnTouchListener(new dxc(this, tooltipContainer));
    }
}

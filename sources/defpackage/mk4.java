package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: mk4  reason: default package */
public class mk4 implements rk4 {
    private final GlueHeaderViewV2 a;
    private final tk4 b;
    private final wk4 c;
    private final u f;

    public mk4(tk4 tk4, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        context.getClass();
        h.e(viewGroup, "parent");
        Context context2 = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context2, null);
        h.d(context2, "context");
        h.e(context2, "context");
        glueHeaderViewV2.setStickyAreaSize(nud.l(context2, C0707R.attr.actionBarSize) + a.e(context2.getResources()));
        glueHeaderViewV2.setLayoutParams(a.c(context2, viewGroup));
        glueHeaderViewV2.setContentTopMargin(a.e(context2.getResources()));
        this.a = glueHeaderViewV2;
        u k = l70.k(context);
        this.f = k;
        h.e(glueHeaderViewV2, "view");
        h.e(k, "toolbarUpdater");
        glueHeaderViewV2.setScrollObserver(new ik4(k, new AccelerateInterpolator(2.0f)));
        wk4 wk4 = new wk4(context, glueHeaderViewV2, C0707R.layout.header_gradient);
        this.c = wk4;
        glueHeaderViewV2.setContentViewBinder(wk4);
        this.b = tk4;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.rk4
    public void setTitle(CharSequence charSequence) {
        this.c.setTitle(charSequence);
    }

    @Override // defpackage.rk4
    public void v(String str) {
        this.b.a(this.a, str, this.f);
    }
}

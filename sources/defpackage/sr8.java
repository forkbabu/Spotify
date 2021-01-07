package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: sr8  reason: default package */
public final class sr8 implements rr8 {
    public static final a f = new a(null);
    private final GlueHeaderViewV2 a;
    private final u b;
    private final or8 c;

    /* renamed from: sr8$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    public sr8(Context context, ViewGroup viewGroup) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        this.a = glueHeaderViewV2;
        u k = l70.k(context);
        this.b = k;
        or8 or8 = new or8(context, glueHeaderViewV2, C0707R.layout.topic_header);
        this.c = or8;
        k.o(0.0f);
        glueHeaderViewV2.setLayoutParams(com.spotify.android.goldenpath.a.c(context, viewGroup));
        glueHeaderViewV2.setContentTopMargin(com.spotify.android.goldenpath.a.e(context.getResources()));
        glueHeaderViewV2.setStickyAreaSize(nud.l(context, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.e(context.getResources()));
        glueHeaderViewV2.setContentViewBinder(or8);
        glueHeaderViewV2.setScrollObserver(new tr8(this, new AccelerateInterpolator(3.0f)));
        mc0 c2 = lc0.c(context, i2.c(context.getResources(), R.color.midnight, null));
        h.d(c2, "GlueCompositeDrawables.s…          )\n            )");
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        glueHeaderViewV2.setBackground(c2);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.rr8
    public void setTitle(CharSequence charSequence) {
        h.e(charSequence, "title");
        this.c.setTitle(charSequence);
        this.b.setTitle(charSequence.toString());
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;

/* renamed from: uma  reason: default package */
public final class uma {
    public static GlueHeaderViewV2 a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        glueHeaderViewV2.setStickyAreaSize(nud.l(context, C0707R.attr.actionBarSize) + a.e(context.getResources()));
        return glueHeaderViewV2;
    }

    private static Drawable b(Context context, int i) {
        return lc0.a(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, 0}), new kc0(context));
    }

    public static void c(GlueHeaderViewV2 glueHeaderViewV2, int i, u uVar) {
        uVar.o(0.0f);
        uVar.u(b(glueHeaderViewV2.getContext(), i));
        glueHeaderViewV2.setBackground(b(glueHeaderViewV2.getContext(), i));
    }
}

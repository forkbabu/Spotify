package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.gradients.factory.GlueGradients;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.goldenpath.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import java.util.List;

/* renamed from: fp9  reason: default package */
public class fp9 implements Object<GlueHeaderViewV2>, pk9 {
    private final wlf<u> a;

    public fp9(wlf<u> wlf) {
        wlf.getClass();
        this.a = wlf;
    }

    public /* synthetic */ void a(float f) {
        this.a.get().a(1.0f - f);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        mc0 mc0;
        p81 bundle;
        int i;
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
        List<? extends s81> children = s81.children();
        if (children.size() == 1) {
            s81 s812 = (s81) children.get(0);
            w61<?> b = w61.b(w51.c().d(s812), glueHeaderViewV2, w51);
            b.a(0, s812, bVar);
            glueHeaderViewV2.setContentViewBinder(new hp9(b.e()));
        } else {
            Logger.d("Only one child is supported in freetier:solarHeader component.", new Object[0]);
        }
        Context context = glueHeaderViewV2.getContext();
        p81 custom = s81.custom();
        if (custom == null || (bundle = custom.bundle("gradient")) == null) {
            mc0 = lc0.b(context, GlueGradients.Style.AQUATIC);
        } else {
            String string = bundle.string("style", "aquatic");
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1102672091) {
                if (hashCode != -932786325) {
                    if (hashCode == -760305582 && string.equals("aquatic")) {
                        c = 2;
                    }
                } else if (string.equals("purpleLake")) {
                    c = 1;
                }
            } else if (string.equals("linear")) {
                c = 0;
            }
            if (c == 0) {
                try {
                    i = Color.parseColor(bundle.string("color", "#535353"));
                } catch (IllegalArgumentException e) {
                    int c2 = i2.c(context.getResources(), R.color.gray_30, null);
                    Logger.e(e, "Not supported color", new Object[0]);
                    i = c2;
                }
                mc0 = lc0.c(context, i);
            } else if (c != 1) {
                mc0 = lc0.b(context, GlueGradients.Style.AQUATIC);
            } else {
                mc0 = lc0.b(context, GlueGradients.Style.PURPLE_LAKE);
            }
        }
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        glueHeaderViewV2.setBackground(mc0);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.free_tier_solar_header;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        Context context = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        glueHeaderViewV2.setLayoutParams(a.c(context, viewGroup));
        glueHeaderViewV2.setContentTopMargin(context.getResources().getDimensionPixelSize(C0707R.dimen.header_content_top_margin) + (nud.l(context, C0707R.attr.actionBarSize) / 2) + a.d(context));
        glueHeaderViewV2.setScrollObserver(new cp9(this));
        q4.J(glueHeaderViewV2, true);
        return glueHeaderViewV2;
    }
}

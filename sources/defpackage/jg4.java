package defpackage;

import android.app.Activity;
import android.view.View;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;

/* renamed from: jg4  reason: default package */
public class jg4 {
    private final Activity a;
    private final hg4 b;
    private final boolean c;
    private final boolean d;

    public jg4(Activity activity, hg4 hg4, boolean z, boolean z2) {
        this.a = activity;
        hg4.getClass();
        this.b = hg4;
        this.c = z;
        this.d = z2;
    }

    public void a(GlueHeaderLayout glueHeaderLayout, s81 s81) {
        glueHeaderLayout.setAccessory(null);
        int i = 0;
        if (s81 != null && !s81.childGroup("primary_buttons").isEmpty()) {
            View a2 = this.b.a((s81) s81.childGroup("primary_buttons").get(0), glueHeaderLayout, 0);
            if (!this.c || this.d) {
                glueHeaderLayout.F(a2, true);
                i = 0 + a.d(this.a);
                if (this.c) {
                    i += this.a.getResources().getDimensionPixelSize(C0707R.dimen.find_button_landscape_top_margin);
                }
            }
        }
        View C = glueHeaderLayout.C(true);
        if (C instanceof GlueHeaderViewV2) {
            GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) C;
            int d2 = a.d(this.a);
            if (!this.d) {
                d2 += nud.l(this.a, C0707R.attr.actionBarSize);
            }
            glueHeaderViewV2.setStickyAreaSize(d2 + i);
            glueHeaderViewV2.setContentBottomMargin(i);
        }
    }
}

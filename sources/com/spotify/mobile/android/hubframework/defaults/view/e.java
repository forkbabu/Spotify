package com.spotify.mobile.android.hubframework.defaults.view;

import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.b0;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;

/* access modifiers changed from: package-private */
public class e extends m {
    final /* synthetic */ c a;
    final /* synthetic */ f b;

    e(f fVar, c cVar) {
        this.b = fVar;
        this.a = cVar;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void I1(Menu menu) {
        if (this.b.j == null) {
            return;
        }
        if ((this.b.i == null || this.b.i.e3()) && x.f(this.b.a)) {
            b bVar = this.b.e;
            a0 a2 = ToolbarConfig.a(this.b.a, menu, this.a);
            View b2 = bVar.b(this.b.j.d().a(), this.b.c);
            if (b2 != null) {
                bd0.i(b2);
                FrameLayout frameLayout = new FrameLayout(a2.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int dimensionPixelSize = b2.getResources().getDimensionPixelSize(C0707R.dimen.actionbar_play_button_container_padding);
                layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                b2.setLayoutParams(layoutParams);
                frameLayout.addView(b2);
                b0 d = a2.d(C0707R.id.actionbar_item_shuffle_play, "");
                d.setActionView(frameLayout);
                d.a(new a(frameLayout));
            }
        }
    }
}

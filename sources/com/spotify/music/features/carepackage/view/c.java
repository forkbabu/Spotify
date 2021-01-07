package com.spotify.music.features.carepackage.view;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

final class c implements AppBarLayout.c {
    final /* synthetic */ CarePackageViews a;
    final /* synthetic */ AppBarLayout b;
    final /* synthetic */ TextView c;
    final /* synthetic */ List f;

    c(CarePackageViews carePackageViews, AppBarLayout appBarLayout, TextView textView, List list) {
        this.a = carePackageViews;
        this.b = appBarLayout;
        this.c = textView;
        this.f = list;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        float abs = Math.abs(((float) i) / ((float) this.b.getTotalScrollRange()));
        float a2 = CarePackageViews.a(this.a, abs, 0.8f);
        float a3 = 1.0f - CarePackageViews.a(this.a, abs, 0.5f);
        TextView textView = this.c;
        this.a.getClass();
        textView.setTextColor(Color.argb((int) ((a2 * 255.0f) + 0.5f), Color.red(-1), Color.green(-1), Color.blue(-1)));
        for (View view : this.f) {
            view.setAlpha(a3);
        }
    }
}

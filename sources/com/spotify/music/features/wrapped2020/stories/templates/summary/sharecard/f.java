package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

final class f implements ViewPager2.i {
    final /* synthetic */ SummaryShareStory a;
    final /* synthetic */ ViewPager2 b;

    f(SummaryShareStory summaryShareStory, ViewPager2 viewPager2) {
        this.a = summaryShareStory;
        this.b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void a(View view, float f) {
        h.e(view, "page");
        float dimensionPixelSize = f * ((float) ((this.a.f().getResources().getDimensionPixelSize(C0707R.dimen.share_card_view_margin) * 2) - this.a.f().getResources().getDimensionPixelSize(C0707R.dimen.share_card_view_gap)));
        if (this.b.getOrientation() != 0) {
            return;
        }
        if (q4.o(this.b) == 1) {
            view.setTranslationX(dimensionPixelSize);
        } else {
            view.setTranslationX(-dimensionPixelSize);
        }
    }
}

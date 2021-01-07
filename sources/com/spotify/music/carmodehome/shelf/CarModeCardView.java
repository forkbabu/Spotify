package com.spotify.music.carmodehome.shelf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.android.glue.components.card.glue.CardView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class CarModeCardView extends CardView {
    public CarModeCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setTitleCentered(boolean z) {
        TextView titleView = getTitleView();
        h.d(titleView, "titleView");
        titleView.setGravity(z ? 17 : 8388611);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.components.card.glue.CardView
    public void w(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarModeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        TextView titleView = getTitleView();
        h.d(titleView, "titleView");
        ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(C0707R.dimen.std_8dp);
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
            titleView.setLayoutParams(marginLayoutParams);
            c.n(getTitleView(), R.style.TextAppearance_Encore_Cello);
            TextView titleView2 = getTitleView();
            h.d(titleView2, "titleView");
            titleView2.setMaxLines(1);
            TextView subtitleView = getSubtitleView();
            h.d(subtitleView, "subtitleView");
            subtitleView.setVisibility(8);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}

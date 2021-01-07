package com.spotify.music.carmodehome.view.offlinebar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class CarModeOfflineBarView extends AppCompatTextView {
    public CarModeOfflineBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarModeOfflineBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setBackgroundColor(a.b(context, R.color.announcement));
        c.n(this, C0707R.style.res_2132083290_textappearance_carmodehome_offlinebar);
        setGravity(17);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), context.getResources().getDimensionPixelSize(R.dimen.spacer_4));
        setText(C0707R.string.car_mode_home_spotify_is_offline);
    }
}

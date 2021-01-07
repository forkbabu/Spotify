package com.spotify.music.features.languagepicker.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public class h {
    private final Context a;
    final lb0 b;

    public h(Context context, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.a = context;
        viewGroup.getClass();
        lb0 a2 = pb0.a(context, viewGroup);
        this.b = a2;
        viewGroup.addView(a2.getView());
        a2.getView().setVisibility(8);
        a2.getTitleView().setVisibility(0);
        a2.getTitleView().setTextColor(a.b(context, R.color.white));
        a2.getTitleView().setTextSize(2, 24.0f);
        a2.getTitleView().setTypeface(a2.getTitleView().getTypeface(), 1);
        a2.getSubtitleView().setVisibility(4);
        a2.i().setVisibility(0);
        a2.i().setText(C0707R.string.error_button_title);
        a2.i().setTextColor(-16777216);
        a2.i().setBackgroundResource(C0707R.drawable.glue_button_primary_white);
        a2.i().setOnClickListener(onClickListener);
        a2.getView().setBackgroundColor(0);
    }

    public void a(int i, boolean z) {
        this.b.setTitle(this.a.getString(i));
        int i2 = 0;
        this.b.getView().setVisibility(0);
        Button i3 = this.b.i();
        if (!z) {
            i2 = 8;
        }
        i3.setVisibility(i2);
    }
}

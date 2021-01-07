package com.spotify.music.carmode.nowplaying.common.view.optout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.graphics.drawable.a;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.optout.g;

public class CarModeOptOutButton extends AppCompatImageButton implements g {
    private g.a a;

    public CarModeOptOutButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            ((e) aVar).b();
        }
    }

    @Override // com.spotify.music.carmode.nowplaying.common.view.optout.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    public CarModeOptOutButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER);
        Context context2 = getContext();
        context2.getClass();
        Drawable b = i0.b(context2, C0707R.drawable.ic_car_mode_opt_out);
        b.getClass();
        Drawable l = a.l(b);
        a.i(l, androidx.core.content.a.c(context2, C0707R.color.btn_car_mode_now_playing_opt_out));
        setImageDrawable(l);
        setOnClickListener(new a(this));
    }
}

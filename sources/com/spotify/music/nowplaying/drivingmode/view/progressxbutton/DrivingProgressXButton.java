package com.spotify.music.nowplaying.drivingmode.view.progressxbutton;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.view.progressxbutton.h;

public class DrivingProgressXButton extends ProgressBar implements h {
    private h.a a;
    private LayerDrawable b;

    public DrivingProgressXButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        this.b = (LayerDrawable) a.d(getContext(), C0707R.drawable.driving_progress_x_button);
        setProgressDrawable(null);
        setBackground(fvb.y(getContext()));
        setOnClickListener(new b(this));
    }

    public void b(View view) {
        h.a aVar = this.a;
        if (aVar != null) {
            ((g) aVar).c();
        }
    }

    public void c(int i) {
        if (i == 1) {
            setProgressDrawable(this.b);
        }
        setProgress(i);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.progressxbutton.h
    public void setListener(h.a aVar) {
        this.a = aVar;
    }

    public DrivingProgressXButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}

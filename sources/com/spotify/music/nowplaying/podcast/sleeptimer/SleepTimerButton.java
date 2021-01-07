package com.spotify.music.nowplaying.podcast.sleeptimer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.sleeptimer.g;

public class SleepTimerButton extends AppCompatImageButton implements g {
    private g.a a;

    public SleepTimerButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.sleeptimer.g
    public void setActive(boolean z) {
        if (z) {
            setImageDrawable(gqd.A(getContext()));
        } else {
            setImageDrawable(gqd.B(getContext()));
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.sleeptimer.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    public SleepTimerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(gqd.B(getContext()));
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setOnClickListener(new a(this));
        setContentDescription(getResources().getString(C0707R.string.player_content_description_sleep_timer));
    }
}

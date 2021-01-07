package com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.g;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder;

public class DrivingShowVoiceViewButton extends AppCompatImageButton implements DrivingShowVoiceViewButtonViewBinder {
    private DrivingShowVoiceViewButtonViewBinder.a a;
    private DrivingShowVoiceViewButtonViewBinder.Type b = DrivingShowVoiceViewButtonViewBinder.Type.UNKNOWN;

    public DrivingShowVoiceViewButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context, attributeSet, 0);
    }

    private void g(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wka.a, i, 0);
            int i2 = obtainStyledAttributes.getInt(0, 0);
            if (i2 == 1) {
                this.b = DrivingShowVoiceViewButtonViewBinder.Type.NOW_PLAYING;
                setImageDrawable(fvb.u(context, R.color.white, R.color.gray_50, C0707R.dimen.driving_npv_mic_icon_scale));
            } else if (i2 != 2) {
                this.b = DrivingShowVoiceViewButtonViewBinder.Type.UNKNOWN;
                setImageDrawable(fvb.u(context, R.color.white, R.color.gray_50, C0707R.dimen.driving_npv_mic_icon_scale));
            } else {
                this.b = DrivingShowVoiceViewButtonViewBinder.Type.HOME_FEED;
                setImageDrawable(fvb.u(context, R.color.white, R.color.gray_50, C0707R.dimen.driving_home_feed_mic_icon_scale));
            }
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new a(this));
    }

    public void h(View view) {
        DrivingShowVoiceViewButtonViewBinder.Type type = this.b;
        DrivingShowVoiceViewButtonViewBinder.a aVar = this.a;
        if (aVar != null) {
            ((g) aVar).b(type);
        }
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder
    public void setListener(DrivingShowVoiceViewButtonViewBinder.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder
    public void setMicButtonEnabled(boolean z) {
        setClickable(z);
        setActivated(z);
        setEnabled(z);
    }

    public DrivingShowVoiceViewButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(context, attributeSet, i);
    }
}

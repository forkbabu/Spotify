package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.a;

public abstract class HomeMixTuningButton extends LinearLayout implements e {
    public HomeMixTuningButton(Context context) {
        super(context);
        e(context);
    }

    private Drawable getStateListDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        a aVar = new a(getContext(), getIcon(), (float) d(C0707R.dimen.mix_tuning_icon_size), (float) d(C0707R.dimen.mix_tuning_button_size), b(C0707R.color.mix_tuning_default_bg), b(C0707R.color.whiteAlpha60));
        stateListDrawable.addState(new int[]{16842913}, new a(getContext(), getIcon(), (float) d(C0707R.dimen.mix_tuning_icon_size), (float) d(C0707R.dimen.mix_tuning_button_size), b(R.color.white), b(C0707R.color.textBlack)));
        stateListDrawable.addState(new int[0], aVar);
        return stateListDrawable;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.e
    public void a(float f) {
        setScaleX(f);
        setScaleY(f);
        setAlpha(f);
    }

    /* access modifiers changed from: protected */
    public int b(int i) {
        return androidx.core.content.a.b(getContext(), i);
    }

    /* access modifiers changed from: protected */
    public abstract ViewGroup.LayoutParams c();

    /* access modifiers changed from: protected */
    public int d(int i) {
        return getContext().getResources().getDimensionPixelSize(i);
    }

    /* access modifiers changed from: protected */
    public final void e(Context context) {
        LinearLayout.inflate(context, C0707R.layout.playlist_entity_home_mix_tuning_button_view, this);
        setOrientation(1);
        setGravity(17);
        setLayoutParams(c());
        setId(getButtonId());
        int i = (int) (getContext().getResources().getDisplayMetrics().density * ((float) 16));
        setPadding(i, i, i, i);
        ImageView imageView = (ImageView) findViewById(C0707R.id.styleImage);
        imageView.setImageDrawable(getStateListDrawable());
        imageView.setContentDescription(getContentDescription());
        ((TextView) findViewById(C0707R.id.styleText)).setText(getLabel());
    }

    /* access modifiers changed from: protected */
    public abstract int getButtonId();

    /* access modifiers changed from: protected */
    public abstract SpotifyIconV2 getIcon();

    /* access modifiers changed from: protected */
    public abstract String getIconContentDescription();

    /* access modifiers changed from: protected */
    public abstract String getLabel();

    public HomeMixTuningButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }
}

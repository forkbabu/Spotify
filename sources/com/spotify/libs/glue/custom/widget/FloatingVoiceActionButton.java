package com.spotify.libs.glue.custom.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.paste.spotifyicon.a;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;

public class FloatingVoiceActionButton extends StateListAnimatorImageButton {
    public FloatingVoiceActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingVoiceActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.spacer_56);
        setImageDrawable(new a(context, SpotifyIconV2.MIC, (float) resources.getDimensionPixelSize(R.dimen.spacer_24), dimensionPixelSize, androidx.core.content.a.b(context, R.color.white), androidx.core.content.a.b(context, R.color.green)));
    }
}

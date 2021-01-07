package com.spotify.music.nowplaying.ads.view.tagline;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.ui.view.MarqueeTextView;

public class AudioAdsTagLineView extends MarqueeTextView {
    public AudioAdsTagLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTextSize(2, 14.0f);
        c.n(this, R.style.TextAppearance_Encore_Viola);
    }

    public void setAdvertiserName(String str) {
        if (!TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StyleSpan(1), 0, str.length(), 17);
            setAlpha(1.0f);
            setText(spannableString);
            setVisibility(0);
        }
    }

    public void setTagLine(String str) {
        if (!TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(str);
            if (str.contains(":")) {
                spannableString.setSpan(new StyleSpan(1), 0, str.indexOf(58), 17);
            } else {
                spannableString.setSpan(new StyleSpan(1), 0, str.length(), 17);
            }
            setAlpha(1.0f);
            setText(spannableString);
            setVisibility(0);
        }
    }

    public AudioAdsTagLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTextSize(2, 14.0f);
        c.n(this, R.style.TextAppearance_Encore_Viola);
    }
}

package com.spotify.android.recaptcha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.c;
import com.spotify.music.C0707R;

public class RecaptchaDisclosureView extends AppCompatTextView {
    public RecaptchaDisclosureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c.n(this, C0707R.style.DisclosureTextAppearance);
        setVisibility(0);
        setText(C0707R.string.recaptcha_disclosure_text);
    }
}

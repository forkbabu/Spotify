package com.spotify.music.features.ads.skippable.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.skippable.view.a;

public class SkippableAdTextView extends AppCompatTextView implements a, View.OnClickListener {
    private int a = getResources().getInteger(17694721);
    private a.AbstractC0213a b;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SkippableAdTextView.this.setVisibility(4);
        }
    }

    public SkippableAdTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void j() {
        animate().alpha(0.0f).setDuration((long) this.a).setListener(new a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a.AbstractC0213a aVar = this.b;
        if (aVar != null) {
            ((x6c) aVar).b();
        }
    }

    @Override // com.spotify.music.features.ads.skippable.view.a
    public void setDelayedSkippableAdCallToActionText(long j) {
        String string = getContext().getString(C0707R.string.skippable_ad_delayed_cta, Long.valueOf(j));
        int log10 = (int) (Math.log10((double) j) + 1.0d);
        SpannableString spannableString = new SpannableString(string);
        c.n(this, R.style.TextAppearance_Encore_Ballad);
        spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.b(getContext(), R.color.white_40)), 0, spannableString.length() - log10, 17);
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.TextAppearance_Encore_BalladBold), spannableString.length() - log10, spannableString.length(), 17);
        spannableString.setSpan(new StyleSpan(1), spannableString.length() - log10, spannableString.length(), 17);
        setAlpha(1.0f);
        setText(spannableString);
        setVisibility(0);
    }

    @Override // com.spotify.music.features.ads.skippable.view.a
    public void setListener(a.AbstractC0213a aVar) {
        this.b = aVar;
        if (aVar != null) {
            setOnClickListener(this);
        }
    }

    public SkippableAdTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

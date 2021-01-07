package com.spotify.music.features.tasteonboarding.updatetaste.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.adjust.sdk.Constants;
import com.spotify.music.C0707R;

public class ProgressIndicator extends LinearLayout {
    private static final float[] f = {0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
    private static final float[] n = {0.0f, -1.0f, -8.0f, -1.0f, 0.0f};
    private static final float[] o = {1.0f, 1.0f, 1.0f, 0.2f, 1.0f};
    private static final float[] p = {0.6f, 1.0f, 1.0f, 0.2f, 0.6f};
    private static final float[] q = {0.2f, 0.6f, 1.0f, 0.2f, 0.2f};
    private View a;
    private View b;
    private View c;

    public ProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static Keyframe[] a(float[] fArr) {
        float[] fArr2 = f;
        Keyframe[] keyframeArr = new Keyframe[fArr2.length];
        for (int i = 0; i < fArr2.length; i++) {
            keyframeArr[i] = Keyframe.ofFloat(fArr2[i], fArr[i]);
        }
        return keyframeArr;
    }

    private static ObjectAnimator b(View view, float[] fArr, int i) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.ALPHA, a(fArr)), PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, a(n)));
        ofPropertyValuesHolder.setStartDelay((long) i);
        ofPropertyValuesHolder.setDuration(1500L);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(1);
        return ofPropertyValuesHolder;
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.inflate(getContext(), C0707R.layout.progress_indicator, this);
        setGravity(80);
        setMinimumHeight(nud.g(16.0f, getResources()));
        this.a = findViewById(C0707R.id.dot1);
        this.b = findViewById(C0707R.id.dot2);
        this.c = findViewById(C0707R.id.dot3);
        this.a.setAlpha(1.0f);
        this.b.setAlpha(0.6f);
        this.c.setAlpha(0.2f);
        getViewTreeObserver().addOnPreDrawListener(new a(this, b(this.a, o, 0), b(this.b, p, 500), b(this.c, q, Constants.ONE_SECOND)));
    }
}

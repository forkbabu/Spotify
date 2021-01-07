package com.spotify.music.carmode.navigation.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;

public class VoiceSearchButton extends StateListAnimatorImageButton {
    final Rect a;
    final int b;

    public VoiceSearchButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Drawable getVoiceSearchDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable d = a.d(getContext(), C0707R.drawable.ic_car_mode_voice_search);
        stateListDrawable.addState(new int[]{-16842910}, a.d(getContext(), C0707R.drawable.ic_car_mode_voice_search_offline));
        stateListDrawable.addState(StateSet.WILD_CARD, d);
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.a;
        int i3 = this.b;
        rect.set(i3, i3, getMeasuredWidth() - this.b, getMeasuredHeight() - this.b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || this.a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public VoiceSearchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = getResources().getDimensionPixelSize(C0707R.dimen.voice_search_button_inset);
        setScaleType(ImageView.ScaleType.CENTER);
        setImageDrawable(getVoiceSearchDrawable());
        setBackgroundResource(C0707R.drawable.bg_voice_search);
        Animator a2 = uud.a(new xn2(this));
        Animator a3 = uud.a(new wn2(this));
        l lVar = new l();
        lVar.d(new int[]{16842919}, a3);
        lVar.d(new int[0], a2);
        setStateListAnimatorCompat(lVar);
    }
}

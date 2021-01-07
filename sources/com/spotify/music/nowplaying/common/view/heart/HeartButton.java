package com.spotify.music.nowplaying.common.view.heart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encore.consumer.elements.heart.AnimatedHeartButton;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.heart.i;
import kotlin.f;

public class HeartButton extends FrameLayout implements i {
    private i.a a;
    private com.spotify.encore.consumer.elements.heart.HeartButton b;
    private AnimatedHeartButton c;
    private String f;

    public HeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f a(Boolean bool) {
        i.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
        return f.a;
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void b(boolean z) {
        int i = 0;
        this.c.setVisibility(z ? 0 : 8);
        com.spotify.encore.consumer.elements.heart.HeartButton heartButton = this.b;
        if (z) {
            i = 8;
        }
        heartButton.setVisibility(i);
    }

    public f c(Boolean bool) {
        i.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
        return f.a;
    }

    public /* synthetic */ void d(View view) {
        if (this.b.getVisibility() == 0) {
            this.b.performClick();
        } else if (this.c.getVisibility() == 0) {
            this.c.performClick();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int measuredHeight = (int) (((float) (getMeasuredHeight() - (getPaddingBottom() + getPaddingTop()))) * 2.33f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = measuredHeight;
        layoutParams.width = (int) (((float) (getMeasuredWidth() - paddingRight)) * 2.33f);
        this.c.requestLayout();
    }

    @Override // android.view.View, com.spotify.music.nowplaying.common.view.heart.i
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void setHeartState(boolean z) {
        setActivated(z);
        this.b.render(new Heart.Model(z, this.f));
        this.c.render(new Heart.Model(z, this.f));
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void setListener(i.a aVar) {
        this.a = aVar;
    }

    public HeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(C0707R.layout.heart_button_container, (ViewGroup) this, true);
        this.b = (com.spotify.encore.consumer.elements.heart.HeartButton) findViewById(C0707R.id.heart_btn);
        this.c = (AnimatedHeartButton) findViewById(C0707R.id.animated_heart_btn);
        this.f = getContext().getString(C0707R.string.element_content_description_context_song);
        this.b.onEvent(new b(this));
        this.c.onEvent(new c(this));
        setOnClickListener(new a(this));
        setClipChildren(false);
        setClipToPadding(false);
    }
}

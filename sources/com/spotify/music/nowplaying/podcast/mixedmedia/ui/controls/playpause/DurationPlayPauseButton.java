package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.UtilsKt;
import com.spotify.paste.graphics.drawable.c;

public final class DurationPlayPauseButton extends AppCompatImageButton implements h, g {
    private Drawable a;
    private Drawable b;
    private boolean c;
    private float f;
    private final Rect n;
    private final RectF o;
    private final int p;
    private final int q;
    private final boolean r;
    private boolean s;
    private final Paint t;
    private final ColorStateList u;

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ DurationPlayPauseButton a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(DurationPlayPauseButton durationPlayPauseButton) {
            this.a = durationPlayPauseButton;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            DurationPlayPauseButton.i(this.a);
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ h.a a;

        b(h.a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public DurationPlayPauseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void i(DurationPlayPauseButton durationPlayPauseButton) {
        int i = durationPlayPauseButton.p * 2 * 2;
        int i2 = durationPlayPauseButton.q + i;
        durationPlayPauseButton.n.set(i2, i2, durationPlayPauseButton.getMeasuredWidth() - i2, durationPlayPauseButton.getMeasuredHeight() - i2);
        float f2 = (float) i;
        float min = ((float) Math.min(durationPlayPauseButton.getMeasuredWidth(), durationPlayPauseButton.getMeasuredHeight())) - f2;
        durationPlayPauseButton.o.set(f2, f2, min, min);
        DurationPlayPauseButton$updateDrawables$1 durationPlayPauseButton$updateDrawables$1 = new DurationPlayPauseButton$updateDrawables$1(durationPlayPauseButton);
        c g = gqd.g(durationPlayPauseButton.getContext(), 45, 0, 0.5f);
        kotlin.jvm.internal.h.d(g, "getBlackPlayDrawable(\n  …SE_BUTTON_SCALE\n        )");
        durationPlayPauseButton$updateDrawables$1.a(g);
        durationPlayPauseButton.a = g;
        c f3 = gqd.f(durationPlayPauseButton.getContext(), 45, 0, 0.5f);
        kotlin.jvm.internal.h.d(f3, "getBlackPauseDrawable(\n …SE_BUTTON_SCALE\n        )");
        durationPlayPauseButton$updateDrawables$1.a(f3);
        durationPlayPauseButton.b = f3;
        durationPlayPauseButton.s = true;
        durationPlayPauseButton.invalidate();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.s) {
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setState(getDrawableState());
                Drawable drawable2 = this.b;
                if (drawable2 != null) {
                    drawable2.setState(getDrawableState());
                    invalidate();
                    return;
                }
                kotlin.jvm.internal.h.k("pauseDrawable");
                throw null;
            }
            kotlin.jvm.internal.h.k("playDrawable");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h
    public void f(boolean z) {
        this.c = z;
        setContentDescription(getResources().getString(z ? C0707R.string.player_content_description_pause : C0707R.string.player_content_description_play));
        invalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        kotlin.jvm.internal.h.e(canvas, "canvas");
        super.onDraw(canvas);
        if (this.c) {
            drawable = this.b;
            if (drawable == null) {
                kotlin.jvm.internal.h.k("pauseDrawable");
                throw null;
            }
        } else {
            drawable = this.a;
            if (drawable == null) {
                kotlin.jvm.internal.h.k("playDrawable");
                throw null;
            }
        }
        drawable.draw(canvas);
        RectF rectF = this.o;
        float f2 = this.f;
        canvas.drawArc(rectF, 270.0f - f2, f2, false, this.t);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h
    public void setOnToggleListener(h.a aVar) {
        setOnClickListener(new b(aVar));
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.g
    public void setPosition(float f2) {
        if (this.r) {
            this.f = f2 * 360.0f;
        } else {
            this.f = 360.0f - (f2 * 360.0f);
        }
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DurationPlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.h.e(context, "context");
        this.n = new Rect();
        this.o = new RectF();
        int c2 = UtilsKt.c(this, 2.0f);
        this.p = c2;
        this.q = UtilsKt.c(this, 5.0f);
        this.r = nud.n(this);
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(androidx.core.content.a.b(context, C0707R.color.duration_play_pause_progress_colour));
        paint.setStrokeWidth((float) c2);
        this.t = paint;
        this.u = i0.a(context, C0707R.color.btn_now_playing_white);
        getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
    }
}

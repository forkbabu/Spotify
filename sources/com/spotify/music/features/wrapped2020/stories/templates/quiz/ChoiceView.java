package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class ChoiceView extends ConstraintLayout {
    private final RectF a = new RectF();
    private final Path b = new Path();
    private final ImageView c;
    private final TextView f;
    private final WrappedGradientView n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.choice_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.choice_image);
        h.d(G, "requireViewById(this, R.id.choice_image)");
        this.c = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.choice_text);
        h.d(G2, "requireViewById(this, R.id.choice_text)");
        this.f = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.image_gradient);
        h.d(G3, "requireViewById(this, R.id.image_gradient)");
        this.n = (WrappedGradientView) G3;
    }

    private final float D(int i) {
        Context context = getContext();
        h.d(context, "context");
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        return ((float) i) * resources.getDisplayMetrics().density;
    }

    public final void C(a aVar, int i, int i2) {
        h.e(aVar, "choice");
        setEnabled(false);
        this.f.setText(aVar.b());
        this.f.setTextColor(i);
        this.f.setBackgroundColor(i2);
        this.c.setImageBitmap(aVar.a());
        this.n.setGradient(WrappedGradient.GRADIENT_2);
        this.n.a().start();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        int save = canvas.save();
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.set(0.0f, 0.0f, (float) i, (float) i2);
        Path path = this.b;
        path.reset();
        path.addRoundRect(this.a, D(8), D(8), Path.Direction.CW);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.choice_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.choice_image);
        h.d(G, "requireViewById(this, R.id.choice_image)");
        this.c = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.choice_text);
        h.d(G2, "requireViewById(this, R.id.choice_text)");
        this.f = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.image_gradient);
        h.d(G3, "requireViewById(this, R.id.image_gradient)");
        this.n = (WrappedGradientView) G3;
    }
}

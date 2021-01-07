package com.spotify.music.features.premiumdestination.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.c;

public final class RecyclerViewItemIndicator extends View {
    private final int a;
    private final int b;
    private float c;
    private final Paint f;
    private final Paint n;
    private RecyclerView o;
    private final RecyclerView.q p;
    private f0 q;

    private class b extends RecyclerView.q {
        b(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0 && RecyclerViewItemIndicator.this.q != null) {
                RecyclerViewItemIndicator recyclerViewItemIndicator = RecyclerViewItemIndicator.this;
                View f = recyclerViewItemIndicator.q.f(recyclerView.getLayoutManager());
                f.getClass();
                recyclerViewItemIndicator.c = (float) recyclerView.Z(f);
                RecyclerViewItemIndicator.this.postInvalidate();
            }
        }
    }

    public RecyclerViewItemIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsViewPagerIndicatorStyle);
    }

    public void c(RecyclerView recyclerView, f0 f0Var) {
        this.o = recyclerView;
        this.q = f0Var;
        recyclerView.n(this.p);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public RecyclerView.q getOnScrollListener() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public float getPositionOffset() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public RecyclerView getRecyclerView() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.q getScrollListener() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public f0 getSnapHelper() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RecyclerView.e eVar;
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            eVar = null;
        } else {
            eVar = recyclerView.getAdapter();
        }
        int u = eVar != null ? eVar.u() : 0;
        if (u > 1) {
            int save = canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            float f2 = ((float) this.a) / 2.0f;
            for (int i = 0; i < u; i++) {
                canvas.drawCircle(((float) ((this.a + this.b) * i)) + f2, f2, f2, this.f);
            }
            boolean n2 = nud.n(this);
            float f3 = this.c;
            if (n2) {
                f3 = ((float) (u - 1)) - f3;
            }
            canvas.drawCircle((f3 * ((float) (this.a + this.b))) + f2, f2, f2, this.n);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        RecyclerView.e eVar;
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            eVar = null;
        } else {
            eVar = recyclerView.getAdapter();
        }
        int u = eVar != null ? eVar.u() : 0;
        if (u <= 1) {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        int i3 = this.a;
        int paddingRight = getPaddingRight() + getPaddingLeft() + ((u - 1) * this.b) + (u * i3);
        int paddingTop = getPaddingTop();
        setVisibility(0);
        setMeasuredDimension(paddingRight, getPaddingBottom() + paddingTop + i3);
    }

    public RecyclerViewItemIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new b(null);
        int g = nud.g(10.0f, context.getResources());
        int f2 = nud.f(6.0f, context.getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.i, i, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(2, g);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(3, f2);
        int color = obtainStyledAttributes.getColor(1, -7829368);
        int color2 = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        Paint paint2 = new Paint();
        this.n = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(color2);
    }
}

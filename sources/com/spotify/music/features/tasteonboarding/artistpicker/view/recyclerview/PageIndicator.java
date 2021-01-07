package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ShelfView;
import defpackage.qo8;

public class PageIndicator extends View implements qo8.b, ShelfView.a {
    private ShelfGridRecyclerView a;
    private qo8 b;
    private int c;
    private int f;
    private Paint n;
    private Paint o;
    private int p;

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q85.a);
            this.c = obtainStyledAttributes.getDimensionPixelSize(2, getContext().getResources().getDimensionPixelSize(C0707R.dimen.page_indicator_size));
            this.f = obtainStyledAttributes.getDimensionPixelSize(3, getContext().getResources().getDimensionPixelSize(C0707R.dimen.page_indicator_space));
            int color = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.white));
            int color2 = obtainStyledAttributes.getColor(1, getContext().getResources().getColor(C0707R.color.gray_background_30));
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.n = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(color2);
            Paint paint2 = new Paint();
            this.o = paint2;
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(color);
        }
    }

    private int getNumOfDots() {
        if (getNumPages() > 6) {
            return 6;
        }
        return getNumPages();
    }

    private int getNumPages() {
        ShelfGridRecyclerView shelfGridRecyclerView = this.a;
        if (shelfGridRecyclerView == null || shelfGridRecyclerView.getAdapter() == null) {
            return 0;
        }
        RecyclerView.e adapter = this.a.getAdapter();
        adapter.getClass();
        return (int) Math.ceil((double) (((float) adapter.u()) / ((float) this.a.getNumOfItemsInPage())));
    }

    public void b(int i) {
        if (this.b != null) {
            this.p = i / this.a.getNumOfItemsInPage();
            postInvalidate();
        }
    }

    public void c() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.a.getLayoutManager();
        gridLayoutManager.getClass();
        this.p = gridLayoutManager.U1() / this.a.getNumOfItemsInPage();
        postInvalidate();
    }

    public void d(ShelfGridRecyclerView shelfGridRecyclerView, qo8 qo8) {
        this.a = shelfGridRecyclerView;
        this.b = qo8;
        qo8.u(this);
        invalidate();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int numOfDots;
        ShelfGridRecyclerView shelfGridRecyclerView = this.a;
        int i = 0;
        if (!(shelfGridRecyclerView != null && shelfGridRecyclerView.getNumOfItemsInPage() == 0) && (numOfDots = getNumOfDots()) >= 2) {
            int save = canvas.save();
            canvas.translate((float) q4.r(this), (float) getPaddingTop());
            float f2 = ((float) this.c) / 2.0f;
            int i2 = this.p;
            if (i2 >= 6) {
                i2 = 5;
            }
            while (i < numOfDots && i < 6) {
                if (i2 != i) {
                    canvas.drawCircle(((float) ((this.c + this.f) * i)) + f2, f2, f2, this.n);
                }
                i++;
            }
            canvas.drawCircle(((float) ((this.c + this.f) * i2)) + f2, f2, f2, this.o);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ShelfGridRecyclerView shelfGridRecyclerView = this.a;
        if (shelfGridRecyclerView != null && shelfGridRecyclerView.getNumOfItemsInPage() == 0) {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        int numOfDots = getNumOfDots();
        if (numOfDots < 2) {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        int q = q4.q(this) + q4.r(this) + ((numOfDots > 6 ? 5 : numOfDots - 1) * this.f) + (this.c * numOfDots);
        int paddingTop = getPaddingTop() + this.c;
        setVisibility(0);
        setMeasuredDimension(q, getPaddingBottom() + paddingTop);
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}

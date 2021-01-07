package com.spotify.music.features.editplaylist.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleHeaderLayout extends FrameLayout {
    private c a;
    private RecyclerView b;
    private View c;

    public SimpleHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static int a(SimpleHeaderLayout simpleHeaderLayout) {
        return simpleHeaderLayout.a.getStickyAreaSize() + simpleHeaderLayout.a.getTotalScrollRange() + simpleHeaderLayout.d();
    }

    private int d() {
        View view = this.c;
        if (view != null) {
            return view.getMeasuredHeight() / 2;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public void setHeaderScrollOffset(int i) {
        int stickyAreaSize = this.a.getStickyAreaSize() + this.a.getTotalScrollRange();
        float max = 1.0f - Math.max(((float) ((i - this.a.getStickyAreaSize()) - d())) / ((float) this.a.getTotalScrollRange()), 0.0f);
        int max2 = Math.max((i - stickyAreaSize) - d(), this.a.getStickyAreaSize() - stickyAreaSize);
        this.a.a(max2, max);
        View view = this.c;
        if (view != null) {
            view.setTranslationY((float) ((stickyAreaSize + max2) - (view.getMeasuredHeight() / 2)));
            this.c.setTranslationX((float) ((getMeasuredWidth() / 2) - (this.c.getMeasuredWidth() / 2)));
        }
    }

    public /* synthetic */ void e(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 - i4 != i6 - i8) {
            this.b.i0();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof c) {
                this.a = (c) childAt;
                int childCount2 = getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = getChildAt(i2);
                    if (childAt2 instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) childAt2;
                        this.b = recyclerView;
                        recyclerView.k(new d(this), -1);
                        this.b.n(new e(this));
                        this.a.getView().addOnLayoutChangeListener(new a(this));
                        return;
                    }
                }
                throw new IllegalStateException("Must have a RecyclerView as a child.");
            }
        }
        throw new IllegalStateException("Must have a GlueBehavingHeaderWithStickyArea as a child.");
    }

    public void setAccessory(View view) {
        View view2 = this.c;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-2, -2));
            this.c = view;
        }
    }
}

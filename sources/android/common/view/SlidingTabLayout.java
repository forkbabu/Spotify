package android.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.C0707R;

public final class SlidingTabLayout extends HorizontalScrollView {
    private final int a;
    private final int b;
    private final int c;
    private final int f;
    private ViewPager n;
    private ViewPager.i o;
    private b p;
    private final a q;

    private class b implements ViewPager.i {
        private int a;

        b(a aVar) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i) {
            this.a = i;
            if (SlidingTabLayout.this.o != null) {
                SlidingTabLayout.this.o.a(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void f(int i, float f, int i2) {
            int childCount = SlidingTabLayout.this.q.getChildCount();
            if (childCount != 0 && i >= 0 && i < childCount) {
                SlidingTabLayout.this.q.a(i, f);
                View childAt = SlidingTabLayout.this.q.getChildAt(i);
                SlidingTabLayout.this.e(i, childAt != null ? (int) (((float) childAt.getWidth()) * f) : 0);
                if (SlidingTabLayout.this.o != null) {
                    SlidingTabLayout.this.o.f(i, f, i2);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void g(int i) {
            if (this.a == 0) {
                SlidingTabLayout.this.q.a(i, 0.0f);
                SlidingTabLayout.this.e(i, 0);
            }
            if (SlidingTabLayout.this.o != null) {
                SlidingTabLayout.this.o.g(i);
            }
        }
    }

    private class c implements View.OnClickListener {
        c(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i = 0; i < SlidingTabLayout.this.q.getChildCount(); i++) {
                if (view == SlidingTabLayout.this.q.getChildAt(i)) {
                    SlidingTabLayout.this.n.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsSlidingTabStyle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e(int i, int i2) {
        View childAt;
        int childCount = this.q.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount && (childAt = this.q.getChildAt(i)) != null) {
            int left = childAt.getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f;
            }
            scrollTo(left, 0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.n;
        if (viewPager != null) {
            e(viewPager.getCurrentItem(), 0);
        }
    }

    public void setCustomTabColorizer(d dVar) {
        this.q.setCustomTabColorizer(dVar);
    }

    public void setDividerColors(int... iArr) {
        this.q.setDividerColors(iArr);
    }

    public void setOnPageChangeListener(ViewPager.i iVar) {
        this.o = iVar;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.q.setSelectedIndicatorColors(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.q.removeAllViews();
        ViewPager viewPager2 = this.n;
        if (viewPager2 != null) {
            viewPager2.w(this.p);
        }
        this.n = viewPager;
        if (viewPager != null) {
            b bVar = new b(null);
            this.p = bVar;
            viewPager.c(bVar);
            androidx.viewpager.widget.a adapter = this.n.getAdapter();
            adapter.getClass();
            c cVar = new c(null);
            for (int i = 0; i < adapter.d(); i++) {
                TextView textView = new TextView(getContext());
                textView.setGravity(17);
                int i2 = this.a;
                if (i2 != 0) {
                    androidx.core.widget.c.n(textView, i2);
                } else {
                    textView.setTextSize(2, 12.0f);
                }
                TypedValue typedValue = new TypedValue();
                getContext().getTheme().resolveAttribute(C0707R.attr.selectableItemBackground, typedValue, true);
                textView.setBackgroundResource(typedValue.resourceId);
                textView.setAllCaps(true);
                int i3 = this.b;
                int i4 = this.c;
                textView.setPadding(i3, i4, i3, i4);
                TextView textView2 = TextView.class.isInstance(textView) ? textView : null;
                if (textView2 != null) {
                    textView2.setText(adapter.f(i));
                }
                textView.setOnClickListener(cVar);
                this.q.addView(textView);
            }
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oud.c, i, 0);
        this.a = obtainStyledAttributes.getResourceId(6, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(7, 24);
        this.c = obtainStyledAttributes.getDimensionPixelSize(8, 16);
        this.f = obtainStyledAttributes.getDimensionPixelSize(9, 24);
        obtainStyledAttributes.recycle();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        a aVar = new a(context, attributeSet, i);
        this.q = aVar;
        addView(aVar, -1, -2);
    }
}

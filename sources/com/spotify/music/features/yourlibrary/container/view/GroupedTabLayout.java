package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.common.base.Optional;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.container.view.ListenableScrollingViewBehavior;
import java.lang.ref.WeakReference;

public class GroupedTabLayout extends LinearLayout implements ListenableScrollingViewBehavior.a {
    public static final /* synthetic */ int y = 0;
    private ViewPager a;
    private s b;
    private ViewPager.i c;
    private ViewPager.h f;
    private final HorizontalScrollView n;
    private final HorizontalScrollView o;
    private final LinearLayout p;
    private final FrameLayout q;
    private final g r;
    private final f s;
    private final f t;
    private final boolean u;
    private final int v;
    private com.spotify.music.features.yourlibrary.container.h w;
    private b29 x;

    /* access modifiers changed from: private */
    public class b implements ViewPager.h {
        b(a aVar) {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            if (GroupedTabLayout.this.a == viewPager) {
                GroupedTabLayout.this.setPagerAdapter(aVar2);
            }
        }
    }

    private class c {
        private int a;
        private boolean b;

        c(int i) {
            this.a = i;
        }

        public void a(int i) {
            if (this.b && this.a != i) {
                GroupedTabLayout.this.x.d((String) GroupedTabLayout.h(GroupedTabLayout.this, i).or((Optional) "unknown"));
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i, int i2) {
            if (i == 0) {
                this.a = i2;
                this.b = false;
            } else if (i == 1) {
                this.b = true;
            }
        }
    }

    public interface d {
    }

    public class e implements ViewPager.i {
        private final WeakReference<GroupedTabLayout> a;
        private int b;
        private final c c;
        private boolean f;

        public e(GroupedTabLayout groupedTabLayout) {
            this.a = new WeakReference<>(groupedTabLayout);
            int currentItem = GroupedTabLayout.this.a.getCurrentItem();
            this.b = currentItem;
            this.c = new c(currentItem);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i) {
            this.c.b(i, this.b);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void f(int i, float f2, int i2) {
            int d = GroupedTabLayout.d(GroupedTabLayout.this, i, GroupedTabLayout.this.b.d());
            if (f2 > 0.0f && GroupedTabLayout.this.u) {
                d--;
                f2 = 1.0f - f2;
            }
            GroupedTabLayout groupedTabLayout = this.a.get();
            if (groupedTabLayout != null) {
                GroupedTabLayout.f(groupedTabLayout, d, f2, this.b, this.f);
                this.f = this.f && (d != this.b || f2 > 0.0f);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void g(int i) {
            int d = GroupedTabLayout.d(GroupedTabLayout.this, i, GroupedTabLayout.this.b.d());
            this.f = GroupedTabLayout.this.m(this.b) != GroupedTabLayout.this.m(d);
            this.b = d;
            this.c.a(d);
        }
    }

    /* access modifiers changed from: private */
    public static class f extends LinearLayout {
        public f(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    /* access modifiers changed from: private */
    public static class g extends FrameLayout {
        private int a;

        g(Context context) {
            super(context);
        }

        public void a(int i) {
            this.a = i;
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            if (viewGroup.getChildCount() > 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), 1073741824));
                return;
            }
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: private */
    public class h extends LinearLayout {
        private final int a = getResources().getDimensionPixelSize(C0707R.dimen.bottom_tabs_highlight_height);
        private final Paint b;
        private int c;
        private float f;

        h(Context context) {
            super(context);
            setWillNotDraw(false);
            int color = getResources().getColor(R.color.green);
            Paint paint = new Paint();
            this.b = paint;
            paint.setColor(color);
            setGravity(8388611);
        }

        public void a(int i, float f2) {
            this.c = i;
            this.f = f2;
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.LinearLayout, android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            View childAt = getChildAt(this.c);
            View childAt2 = getChildAt(Math.min(this.c + 1, getChildCount() - 1));
            int width = childAt.findViewById(C0707R.id.bottom_tab_view_label).getWidth();
            int round = Math.round(this.f * ((float) (childAt2.findViewById(C0707R.id.bottom_tab_view_label).getWidth() - width))) + width;
            int width2 = (childAt.getWidth() / 2) + childAt.getLeft();
            int round2 = (Math.round(((float) (((childAt2.getWidth() / 2) + childAt2.getLeft()) - width2)) * this.f) + width2) - (round / 2);
            int bottom = childAt.getBottom();
            canvas.drawRect(new Rect(round2, bottom - this.a, round + round2, bottom), this.b);
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            measureChildren(makeMeasureSpec, makeMeasureSpec);
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                i3 += getChildAt(i4).getMeasuredWidth();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(GroupedTabLayout.this.getMeasuredWidth(), i3), 1073741824), i2);
        }
    }

    public GroupedTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static int d(GroupedTabLayout groupedTabLayout, int i, int i2) {
        return groupedTabLayout.u ? (i2 - i) - 1 : i;
    }

    static void f(GroupedTabLayout groupedTabLayout, int i, float f2, int i2, boolean z) {
        int n2 = groupedTabLayout.n(i);
        int m = groupedTabLayout.m(i);
        int childCount = ((h) groupedTabLayout.t.getChildAt(m)).getChildCount() - 1;
        float f3 = n2 == childCount ? f2 : 0.0f;
        u(groupedTabLayout.s, m, f3);
        groupedTabLayout.t.post(new e(groupedTabLayout, m, f3));
        groupedTabLayout.r.post(new f(groupedTabLayout, m, f3));
        int measuredWidth = groupedTabLayout.getMeasuredWidth();
        groupedTabLayout.t(groupedTabLayout.o, (groupedTabLayout.q.getMeasuredWidth() + groupedTabLayout.s.getMeasuredWidth()) - measuredWidth, m, groupedTabLayout.getGroupCount() - 1, f3);
        groupedTabLayout.t(groupedTabLayout.n, groupedTabLayout.r.getMeasuredWidth() - measuredWidth, n2, childCount, f2);
        if (z) {
            int m2 = groupedTabLayout.m(i2);
            int n3 = groupedTabLayout.n(i2);
            h o2 = groupedTabLayout.o(m2);
            o2.a(n3, 0.0f);
            o2.requestLayout();
            u(o2, n3, 0.0f);
            return;
        }
        h o3 = groupedTabLayout.o(m);
        o3.a(n2, f2);
        o3.requestLayout();
        u(o3, n2, f2);
    }

    private int getGroupCount() {
        return this.s.getChildCount();
    }

    static Optional h(GroupedTabLayout groupedTabLayout, int i) {
        return groupedTabLayout.b.A(groupedTabLayout.b.x(i)).transform(d.a);
    }

    private int l(int i) {
        if (this.t.getMeasuredWidth() == 0) {
            this.t.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        return this.t.getChildAt(i).getMeasuredWidth();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int m(int i) {
        int u2 = this.b.u();
        int i2 = 0;
        for (int i3 = 0; i3 < u2; i3++) {
            i2 += this.b.v(i3);
            if (i2 > i) {
                return i3;
            }
        }
        return -1;
    }

    private int n(int i) {
        int u2 = this.b.u();
        int i2 = 0;
        int i3 = 0;
        while (i2 < u2) {
            int v2 = this.b.v(i2) + i3;
            if (v2 > i) {
                return i - i3;
            }
            i2++;
            i3 = v2;
        }
        return -1;
    }

    private h o(int i) {
        return (h) this.t.getChildAt(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPagerAdapter(androidx.viewpager.widget.a aVar) {
        if (aVar instanceof s) {
            this.b = (s) aVar;
            this.s.removeAllViews();
            this.t.removeAllViews();
            if (this.b != null) {
                int i = 0;
                int i2 = 0;
                while (i < this.b.u()) {
                    int u2 = this.b.u();
                    CharSequence w2 = this.b.w(i);
                    YourLibraryTabView b2 = YourLibraryTabView.b(getContext(), w2, this.s, false);
                    int i3 = -1;
                    b2.setOnClickListener(new j(this, i, this.u ? (this.b.d() - i2) - 1 : i2));
                    int i4 = i + 1;
                    b2.setContentDescription(getContext().getString(C0707R.string.your_library_accessibility_tab_description, w2, Integer.valueOf(i4), Integer.valueOf(u2)));
                    this.s.addView(b2);
                    h hVar = new h(getContext());
                    int v2 = this.b.v(i);
                    int i5 = 0;
                    while (i5 < v2) {
                        int d2 = this.u ? (this.b.d() - i2) + i3 : i2;
                        CharSequence f2 = this.b.f(d2);
                        YourLibraryTabView a2 = YourLibraryTabView.a(getContext(), f2, this.t, false);
                        a2.setOnClickListener(new g(this, i, d2, i5));
                        i5++;
                        a2.setContentDescription(getContext().getString(C0707R.string.your_library_accessibility_tab_description, f2, Integer.valueOf(i5), Integer.valueOf(v2)));
                        hVar.addView(a2);
                        i2++;
                        i3 = -1;
                    }
                    this.t.addView(hVar, new LinearLayout.LayoutParams(-1, -2));
                    i = i4;
                }
                return;
            }
            return;
        }
        throw new AssertionError("Adapter not instance of GroupedPagerAdapter");
    }

    private void t(HorizontalScrollView horizontalScrollView, int i, int i2, int i3, float f2) {
        if (i > 0) {
            float f3 = (float) i;
            if (i2 != i3 || f2 <= 0.0f) {
                float f4 = (((float) i2) + f2) / ((float) i3);
                f2 = this.u ? 1.0f - f4 : f4;
            } else if (!this.u) {
                f2 = 1.0f - f2;
            }
            horizontalScrollView.scrollTo(Math.round(f3 * f2), 0);
        }
    }

    private static void u(ViewGroup viewGroup, int i, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            YourLibraryTabView yourLibraryTabView = (YourLibraryTabView) viewGroup.getChildAt(i2);
            if (i2 == i) {
                yourLibraryTabView.setFocusLevel(1.0f - f2);
            } else if (i2 == i + 1) {
                yourLibraryTabView.setFocusLevel(f2);
            } else {
                yourLibraryTabView.setFocusLevel(0.0f);
            }
        }
    }

    @Override // com.spotify.music.features.yourlibrary.container.view.ListenableScrollingViewBehavior.a
    public void b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int top = view2.getTop() - com.spotify.android.goldenpath.a.f(getContext());
        int top2 = this.o.getTop() + top;
        int bottom = this.o.getBottom() + top;
        int height = this.o.getHeight();
        if (bottom < 0) {
            this.p.setAlpha(0.0f);
        } else if (top2 < 0) {
            this.p.setAlpha((((float) top2) / ((float) height)) + 1.0f);
        } else {
            this.p.setAlpha(1.0f);
        }
        int top3 = this.n.getTop() + top;
        int bottom2 = this.n.getBottom() + top;
        int height2 = this.n.getHeight();
        if (bottom2 < 0) {
            this.n.setAlpha(0.0f);
        } else if (top3 < 0) {
            this.n.setAlpha((((float) top3) / ((float) height2)) + 1.0f);
        } else {
            this.n.setAlpha(1.0f);
        }
    }

    public void k(ImageView imageView, d dVar) {
        int g2 = nud.g(32.0f, this.p.getResources());
        this.q.addView(imageView, new FrameLayout.LayoutParams(g2, g2));
        this.q.setOnClickListener(new i(dVar));
        this.q.setVisibility(0);
    }

    public void p(int i, int i2, View view) {
        if (this.x != null) {
            s sVar = this.b;
            this.x.a(i, sVar.A(sVar.x(i2)).transform(h.a).orNull());
        }
        com.spotify.music.features.yourlibrary.container.h hVar = this.w;
        if (hVar == null) {
            this.a.setCurrentItem(i2);
        } else {
            hVar.h(this.b.x(i2), true);
        }
    }

    public void q(int i, int i2, int i3, View view) {
        b29 b29 = this.x;
        if (b29 != null) {
            b29.e(i, i3, this.b.A(this.b.x(i2)).transform(d.a).orNull());
        }
        com.spotify.music.features.yourlibrary.container.h hVar = this.w;
        if (hVar == null) {
            this.a.setCurrentItem(i2);
        } else {
            hVar.h(this.b.x(i2), true);
        }
    }

    public void r(int i, float f2) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        float l = ((float) l(i)) * f2;
        if (this.t.getMeasuredWidth() == 0) {
            this.t.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        View childAt = this.t.getChildAt(i);
        if (this.u) {
            i2 = this.t.getMeasuredWidth() - childAt.getRight();
        } else {
            i2 = childAt.getLeft();
        }
        float f3 = (-(l + ((float) i2))) + ((float) this.v);
        if (this.u) {
            marginLayoutParams.rightMargin = Math.round(f3);
        } else {
            marginLayoutParams.leftMargin = Math.round(f3);
        }
        this.t.setLayoutParams(marginLayoutParams);
    }

    public /* synthetic */ void s(int i, float f2) {
        int l = l(i);
        if (f2 == 0.0f) {
            this.r.a(l);
        } else {
            this.r.a(Math.round(((float) (l(i + 1) - l)) * f2) + l);
        }
    }

    public void setLogger(b29 b29) {
        this.x = b29;
    }

    public void setYourLibraryDelegator(com.spotify.music.features.yourlibrary.container.h hVar) {
        this.w = hVar;
    }

    public void setupWithViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.a;
        if (viewPager2 != null) {
            ViewPager.i iVar = this.c;
            if (iVar != null) {
                viewPager2.w(iVar);
                this.c = null;
            }
            ViewPager.h hVar = this.f;
            if (hVar != null) {
                this.a.v(hVar);
                this.f = null;
            }
        }
        this.a = viewPager;
        if (viewPager != null) {
            e eVar = new e(this);
            this.c = eVar;
            this.a.c(eVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter);
            }
            b bVar = new b(null);
            this.f = bVar;
            this.a.b(bVar);
        }
    }

    public GroupedTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = nud.m(context);
        this.v = context.getResources().getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin);
        setOrientation(1);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C0707R.layout.top_tab_scroll, (ViewGroup) this, false);
        this.p = linearLayout;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) linearLayout.findViewById(C0707R.id.top_scroll);
        this.o = horizontalScrollView;
        f fVar = new f(context);
        this.s = fVar;
        horizontalScrollView.addView(fVar);
        addView(linearLayout);
        this.q = (FrameLayout) linearLayout.findViewById(C0707R.id.header_action_container);
        HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) LayoutInflater.from(context).inflate(C0707R.layout.bottom_tab_scroll, (ViewGroup) this, false);
        this.n = horizontalScrollView2;
        horizontalScrollView2.setHorizontalScrollBarEnabled(false);
        f fVar2 = new f(context);
        this.t = fVar2;
        g gVar = new g(context);
        this.r = gVar;
        gVar.addView(fVar2, new LinearLayout.LayoutParams(-2, -2));
        horizontalScrollView2.addView(gVar, new FrameLayout.LayoutParams(100, -2));
        addView(horizontalScrollView2, new LinearLayout.LayoutParams(-1, -2));
    }
}

package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.C0707R;

public final class HeaderView extends ViewGroup implements a {
    private final DataSetObserver A;
    private final ViewPager a;
    private final ViewPagerIndicator b;
    private final LinearLayout c;
    private final FrameLayout f;
    private final ImageView n;
    private final com.spotify.paste.widgets.internal.a o;
    private final TextView p;
    private final TextView q;
    private View r;
    private final androidx.viewpager.widget.a s;
    private androidx.viewpager.widget.a t;
    private final GestureDetector u;
    private boolean v;
    private int w;
    private int x;
    private TypedValue y;
    private float z;

    class a extends DataSetObserver {
        a() {
        }

        private void a() {
            HeaderView.this.b.requestLayout();
            HeaderView.this.b.invalidate();
            HeaderView.this.s.j();
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a();
        }
    }

    class b extends ViewPager {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            onLayout(false, getLeft(), getTop(), getRight(), getBottom());
        }

        @Override // androidx.viewpager.widget.ViewPager, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!HeaderView.this.v) {
                HeaderView headerView = HeaderView.this;
                headerView.v = headerView.u.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                HeaderView.this.v = false;
            }
            HeaderView headerView2 = HeaderView.this;
            headerView2.requestDisallowInterceptTouchEvent(headerView2.v);
            return super.onTouchEvent(motionEvent);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c(HeaderView headerView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f) > Math.abs(f2);
        }
    }

    /* access modifiers changed from: private */
    public class d extends androidx.viewpager.widget.a {
        d(a aVar) {
        }

        @Override // androidx.viewpager.widget.a
        public void b(ViewGroup viewGroup, int i, Object obj) {
            if (i == 0) {
                viewGroup.removeView(HeaderView.this.c);
            } else {
                HeaderView.this.t.b(viewGroup, i - 1, obj);
            }
        }

        @Override // androidx.viewpager.widget.a
        public void c(ViewGroup viewGroup) {
            if (HeaderView.this.t != null) {
                HeaderView.this.t.c(viewGroup);
            }
        }

        @Override // androidx.viewpager.widget.a
        public int d() {
            if (HeaderView.this.t != null) {
                return HeaderView.this.t.d() + 1;
            }
            return 1;
        }

        @Override // androidx.viewpager.widget.a
        public int e(Object obj) {
            return obj.equals(HeaderView.this.c) ? -1 : 0;
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence f(int i) {
            if (i == 0) {
                return null;
            }
            return HeaderView.this.t.f(i - 1);
        }

        @Override // androidx.viewpager.widget.a
        public float g(int i) {
            if (i == 0) {
                return 1.0f;
            }
            return HeaderView.this.t.g(i - 1);
        }

        @Override // androidx.viewpager.widget.a
        public Object h(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return HeaderView.this.t.h(viewGroup, i - 1);
            }
            viewGroup.addView(HeaderView.this.c);
            return HeaderView.this.c;
        }

        @Override // androidx.viewpager.widget.a
        public boolean i(View view, Object obj) {
            if (obj == HeaderView.this.c) {
                return view == HeaderView.this.c;
            }
            return HeaderView.this.t.i(view, obj);
        }

        @Override // androidx.viewpager.widget.a
        public void l(Parcelable parcelable, ClassLoader classLoader) {
            if (HeaderView.this.t != null) {
                HeaderView.this.t.l(parcelable, classLoader);
            }
        }

        @Override // androidx.viewpager.widget.a
        public Parcelable m() {
            if (HeaderView.this.t != null) {
                return HeaderView.this.t.m();
            }
            return null;
        }

        @Override // androidx.viewpager.widget.a
        public void n(ViewGroup viewGroup, int i, Object obj) {
            if (HeaderView.this.t != null) {
                HeaderView.this.t.n(viewGroup, i, obj);
            }
        }

        @Override // androidx.viewpager.widget.a
        public void p(ViewGroup viewGroup) {
            if (HeaderView.this.t != null) {
                HeaderView.this.t.p(viewGroup);
            }
        }
    }

    private class e extends d {
        e(a aVar) {
            super(null);
        }

        private boolean r(int i) {
            return i == d() - 1;
        }

        @Override // com.spotify.paste.widgets.HeaderView.d, androidx.viewpager.widget.a
        public void b(ViewGroup viewGroup, int i, Object obj) {
            if (r(i)) {
                viewGroup.removeView(HeaderView.this.c);
            } else {
                HeaderView.this.t.b(viewGroup, HeaderView.this.t.d() - i, obj);
            }
        }

        @Override // com.spotify.paste.widgets.HeaderView.d, androidx.viewpager.widget.a
        public int e(Object obj) {
            int i = -1;
            if (obj.equals(HeaderView.this.c)) {
                return -1;
            }
            int d2 = HeaderView.this.t.d();
            if (!obj.equals(HeaderView.this.c)) {
                i = 0;
            }
            return d2 - i;
        }

        @Override // com.spotify.paste.widgets.HeaderView.d, androidx.viewpager.widget.a
        public CharSequence f(int i) {
            if (r(i)) {
                return super.f(0);
            }
            return HeaderView.this.t.f(HeaderView.this.t.d() - i);
        }

        @Override // com.spotify.paste.widgets.HeaderView.d, androidx.viewpager.widget.a
        public float g(int i) {
            if (r(i)) {
                return super.g(0);
            }
            return HeaderView.this.t.g(HeaderView.this.t.d() - i);
        }

        @Override // com.spotify.paste.widgets.HeaderView.d, androidx.viewpager.widget.a
        public Object h(ViewGroup viewGroup, int i) {
            if (!r(i)) {
                return HeaderView.this.t.h(viewGroup, HeaderView.this.t.d() - i);
            }
            viewGroup.addView(HeaderView.this.c);
            return HeaderView.this.c;
        }

        @Override // com.spotify.paste.widgets.HeaderView.d, androidx.viewpager.widget.a
        public void n(ViewGroup viewGroup, int i, Object obj) {
            if (HeaderView.this.t != null) {
                HeaderView.this.t.n(viewGroup, HeaderView.this.t.d() - i, obj);
            }
        }
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsHeaderStyle);
    }

    private int h(int i, int i2) {
        int i3;
        int i4 = this.x;
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = this.y;
        if (typedValue != null) {
            float f2 = (float) i;
            i3 = (int) typedValue.getFraction(f2, f2);
        } else {
            i3 = i / 2;
        }
        if (i2 > 0) {
            i3 = Math.min(i3, i2);
        }
        return i3;
    }

    public View getContentView() {
        return this.r;
    }

    @Override // com.spotify.paste.widgets.a
    public View getHeaderView() {
        return this;
    }

    public View getImageContainerView() {
        return this.f;
    }

    public View getImageOverlay() {
        return this.o.d();
    }

    public ViewGroup getImageOverlayParent() {
        return this.o.c();
    }

    @Override // com.spotify.paste.widgets.a
    public ImageView getImageView() {
        return this.n;
    }

    public TextView getTextView() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ViewPager viewPager = this.a;
        viewPager.layout(0, 0, viewPager.getMeasuredWidth(), this.a.getMeasuredHeight());
        int measuredWidth = (((i3 - i) - this.b.getMeasuredWidth()) / 2) + 0;
        int measuredHeight = this.a.getMeasuredHeight() + 0;
        ViewPagerIndicator viewPagerIndicator = this.b;
        viewPagerIndicator.layout(measuredWidth, measuredHeight, viewPagerIndicator.getMeasuredWidth() + measuredWidth, this.b.getMeasuredHeight() + measuredHeight);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int h = h(size, this.w);
        this.f.getLayoutParams().width = this.w;
        this.f.getLayoutParams().height = (int) (((float) this.w) * this.z);
        this.n.getLayoutParams().width = h;
        this.n.getLayoutParams().height = h;
        this.c.measure(i, z42.B());
        int measuredHeight = this.b.getMeasuredHeight() + this.c.getMeasuredHeight();
        if (mode != 0 && measuredHeight > size2) {
            int i3 = measuredHeight - size2;
            this.f.getLayoutParams().width -= i3;
            this.f.getLayoutParams().height -= i3;
            int h2 = h(size, this.w - i3);
            this.n.getLayoutParams().width = h2;
            this.n.getLayoutParams().height = h2;
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - this.b.getMeasuredHeight(), 1073741824);
        }
        this.c.measure(i, i2);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.getMeasuredHeight(), 1073741824));
        setMeasuredDimension(this.c.getMeasuredWidth(), this.b.getMeasuredHeight() + this.c.getMeasuredHeight());
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.t;
        if (aVar2 != null) {
            aVar2.q(this.A);
        }
        this.t = aVar;
        if (aVar != null) {
            aVar.k(this.A);
        }
        this.s.j();
        setCurrentPage(0);
        this.b.requestLayout();
        this.b.invalidate();
    }

    @Override // com.spotify.paste.widgets.a
    public void setContentView(View view) {
        View view2 = this.r;
        if (view2 != view) {
            if (view2 != null) {
                this.c.removeView(view2);
            }
            this.r = view;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = nud.g(10.0f, getResources());
                view.setLayoutParams(layoutParams);
                this.c.addView(view);
            }
        }
    }

    public void setCurrentPage(int i) {
        if (nud.m(getContext())) {
            this.a.setCurrentItem((this.s.d() - 1) - i);
        } else {
            this.a.setCurrentItem(i);
        }
    }

    @Override // com.spotify.paste.widgets.a
    public void setImageOverlay(View view) {
        this.o.f(view);
    }

    public void setImageSize(int i) {
        this.x = i;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // com.spotify.paste.widgets.a
    public void setTitle(CharSequence charSequence) {
        if (getResources().getConfiguration().orientation == 2) {
            charSequence = "";
        }
        this.p.setText(charSequence);
        this.p.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.y = new TypedValue();
        this.z = 1.0f;
        this.A = new a();
        if (nud.m(context)) {
            this.s = new e(null);
        } else {
            this.s = new d(null);
        }
        b bVar = new b(context);
        this.a = bVar;
        bVar.setId(C0707R.id.header_viewpager);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C0707R.layout.paste_header, (ViewGroup) bVar, false);
        this.c = linearLayout;
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(C0707R.id.image_container);
        this.f = frameLayout;
        this.w = frameLayout.getLayoutParams().width;
        this.n = (ImageView) linearLayout.findViewById(C0707R.id.image);
        this.o = new com.spotify.paste.widgets.internal.a((ViewGroup) linearLayout.findViewById(C0707R.id.image_overlay));
        TextView textView = (TextView) linearLayout.findViewById(C0707R.id.title);
        this.p = textView;
        this.q = (TextView) linearLayout.findViewById(C0707R.id.header_subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e, i, 0);
        setTitle(obtainStyledAttributes.getString(0));
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            androidx.core.widget.c.n(textView, resourceId);
        }
        if (!obtainStyledAttributes.getValue(1, this.y)) {
            this.y = null;
        }
        obtainStyledAttributes.recycle();
        bVar.setAdapter(this.s);
        int f2 = nud.f(8.0f, context.getResources());
        ViewPagerIndicator viewPagerIndicator = new ViewPagerIndicator(context, null);
        this.b = viewPagerIndicator;
        viewPagerIndicator.setPadding(f2, 0, f2, f2);
        viewPagerIndicator.setupWithViewPager(bVar);
        addView(bVar);
        addView(viewPagerIndicator);
        this.u = new GestureDetector(context, new c(this));
    }
}

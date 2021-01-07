package com.spotify.music.features.followfeed.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.hubs.components.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class FooterView extends FrameLayout {
    private final ViewGroup a;
    private View b;
    private TextView c;
    private a f;
    private boolean n;
    private boolean o;
    private int p;
    private final List<i45> q;
    private int r;
    private ValueAnimator s;
    private nmf<? super Boolean, f> t;
    private c.a u;

    static final class a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    public FooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void d(FooterView footerView, int i) {
        int[] iArr = new int[2];
        footerView.getLocationOnScreen(iArr);
        if (iArr[1] + i > footerView.r) {
            footerView.j();
        }
        ViewGroup viewGroup = footerView.a;
        ValueAnimator valueAnimator = footerView.s;
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        if (animatedValue != null) {
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = intValue;
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    private final int getTrackRowHeight() {
        int l = l(C0707R.dimen.feed_expandable_item_track_height);
        a aVar = this.f;
        Context context = getContext();
        h.d(context, "context");
        ViewGroup viewGroup = this.a;
        aVar.getClass();
        h.e(context, "context");
        h.e(viewGroup, "parent");
        x90 h = e90.d().h(context, viewGroup, false);
        h.getView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = h.getView().getMeasuredHeight();
        return measuredHeight > 0 ? measuredHeight : l;
    }

    private final void j() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            if (!this.n) {
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n = false;
            }
        }
    }

    private final int k(int i) {
        int l = l(C0707R.dimen.feed_expandable_item_footer_height);
        return (l(C0707R.dimen.feed_expandable_item_footer_vertical_padding) * 2) + (getTrackRowHeight() * i) + l;
    }

    private final int l(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public final void f(int i, boolean z) {
        int i2;
        this.o = z;
        if (z) {
            a aVar = this.f;
            aVar.Z(this.q);
            aVar.b0(this.u);
            aVar.z();
        }
        if (this.o) {
            i2 = k(i);
        } else {
            i2 = l(C0707R.dimen.feed_expandable_item_footer_height);
        }
        ViewGroup viewGroup = this.a;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = i2;
        viewGroup.setLayoutParams(layoutParams);
    }

    public final void g(int i, boolean z) {
        String str;
        if (z) {
            str = getContext().getString(C0707R.string.follow_feed_item_footer_text_hide);
        } else {
            str = getContext().getString(C0707R.string.follow_feed_item_footer_text_view);
        }
        h.d(str, "if (isExpanded) {\n      …ed_item_footer_text_view)");
        TextView textView = this.c;
        String format = String.format(str, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
        h.d(format, "java.lang.String.format(format, *args)");
        textView.setText(format);
    }

    public final void h(int i) {
        this.r = i;
    }

    public final void i(List<i45> list) {
        h.e(list, "trackRows");
        this.p = list.size();
        this.q.clear();
        this.q.addAll(list);
    }

    public final void m() {
        int i;
        if (!this.n) {
            if (!this.o) {
                a aVar = this.f;
                aVar.Z(this.q);
                aVar.b0(this.u);
                aVar.z();
            }
            if (this.o) {
                i = l(C0707R.dimen.feed_expandable_item_footer_height);
            } else {
                i = k(this.p);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.a.getMeasuredHeight(), i);
            this.s = ofInt;
            if (ofInt != null) {
                ofInt.setDuration(((long) Math.max(4, this.p)) * 50);
                ofInt.setInterpolator(new y5());
                ofInt.addUpdateListener(new k(this));
                ofInt.addListener(new l(this));
                this.n = true;
                ofInt.start();
            }
            boolean z = !this.o;
            this.o = z;
            g(this.p, z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    public final void setExpandingListener(nmf<? super Boolean, f> nmf) {
        h.e(nmf, "expandingConsumer");
        this.t = nmf;
    }

    public final void setFooterClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        this.b.setOnClickListener(new a(cmf));
    }

    public final void setTrackRowClickListener(c.a aVar) {
        h.e(aVar, "listener");
        this.u = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        View inflate = FrameLayout.inflate(context, C0707R.layout.footer_view, this);
        if (inflate != null) {
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.a = viewGroup;
            this.q = new ArrayList();
            this.r = -1;
            this.t = FooterView$expandingConsumer$1.a;
            View G = q4.G(viewGroup, C0707R.id.footer_layout);
            h.d(G, "ViewCompat.requireViewBy…root, R.id.footer_layout)");
            this.b = G;
            View G2 = q4.G(G, C0707R.id.item_footer_label);
            h.d(G2, "ViewCompat.requireViewBy…, R.id.item_footer_label)");
            this.c = (TextView) G2;
            View G3 = q4.G(viewGroup, C0707R.id.item_track_recycler);
            h.d(G3, "ViewCompat.requireViewBy…R.id.item_track_recycler)");
            RecyclerView recyclerView = (RecyclerView) G3;
            this.f = new a();
            viewGroup.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(this.f);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}

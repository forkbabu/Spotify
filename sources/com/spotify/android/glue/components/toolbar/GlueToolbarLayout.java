package com.spotify.android.glue.components.toolbar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class GlueToolbarLayout extends ViewGroup {
    public static final /* synthetic */ int q = 0;
    private final Map<Integer, View> a;
    private final Map<Integer, View> b;
    private final TextView c;
    private final f f;
    private ImageButton n;
    private View.OnClickListener o;
    private int p;

    public GlueToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(MenuItem menuItem) {
        if (this.n == null) {
            StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(getContext());
            stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(getContext(), SpotifyIconV2.MORE_ANDROID, (float) getResources().getDimensionPixelSize(C0707R.dimen.toolbar_context_menu_icon_size)));
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            stateListAnimatorImageButton.setBackground(null);
            stateListAnimatorImageButton.setOnClickListener(new a(this));
            b(ToolbarSide.END, stateListAnimatorImageButton, C0707R.id.legacy_overflow);
            this.f.g(stateListAnimatorImageButton);
            this.n = stateListAnimatorImageButton;
        }
        this.f.b(menuItem);
    }

    public void b(ToolbarSide toolbarSide, View view, int i) {
        if (!this.a.containsKey(Integer.valueOf(i)) && !this.b.containsKey(Integer.valueOf(i))) {
            (toolbarSide == ToolbarSide.START ? this.a : this.b).put(Integer.valueOf(i), view);
            addView(view);
        }
    }

    public void c(ToolbarSide toolbarSide) {
        Map<Integer, View> map = toolbarSide == ToolbarSide.START ? this.a : this.b;
        for (View view : map.values()) {
            removeView(view);
        }
        this.n = null;
        this.f.c();
        map.clear();
    }

    public Collection<View> d(ToolbarSide toolbarSide) {
        if (toolbarSide == ToolbarSide.START) {
            return this.a.values();
        }
        return this.b.values();
    }

    public /* synthetic */ void e(View view) {
        this.f.f();
        this.o.onClick(view);
    }

    public TextView getTextView() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.d();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Collection<View> collection;
        Collection<View> collection2;
        if (nud.n(this)) {
            collection2 = this.b.values();
            collection = this.a.values();
        } else {
            collection2 = this.a.values();
            collection = this.b.values();
        }
        int i5 = 0;
        int i6 = 0;
        for (View view : collection2) {
            int measuredHeight = (getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            view.layout(i6, measuredHeight, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + measuredHeight);
            i6 += view.getMeasuredWidth();
        }
        for (View view2 : collection) {
            int measuredHeight2 = (getMeasuredHeight() / 2) - (view2.getMeasuredHeight() / 2);
            view2.layout((getMeasuredWidth() - i5) - view2.getMeasuredWidth(), measuredHeight2, getMeasuredWidth() - i5, view2.getMeasuredHeight() + measuredHeight2);
            i5 += view2.getMeasuredWidth();
        }
        this.c.layout(this.p, (getMeasuredHeight() / 2) - (this.c.getMeasuredHeight() / 2), this.c.getMeasuredWidth() + this.p, (this.c.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Collection<View> collection;
        Collection<View> collection2;
        Assertion.l(!z42.z(i), "GlueToolbarLayout does not support UNSPECIFIED width measure spec");
        Assertion.l(!z42.z(i2), "GlueToolbarLayout does not support UNSPECIFIED height measure spec");
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int g = nud.g(40.0f, getResources());
        int A = z42.A(g);
        int A2 = z42.A(g);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        if (nud.n(this)) {
            collection2 = this.b.values();
            collection = this.a.values();
        } else {
            collection2 = this.a.values();
            collection = this.b.values();
        }
        int i3 = 0;
        int i4 = 0;
        for (View view : collection2) {
            if (view instanceof ImageButton) {
                view.measure(A, A2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            i4 += view.getMeasuredWidth();
        }
        for (View view2 : collection) {
            if (view2 instanceof ImageButton) {
                view2.measure(A, A2);
            } else {
                view2.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            i3 += view2.getMeasuredWidth();
        }
        this.c.measure(makeMeasureSpec, makeMeasureSpec2);
        float f2 = ((float) size) / 2.0f;
        float measuredWidth = (((float) this.c.getMeasuredWidth()) / 2.0f) + f2;
        float max = Math.max(f2 - (((float) this.c.getMeasuredWidth()) / 2.0f), (float) i4);
        float min = Math.min(measuredWidth, (float) (size - i3));
        this.p = (int) Math.floor((double) max);
        this.c.measure(z42.A((int) Math.ceil((double) (min - max))), makeMeasureSpec2);
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: package-private */
    public void setOnOverflowClickListener(View.OnClickListener onClickListener) {
        this.o = (View.OnClickListener) MoreObjects.firstNonNull(onClickListener, this.o);
    }

    public GlueToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.o = b.a;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.c = appCompatTextView;
        appCompatTextView.setId(C0707R.id.glue_toolbar_title);
        appCompatTextView.setGravity(17);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(1);
        nud.p(context, appCompatTextView, C0707R.attr.pasteTextAppearanceBodyMediumBold);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        vc0.c(appCompatTextView);
        addView(appCompatTextView);
        this.f = new f(context);
    }
}

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.music.C0707R;
import com.spotify.music.libs.connect.access.ConnectAccessViewModel;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;
import com.spotify.music.p0;
import defpackage.ys2;
import java.util.HashSet;
import java.util.Set;

public class MainLayout extends ConstraintLayout {
    private int a;
    private ViewGroup b;
    private AnchorBar c;
    private AnchorBar f;
    private View n;
    private FrameLayout o;
    private ViewGroup p;
    private View q;
    private ConnectAccessButton r;
    private FrameLayout s;
    private d t = new e(null);
    private c u;
    private ConnectAccessViewModel v;
    private final Set<ys2.a> w = new HashSet();

    private class b implements d {
        b(a aVar) {
        }

        @Override // com.spotify.mobile.android.ui.view.MainLayout.d
        public void a(boolean z, int i, int i2, int i3, int i4) {
            MainLayout.super.onLayout(z, i, i2, i3, i4);
            if (MainLayout.this.q != null) {
                MainLayout.this.q.setPadding(0, MainLayout.h0(MainLayout.this) ? 0 : MainLayout.this.p.getMeasuredHeight(), 0, MainLayout.this.f.getMeasuredHeight());
            }
            MainLayout mainLayout = MainLayout.this;
            mainLayout.I0(mainLayout.c, 0.0f);
            ToolbarConfig.Visibility visibility = ToolbarConfig.Visibility.SHOW;
            int childCount = MainLayout.this.getChildCount();
            View view = null;
            boolean z2 = false;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = MainLayout.this.getChildAt(i5);
                if (childAt != MainLayout.this.p && MainLayout.m0(childAt)) {
                    if (MainLayout.this.u != null) {
                        view = childAt;
                        z2 = ((p0) MainLayout.this.u).g();
                        visibility = ((p0) MainLayout.this.u).h();
                    } else {
                        view = childAt;
                    }
                }
            }
            if (MainLayout.this.u != null) {
                ((p0) MainLayout.this.u).d(view, z2, visibility);
            }
        }

        @Override // com.spotify.mobile.android.ui.view.MainLayout.d
        public void b(int i, int i2) {
            MainLayout.super.onMeasure(i, i2);
        }
    }

    public interface c {
    }

    private interface d {
        void a(boolean z, int i, int i2, int i3, int i4);

        void b(int i, int i2);
    }

    /* access modifiers changed from: private */
    public class e implements d {
        e(a aVar) {
        }

        @Override // com.spotify.mobile.android.ui.view.MainLayout.d
        public void a(boolean z, int i, int i2, int i3, int i4) {
            int i5 = MainLayout.this.a;
            MainLayout.W(MainLayout.this);
            int measuredHeight = MainLayout.this.o.getMeasuredHeight();
            int measuredHeight2 = MainLayout.this.f.getMeasuredHeight();
            int height = MainLayout.this.getHeight() - MainLayout.this.o.getMeasuredHeight();
            int height2 = MainLayout.this.getHeight();
            MainLayout.this.o.layout(0, height, MainLayout.this.getWidth(), height2);
            int measuredHeight3 = (height2 - measuredHeight) - MainLayout.this.f.getMeasuredHeight();
            MainLayout.this.f.layout(0, measuredHeight3, MainLayout.this.getWidth(), MainLayout.this.getHeight() - measuredHeight);
            MainLayout.this.n.layout(0, measuredHeight3 - MainLayout.this.n.getMeasuredHeight(), MainLayout.this.getWidth(), measuredHeight3);
            if (MainLayout.this.v != null) {
                MainLayout.this.v.c(new p(this, height2, measuredHeight2, measuredHeight));
            }
            MainLayout.this.c.layout(0, 0, MainLayout.this.getWidth(), MainLayout.this.c.getMeasuredHeight());
            int heightReportedToParent = MainLayout.this.c.getHeightReportedToParent();
            int heightReportedToParent2 = MainLayout.this.c.getHeightReportedToParent() + i5;
            int d = (!com.spotify.android.goldenpath.a.g(MainLayout.this.getContext()) || heightReportedToParent == 0) ? 0 : com.spotify.android.goldenpath.a.d(MainLayout.this.getContext());
            int i6 = heightReportedToParent - d;
            int i7 = heightReportedToParent2 - d;
            MainLayout.this.b.layout(0, i7, MainLayout.this.getWidth(), MainLayout.this.getHeight() - MainLayout.this.getBottomSectionMeasuredHeight());
            if (MainLayout.this.p != null) {
                MainLayout.this.p.layout(0, i6, MainLayout.this.getMeasuredWidth(), MainLayout.this.p.getMeasuredHeight() + i6);
            }
            for (int i8 = 0; i8 < MainLayout.this.getChildCount(); i8++) {
                View childAt = MainLayout.this.getChildAt(i8);
                if (childAt != MainLayout.this.p && MainLayout.m0(childAt)) {
                    if (MainLayout.h0(MainLayout.this)) {
                        childAt.layout(0, i6, MainLayout.this.getWidth(), MainLayout.this.getMeasuredHeight() - MainLayout.this.getBottomSectionHeightReportedToParent());
                    } else {
                        childAt.layout(0, i7, MainLayout.this.getWidth(), MainLayout.this.getMeasuredHeight() - MainLayout.this.getBottomSectionHeightReportedToParent());
                    }
                }
            }
            if (MainLayout.this.p != null) {
                MainLayout.this.p.bringToFront();
            }
            MainLayout.this.n.bringToFront();
            MainLayout.this.f.bringToFront();
            MainLayout.this.c.bringToFront();
            MainLayout.this.o.bringToFront();
            MainLayout.this.b.bringToFront();
            MainLayout.this.r.bringToFront();
        }

        @Override // com.spotify.mobile.android.ui.view.MainLayout.d
        public void b(int i, int i2) {
            MainLayout.this.setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            ToolbarConfig.Visibility visibility = ToolbarConfig.Visibility.SHOW;
            View view = null;
            boolean z = false;
            for (int i3 = 0; i3 < MainLayout.this.getChildCount(); i3++) {
                View childAt = MainLayout.this.getChildAt(i3);
                if (childAt != MainLayout.this.p && MainLayout.m0(childAt)) {
                    if (MainLayout.this.u != null) {
                        view = childAt;
                        z = ((p0) MainLayout.this.u).g();
                        visibility = ((p0) MainLayout.this.u).h();
                    } else {
                        view = childAt;
                    }
                }
            }
            if (MainLayout.this.u != null) {
                ((p0) MainLayout.this.u).d(view, z, visibility);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MainLayout.this.getMeasuredWidth(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(MainLayout.this.getMeasuredHeight(), 1073741824);
            MainLayout.this.f.measure(makeMeasureSpec, z42.B());
            MainLayout.this.c.measure(makeMeasureSpec, z42.B());
            MainLayout.this.n.measure(makeMeasureSpec, z42.B());
            MainLayout.this.b.measure(makeMeasureSpec, makeMeasureSpec2);
            MainLayout.this.o.measure(makeMeasureSpec, z42.B());
            if (MainLayout.this.p != null) {
                MainLayout.this.p.measure(makeMeasureSpec, z42.A(MainLayout.this.a));
            }
            if (MainLayout.this.v != null) {
                MainLayout.this.v.c(new o(this, makeMeasureSpec));
            }
            int measuredHeight = (MainLayout.this.getMeasuredHeight() - MainLayout.this.getBottomSectionHeightReportedToParent()) - MainLayout.this.c.getHeightReportedToParent();
            if (MainLayout.this.c.getHeightReportedToParent() > 0 && com.spotify.android.goldenpath.a.g(MainLayout.this.getContext())) {
                measuredHeight += com.spotify.android.goldenpath.a.d(MainLayout.this.getContext());
            }
            int measuredHeight2 = measuredHeight - MainLayout.this.o.getMeasuredHeight();
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2 - MainLayout.this.p.getMeasuredHeight(), 1073741824);
            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
            if (view == null) {
                return;
            }
            if (z || visibility == ToolbarConfig.Visibility.HIDE) {
                view.measure(makeMeasureSpec, makeMeasureSpec4);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec3);
            }
        }
    }

    public MainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static boolean F0(View view) {
        int u0 = u0(view);
        return (u0 == C0707R.id.anchor_bar_top || u0 == C0707R.id.anchor_bar_bottom || u0 == C0707R.id.navigation_bar || u0 == C0707R.id.side_panel_background || u0 == C0707R.id.now_playing_mini_container || u0 == C0707R.id.snackbarContainer || u0 == C0707R.id.tooltip_container) ? false : true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    public void I0(View view, float f2) {
        float measuredHeight = f2 + ((float) view.getMeasuredHeight());
        if (com.spotify.android.goldenpath.a.g(getContext())) {
            measuredHeight -= (float) com.spotify.android.goldenpath.a.d(getContext());
            if (measuredHeight < 0.0f) {
                measuredHeight = 0.0f;
            }
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (F0(childAt)) {
                childAt.setTranslationY(measuredHeight);
            }
        }
    }

    static void W(MainLayout mainLayout) {
        for (int i = 0; i < mainLayout.getChildCount(); i++) {
            View childAt = mainLayout.getChildAt(i);
            if (F0(childAt)) {
                childAt.setTranslationY(0.0f);
            }
        }
    }

    static void d0(MainLayout mainLayout, int i, int i2, int i3) {
        int width = mainLayout.getWidth();
        mainLayout.r.layout(0, ((i - i2) - i3) - mainLayout.r.getMeasuredHeight(), width, (mainLayout.getHeight() - i2) - i3);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getBottomSectionHeightReportedToParent() {
        return this.f.getHeightReportedToParent();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getBottomSectionMeasuredHeight() {
        return this.f.getMeasuredHeight();
    }

    static boolean h0(MainLayout mainLayout) {
        c cVar = mainLayout.u;
        return cVar != null && (((p0) cVar).g() || ((p0) mainLayout.u).h() == ToolbarConfig.Visibility.HIDE);
    }

    static boolean m0(View view) {
        int u0 = u0(view);
        return (u0 == C0707R.id.actionbar_shadow || u0 == C0707R.id.anchor_bar_bottom || u0 == C0707R.id.anchor_bar_top || u0 == C0707R.id.navigation_bar || u0 == C0707R.id.tooltip_container || u0 == C0707R.id.connect_access_button || u0 == C0707R.id.snackbarContainer) ? false : true;
    }

    private static int u0(View view) {
        View childAt;
        int id = view.getId();
        return (id >= 0 || !(view instanceof ViewGroup) || (childAt = ((ViewGroup) view).getChildAt(0)) == null) ? id : childAt.getId();
    }

    public void C0() {
        for (ys2.a aVar : this.w) {
            aVar.T0();
        }
    }

    public void E0(ys2.a aVar) {
        this.w.remove(aVar);
    }

    public void K0(boolean z) {
        if (z) {
            this.t = new b(null);
        }
    }

    public AnchorBar getBottomAnchorBar() {
        return this.f;
    }

    public ViewGroup getToolbarContainer() {
        return this.p;
    }

    public AnchorBar getTopAnchorBar() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (AnchorBar) findViewById(C0707R.id.anchor_bar_top);
        this.f = (AnchorBar) findViewById(C0707R.id.anchor_bar_bottom);
        this.n = findViewById(C0707R.id.snackbarContainer);
        this.o = (FrameLayout) findViewById(C0707R.id.navigation_bar);
        this.b = (ViewGroup) findViewById(C0707R.id.tooltip_container);
        this.p = (ViewGroup) findViewById(C0707R.id.toolbar_wrapper);
        this.q = findViewById(C0707R.id.fragment_container);
        this.r = (ConnectAccessButton) findViewById(C0707R.id.connect_access_button);
        this.s = (FrameLayout) findViewById(C0707R.id.now_playing_mini_container);
        this.a = com.spotify.android.paste.app.d.c(getContext());
        this.c.setAnchorBarAnimationListener(new q(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.t.a(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.t.b(i, i2);
    }

    public void s0(ys2.a aVar) {
        this.w.add(aVar);
    }

    public void setConnectAccessViewModel(ConnectAccessViewModel connectAccessViewModel) {
        connectAccessViewModel.getClass();
        this.v = connectAccessViewModel;
        connectAccessViewModel.k(new n(this));
        ConnectAccessViewModel connectAccessViewModel2 = this.v;
        if (connectAccessViewModel2 != null) {
            connectAccessViewModel2.a(this.r);
        }
    }

    public void setDelegate(c cVar) {
        this.u = cVar;
    }

    public boolean v0() {
        FrameLayout frameLayout = this.s;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }
}

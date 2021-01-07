package com.spotify.nowplaying.ui.components.overlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.overlay.k;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import java.util.LinkedHashSet;
import java.util.Set;

public class OverlayHidingFrameLayout extends FrameLayout implements k, ViewGroup.OnHierarchyChangeListener {
    private final GestureDetector a;
    private final y4 b;
    private final y4 c;
    private final g<Boolean> f;
    private final Set<k.b> n;
    private final Set<k.a> o;
    private final Runnable p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private View v;

    class a extends c {
        a() {
            super(null);
        }

        @Override // defpackage.y4
        public void c(View view) {
            OverlayHidingFrameLayout.this.u = true;
            this.a = false;
            OverlayHidingFrameLayout.this.v();
            OverlayHidingFrameLayout.this.v.setVisibility(0);
        }
    }

    class b extends c {
        b() {
            super(null);
        }

        @Override // com.spotify.nowplaying.ui.components.overlay.OverlayHidingFrameLayout.c, defpackage.y4
        public void b(View view) {
            OverlayHidingFrameLayout.this.u = false;
            if (!this.a) {
                OverlayHidingFrameLayout.this.v.setVisibility(4);
            }
        }

        @Override // defpackage.y4
        public void c(View view) {
            OverlayHidingFrameLayout.this.u = true;
            this.a = false;
            OverlayHidingFrameLayout.this.u();
        }
    }

    private abstract class c implements y4 {
        boolean a;

        c(a aVar) {
        }

        @Override // defpackage.y4
        public void a(View view) {
            OverlayHidingFrameLayout.this.u = false;
            this.a = true;
            OverlayHidingFrameLayout.this.v.setAlpha(1.0f);
            OverlayHidingFrameLayout.this.x(false, false);
        }

        @Override // defpackage.y4
        public void b(View view) {
            OverlayHidingFrameLayout.this.u = false;
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        boolean a;
        boolean b;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
            parcel.writeInt(this.b ? 1 : 0);
        }

        d(Parcel parcel) {
            super(parcel);
            boolean z = true;
            this.a = parcel.readInt() != 0;
            this.b = parcel.readInt() == 0 ? false : z;
        }
    }

    private class e extends GestureDetector.SimpleOnGestureListener {
        e(a aVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if ((OverlayHidingFrameLayout.this.v.getAlpha() >= 1.0f && OverlayHidingFrameLayout.q(OverlayHidingFrameLayout.this, motionEvent)) || OverlayHidingFrameLayout.this.o.isEmpty()) {
                return false;
            }
            OverlayHidingFrameLayout.i(OverlayHidingFrameLayout.this);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!OverlayHidingFrameLayout.this.t) {
                return true;
            }
            if (OverlayHidingFrameLayout.this.v.getVisibility() == 4) {
                OverlayHidingFrameLayout.this.a(true);
                OverlayHidingFrameLayout.p(OverlayHidingFrameLayout.this, false);
                return true;
            } else if (OverlayHidingFrameLayout.q(OverlayHidingFrameLayout.this, motionEvent)) {
                return false;
            } else {
                if (OverlayHidingFrameLayout.this.v.getVisibility() == 0) {
                    OverlayHidingFrameLayout.this.r(true);
                    OverlayHidingFrameLayout.p(OverlayHidingFrameLayout.this, true);
                } else {
                    OverlayHidingFrameLayout.this.a(true);
                    OverlayHidingFrameLayout.p(OverlayHidingFrameLayout.this, false);
                }
                return true;
            }
        }
    }

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void i(OverlayHidingFrameLayout overlayHidingFrameLayout) {
        for (k.a aVar : overlayHidingFrameLayout.o) {
            aVar.b();
        }
    }

    static void p(OverlayHidingFrameLayout overlayHidingFrameLayout, boolean z) {
        for (k.a aVar : overlayHidingFrameLayout.o) {
            aVar.a(z);
        }
    }

    static boolean q(OverlayHidingFrameLayout overlayHidingFrameLayout, MotionEvent motionEvent) {
        overlayHidingFrameLayout.getClass();
        return s(overlayHidingFrameLayout, overlayHidingFrameLayout.getLeft() + Math.round(motionEvent.getX()), overlayHidingFrameLayout.getTop() + Math.round(motionEvent.getY()));
    }

    private static boolean s(View view, int i, int i2) {
        if (view.isClickable()) {
            if (i >= view.getLeft() && i <= view.getRight() && i2 >= view.getTop() && i2 <= view.getBottom()) {
                return true;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            int left = i - viewGroup.getLeft();
            int top = i2 - viewGroup.getTop();
            if (left >= 0 && top >= 0 && s(childAt, left, top)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void u() {
        for (k.b bVar : this.n) {
            bVar.a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void v() {
        for (k.b bVar : this.n) {
            bVar.b();
        }
    }

    private boolean w(boolean z, int i) {
        View view = this.v;
        if (view == null || view.getVisibility() == i) {
            return false;
        }
        if (!z) {
            this.v.setAlpha(i == 0 ? 1.0f : 0.0f);
            this.v.setVisibility(i);
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x(boolean z, boolean z2) {
        if (z2) {
            this.v.animate().cancel();
        }
        if (this.s) {
            removeCallbacks(this.p);
            postDelayed(this.p, (long) this.r);
        }
        if (!w(z, 0)) {
            v();
            return;
        }
        x4 a2 = q4.a(this.v);
        a2.d((long) this.q);
        a2.e(ta0.c);
        a2.f(this.b);
        a2.a(1.0f);
        a2.j();
    }

    private void y(Drawable drawable, int i) {
        Drawable drawable2;
        if (this.v.getBackground() != null) {
            drawable2 = this.v.getBackground();
        } else {
            drawable2 = androidx.core.content.a.d(getContext(), C0707R.color.pasteTransparent);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(i);
        View view = this.v;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        view.setBackground(transitionDrawable);
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public void a(boolean z) {
        x(z, true);
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public void b() {
        y(androidx.core.content.a.d(getContext(), C0707R.color.pasteTransparent), 200);
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public void d(k.b bVar) {
        this.n.add(bVar);
    }

    @Override // android.view.View, android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.v == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        removeCallbacks(this.p);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.s) {
            removeCallbacks(this.p);
            postDelayed(this.p, (long) this.r);
        }
        if (actionMasked == 0 && this.u) {
            this.v.animate().cancel();
        } else if (this.a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public boolean isVisible() {
        return this.v.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        setOverlayView(view2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.s = dVar.a;
        if (dVar.b) {
            x(false, true);
        } else {
            r(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.a = this.s;
        dVar.b = this.v.getVisibility() == 0;
        return dVar;
    }

    public void r(boolean z) {
        this.v.animate().cancel();
        if (!w(z, 4)) {
            u();
            return;
        }
        x4 a2 = q4.a(this.v);
        a2.d((long) this.q);
        a2.e(ta0.c);
        a2.f(this.c);
        a2.a(0.0f);
        a2.j();
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public void setAutoHide(boolean z) {
        this.s = z;
        if (this.v != null && !z) {
            removeCallbacks(this.p);
        }
    }

    public void setFadeDuration(int i) {
        this.q = i;
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public void setHidingEnabled(boolean z) {
        this.t = z;
        if (!z) {
            setAutoHide(false);
        }
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public void setOverlayBackground(int i) {
        y(androidx.core.content.a.d(getContext(), i), 20);
    }

    public void setOverlayView(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        while (parent != this) {
            parent = parent.getParent();
            if (parent == null) {
                throw new IllegalArgumentException("Overlay has to be a child of the container!");
            }
        }
        this.v = view;
    }

    public void setTimeoutDuration(int i) {
        this.r = i;
    }

    public g<Boolean> t() {
        return this.f;
    }

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new GestureDetector(getContext(), new e(null));
        this.b = new a();
        this.c = new b();
        this.n = new LinkedHashSet();
        this.o = new LinkedHashSet();
        this.p = new d(this);
        this.q = AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150;
        this.r = 3500;
        this.s = true;
        this.t = true;
        setOnHierarchyChangeListener(this);
        this.f = g.p(new b(this), BackpressureStrategy.LATEST).c0(new io.reactivex.internal.operators.flowable.c(new a(this))).s().V(1).r0();
    }
}

package com.spotify.mobile.android.ui.view.anchorbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorItem;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class AnchorBar extends ViewGroup {
    public static final /* synthetic */ int x = 0;
    private final List<AnchorItem> a = new ArrayList();
    private final SparseBooleanArray b = new SparseBooleanArray();
    private final BitSet c = new BitSet();
    private int f;
    private boolean n;
    private cqe o = new aqe();
    private final TimeInterpolator p = ta0.d;
    private long q;
    private Optional<Integer> r = Optional.absent();
    private boolean s;
    private AnchorContentAnimation t = AnchorContentAnimation.BOTTOM_TO_TOP;
    private final List<c> u = new ArrayList(4);
    private b v = b.a;
    private boolean w;

    public enum AnchorContentAnimation {
        BOTTOM_TO_TOP {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorBar.AnchorContentAnimation
            public void d(AnchorBar anchorBar, View view, float f) {
                AnchorBar.d(anchorBar, view, f, 1);
            }
        },
        TOP_TO_BOTTOM {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorBar.AnchorContentAnimation
            public void d(AnchorBar anchorBar, View view, float f) {
                AnchorBar.d(anchorBar, view, f, -1);
            }
        };

        AnchorContentAnimation(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract void d(AnchorBar anchorBar, View view, float f);
    }

    public interface b {
        void a(View view, float f);
    }

    public interface c {
        void a();

        void b();
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        boolean[] a;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
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
            parcel.writeInt(this.a.length);
            parcel.writeBooleanArray(this.a);
        }

        d(Parcel parcel, a aVar) {
            super(parcel);
            boolean[] zArr = new boolean[parcel.readInt()];
            this.a = zArr;
            parcel.readBooleanArray(zArr);
        }
    }

    public AnchorBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static void d(AnchorBar anchorBar, View view, float f2, int i) {
        MoreObjects.checkState(anchorBar.r.isPresent());
        int intValue = anchorBar.r.get().intValue();
        boolean isVisible = anchorBar.a.get(intValue).isVisible();
        int measuredHeight = anchorBar.getChildAt(intValue).getMeasuredHeight();
        float interpolation = anchorBar.p.getInterpolation(f2);
        int i2 = 0;
        int i3 = measuredHeight * i;
        if (isVisible) {
            i2 = i3;
            i3 = 0;
        }
        float f3 = (((float) (i3 - i2)) * interpolation) + ((float) i2);
        view.setTranslationY(f3);
        anchorBar.v.a(view, f3);
    }

    private ViewGroup f(int i) {
        return (ViewGroup) getChildAt(i);
    }

    private boolean g(int i) {
        return this.r.isPresent() && i == this.r.get().intValue();
    }

    private int getAnchorToAdd() {
        for (int i = 0; i < this.a.size(); i++) {
            boolean z = this.c.get(i);
            boolean isVisible = this.a.get(i).isVisible();
            if (!z && isVisible) {
                return i;
            }
        }
        return -1;
    }

    private int getAnchorToRemove() {
        for (int i = 0; i < this.a.size(); i++) {
            boolean z = this.c.get(i);
            boolean isVisible = this.a.get(i).isVisible();
            if (z && !isVisible) {
                return i;
            }
        }
        return -1;
    }

    private void h() {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < this.a.size(); i++) {
            z2 |= this.c.get(i);
            z3 |= this.a.get(i).isVisible();
        }
        if (!z2 && z3) {
            z = true;
        }
        if (z) {
            for (c cVar : this.u) {
                cVar.b();
            }
        }
        if (!this.n) {
            requestLayout();
            this.n = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.r.isPresent()) {
            int intValue = this.r.get().intValue();
            boolean isVisible = this.a.get(intValue).isVisible();
            if (this.q == 0) {
                this.q = this.o.a();
            }
            float a2 = ((float) (this.o.a() - this.q)) / 400.0f;
            float f2 = 1.0f;
            boolean z2 = false;
            if (a2 > 1.0f) {
                z = true;
            } else {
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                postInvalidateOnAnimation();
                f2 = a2;
                z = false;
            }
            for (int i3 = intValue; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    this.t.d(this, childAt, f2);
                }
            }
            if (z) {
                this.q = 0;
                this.r = Optional.absent();
                if (isVisible) {
                    this.c.set(intValue);
                } else {
                    this.c.clear(intValue);
                }
                h();
                for (AnchorItem anchorItem : this.a) {
                    z2 |= anchorItem.isVisible();
                }
                if (!z2) {
                    for (c cVar : this.u) {
                        cVar.a();
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public void e(AnchorItem anchorItem) {
        if (this.s && this.b.indexOfKey(((f) anchorItem).d()) > 0) {
            Assertion.g("An AnchorItem with the same ID has already been added. Please use a unique ID.");
        }
        this.a.add(anchorItem);
        int d2 = ((f) anchorItem).d();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(d2);
        addView(frameLayout);
        setBackgroundColor(0);
        frameLayout.setVisibility(8);
        frameLayout.setTag(Integer.valueOf(this.a.size() - 1));
        int size = this.a.size() - 1;
        if (!this.s) {
            anchorItem.a(f(size));
        }
        if (anchorItem.isVisible()) {
            this.c.set(size);
            if (this.a.size() == 1) {
                for (c cVar : this.u) {
                    cVar.b();
                }
                return;
            }
            return;
        }
        this.c.clear(size);
    }

    public int getHeightReportedToParent() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public TimeInterpolator getInterpolator() {
        return this.p;
    }

    public void i(AnchorItem anchorItem, boolean z) {
        AnchorItem.Type type = anchorItem.getType();
        AnchorItem.Priority c2 = anchorItem.c();
        AnchorItem.Priority priority = AnchorItem.Priority.DEFAULT;
        int i = 0;
        for (AnchorItem anchorItem2 : this.a) {
            if (anchorItem2.getType() == type && anchorItem2 != anchorItem) {
                i = Math.max(i, anchorItem2.c().ordinal());
            }
        }
        AnchorItem.Priority priority2 = AnchorItem.Priority.c[i];
        if (c2.ordinal() > priority2.ordinal()) {
            if (!z) {
                c2 = priority2;
            }
            for (AnchorItem anchorItem3 : this.a) {
                anchorItem3.b(type, c2);
            }
        }
        if (this.s && z) {
            f fVar = (f) anchorItem;
            if (!this.b.get(fVar.d())) {
                anchorItem.a((ViewGroup) findViewById(fVar.d()));
                this.b.put(fVar.d(), true);
            }
        }
        h();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < this.a.size(); i6++) {
            ViewGroup f2 = f(i6);
            if (this.c.get(i6) || g(i6)) {
                int measuredHeight = f2.getMeasuredHeight() + i5;
                f2.layout(0, i5, getMeasuredWidth(), measuredHeight);
                f2.setTranslationY(0.0f);
                i5 = measuredHeight;
            }
        }
        if (this.w) {
            int i7 = q4.g;
            int i8 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
        this.n = false;
        this.w = false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Optional<Integer> optional;
        MoreObjects.checkState(getChildCount() == this.a.size());
        this.f = 0;
        if (this.r.isPresent()) {
            optional = this.r;
        } else {
            int anchorToRemove = getAnchorToRemove();
            if (anchorToRemove == -1) {
                anchorToRemove = getAnchorToAdd();
            }
            if (anchorToRemove != -1) {
                optional = Optional.of(Integer.valueOf(anchorToRemove));
            } else {
                optional = Optional.absent();
            }
        }
        this.r = optional;
        this.w = optional.isPresent();
        int i3 = 0;
        for (int i4 = 0; i4 < this.a.size(); i4++) {
            ViewGroup f2 = f(i4);
            f2.measure(i, z42.B());
            f2.setLayerType(0, null);
            if (this.c.get(i4) || g(i4)) {
                f2.setVisibility(0);
                i3 += f2.getMeasuredHeight();
            } else {
                f2.setVisibility(8);
            }
            if (this.c.get(i4) && !g(i4)) {
                this.f = f2.getMeasuredHeight() + this.f;
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        boolean[] zArr = dVar.a;
        for (int i = 0; i < this.a.size(); i++) {
            boolean z = zArr[i];
            this.a.get(i).setVisible(z);
            if (z) {
                this.c.set(i);
            } else {
                this.c.clear(i);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        boolean[] zArr = new boolean[this.a.size()];
        for (int i = 0; i < this.a.size(); i++) {
            zArr[i] = this.a.get(i).isVisible();
        }
        dVar.a = zArr;
        return dVar;
    }

    public void setAnchorBarAnimationListener(b bVar) {
        this.v = (b) MoreObjects.firstNonNull(bVar, b.a);
    }

    public void setAnchorContentAnimation(AnchorContentAnimation anchorContentAnimation) {
        anchorContentAnimation.getClass();
        this.t = anchorContentAnimation;
    }

    /* access modifiers changed from: package-private */
    public void setClock(cqe cqe) {
        this.o = cqe;
    }

    public void setInflateAnchorItemsLazilyEnabled(boolean z) {
        this.s = z;
    }

    public AnchorBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

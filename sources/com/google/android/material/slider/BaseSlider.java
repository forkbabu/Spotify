package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.google.android.material.internal.j;
import com.google.android.material.internal.n;
import com.google.android.material.internal.o;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import com.spotify.music.C0707R;
import defpackage.d5;
import defpackage.dy;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends a<S>, T extends b<S>> extends View {
    private static final String d0 = BaseSlider.class.getSimpleName();
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private float F;
    private MotionEvent G;
    private c H;
    private boolean I;
    private float J;
    private float K;
    private ArrayList<Float> L;
    private int M;
    private int N;
    private float O;
    private float[] P;
    private int Q;
    private boolean R;
    private boolean S;
    private ColorStateList T;
    private ColorStateList U;
    private ColorStateList V;
    private ColorStateList W;
    private final Paint a;
    private ColorStateList a0;
    private final Paint b;
    private final yx b0;
    private final Paint c;
    private float c0;
    private final Paint f;
    private final Paint n;
    private final Paint o;
    private final c p;
    private final AccessibilityManager q;
    private BaseSlider<S, L, T>.b r;
    private final e s;
    private final List<jy> t;
    private final List<L> u;
    private final List<T> v;
    private final int w;
    private int x;
    private int y;
    private int z;

    /* access modifiers changed from: package-private */
    public class a implements e {
        final /* synthetic */ AttributeSet a;
        final /* synthetic */ int b;

        a(AttributeSet attributeSet, int i) {
            this.a = attributeSet;
            this.b = i;
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        int a = -1;

        b(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.p.u(this.a, 4);
        }
    }

    /* access modifiers changed from: private */
    public static class c extends m5 {
        private final BaseSlider<?, ?, ?> n;
        Rect o = new Rect();

        c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.n = baseSlider;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public int i(float f, float f2) {
            for (int i = 0; i < this.n.getValues().size(); i++) {
                this.n.w(i, this.o);
                if (this.o.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public void j(List<Integer> list) {
            for (int i = 0; i < this.n.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public boolean o(int i, int i2, Bundle bundle) {
            if (!this.n.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float f = this.n.f(20);
                if (i2 == 8192) {
                    f = -f;
                }
                if (this.n.m()) {
                    f = -f;
                }
                if (!this.n.u(i, e2.e(this.n.getValues().get(i).floatValue() + f, this.n.getValueFrom(), this.n.getValueTo()))) {
                    return false;
                }
                this.n.x();
                this.n.postInvalidate();
                k(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.n.u(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.n.x();
                    this.n.postInvalidate();
                    k(i);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public void q(int i, d5 d5Var) {
            String str;
            d5Var.b(d5.a.o);
            List<Float> values = this.n.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.n.getValueFrom();
            float valueTo = this.n.getValueTo();
            if (this.n.isEnabled()) {
                if (floatValue > valueFrom) {
                    d5Var.a(8192);
                }
                if (floatValue < valueTo) {
                    d5Var.a(4096);
                }
            }
            d5Var.k0(d5.d.a(1, valueFrom, valueTo, floatValue));
            d5Var.R(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.n.getContentDescription() != null) {
                sb.append(this.n.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                if (i == this.n.getValues().size() - 1) {
                    str = this.n.getContext().getString(C0707R.string.material_slider_range_end);
                } else {
                    str = i == 0 ? this.n.getContext().getString(C0707R.string.material_slider_range_start) : "";
                }
                sb.append(str);
                sb.append(this.n.j(floatValue));
            }
            d5Var.V(sb.toString());
            this.n.w(i, this.o);
            d5Var.M(this.o);
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        float a;
        float b;
        ArrayList<Float> c;
        float f;
        boolean n;

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
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeList(this.c);
            parcel.writeFloat(this.f);
            parcel.writeBooleanArray(new boolean[]{this.n});
        }

        d(Parcel parcel, a aVar) {
            super(parcel);
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f = parcel.readFloat();
            this.n = parcel.createBooleanArray()[0];
        }
    }

    /* access modifiers changed from: private */
    public interface e {
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.sliderStyle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float f(int i) {
        float f2 = this.O;
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        float f3 = (this.K - this.J) / f2;
        float f4 = (float) i;
        if (f3 <= f4) {
            return f2;
        }
        return ((float) Math.round(f3 / f4)) * f2;
    }

    private void g() {
        y();
        int min = Math.min((int) (((this.K - this.J) / this.O) + 1.0f), (this.Q / (this.z * 2)) + 1);
        float[] fArr = this.P;
        if (fArr == null || fArr.length != min * 2) {
            this.P = new float[(min * 2)];
        }
        float f2 = ((float) this.Q) / ((float) (min - 1));
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.P;
            fArr2[i] = (((float) (i / 2)) * f2) + ((float) this.A);
            fArr2[i + 1] = (float) h();
        }
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.L.size() == 1) {
            floatValue2 = this.J;
        }
        float p2 = p(floatValue2);
        float p3 = p(floatValue);
        return m() ? new float[]{p3, p2} : new float[]{p2, p3};
    }

    private float getValueOfTouchPosition() {
        double d2;
        float f2 = this.c0;
        float f3 = this.O;
        if (f3 > 0.0f) {
            int i = (int) ((this.K - this.J) / f3);
            double round = (double) Math.round(f2 * ((float) i));
            double d3 = (double) i;
            Double.isNaN(round);
            Double.isNaN(d3);
            Double.isNaN(round);
            Double.isNaN(d3);
            d2 = round / d3;
        } else {
            d2 = (double) f2;
        }
        if (m()) {
            d2 = 1.0d - d2;
        }
        float f4 = this.K;
        float f5 = this.J;
        double d4 = (double) (f4 - f5);
        Double.isNaN(d4);
        double d5 = (double) f5;
        Double.isNaN(d5);
        return (float) ((d2 * d4) + d5);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.c0;
        if (m()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.K;
        float f4 = this.J;
        return je.a(f3, f4, f2, f4);
    }

    private int h() {
        int i = this.B;
        int i2 = 0;
        if (this.y == 1) {
            i2 = this.t.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    private void i() {
        for (L l : this.u) {
            Iterator<Float> it = this.L.iterator();
            while (it.hasNext()) {
                l.a(this, it.next().floatValue(), false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String j(float f2) {
        if (l()) {
            return this.H.a(f2);
        }
        return String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", Float.valueOf(f2));
    }

    private int k(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private boolean n(int i) {
        int i2 = this.N;
        long j = ((long) i2) + ((long) i);
        long size = (long) (this.L.size() - 1);
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.N = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.M != -1) {
            this.M = i3;
        }
        x();
        postInvalidate();
        return true;
    }

    private boolean o(int i) {
        if (m()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return n(i);
    }

    private float p(float f2) {
        float f3 = this.J;
        float f4 = (f2 - f3) / (this.K - f3);
        return m() ? 1.0f - f4 : f4;
    }

    private void q() {
        for (T t2 : this.v) {
            t2.a(this);
        }
    }

    private void s(jy jyVar, float f2) {
        jyVar.d0(j(f2));
        int p2 = (this.A + ((int) (p(f2) * ((float) this.Q)))) - (jyVar.getIntrinsicWidth() / 2);
        int h = h() - (this.E + this.C);
        jyVar.setBounds(p2, h - jyVar.getIntrinsicHeight(), jyVar.getIntrinsicWidth() + p2, h);
        Rect rect = new Rect(jyVar.getBounds());
        com.google.android.material.internal.b.c(o.d(this), this, rect);
        jyVar.setBounds(rect);
        o.e(this).a(jyVar);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        n e2;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.L.size() != arrayList.size() || !this.L.equals(arrayList)) {
                this.L = arrayList;
                int i = 1;
                this.S = true;
                this.N = 0;
                x();
                if (this.t.size() > this.L.size()) {
                    List<jy> subList = this.t.subList(this.L.size(), this.t.size());
                    for (jy jyVar : subList) {
                        if (q4.v(this) && (e2 = o.e(this)) != null) {
                            e2.b(jyVar);
                            jyVar.b0(o.d(this));
                        }
                    }
                    subList.clear();
                }
                while (this.t.size() < this.L.size()) {
                    a aVar = (a) this.s;
                    TypedArray f2 = j.f(BaseSlider.this.getContext(), aVar.a, pw.I, aVar.b, C0707R.style.res_2132083902_widget_materialcomponents_slider, new int[0]);
                    jy Z = jy.Z(BaseSlider.this.getContext(), null, 0, f2.getResourceId(8, C0707R.style.res_2132083926_widget_materialcomponents_tooltip));
                    f2.recycle();
                    this.t.add(Z);
                    if (q4.v(this)) {
                        Z.c0(o.d(this));
                    }
                }
                if (this.t.size() == 1) {
                    i = 0;
                }
                for (jy jyVar2 : this.t) {
                    jyVar2.T((float) i);
                }
                i();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private boolean t() {
        return Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean u(int i, float f2) {
        if (((double) Math.abs(f2 - this.L.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.L.set(i, Float.valueOf(e2.e(f2, i3 < 0 ? this.J : this.L.get(i3).floatValue(), i2 >= this.L.size() ? this.K : this.L.get(i2).floatValue())));
        this.N = i;
        for (L l : this.u) {
            l.a(this, this.L.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.q;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.b bVar = this.r;
            if (bVar == null) {
                this.r = new b(null);
            } else {
                removeCallbacks(bVar);
            }
            BaseSlider<S, L, T>.b bVar2 = this.r;
            bVar2.a = i;
            postDelayed(bVar2, 200);
        }
        return true;
    }

    private boolean v() {
        return u(this.M, getValueOfTouchPosition());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x() {
        if (!t() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int p2 = (int) ((p(this.L.get(this.N).floatValue()) * ((float) this.Q)) + ((float) this.A));
                int h = h();
                int i = this.D;
                androidx.core.graphics.drawable.a.f(background, p2 - i, h - i, p2 + i, h + i);
            }
        }
    }

    private void y() {
        if (this.S) {
            float f2 = this.J;
            float f3 = this.K;
            if (f2 >= f3) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.toString(this.J), Float.toString(this.K)));
            } else if (f3 <= f2) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.toString(this.K), Float.toString(this.J)));
            } else if (this.O <= 0.0f || z(f3)) {
                Iterator<Float> it = this.L.iterator();
                while (it.hasNext()) {
                    Float next = it.next();
                    if (next.floatValue() < this.J || next.floatValue() > this.K) {
                        throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", Float.toString(next.floatValue()), Float.toString(this.J), Float.toString(this.K)));
                    } else if (this.O > 0.0f && !z(next.floatValue())) {
                        throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", Float.toString(next.floatValue()), Float.toString(this.J), Float.toString(this.O), Float.toString(this.O)));
                    }
                }
                float f4 = this.O;
                if (f4 != 0.0f) {
                    if (((float) ((int) f4)) != f4) {
                        String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "stepSize", Float.valueOf(f4));
                    }
                    float f5 = this.J;
                    if (((float) ((int) f5)) != f5) {
                        String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueFrom", Float.valueOf(f5));
                    }
                    float f6 = this.K;
                    if (((float) ((int) f6)) != f6) {
                        String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueTo", Float.valueOf(f6));
                    }
                }
                this.S = false;
            } else {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(this.O), Float.toString(this.J), Float.toString(this.K)));
            }
        }
    }

    private boolean z(float f2) {
        double doubleValue = new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Float.toString(this.J))).divide(new BigDecimal(Float.toString(this.O)), MathContext.DECIMAL64).doubleValue();
        double round = (double) Math.round(doubleValue);
        Double.isNaN(round);
        return Math.abs(round - doubleValue) < 1.0E-4d;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.p.e(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(k(this.a0));
        this.b.setColor(k(this.W));
        this.n.setColor(k(this.V));
        this.o.setColor(k(this.U));
        for (jy jyVar : this.t) {
            if (jyVar.isStateful()) {
                jyVar.setState(getDrawableState());
            }
        }
        if (this.b0.isStateful()) {
            this.b0.setState(getDrawableState());
        }
        this.f.setColor(k(this.T));
        this.f.setAlpha(63);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    /* access modifiers changed from: package-private */
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.p.g();
    }

    public int getActiveThumbIndex() {
        return this.M;
    }

    public int getFocusedThumbIndex() {
        return this.N;
    }

    public int getHaloRadius() {
        return this.D;
    }

    public ColorStateList getHaloTintList() {
        return this.T;
    }

    public int getLabelBehavior() {
        return this.y;
    }

    public float getStepSize() {
        return this.O;
    }

    public float getThumbElevation() {
        return this.b0.q();
    }

    public int getThumbRadius() {
        return this.C;
    }

    public ColorStateList getThumbTintList() {
        return this.b0.r();
    }

    public ColorStateList getTickActiveTintList() {
        return this.U;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.V;
    }

    public ColorStateList getTickTintList() {
        if (this.V.equals(this.U)) {
            return this.U;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.W;
    }

    public int getTrackHeight() {
        return this.z;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.a0;
    }

    public int getTrackSidePadding() {
        return this.A;
    }

    public ColorStateList getTrackTintList() {
        if (this.a0.equals(this.W)) {
            return this.W;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.Q;
    }

    public float getValueFrom() {
        return this.J;
    }

    public float getValueTo() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public List<Float> getValues() {
        return new ArrayList(this.L);
    }

    public boolean l() {
        return this.H != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        return q4.o(this) == 1;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (jy jyVar : this.t) {
            jyVar.c0(o.d(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.b bVar = this.r;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        for (jy jyVar : this.t) {
            n e2 = o.e(this);
            if (e2 != null) {
                e2.b(jyVar);
                jyVar.b0(o.d(this));
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.S) {
            y();
            if (this.O > 0.0f) {
                g();
            }
        }
        super.onDraw(canvas);
        int h = h();
        int i = this.Q;
        float[] activeRange = getActiveRange();
        int i2 = this.A;
        float f2 = (float) i;
        float f3 = ((float) i2) + (activeRange[1] * f2);
        float f4 = (float) (i2 + i);
        if (f3 < f4) {
            float f5 = (float) h;
            canvas.drawLine(f3, f5, f4, f5, this.a);
        }
        float f6 = (float) this.A;
        float f7 = (activeRange[0] * f2) + f6;
        if (f7 > f6) {
            float f8 = (float) h;
            canvas.drawLine(f6, f8, f7, f8, this.a);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.J) {
            int i3 = this.Q;
            float[] activeRange2 = getActiveRange();
            float f9 = (float) this.A;
            float f10 = (float) i3;
            float f11 = (float) h;
            canvas.drawLine((activeRange2[0] * f10) + f9, f11, (activeRange2[1] * f10) + f9, f11, this.b);
        }
        if (this.O > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int round = Math.round(activeRange3[0] * ((float) ((this.P.length / 2) - 1)));
            int round2 = Math.round(activeRange3[1] * ((float) ((this.P.length / 2) - 1)));
            int i4 = round * 2;
            canvas.drawPoints(this.P, 0, i4, this.n);
            int i5 = round2 * 2;
            canvas.drawPoints(this.P, i4, i5 - i4, this.o);
            float[] fArr = this.P;
            canvas.drawPoints(fArr, i5, fArr.length - i5, this.n);
        }
        if ((this.I || isFocused()) && isEnabled()) {
            int i6 = this.Q;
            if (t()) {
                int p2 = (int) ((p(this.L.get(this.N).floatValue()) * ((float) i6)) + ((float) this.A));
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = this.D;
                    canvas.clipRect((float) (p2 - i7), (float) (h - i7), (float) (p2 + i7), (float) (i7 + h), Region.Op.UNION);
                }
                canvas.drawCircle((float) p2, (float) h, (float) this.D, this.f);
            }
            if (!(this.M == -1 || this.y == 2)) {
                Iterator<jy> it = this.t.iterator();
                for (int i8 = 0; i8 < this.L.size() && it.hasNext(); i8++) {
                    if (i8 != this.N) {
                        s(it.next(), this.L.get(i8).floatValue());
                    }
                }
                if (it.hasNext()) {
                    s(it.next(), this.L.get(this.N).floatValue());
                } else {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.t.size()), Integer.valueOf(this.L.size())));
                }
            }
        }
        int i9 = this.Q;
        if (!isEnabled()) {
            Iterator<Float> it2 = this.L.iterator();
            while (it2.hasNext()) {
                canvas.drawCircle((p(it2.next().floatValue()) * ((float) i9)) + ((float) this.A), (float) h, (float) this.C, this.c);
            }
        }
        Iterator<Float> it3 = this.L.iterator();
        while (it3.hasNext()) {
            canvas.save();
            int p3 = this.A + ((int) (p(it3.next().floatValue()) * ((float) i9)));
            int i10 = this.C;
            canvas.translate((float) (p3 - i10), (float) (h - i10));
            this.b0.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (!z2) {
            this.M = -1;
            for (jy jyVar : this.t) {
                o.e(this).b(jyVar);
            }
            this.p.b(this.N);
            return;
        }
        if (i == 1) {
            n(Integer.MAX_VALUE);
        } else if (i == 2) {
            n(Integer.MIN_VALUE);
        } else if (i == 17) {
            o(Integer.MAX_VALUE);
        } else if (i == 66) {
            o(Integer.MIN_VALUE);
        }
        this.p.t(this.N);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        float f2;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.L.size() == 1) {
            this.M = 0;
        }
        Float f3 = null;
        Boolean bool = null;
        if (this.M == -1) {
            Boolean bool2 = Boolean.TRUE;
            if (i != 61) {
                if (i != 66) {
                    if (i != 81) {
                        if (i != 69) {
                            if (i != 70) {
                                switch (i) {
                                    case 21:
                                        o(-1);
                                        break;
                                    case 22:
                                        o(1);
                                        break;
                                }
                            }
                        } else {
                            n(-1);
                        }
                        bool = bool2;
                    }
                    n(1);
                    bool = bool2;
                }
                this.M = this.N;
                postInvalidate();
                bool = bool2;
            } else if (keyEvent.hasNoModifiers()) {
                bool = Boolean.valueOf(n(1));
            } else if (keyEvent.isShiftPressed()) {
                bool = Boolean.valueOf(n(-1));
            } else {
                bool = Boolean.FALSE;
            }
            return bool != null ? bool.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean isLongPress = this.R | keyEvent.isLongPress();
        this.R = isLongPress;
        if (isLongPress) {
            f2 = f(20);
        } else {
            f2 = this.O;
            if (f2 == 0.0f) {
                f2 = 1.0f;
            }
        }
        if (i == 21) {
            if (!m()) {
                f2 = -f2;
            }
            f3 = Float.valueOf(f2);
        } else if (i == 22) {
            if (m()) {
                f2 = -f2;
            }
            f3 = Float.valueOf(f2);
        } else if (i == 69) {
            f3 = Float.valueOf(-f2);
        } else if (i == 70 || i == 81) {
            f3 = Float.valueOf(f2);
        }
        if (f3 != null) {
            if (u(this.M, f3.floatValue() + this.L.get(this.M).floatValue())) {
                x();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return n(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return n(-1);
                }
                return false;
            }
        }
        this.M = -1;
        for (jy jyVar : this.t) {
            o.e(this).b(jyVar);
        }
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.R = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.x;
        int i4 = 0;
        if (this.y == 1) {
            i4 = this.t.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.J = dVar.a;
        this.K = dVar.b;
        setValuesInternal(dVar.c);
        this.O = dVar.f;
        if (dVar.n) {
            requestFocus();
        }
        i();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.a = this.J;
        dVar.b = this.K;
        dVar.c = new ArrayList<>(this.L);
        dVar.f = this.O;
        dVar.n = hasFocus();
        return dVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.Q = Math.max(i - (this.A * 2), 0);
        if (this.O > 0.0f) {
            g();
        }
        x();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = false;
        if (!isEnabled()) {
            return false;
        }
        float x2 = motionEvent.getX();
        float f2 = (x2 - ((float) this.A)) / ((float) this.Q);
        this.c0 = f2;
        float max = Math.max(0.0f, f2);
        this.c0 = max;
        this.c0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = x2;
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                    z2 = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (!z2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (r()) {
                    requestFocus();
                    this.I = true;
                    v();
                    x();
                    invalidate();
                    q();
                }
            }
        } else if (actionMasked == 1) {
            this.I = false;
            MotionEvent motionEvent2 = this.G;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.G.getX() - motionEvent.getX()) <= ((float) this.w) && Math.abs(this.G.getY() - motionEvent.getY()) <= ((float) this.w)) {
                r();
            }
            if (this.M != -1) {
                v();
                this.M = -1;
            }
            for (jy jyVar : this.t) {
                o.e(this).b(jyVar);
            }
            for (T t2 : this.v) {
                t2.b(this);
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.I) {
                if (Math.abs(x2 - this.F) < ((float) this.w)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                q();
            }
            if (r()) {
                this.I = true;
                v();
                x();
                invalidate();
            }
        }
        setPressed(this.I);
        this.G = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        if (this.M != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float p2 = (p(valueOfTouchPositionAbsolute) * ((float) this.Q)) + ((float) this.A);
        this.M = 0;
        float abs = Math.abs(this.L.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.L.size(); i++) {
            float abs2 = Math.abs(this.L.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float p3 = (p(this.L.get(i).floatValue()) * ((float) this.Q)) + ((float) this.A);
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z2 = !m() ? p3 - p2 < 0.0f : p3 - p2 > 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.M = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(p3 - p2) < ((float) this.w)) {
                    this.M = -1;
                    return false;
                } else if (z2) {
                    this.M = i;
                }
            }
            abs = abs2;
        }
        if (this.M != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void setActiveThumbIndex(int i) {
        this.M = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        setLayerType(z2 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.L.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.N = i;
        this.p.t(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.D) {
            this.D = i;
            Drawable background = getBackground();
            if (t() || !(background instanceof RippleDrawable)) {
                postInvalidate();
                return;
            }
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int i2 = this.D;
            if (Build.VERSION.SDK_INT >= 23) {
                rippleDrawable.setRadius(i2);
                return;
            }
            try {
                RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i2));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new IllegalStateException("Couldn't set RippleDrawable radius", e2);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.T)) {
            this.T = colorStateList;
            Drawable background = getBackground();
            if (t() || !(background instanceof RippleDrawable)) {
                this.f.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
                this.f.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.y != i) {
            this.y = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(c cVar) {
        this.H = cVar;
    }

    public void setStepSize(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(f2), Float.toString(this.J), Float.toString(this.K)));
        } else if (this.O != f2) {
            this.O = f2;
            this.S = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f2) {
        this.b0.G(f2);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i != this.C) {
            this.C = i;
            yx yxVar = this.b0;
            dy.b bVar = new dy.b();
            bVar.p(0, (float) this.C);
            yxVar.setShapeAppearanceModel(bVar.m());
            yx yxVar2 = this.b0;
            int i2 = this.C;
            yxVar2.setBounds(0, 0, i2 * 2, i2 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b0.H(colorStateList);
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.U)) {
            this.U = colorStateList;
            this.o.setColor(k(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.V)) {
            this.V = colorStateList;
            this.n.setColor(k(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.W)) {
            this.W = colorStateList;
            this.b.setColor(k(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.z != i) {
            this.z = i;
            this.a.setStrokeWidth((float) i);
            this.b.setStrokeWidth((float) this.z);
            this.n.setStrokeWidth(((float) this.z) / 2.0f);
            this.o.setStrokeWidth(((float) this.z) / 2.0f);
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.a0)) {
            this.a0 = colorStateList;
            this.a.setColor(k(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.J = f2;
        this.S = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.K = f2;
        this.S = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void w(int i, Rect rect) {
        int p2 = this.A + ((int) (p(getValues().get(i).floatValue()) * ((float) this.Q)));
        int h = h();
        int i2 = this.C;
        rect.set(p2 - i2, h - i2, p2 + i2, h + i2);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.res_2132083902_widget_materialcomponents_slider), attributeSet, i);
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.I = false;
        this.L = new ArrayList<>();
        this.M = -1;
        this.N = -1;
        this.O = 0.0f;
        this.R = false;
        yx yxVar = new yx();
        this.b0 = yxVar;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.n = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.o = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.x = resources.getDimensionPixelSize(C0707R.dimen.mtrl_slider_widget_height);
        this.A = resources.getDimensionPixelOffset(C0707R.dimen.mtrl_slider_track_side_padding);
        this.B = resources.getDimensionPixelOffset(C0707R.dimen.mtrl_slider_track_top);
        this.E = resources.getDimensionPixelSize(C0707R.dimen.mtrl_slider_label_padding);
        this.s = new a(attributeSet, i);
        TypedArray f2 = j.f(context2, attributeSet, pw.I, i, C0707R.style.res_2132083902_widget_materialcomponents_slider, new int[0]);
        this.J = f2.getFloat(3, 0.0f);
        this.K = f2.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.J));
        this.O = f2.getFloat(2, 0.0f);
        int i2 = 15;
        boolean hasValue = f2.hasValue(15);
        int i3 = hasValue ? 15 : 17;
        i2 = !hasValue ? 16 : i2;
        ColorStateList a2 = jx.a(context2, f2, i3);
        setTrackInactiveTintList(a2 == null ? i0.a(context2, C0707R.color.material_slider_inactive_track_color) : a2);
        ColorStateList a3 = jx.a(context2, f2, i2);
        setTrackActiveTintList(a3 == null ? i0.a(context2, C0707R.color.material_slider_active_track_color) : a3);
        yxVar.H(jx.a(context2, f2, 9));
        ColorStateList a4 = jx.a(context2, f2, 5);
        setHaloTintList(a4 == null ? i0.a(context2, C0707R.color.material_slider_halo_color) : a4);
        int i4 = 12;
        boolean hasValue2 = f2.hasValue(12);
        int i5 = hasValue2 ? 12 : 14;
        i4 = !hasValue2 ? 13 : i4;
        ColorStateList a5 = jx.a(context2, f2, i5);
        setTickInactiveTintList(a5 == null ? i0.a(context2, C0707R.color.material_slider_inactive_tick_marks_color) : a5);
        ColorStateList a6 = jx.a(context2, f2, i4);
        setTickActiveTintList(a6 == null ? i0.a(context2, C0707R.color.material_slider_active_tick_marks_color) : a6);
        setThumbRadius(f2.getDimensionPixelSize(11, 0));
        setHaloRadius(f2.getDimensionPixelSize(6, 0));
        setThumbElevation(f2.getDimension(10, 0.0f));
        setTrackHeight(f2.getDimensionPixelSize(18, 0));
        this.y = f2.getInt(7, 0);
        if (!f2.getBoolean(0, true)) {
            setEnabled(false);
        }
        f2.recycle();
        setFocusable(true);
        setClickable(true);
        yxVar.P(2);
        this.w = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.p = cVar;
        q4.I(this, cVar);
        this.q = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }
}

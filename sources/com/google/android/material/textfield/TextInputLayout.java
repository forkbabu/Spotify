package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.q;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import defpackage.dy;
import defpackage.k3;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    private int A;
    private ColorStateList A0;
    private ColorStateList B;
    private ColorStateList B0;
    private ColorStateList C;
    private int C0;
    private CharSequence D;
    private int D0;
    private final TextView E;
    private int E0;
    private CharSequence F;
    private ColorStateList F0;
    private final TextView G;
    private int G0;
    private boolean H;
    private int H0;
    private CharSequence I;
    private int I0;
    private boolean J;
    private int J0;
    private yx K;
    private int K0;
    private yx L;
    private boolean L0;
    private dy M;
    final com.google.android.material.internal.a M0;
    private final int N;
    private boolean N0;
    private int O;
    private ValueAnimator O0;
    private final int P;
    private boolean P0;
    private int Q;
    private boolean Q0;
    private int R;
    private int S;
    private int T;
    private int U;
    private final Rect V;
    private final Rect W;
    private final FrameLayout a;
    private final RectF a0;
    private final LinearLayout b;
    private Typeface b0;
    private final LinearLayout c;
    private final CheckableImageButton c0;
    private ColorStateList d0;
    private boolean e0;
    private final FrameLayout f;
    private PorterDuff.Mode f0;
    private boolean g0;
    private Drawable h0;
    private int i0;
    private View.OnLongClickListener j0;
    private final LinkedHashSet<f> k0;
    private int l0;
    private final SparseArray<m> m0;
    EditText n;
    private final CheckableImageButton n0;
    private CharSequence o;
    private final LinkedHashSet<g> o0;
    private final n p;
    private ColorStateList p0;
    boolean q;
    private boolean q0;
    private int r;
    private PorterDuff.Mode r0;
    private boolean s;
    private boolean s0;
    private TextView t;
    private Drawable t0;
    private int u;
    private int u0;
    private int v;
    private Drawable v0;
    private CharSequence w;
    private View.OnLongClickListener w0;
    private boolean x;
    private View.OnLongClickListener x0;
    private TextView y;
    private final CheckableImageButton y0;
    private ColorStateList z;
    private ColorStateList z0;

    /* access modifiers changed from: package-private */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.F(!textInputLayout.Q0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.q) {
                textInputLayout2.z(editable.length());
            }
            if (TextInputLayout.this.x) {
                TextInputLayout.this.H(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.n0.performClick();
            TextInputLayout.this.n0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.n.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.M0.L(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends z3 {
        private final TextInputLayout a;

        public e(TextInputLayout textInputLayout) {
            this.a = textInputLayout;
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            String str;
            String str2;
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            EditText editText = this.a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.a.getHint();
            CharSequence helperText = this.a.getHelperText();
            CharSequence error = this.a.getError();
            int counterMaxLength = this.a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.a.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z2) {
                str = hint.toString();
            } else {
                str = "";
            }
            StringBuilder V0 = je.V0(str);
            if ((z4 || z3) && !TextUtils.isEmpty(str)) {
                str2 = ", ";
            } else {
                str2 = "";
            }
            V0.append(str2);
            StringBuilder V02 = je.V0(V0.toString());
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = "";
            }
            V02.append((Object) helperText);
            String sb = V02.toString();
            if (z) {
                d5Var.s0(text);
            } else if (!TextUtils.isEmpty(sb)) {
                d5Var.s0(sb);
            }
            if (!TextUtils.isEmpty(sb)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    d5Var.c0(sb);
                } else {
                    if (z) {
                        sb = ((Object) text) + ", " + sb;
                    }
                    d5Var.s0(sb);
                }
                d5Var.p0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            d5Var.e0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                d5Var.Y(error);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    static class h extends l5 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        CharSequence c;
        boolean f;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("TextInputLayout.SavedState{");
            V0.append(Integer.toHexString(System.identityHashCode(this)));
            V0.append(" error=");
            V0.append((Object) this.c);
            V0.append("}");
            return V0.toString();
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.f ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.textInputStyle);
    }

    private void A() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.t;
        if (textView != null) {
            x(textView, this.s ? this.u : this.v);
            if (!this.s && (colorStateList2 = this.B) != null) {
                this.t.setTextColor(colorStateList2);
            }
            if (this.s && (colorStateList = this.C) != null) {
                this.t.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean B() {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.B():boolean");
    }

    private void D(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
            androidx.core.graphics.drawable.a.i(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private void E() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            int l = l();
            if (l != layoutParams.topMargin) {
                layoutParams.topMargin = l;
                this.a.requestLayout();
            }
        }
    }

    private void G(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.n;
        int i = 0;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.n;
        boolean z5 = editText2 != null && editText2.hasFocus();
        boolean h2 = this.p.h();
        ColorStateList colorStateList2 = this.A0;
        if (colorStateList2 != null) {
            this.M0.B(colorStateList2);
            this.M0.H(this.A0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.A0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.K0) : this.K0;
            this.M0.B(ColorStateList.valueOf(colorForState));
            this.M0.H(ColorStateList.valueOf(colorForState));
        } else if (h2) {
            this.M0.B(this.p.m());
        } else if (this.s && (textView = this.t) != null) {
            this.M0.B(textView.getTextColors());
        } else if (z5 && (colorStateList = this.B0) != null) {
            this.M0.B(colorStateList);
        }
        if (z4 || (isEnabled() && (z5 || h2))) {
            if (z3 || this.L0) {
                ValueAnimator valueAnimator = this.O0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.O0.cancel();
                }
                if (!z2 || !this.N0) {
                    this.M0.L(1.0f);
                } else {
                    g(1.0f);
                }
                this.L0 = false;
                if (m()) {
                    u();
                }
                EditText editText3 = this.n;
                if (editText3 != null) {
                    i = editText3.getText().length();
                }
                H(i);
                J();
                M();
            }
        } else if (z3 || !this.L0) {
            ValueAnimator valueAnimator2 = this.O0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.O0.cancel();
            }
            if (!z2 || !this.N0) {
                this.M0.L(0.0f);
            } else {
                g(0.0f);
            }
            if (m() && ((g) this.K).X() && m()) {
                ((g) this.K).Y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.L0 = true;
            TextView textView2 = this.y;
            if (textView2 != null && this.x) {
                textView2.setText((CharSequence) null);
                this.y.setVisibility(4);
            }
            J();
            M();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void H(int i) {
        if (i != 0 || this.L0) {
            TextView textView = this.y;
            if (textView != null && this.x) {
                textView.setText((CharSequence) null);
                this.y.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = this.y;
        if (textView2 != null && this.x) {
            textView2.setText(this.w);
            this.y.setVisibility(0);
            this.y.bringToFront();
        }
    }

    private void I() {
        int i;
        if (this.n != null) {
            if (this.c0.getVisibility() == 0) {
                i = 0;
            } else {
                i = q4.r(this.n);
            }
            q4.Q(this.E, i, this.n.getCompoundPaddingTop(), 0, this.n.getCompoundPaddingBottom());
        }
    }

    private void J() {
        this.E.setVisibility((this.D == null || this.L0) ? 8 : 0);
        B();
    }

    private void K(boolean z2, boolean z3) {
        int defaultColor = this.F0.getDefaultColor();
        int colorForState = this.F0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.F0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.T = colorForState2;
        } else if (z3) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    private void L() {
        int i;
        if (this.n != null) {
            if (!q()) {
                if (!(this.y0.getVisibility() == 0)) {
                    i = q4.q(this.n);
                    q4.Q(this.G, 0, this.n.getPaddingTop(), i, this.n.getPaddingBottom());
                }
            }
            i = 0;
            q4.Q(this.G, 0, this.n.getPaddingTop(), i, this.n.getPaddingBottom());
        }
    }

    private void M() {
        int visibility = this.G.getVisibility();
        int i = 0;
        boolean z2 = this.F != null && !this.L0;
        TextView textView = this.G;
        if (!z2) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.G.getVisibility()) {
            getEndIconDelegate().c(z2);
        }
        B();
    }

    private m getEndIconDelegate() {
        m mVar = this.m0.get(this.l0);
        return mVar != null ? mVar : this.m0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.y0.getVisibility() == 0) {
            return this.y0;
        }
        if (!p() || !q()) {
            return null;
        }
        return this.n0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r6 = this;
            yx r0 = r6.K
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            dy r1 = r6.M
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.O
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0021
            int r0 = r6.Q
            if (r0 <= r2) goto L_0x001c
            int r0 = r6.T
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            yx r0 = r6.K
            int r1 = r6.Q
            float r1 = (float) r1
            int r5 = r6.T
            r0.Q(r1, r5)
        L_0x002e:
            int r0 = r6.U
            int r1 = r6.O
            if (r1 != r4) goto L_0x0045
            r0 = 2130968937(0x7f040169, float:1.7546542E38)
            android.content.Context r1 = r6.getContext()
            int r0 = defpackage.rw.l(r1, r0, r3)
            int r1 = r6.U
            int r0 = defpackage.s2.e(r1, r0)
        L_0x0045:
            r6.U = r0
            yx r1 = r6.K
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.H(r0)
            int r0 = r6.l0
            r1 = 3
            if (r0 != r1) goto L_0x005e
            android.widget.EditText r0 = r6.n
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x005e:
            yx r0 = r6.L
            if (r0 != 0) goto L_0x0063
            goto L_0x007a
        L_0x0063:
            int r1 = r6.Q
            if (r1 <= r2) goto L_0x006c
            int r1 = r6.T
            if (r1 == 0) goto L_0x006c
            r3 = 1
        L_0x006c:
            if (r3 == 0) goto L_0x0077
            int r1 = r6.T
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.H(r1)
        L_0x0077:
            r6.invalidate()
        L_0x007a:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.h():void");
    }

    private void i() {
        j(this.n0, this.q0, this.p0, this.s0, this.r0);
    }

    private void j(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            if (z2) {
                androidx.core.graphics.drawable.a.i(drawable, colorStateList);
            }
            if (z3) {
                androidx.core.graphics.drawable.a.j(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void k() {
        j(this.c0, this.e0, this.d0, this.g0, this.f0);
    }

    private int l() {
        float k;
        if (!this.H) {
            return 0;
        }
        int i = this.O;
        if (i == 0 || i == 1) {
            k = this.M0.k();
        } else if (i != 2) {
            return 0;
        } else {
            k = this.M0.k() / 2.0f;
        }
        return (int) k;
    }

    private boolean m() {
        return this.H && !TextUtils.isEmpty(this.I) && (this.K instanceof g);
    }

    private int n(int i, boolean z2) {
        int compoundPaddingLeft = this.n.getCompoundPaddingLeft() + i;
        return (this.D == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - this.E.getMeasuredWidth()) + this.E.getPaddingLeft();
    }

    private int o(int i, boolean z2) {
        int compoundPaddingRight = i - this.n.getCompoundPaddingRight();
        return (this.D == null || !z2) ? compoundPaddingRight : compoundPaddingRight + (this.E.getMeasuredWidth() - this.E.getPaddingRight());
    }

    private boolean p() {
        return this.l0 != 0;
    }

    private boolean s() {
        if (this.O == 1) {
            int i = Build.VERSION.SDK_INT;
            if (this.n.getMinLines() <= 1) {
                return true;
            }
        }
        return false;
    }

    private void setEditText(EditText editText) {
        if (this.n == null) {
            if (this.l0 != 3) {
                boolean z2 = editText instanceof TextInputEditText;
            }
            this.n = editText;
            t();
            setTextInputAccessibilityDelegate(new e(this));
            this.M0.S(this.n.getTypeface());
            this.M0.J(this.n.getTextSize());
            int gravity = this.n.getGravity();
            this.M0.C((gravity & -113) | 48);
            this.M0.I(gravity);
            this.n.addTextChangedListener(new a());
            if (this.A0 == null) {
                this.A0 = this.n.getHintTextColors();
            }
            if (this.H) {
                if (TextUtils.isEmpty(this.I)) {
                    CharSequence hint = this.n.getHint();
                    this.o = hint;
                    setHint(hint);
                    this.n.setHint((CharSequence) null);
                }
                this.J = true;
            }
            if (this.t != null) {
                z(this.n.getText().length());
            }
            C();
            this.p.e();
            this.b.bringToFront();
            this.c.bringToFront();
            this.f.bringToFront();
            this.y0.bringToFront();
            Iterator<f> it = this.k0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            I();
            L();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            G(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z2) {
        int i = 0;
        this.y0.setVisibility(z2 ? 0 : 8);
        FrameLayout frameLayout = this.f;
        if (z2) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        L();
        if (!p()) {
            B();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.I)) {
            this.I = charSequence;
            this.M0.Q(charSequence);
            if (!this.L0) {
                u();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.x != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.y = appCompatTextView;
                appCompatTextView.setId(C0707R.id.textinput_placeholder);
                q4.K(this.y, 1);
                setPlaceholderTextAppearance(this.A);
                setPlaceholderTextColor(this.z);
                TextView textView = this.y;
                if (textView != null) {
                    this.a.addView(textView);
                    this.y.setVisibility(0);
                }
            } else {
                TextView textView2 = this.y;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.y = null;
            }
            this.x = z2;
        }
    }

    private void t() {
        int i = this.O;
        boolean z2 = true;
        if (i == 0) {
            this.K = null;
            this.L = null;
        } else if (i == 1) {
            this.K = new yx(this.M);
            this.L = new yx();
        } else if (i == 2) {
            if (!this.H || (this.K instanceof g)) {
                this.K = new yx(this.M);
            } else {
                this.K = new g(this.M);
            }
            this.L = null;
        } else {
            throw new IllegalArgumentException(je.B0(new StringBuilder(), this.O, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        EditText editText = this.n;
        if (editText == null || this.K == null || editText.getBackground() != null || this.O == 0) {
            z2 = false;
        }
        if (z2) {
            EditText editText2 = this.n;
            yx yxVar = this.K;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            editText2.setBackground(yxVar);
        }
        N();
        if (this.O != 0) {
            E();
        }
    }

    private void u() {
        if (m()) {
            RectF rectF = this.a0;
            this.M0.h(rectF, this.n.getWidth(), this.n.getGravity());
            float f2 = rectF.left;
            float f3 = (float) this.N;
            rectF.left = f2 - f3;
            rectF.top -= f3;
            rectF.right += f3;
            rectF.bottom += f3;
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            g gVar = (g) this.K;
            gVar.getClass();
            gVar.Y(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private static void v(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                v((ViewGroup) childAt, z2);
            }
        }
    }

    private static void w(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i3 = 1;
        boolean z3 = onLongClickListener != null;
        if (hasOnClickListeners || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i3 = 2;
        }
        q4.O(checkableImageButton, i3);
    }

    private void y() {
        if (this.t != null) {
            EditText editText = this.n;
            z(editText == null ? 0 : editText.getText().length());
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        Drawable background;
        TextView textView;
        EditText editText = this.n;
        if (editText != null && this.O == 0 && (background = editText.getBackground()) != null) {
            if (q.a(background)) {
                background = background.mutate();
            }
            if (this.p.h()) {
                background.setColorFilter(androidx.appcompat.widget.g.e(this.p.l(), PorterDuff.Mode.SRC_IN));
            } else if (!this.s || (textView = this.t) == null) {
                androidx.core.graphics.drawable.a.a(background);
                this.n.refreshDrawableState();
            } else {
                background.setColorFilter(androidx.appcompat.widget.g.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z2) {
        G(z2, false);
    }

    /* access modifiers changed from: package-private */
    public void N() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.K != null && this.O != 0) {
            boolean z2 = false;
            boolean z3 = isFocused() || ((editText2 = this.n) != null && editText2.hasFocus());
            boolean z4 = isHovered() || ((editText = this.n) != null && editText.isHovered());
            if (!isEnabled()) {
                this.T = this.K0;
            } else if (this.p.h()) {
                if (this.F0 != null) {
                    K(z3, z4);
                } else {
                    this.T = this.p.l();
                }
            } else if (!this.s || (textView = this.t) == null) {
                if (z3) {
                    this.T = this.E0;
                } else if (z4) {
                    this.T = this.D0;
                } else {
                    this.T = this.C0;
                }
            } else if (this.F0 != null) {
                K(z3, z4);
            } else {
                this.T = textView.getCurrentTextColor();
            }
            if (getErrorIconDrawable() != null && this.p.q() && this.p.h()) {
                z2 = true;
            }
            setErrorIconVisible(z2);
            D(this.y0, this.z0);
            D(this.c0, this.d0);
            D(this.n0, this.p0);
            if (getEndIconDelegate().d()) {
                if (!this.p.h() || getEndIconDrawable() == null) {
                    i();
                } else {
                    Drawable mutate = androidx.core.graphics.drawable.a.l(getEndIconDrawable()).mutate();
                    androidx.core.graphics.drawable.a.h(mutate, this.p.l());
                    this.n0.setImageDrawable(mutate);
                }
            }
            if (!z3 || !isEnabled()) {
                this.Q = this.R;
            } else {
                this.Q = this.S;
            }
            if (this.O == 1) {
                if (!isEnabled()) {
                    this.U = this.H0;
                } else if (z4 && !z3) {
                    this.U = this.J0;
                } else if (z3) {
                    this.U = this.I0;
                } else {
                    this.U = this.G0;
                }
            }
            h();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.a.addView(view, layoutParams2);
            this.a.setLayoutParams(layoutParams);
            E();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.o == null || (editText = this.n) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z2 = this.J;
        this.J = false;
        CharSequence hint = editText.getHint();
        this.n.setHint(this.o);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.n.setHint(hint);
            this.J = z2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.Q0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Q0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.H) {
            this.M0.g(canvas);
        }
        yx yxVar = this.L;
        if (yxVar != null) {
            Rect bounds = yxVar.getBounds();
            bounds.top = bounds.bottom - this.Q;
            this.L.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        if (!this.P0) {
            boolean z2 = true;
            this.P0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.M0;
            boolean P2 = aVar != null ? aVar.P(drawableState) | false : false;
            if (this.n != null) {
                if (!q4.w(this) || !isEnabled()) {
                    z2 = false;
                }
                G(z2, false);
            }
            C();
            N();
            if (P2) {
                invalidate();
            }
            this.P0 = false;
        }
    }

    public void e(f fVar) {
        this.k0.add(fVar);
        if (this.n != null) {
            fVar.a(this);
        }
    }

    public void f(g gVar) {
        this.o0.add(gVar);
    }

    /* access modifiers changed from: package-private */
    public void g(float f2) {
        if (this.M0.r() != f2) {
            if (this.O0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.O0 = valueAnimator;
                valueAnimator.setInterpolator(qw.b);
                this.O0.setDuration(167L);
                this.O0.addUpdateListener(new d());
            }
            this.O0.setFloatValues(this.M0.r(), f2);
            this.O0.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.n;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + l();
    }

    /* access modifiers changed from: package-private */
    public yx getBoxBackground() {
        int i = this.O;
        if (i == 1 || i == 2) {
            return this.K;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.K.n();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.K.o();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.K.A();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.K.z();
    }

    public int getBoxStrokeColor() {
        return this.E0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.F0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.q || !this.s || (textView = this.t) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.B;
    }

    public ColorStateList getCounterTextColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0;
    }

    public EditText getEditText() {
        return this.n;
    }

    public CharSequence getEndIconContentDescription() {
        return this.n0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.n0.getDrawable();
    }

    public int getEndIconMode() {
        return this.l0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.n0;
    }

    public CharSequence getError() {
        if (this.p.q()) {
            return this.p.k();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.p.j();
    }

    public int getErrorCurrentTextColors() {
        return this.p.l();
    }

    public Drawable getErrorIconDrawable() {
        return this.y0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.p.l();
    }

    public CharSequence getHelperText() {
        if (this.p.r()) {
            return this.p.n();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.p.o();
    }

    public CharSequence getHint() {
        if (this.H) {
            return this.I;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.M0.k();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.M0.m();
    }

    public ColorStateList getHintTextColor() {
        return this.B0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.n0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.n0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.x) {
            return this.w;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.A;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.z;
    }

    public CharSequence getPrefixText() {
        return this.D;
    }

    public ColorStateList getPrefixTextColor() {
        return this.E.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.E;
    }

    public CharSequence getStartIconContentDescription() {
        return this.c0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.c0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.F;
    }

    public ColorStateList getSuffixTextColor() {
        return this.G.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.G;
    }

    public Typeface getTypeface() {
        return this.b0;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.n;
        if (editText != null) {
            Rect rect = this.V;
            com.google.android.material.internal.b.a(this, editText, rect);
            yx yxVar = this.L;
            if (yxVar != null) {
                int i7 = rect.bottom;
                yxVar.setBounds(rect.left, i7 - this.S, rect.right, i7);
            }
            if (this.H) {
                this.M0.J(this.n.getTextSize());
                int gravity = this.n.getGravity();
                this.M0.C((gravity & -113) | 48);
                this.M0.I(gravity);
                com.google.android.material.internal.a aVar = this.M0;
                if (this.n != null) {
                    Rect rect2 = this.W;
                    boolean z3 = q4.o(this) == 1;
                    rect2.bottom = rect.bottom;
                    int i8 = this.O;
                    if (i8 == 1) {
                        rect2.left = n(rect.left, z3);
                        rect2.top = rect.top + this.P;
                        rect2.right = o(rect.right, z3);
                    } else if (i8 != 2) {
                        rect2.left = n(rect.left, z3);
                        rect2.top = getPaddingTop();
                        rect2.right = o(rect.right, z3);
                    } else {
                        rect2.left = this.n.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - l();
                        rect2.right = rect.right - this.n.getPaddingRight();
                    }
                    aVar.z(rect2);
                    com.google.android.material.internal.a aVar2 = this.M0;
                    if (this.n != null) {
                        Rect rect3 = this.W;
                        float p2 = aVar2.p();
                        rect3.left = this.n.getCompoundPaddingLeft() + rect.left;
                        if (s()) {
                            i5 = (int) (((float) rect.centerY()) - (p2 / 2.0f));
                        } else {
                            i5 = rect.top + this.n.getCompoundPaddingTop();
                        }
                        rect3.top = i5;
                        rect3.right = rect.right - this.n.getCompoundPaddingRight();
                        if (s()) {
                            i6 = (int) (((float) rect3.top) + p2);
                        } else {
                            i6 = rect.bottom - this.n.getCompoundPaddingBottom();
                        }
                        rect3.bottom = i6;
                        aVar2.F(rect3);
                        this.M0.w();
                        if (m() && !this.L0) {
                            u();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z2 = false;
        if (this.n != null && this.n.getMeasuredHeight() < (max = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.n.setMinimumHeight(max);
            z2 = true;
        }
        boolean B2 = B();
        if (z2 || B2) {
            this.n.post(new c());
        }
        if (!(this.y == null || (editText = this.n) == null)) {
            this.y.setGravity(editText.getGravity());
            this.y.setPadding(this.n.getCompoundPaddingLeft(), this.n.getCompoundPaddingTop(), this.n.getCompoundPaddingRight(), this.n.getCompoundPaddingBottom());
        }
        I();
        L();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.c);
        if (hVar.f) {
            this.n0.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.p.h()) {
            hVar.c = getError();
        }
        hVar.f = p() && this.n0.isChecked();
        return hVar;
    }

    public boolean q() {
        return this.f.getVisibility() == 0 && this.n0.getVisibility() == 0;
    }

    public boolean r() {
        return this.J;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.U != i) {
            this.U = i;
            this.G0 = i;
            this.I0 = i;
            this.J0 = i;
            h();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(androidx.core.content.a.b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.G0 = defaultColor;
        this.U = defaultColor;
        this.H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.I0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.J0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        h();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.O) {
            this.O = i;
            if (this.n != null) {
                t();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            N();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.C0 = colorStateList.getDefaultColor();
            this.K0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.E0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.E0 != colorStateList.getDefaultColor()) {
            this.E0 = colorStateList.getDefaultColor();
        }
        N();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            N();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.R = i;
        N();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.S = i;
        N();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.q != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.t = appCompatTextView;
                appCompatTextView.setId(C0707R.id.textinput_counter);
                Typeface typeface = this.b0;
                if (typeface != null) {
                    this.t.setTypeface(typeface);
                }
                this.t.setMaxLines(1);
                this.p.d(this.t, 2);
                e2.t((ViewGroup.MarginLayoutParams) this.t.getLayoutParams(), getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_textinput_counter_margin_start));
                A();
                y();
            } else {
                this.p.s(this.t, 2);
                this.t = null;
            }
            this.q = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.r != i) {
            if (i > 0) {
                this.r = i;
            } else {
                this.r = -1;
            }
            if (this.q) {
                y();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.u != i) {
            this.u = i;
            A();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            A();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.v != i) {
            this.v = i;
            A();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            A();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0 = colorStateList;
        this.B0 = colorStateList;
        if (this.n != null) {
            G(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        v(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.n0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.n0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? i0.b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.l0;
        this.l0 = i;
        Iterator<g> it = this.o0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.O)) {
            getEndIconDelegate().a();
            i();
            return;
        }
        StringBuilder V0 = je.V0("The current box background mode ");
        V0.append(this.O);
        V0.append(" is not supported by the end icon mode ");
        V0.append(i);
        throw new IllegalStateException(V0.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.n0;
        View.OnLongClickListener onLongClickListener = this.w0;
        checkableImageButton.setOnClickListener(onClickListener);
        w(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.w0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.n0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        w(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            this.q0 = true;
            i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.r0 != mode) {
            this.r0 = mode;
            this.s0 = true;
            i();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (q() != z2) {
            this.n0.setVisibility(z2 ? 0 : 8);
            L();
            B();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.p.q()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.p.C(charSequence);
        } else {
            this.p.p();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.p.t(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.p.u(z2);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? i0.b(getContext(), i) : null);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.y0;
        View.OnLongClickListener onLongClickListener = this.x0;
        checkableImageButton.setOnClickListener(onClickListener);
        w(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.x0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.y0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        w(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.z0 = colorStateList;
        Drawable drawable = this.y0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            androidx.core.graphics.drawable.a.i(drawable, colorStateList);
        }
        if (this.y0.getDrawable() != drawable) {
            this.y0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.y0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            androidx.core.graphics.drawable.a.j(drawable, mode);
        }
        if (this.y0.getDrawable() != drawable) {
            this.y0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.p.v(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.p.w(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.p.r()) {
                setHelperTextEnabled(true);
            }
            this.p.D(charSequence);
        } else if (this.p.r()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.p.z(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.p.y(z2);
    }

    public void setHelperTextTextAppearance(int i) {
        this.p.x(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.H) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.N0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.H) {
            this.H = z2;
            if (!z2) {
                this.J = false;
                if (!TextUtils.isEmpty(this.I) && TextUtils.isEmpty(this.n.getHint())) {
                    this.n.setHint(this.I);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.n.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.I)) {
                        setHint(hint);
                    }
                    this.n.setHint((CharSequence) null);
                }
                this.J = true;
            }
            if (this.n != null) {
                E();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.M0.A(i);
        this.B0 = this.M0.i();
        if (this.n != null) {
            G(false, false);
            E();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            if (this.A0 == null) {
                this.M0.B(colorStateList);
            }
            this.B0 = colorStateList;
            if (this.n != null) {
                G(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? i0.b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.l0 != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.p0 = colorStateList;
        this.q0 = true;
        i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.r0 = mode;
        this.s0 = true;
        i();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 0;
        if (!this.x || !TextUtils.isEmpty(charSequence)) {
            if (!this.x) {
                setPlaceholderTextEnabled(true);
            }
            this.w = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.n;
        if (editText != null) {
            i = editText.getText().length();
        }
        H(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.A = i;
        TextView textView = this.y;
        if (textView != null) {
            androidx.core.widget.c.n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            TextView textView = this.y;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.D = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.E.setText(charSequence);
        J();
    }

    public void setPrefixTextAppearance(int i) {
        androidx.core.widget.c.n(this.E, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.c0.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? i0.b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.c0;
        View.OnLongClickListener onLongClickListener = this.j0;
        checkableImageButton.setOnClickListener(onClickListener);
        w(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.j0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.c0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        w(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            this.e0 = true;
            k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f0 != mode) {
            this.f0 = mode;
            this.g0 = true;
            k();
        }
    }

    public void setStartIconVisible(boolean z2) {
        int i = 0;
        if ((this.c0.getVisibility() == 0) != z2) {
            CheckableImageButton checkableImageButton = this.c0;
            if (!z2) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            I();
            B();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.F = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.G.setText(charSequence);
        M();
    }

    public void setSuffixTextAppearance(int i) {
        androidx.core.widget.c.n(this.G, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.G.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.n;
        if (editText != null) {
            q4.I(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.b0) {
            this.b0 = typeface;
            this.M0.S(typeface);
            this.p.A(typeface);
            TextView textView = this.t;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(TextView textView, int i) {
        boolean z2 = true;
        try {
            androidx.core.widget.c.n(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            androidx.core.widget.c.n(textView, C0707R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.a.b(getContext(), C0707R.color.design_error));
        }
    }

    /* access modifiers changed from: package-private */
    public void z(int i) {
        boolean z2 = this.s;
        int i2 = this.r;
        if (i2 == -1) {
            this.t.setText(String.valueOf(i));
            this.t.setContentDescription(null);
            this.s = false;
        } else {
            this.s = i > i2;
            Context context = getContext();
            this.t.setContentDescription(context.getString(this.s ? C0707R.string.character_counter_overflowed_content_description : C0707R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.r)));
            if (z2 != this.s) {
                A();
            }
            int i3 = k3.i;
            this.t.setText(new k3.a().a().c(getContext().getString(C0707R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.r))));
        }
        if (this.n != null && z2 != this.s) {
            G(false, false);
            N();
            C();
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_Design_TextInputLayout), attributeSet, i);
        int i2;
        this.p = new n(this);
        this.V = new Rect();
        this.W = new Rect();
        this.a0 = new RectF();
        this.k0 = new LinkedHashSet<>();
        this.l0 = 0;
        SparseArray<m> sparseArray = new SparseArray<>();
        this.m0 = sparseArray;
        this.o0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.M0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.c = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = qw.a;
        aVar.R(timeInterpolator);
        aVar.O(timeInterpolator);
        aVar.C(8388659);
        h0 g2 = j.g(context2, attributeSet, pw.P, i, C0707R.style.Widget_Design_TextInputLayout, 18, 16, 31, 35, 39);
        this.H = g2.a(38, true);
        setHint(g2.p(2));
        this.N0 = g2.a(37, true);
        this.M = dy.c(context2, attributeSet, i, C0707R.style.Widget_Design_TextInputLayout, new rx((float) 0)).m();
        this.N = context2.getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.P = g2.e(5, 0);
        this.R = g2.f(12, context2.getResources().getDimensionPixelSize(C0707R.dimen.mtrl_textinput_box_stroke_width_default));
        this.S = g2.f(13, context2.getResources().getDimensionPixelSize(C0707R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.Q = this.R;
        float d2 = g2.d(9, -1.0f);
        float d3 = g2.d(8, -1.0f);
        float d4 = g2.d(6, -1.0f);
        float d5 = g2.d(7, -1.0f);
        dy dyVar = this.M;
        dyVar.getClass();
        dy.b bVar = new dy.b(dyVar);
        if (d2 >= 0.0f) {
            bVar.z(d2);
        }
        if (d3 >= 0.0f) {
            bVar.C(d3);
        }
        if (d4 >= 0.0f) {
            bVar.v(d4);
        }
        if (d5 >= 0.0f) {
            bVar.s(d5);
        }
        this.M = bVar.m();
        ColorStateList b2 = jx.b(context2, g2, 3);
        if (b2 != null) {
            int defaultColor = b2.getDefaultColor();
            this.G0 = defaultColor;
            this.U = defaultColor;
            if (b2.isStateful()) {
                i2 = -1;
                this.H0 = b2.getColorForState(new int[]{-16842910}, -1);
                this.I0 = b2.getColorForState(new int[]{16842908, 16842910}, -1);
                this.J0 = b2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                i2 = -1;
                this.I0 = this.G0;
                ColorStateList a2 = i0.a(context2, C0707R.color.mtrl_filled_background_color);
                this.H0 = a2.getColorForState(new int[]{-16842910}, -1);
                this.J0 = a2.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            i2 = -1;
            this.U = 0;
            this.G0 = 0;
            this.H0 = 0;
            this.I0 = 0;
            this.J0 = 0;
        }
        if (g2.s(1)) {
            ColorStateList c2 = g2.c(1);
            this.B0 = c2;
            this.A0 = c2;
        }
        ColorStateList b3 = jx.b(context2, g2, 10);
        this.E0 = g2.b(10, 0);
        this.C0 = androidx.core.content.a.b(context2, C0707R.color.mtrl_textinput_default_box_stroke_color);
        this.K0 = androidx.core.content.a.b(context2, C0707R.color.mtrl_textinput_disabled_color);
        this.D0 = androidx.core.content.a.b(context2, C0707R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b3 != null) {
            setBoxStrokeColorStateList(b3);
        }
        if (g2.s(11)) {
            setBoxStrokeErrorColor(jx.b(context2, g2, 11));
        }
        if (g2.n(39, i2) != i2) {
            setHintTextAppearance(g2.n(39, 0));
        }
        int n2 = g2.n(31, 0);
        CharSequence p2 = g2.p(26);
        boolean a3 = g2.a(27, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0707R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.y0 = checkableImageButton;
        checkableImageButton.setVisibility(8);
        if (g2.s(28)) {
            setErrorIconDrawable(g2.g(28));
        }
        if (g2.s(29)) {
            setErrorIconTintList(jx.b(context2, g2, 29));
        }
        if (g2.s(30)) {
            setErrorIconTintMode(o.h(g2.k(30, i2), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(C0707R.string.error_icon_content_description));
        q4.O(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int n3 = g2.n(35, 0);
        boolean a4 = g2.a(34, false);
        CharSequence p3 = g2.p(33);
        int n4 = g2.n(47, 0);
        CharSequence p4 = g2.p(46);
        int n5 = g2.n(50, 0);
        CharSequence p5 = g2.p(49);
        int n6 = g2.n(60, 0);
        CharSequence p6 = g2.p(59);
        boolean a5 = g2.a(14, false);
        setCounterMaxLength(g2.k(15, -1));
        this.v = g2.n(18, 0);
        this.u = g2.n(16, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0707R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.c0 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (g2.s(56)) {
            setStartIconDrawable(g2.g(56));
            if (g2.s(55)) {
                setStartIconContentDescription(g2.p(55));
            }
            setStartIconCheckable(g2.a(54, true));
        }
        if (g2.s(57)) {
            setStartIconTintList(jx.b(context2, g2, 57));
        }
        if (g2.s(58)) {
            setStartIconTintMode(o.h(g2.k(58, -1), null));
        }
        setBoxBackgroundMode(g2.k(4, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0707R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.n0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        sparseArray.append(-1, new f(this));
        sparseArray.append(0, new o(this));
        sparseArray.append(1, new p(this));
        sparseArray.append(2, new a(this));
        sparseArray.append(3, new h(this));
        if (g2.s(23)) {
            setEndIconMode(g2.k(23, 0));
            if (g2.s(22)) {
                setEndIconDrawable(g2.g(22));
            }
            if (g2.s(21)) {
                setEndIconContentDescription(g2.p(21));
            }
            setEndIconCheckable(g2.a(20, true));
        } else if (g2.s(43)) {
            setEndIconMode(g2.a(43, false) ? 1 : 0);
            setEndIconDrawable(g2.g(42));
            setEndIconContentDescription(g2.p(41));
            if (g2.s(44)) {
                setEndIconTintList(jx.b(context2, g2, 44));
            }
            if (g2.s(45)) {
                setEndIconTintMode(o.h(g2.k(45, -1), null));
            }
        }
        if (!g2.s(43)) {
            if (g2.s(24)) {
                setEndIconTintList(jx.b(context2, g2, 24));
            }
            if (g2.s(25)) {
                setEndIconTintMode(o.h(g2.k(25, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.E = appCompatTextView;
        appCompatTextView.setId(C0707R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        q4.K(appCompatTextView, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.G = appCompatTextView2;
        appCompatTextView2.setId(C0707R.id.textinput_suffix_text);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        q4.K(appCompatTextView2, 1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(a4);
        setHelperText(p3);
        setHelperTextTextAppearance(n3);
        setErrorEnabled(a3);
        setErrorTextAppearance(n2);
        setErrorContentDescription(p2);
        setCounterTextAppearance(this.v);
        setCounterOverflowTextAppearance(this.u);
        setPlaceholderText(p4);
        setPlaceholderTextAppearance(n4);
        setPrefixText(p5);
        setPrefixTextAppearance(n5);
        setSuffixText(p6);
        setSuffixTextAppearance(n6);
        if (g2.s(32)) {
            setErrorTextColor(g2.c(32));
        }
        if (g2.s(36)) {
            setHelperTextColor(g2.c(36));
        }
        if (g2.s(40)) {
            setHintTextColor(g2.c(40));
        }
        if (g2.s(19)) {
            setCounterTextColor(g2.c(19));
        }
        if (g2.s(17)) {
            setCounterOverflowTextColor(g2.c(17));
        }
        if (g2.s(48)) {
            setPlaceholderTextColor(g2.c(48));
        }
        if (g2.s(51)) {
            setPrefixTextColor(g2.c(51));
        }
        if (g2.s(61)) {
            setSuffixTextColor(g2.c(61));
        }
        setCounterEnabled(a5);
        setEnabled(g2.a(0, true));
        g2.w();
        q4.O(this, 2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.n0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.n0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.y0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.p.q());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.c0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.c0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.n0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.n0.setImageDrawable(drawable);
    }
}

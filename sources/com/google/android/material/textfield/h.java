package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.C0707R;
import defpackage.dy;

/* access modifiers changed from: package-private */
public class h extends m {
    private static final boolean q = (Build.VERSION.SDK_INT >= 21);
    private final TextWatcher d = new a();
    private final View.OnFocusChangeListener e = new b();
    private final TextInputLayout.e f = new c(this.a);
    private final TextInputLayout.f g = new d();
    private final TextInputLayout.g h = new e();
    private boolean i = false;
    private boolean j = false;
    private long k = Long.MAX_VALUE;
    private StateListDrawable l;
    private yx m;
    private AccessibilityManager n;
    private ValueAnimator o;
    private ValueAnimator p;

    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.h$a$a  reason: collision with other inner class name */
        class RunnableC0113a implements Runnable {
            final /* synthetic */ AutoCompleteTextView a;

            RunnableC0113a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.a.isPopupShowing();
                h.f(h.this, isPopupShowing);
                h.this.i = isPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            h hVar = h.this;
            AutoCompleteTextView e = h.e(hVar, hVar.a.getEditText());
            e.post(new RunnableC0113a(e));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            h.this.a.setEndIconActivated(z);
            if (!z) {
                h.f(h.this, false);
                h.this.i = false;
            }
        }
    }

    class c extends TextInputLayout.e {
        c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            if (h.this.a.getEditText().getKeyListener() == null) {
                d5Var.R(Spinner.class.getName());
            }
            if (d5Var.C()) {
                d5Var.c0(null);
            }
        }

        @Override // defpackage.z3
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            h hVar = h.this;
            AutoCompleteTextView e = h.e(hVar, hVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && h.this.n.isTouchExplorationEnabled()) {
                h.o(h.this, e);
            }
        }
    }

    class d implements TextInputLayout.f {
        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e = h.e(h.this, textInputLayout.getEditText());
            h.p(h.this, e);
            h.q(h.this, e);
            h.r(h.this, e);
            e.setThreshold(0);
            e.removeTextChangedListener(h.this.d);
            e.addTextChangedListener(h.this.d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(h.this.f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class e implements TextInputLayout.g {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.removeTextChangedListener(h.this.d);
                if (autoCompleteTextView.getOnFocusChangeListener() == h.this.e) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (h.q) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.o(h.this, (AutoCompleteTextView) h.this.a.getEditText());
        }
    }

    h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    static AutoCompleteTextView e(h hVar, EditText editText) {
        hVar.getClass();
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    static void f(h hVar, boolean z) {
        if (hVar.j != z) {
            hVar.j = z;
            hVar.p.cancel();
            hVar.o.start();
        }
    }

    static void o(h hVar, AutoCompleteTextView autoCompleteTextView) {
        hVar.getClass();
        if (autoCompleteTextView != null) {
            if (hVar.v()) {
                hVar.i = false;
            }
            if (!hVar.i) {
                if (q) {
                    boolean z = hVar.j;
                    boolean z2 = !z;
                    if (z != z2) {
                        hVar.j = z2;
                        hVar.p.cancel();
                        hVar.o.start();
                    }
                } else {
                    hVar.j = !hVar.j;
                    hVar.c.toggle();
                }
                if (hVar.j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            hVar.i = false;
        }
    }

    static void p(h hVar, AutoCompleteTextView autoCompleteTextView) {
        hVar.getClass();
        if (q) {
            int boxBackgroundMode = hVar.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(hVar.m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(hVar.l);
            }
        }
    }

    static void q(h hVar, AutoCompleteTextView autoCompleteTextView) {
        LayerDrawable layerDrawable;
        hVar.getClass();
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = hVar.a.getBoxBackgroundMode();
            yx boxBackground = hVar.a.getBoxBackground();
            int m2 = rw.m(autoCompleteTextView, C0707R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                int m3 = rw.m(autoCompleteTextView, C0707R.attr.colorSurface);
                yx yxVar = new yx(boxBackground.w());
                int o2 = rw.o(m2, m3, 0.1f);
                yxVar.H(new ColorStateList(iArr, new int[]{o2, 0}));
                if (q) {
                    yxVar.setTint(m3);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{o2, m3});
                    yx yxVar2 = new yx(boxBackground.w());
                    yxVar2.setTint(-1);
                    layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, yxVar, yxVar2), boxBackground});
                } else {
                    layerDrawable = new LayerDrawable(new Drawable[]{yxVar, boxBackground});
                }
                int i2 = q4.g;
                int i3 = Build.VERSION.SDK_INT;
                autoCompleteTextView.setBackground(layerDrawable);
            } else if (boxBackgroundMode == 1) {
                int boxBackgroundColor = hVar.a.getBoxBackgroundColor();
                int[] iArr2 = {rw.o(m2, boxBackgroundColor, 0.1f), boxBackgroundColor};
                if (q) {
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                    int i4 = q4.g;
                    int i5 = Build.VERSION.SDK_INT;
                    autoCompleteTextView.setBackground(rippleDrawable);
                    return;
                }
                yx yxVar3 = new yx(boxBackground.w());
                yxVar3.H(new ColorStateList(iArr, iArr2));
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, yxVar3});
                int r = q4.r(autoCompleteTextView);
                int paddingTop = autoCompleteTextView.getPaddingTop();
                int q2 = q4.q(autoCompleteTextView);
                int paddingBottom = autoCompleteTextView.getPaddingBottom();
                int i6 = Build.VERSION.SDK_INT;
                autoCompleteTextView.setBackground(layerDrawable2);
                q4.Q(autoCompleteTextView, r, paddingTop, q2, paddingBottom);
            }
        }
    }

    static void r(h hVar, AutoCompleteTextView autoCompleteTextView) {
        hVar.getClass();
        autoCompleteTextView.setOnTouchListener(new j(hVar, autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(hVar.e);
        if (q) {
            autoCompleteTextView.setOnDismissListener(new k(hVar));
        }
    }

    private yx u(float f2, float f3, float f4, int i2) {
        dy.b bVar = new dy.b();
        bVar.z(f2);
        bVar.C(f2);
        bVar.s(f3);
        bVar.v(f3);
        dy m2 = bVar.m();
        yx j2 = yx.j(this.b, f4);
        j2.setShapeAppearanceModel(m2);
        j2.J(0, i2, 0, i2);
        return j2;
    }

    /* access modifiers changed from: private */
    public boolean v() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.m
    public void a() {
        float dimensionPixelOffset = (float) this.b.getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.b.getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        yx u = u(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        yx u2 = u(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = u;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, u);
        this.l.addState(new int[0], u2);
        this.a.setEndIconDrawable(i0.b(this.b, q ? C0707R.drawable.mtrl_dropdown_arrow : C0707R.drawable.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C0707R.string.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new f());
        this.a.e(this.g);
        this.a.f(this.h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = qw.a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new i(this));
        this.p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new i(this));
        this.o = ofFloat2;
        ofFloat2.addListener(new l(this));
        q4.O(this.c, 2);
        this.n = (AccessibilityManager) this.b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.m
    public boolean b(int i2) {
        return i2 != 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.m
    public boolean d() {
        return true;
    }
}

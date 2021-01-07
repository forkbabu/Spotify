package com.google.android.material.bottomsheet;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.music.C0707R;

public class c extends p {
    private BottomSheetBehavior<FrameLayout> c;
    private FrameLayout f;
    boolean n;
    boolean o;
    private boolean p;
    private boolean q;
    private BottomSheetBehavior.d r;

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            if (cVar.o && cVar.isShowing() && c.this.h()) {
                c.this.cancel();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends z3 {
        b() {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            if (c.this.o) {
                d5Var.a(1048576);
                d5Var.W(true);
                return;
            }
            d5Var.W(false);
        }

        @Override // defpackage.z3
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                c cVar = c.this;
                if (cVar.o) {
                    cVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.c$c  reason: collision with other inner class name */
    public class View$OnTouchListenerC0103c implements View.OnTouchListener {
        View$OnTouchListenerC0103c(c cVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class d extends BottomSheetBehavior.d {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void b(View view, int i) {
            if (i == 5) {
                c.this.cancel();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968750(0x7f0400ae, float:1.7546162E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2132083489(0x7f150321, float:1.9807122E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.o = r0
            r3.p = r0
            com.google.android.material.bottomsheet.c$d r4 = new com.google.android.material.bottomsheet.c$d
            r4.<init>()
            r3.r = r4
            r3.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.c.<init>(android.content.Context, int):void");
    }

    private FrameLayout d() {
        if (this.f == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0707R.layout.design_bottom_sheet_dialog, null);
            this.f = frameLayout;
            BottomSheetBehavior<FrameLayout> o2 = BottomSheetBehavior.o((FrameLayout) frameLayout.findViewById(C0707R.id.design_bottom_sheet));
            this.c = o2;
            o2.i(this.r);
            this.c.u(this.o);
        }
        return this.f;
    }

    private View i(int i, View view, ViewGroup.LayoutParams layoutParams) {
        d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f.findViewById(C0707R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f.findViewById(C0707R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0707R.id.touch_outside).setOnClickListener(new a());
        q4.I(frameLayout, new b());
        frameLayout.setOnTouchListener(new View$OnTouchListenerC0103c(this));
        return this.f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> e = e();
        if (!this.n || e.y == 5) {
            super.cancel();
        } else {
            e.x(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> e() {
        if (this.c == null) {
            d();
        }
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.c.r(this.r);
    }

    public void g(boolean z) {
        this.n = z;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        if (!this.q) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.p = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.q = true;
        }
        return this.p;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.c;
        if (bottomSheetBehavior != null && bottomSheetBehavior.y == 5) {
            bottomSheetBehavior.x(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.o != z) {
            this.o = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.u(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.o) {
            this.o = true;
        }
        this.p = z;
        this.q = true;
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(i(i, null, null));
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(i(0, view, null));
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(0, view, layoutParams));
    }
}

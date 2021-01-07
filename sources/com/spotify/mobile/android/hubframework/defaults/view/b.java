package com.spotify.mobile.android.hubframework.defaults.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public final class b {
    private final s61 a;
    private w61<?> b;
    private w61<?> c;
    private LinearLayout d;

    b(w51 w51) {
        this.a = new s61(w51);
    }

    private w61<?> a(w61<?> w61, ViewGroup viewGroup, s81 s81, s81 s812) {
        w61<?> a2 = this.a.a(w61, s812, viewGroup, s81.children().indexOf(s812));
        if (a2.e().getParent() != viewGroup) {
            bd0.i(a2.e());
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public View b(s81 s81, ViewGroup viewGroup) {
        List<? extends s81> list;
        if (s81 != null) {
            list = s81.childGroup("primary_buttons");
        } else {
            list = Collections.emptyList();
        }
        if (s81 == null || list.isEmpty()) {
            LinearLayout linearLayout = this.d;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                this.d = null;
            }
            w61<?> w61 = this.b;
            if (w61 != null) {
                this.a.c(w61);
                this.b = null;
            }
            w61<?> w612 = this.c;
            if (w612 != null) {
                this.a.c(w612);
                this.c = null;
            }
            return null;
        } else if (list.size() == 1) {
            LinearLayout linearLayout2 = this.d;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
                this.d = null;
            }
            w61<?> w613 = this.c;
            if (w613 != null) {
                this.a.c(w613);
                this.c = null;
            }
            w61<?> a2 = a(this.b, viewGroup, s81, (s81) list.get(0));
            this.b = a2;
            return a2.e();
        } else {
            Context context = viewGroup.getContext();
            s81 s812 = (s81) list.get(0);
            s81 s813 = (s81) list.get(1);
            LinearLayout linearLayout3 = this.d;
            if (linearLayout3 == null) {
                linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.d = linearLayout3;
            }
            int g = nud.g(8.0f, context.getResources());
            w61<?> a3 = a(this.b, linearLayout3, s81, s812);
            this.b = a3;
            View e = a3.e();
            int i = g * 2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = g;
            View childAt = linearLayout3.getChildAt(0);
            if (childAt != e) {
                if (childAt != null) {
                    linearLayout3.removeView(childAt);
                }
                linearLayout3.addView(e, 0, layoutParams);
            }
            w61<?> a4 = a(this.c, linearLayout3, s81, s813);
            this.c = a4;
            View e2 = a4.e();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            layoutParams2.leftMargin = g;
            layoutParams2.rightMargin = i;
            View childAt2 = linearLayout3.getChildAt(1);
            if (childAt2 != e2) {
                if (childAt2 != null) {
                    linearLayout3.removeView(childAt2);
                }
                linearLayout3.addView(e2, 1, layoutParams2);
            }
            return linearLayout3;
        }
    }
}

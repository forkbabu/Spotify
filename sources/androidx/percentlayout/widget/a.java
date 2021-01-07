package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

@Deprecated
public class a {
    private final ViewGroup a;

    @Deprecated
    /* renamed from: androidx.percentlayout.widget.a$a  reason: collision with other inner class name */
    public static class C0042a {
        public float a = -1.0f;
        public float b = -1.0f;
        public float c = -1.0f;
        public float d = -1.0f;
        public float e = -1.0f;
        public float f = -1.0f;
        public float g = -1.0f;
        public float h = -1.0f;
        public float i;
        final c j = new c(0, 0);

        public void a(ViewGroup.LayoutParams layoutParams, int i2, int i3) {
            c cVar = this.j;
            int i4 = layoutParams.width;
            ((ViewGroup.MarginLayoutParams) cVar).width = i4;
            int i5 = layoutParams.height;
            ((ViewGroup.MarginLayoutParams) cVar).height = i5;
            boolean z = false;
            boolean z2 = (cVar.b || i4 == 0) && this.a < 0.0f;
            if ((cVar.a || i5 == 0) && this.b < 0.0f) {
                z = true;
            }
            float f2 = this.a;
            if (f2 >= 0.0f) {
                layoutParams.width = Math.round(((float) i2) * f2);
            }
            float f3 = this.b;
            if (f3 >= 0.0f) {
                layoutParams.height = Math.round(((float) i3) * f3);
            }
            float f4 = this.i;
            if (f4 >= 0.0f) {
                if (z2) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * f4);
                    this.j.b = true;
                }
                if (z) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.i);
                    this.j.a = true;
                }
            }
        }

        public void b(ViewGroup.LayoutParams layoutParams) {
            c cVar = this.j;
            if (!cVar.b) {
                layoutParams.width = ((ViewGroup.MarginLayoutParams) cVar).width;
            }
            if (!cVar.a) {
                layoutParams.height = ((ViewGroup.MarginLayoutParams) cVar).height;
            }
            cVar.b = false;
            cVar.a = false;
        }

        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
        }
    }

    @Deprecated
    public interface b {
        C0042a a();
    }

    /* access modifiers changed from: package-private */
    public static class c extends ViewGroup.MarginLayoutParams {
        boolean a;
        boolean b;

        public c(int i, int i2) {
            super(i, i2);
        }
    }

    public a(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static C0042a b(Context context, AttributeSet attributeSet) {
        C0042a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.a);
        float fraction = obtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new C0042a();
            aVar.a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.c = fraction3;
            aVar.d = fraction3;
            aVar.e = fraction3;
            aVar.f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new C0042a();
            }
            aVar.i = fraction10;
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void a(int i, int i2) {
        C0042a a2;
        boolean z;
        int size = (View.MeasureSpec.getSize(i) - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - this.a.getPaddingTop()) - this.a.getPaddingBottom();
        int childCount = this.a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    a2.a(marginLayoutParams, size, size2);
                    c cVar = a2.j;
                    ((ViewGroup.MarginLayoutParams) cVar).leftMargin = marginLayoutParams.leftMargin;
                    ((ViewGroup.MarginLayoutParams) cVar).topMargin = marginLayoutParams.topMargin;
                    ((ViewGroup.MarginLayoutParams) cVar).rightMargin = marginLayoutParams.rightMargin;
                    ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = marginLayoutParams.bottomMargin;
                    e2.t(cVar, e2.k(marginLayoutParams));
                    e2.s(a2.j, e2.j(marginLayoutParams));
                    float f = a2.c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(((float) size) * f);
                    }
                    float f2 = a2.d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(((float) size2) * f2);
                    }
                    float f3 = a2.e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(((float) size) * f3);
                    }
                    float f4 = a2.f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(((float) size2) * f4);
                    }
                    float f5 = a2.g;
                    boolean z2 = true;
                    if (f5 >= 0.0f) {
                        e2.t(marginLayoutParams, Math.round(((float) size) * f5));
                        z = true;
                    } else {
                        z = false;
                    }
                    float f6 = a2.h;
                    if (f6 >= 0.0f) {
                        e2.s(marginLayoutParams, Math.round(((float) size) * f6));
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        int o = q4.o(childAt);
                        if (Build.VERSION.SDK_INT >= 17) {
                            marginLayoutParams.resolveLayoutDirection(o);
                        }
                    }
                } else {
                    a2.a(layoutParams, size, size2);
                }
            }
        }
    }

    public boolean c() {
        C0042a a2;
        int childCount = this.a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if ((childAt.getMeasuredWidthAndState() & -16777216) == 16777216 && a2.a >= 0.0f && ((ViewGroup.MarginLayoutParams) a2.j).width == -2) {
                    layoutParams.width = -2;
                    z = true;
                }
                if ((childAt.getMeasuredHeightAndState() & -16777216) == 16777216 && a2.b >= 0.0f && ((ViewGroup.MarginLayoutParams) a2.j).height == -2) {
                    layoutParams.height = -2;
                    z = true;
                }
            }
        }
        return z;
    }

    public void d() {
        C0042a a2;
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = this.a.getChildAt(i).getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    a2.b(marginLayoutParams);
                    c cVar = a2.j;
                    marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                    marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                    marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                    e2.t(marginLayoutParams, e2.k(cVar));
                    e2.s(marginLayoutParams, e2.j(a2.j));
                } else {
                    a2.b(layoutParams);
                }
            }
        }
    }
}

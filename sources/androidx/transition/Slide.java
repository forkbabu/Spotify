package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    private static final TimeInterpolator R = new DecelerateInterpolator();
    private static final TimeInterpolator S = new AccelerateInterpolator();
    private static final g T = new a();
    private static final g U = new b();
    private static final g V = new c();
    private static final g W = new d();
    private static final g X = new e();
    private static final g Y = new f();
    private g Q = Y;

    static class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    static class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (q4.o(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    static class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    static class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    static class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (q4.o(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    static class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* access modifiers changed from: private */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    private static abstract class h implements g {
        h(a aVar) {
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    private static abstract class i implements g {
        i(a aVar) {
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        l0(80);
    }

    @Override // androidx.transition.Visibility
    public Animator g0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        int[] iArr = (int[]) xVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return a.c(view, xVar2, iArr[0], iArr[1], this.Q.b(viewGroup, view), this.Q.a(viewGroup, view), translationX, translationY, R, this);
    }

    @Override // androidx.transition.Visibility
    public Animator i0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        int[] iArr = (int[]) xVar.a.get("android:slide:screenPosition");
        return a.c(view, xVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.Q.b(viewGroup, view), this.Q.a(viewGroup, view), S, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(x xVar) {
        super.j(xVar);
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:slide:screenPosition", iArr);
    }

    public void l0(int i2) {
        if (i2 == 3) {
            this.Q = T;
        } else if (i2 == 5) {
            this.Q = W;
        } else if (i2 == 48) {
            this.Q = V;
        } else if (i2 == 80) {
            this.Q = Y;
        } else if (i2 == 8388611) {
            this.Q = U;
        } else if (i2 == 8388613) {
            this.Q = X;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        o oVar = new o();
        oVar.g(i2);
        this.I = oVar;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void n(x xVar) {
        super.n(xVar);
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:slide:screenPosition", iArr);
    }

    public Slide(int i2) {
        l0(i2);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.g);
        int k = i2.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        l0(k);
    }
}

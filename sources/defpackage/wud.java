package defpackage;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
/* renamed from: wud  reason: default package */
public class wud extends ValueAnimator {
    private final vud a;
    private final ValueAnimator.AnimatorUpdateListener b;

    /* renamed from: wud$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            wud.this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    wud(vud vud) {
        a aVar = new a();
        this.b = aVar;
        this.a = vud;
        addUpdateListener(aVar);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void start() {
        this.a.k();
        super.start();
    }
}

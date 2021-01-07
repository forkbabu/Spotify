package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: npc  reason: default package */
public class npc {
    private ValueAnimator a;

    /* access modifiers changed from: package-private */
    /* renamed from: npc$a */
    public class a extends opc {
        final /* synthetic */ kpc b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(npc npc, int i, float f, kpc kpc) {
            super(i, f);
            this.b = kpc;
        }
    }

    public void a(Drawable drawable) {
        c();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(drawable, "alpha", 0, BitmapRenderer.ALPHA_VISIBLE);
        this.a = ofInt;
        ofInt.setDuration(200L);
        this.a.start();
    }

    public void b(kpc kpc) {
        c();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = ofFloat;
        ofFloat.setDuration(800L);
        this.a.setInterpolator(ta0.f);
        this.a.setRepeatMode(2);
        this.a.addUpdateListener(new a(this, -11316397, 0.125f, kpc));
        this.a.setRepeatCount(-1);
        this.a.start();
    }

    public void c() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a.removeAllUpdateListeners();
        }
    }
}

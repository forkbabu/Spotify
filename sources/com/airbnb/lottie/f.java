package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.model.layer.Layer;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class f extends Drawable implements Drawable.Callback, Animatable {
    private boolean A;
    private boolean B;
    private boolean C;
    private final Matrix a = new Matrix();
    private d b;
    private final be c;
    private float f;
    private boolean n;
    private boolean o;
    private final ArrayList<o> p;
    private final ValueAnimator.AnimatorUpdateListener q;
    private ImageView.ScaleType r;
    private ac s;
    private String t;
    private b u;
    private zb v;
    private boolean w;
    private com.airbnb.lottie.model.layer.c x;
    private int y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public class a implements o {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.O(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements o {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.N(this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements o {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.H(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements o {
        final /* synthetic */ float a;

        d(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.T(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements o {
        final /* synthetic */ com.airbnb.lottie.model.d a;
        final /* synthetic */ Object b;
        final /* synthetic */ he c;

        e(com.airbnb.lottie.model.d dVar, Object obj, he heVar) {
            this.a = dVar;
            this.b = obj;
            this.c = heVar;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.d(this.a, this.b, this.c);
        }
    }

    /* renamed from: com.airbnb.lottie.f$f  reason: collision with other inner class name */
    class C0062f implements ValueAnimator.AnimatorUpdateListener {
        C0062f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (f.this.x != null) {
                f.this.x.t(f.this.c.k());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements o {
        g() {
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.B();
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements o {
        h() {
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.D();
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements o {
        final /* synthetic */ int a;

        i(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.P(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements o {
        final /* synthetic */ float a;

        j(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.R(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class k implements o {
        final /* synthetic */ int a;

        k(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.K(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class l implements o {
        final /* synthetic */ float a;

        l(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.M(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class m implements o {
        final /* synthetic */ String a;

        m(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.Q(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class n implements o {
        final /* synthetic */ String a;

        n(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(d dVar) {
            f.this.L(this.a);
        }
    }

    /* access modifiers changed from: private */
    public interface o {
        void a(d dVar);
    }

    public f() {
        be beVar = new be();
        this.c = beVar;
        this.f = 1.0f;
        this.n = true;
        this.o = false;
        new HashSet();
        this.p = new ArrayList<>();
        C0062f fVar = new C0062f();
        this.q = fVar;
        this.y = BitmapRenderer.ALPHA_VISIBLE;
        this.B = true;
        this.C = false;
        beVar.addUpdateListener(fVar);
    }

    private void b0() {
        d dVar = this.b;
        if (dVar != null) {
            float f2 = this.f;
            setBounds(0, 0, (int) (((float) dVar.b().width()) * f2), (int) (((float) this.b.b().height()) * f2));
        }
    }

    private void e() {
        d dVar = this.b;
        int i2 = hd.d;
        Rect b2 = dVar.b();
        this.x = new com.airbnb.lottie.model.layer.c(this, new Layer(Collections.emptyList(), dVar, "__container", -1, Layer.LayerType.PRE_COMP, -1, null, Collections.emptyList(), new mc(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false), this.b.j(), this.b);
    }

    private void h(Canvas canvas) {
        float f2;
        float f3;
        int i2 = -1;
        if (ImageView.ScaleType.FIT_XY == this.r) {
            if (this.x != null) {
                Rect bounds = getBounds();
                float width = ((float) bounds.width()) / ((float) this.b.b().width());
                float height = ((float) bounds.height()) / ((float) this.b.b().height());
                if (this.B) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f3 = 1.0f / min;
                        width /= f3;
                        height /= f3;
                    } else {
                        f3 = 1.0f;
                    }
                    if (f3 > 1.0f) {
                        i2 = canvas.save();
                        float width2 = ((float) bounds.width()) / 2.0f;
                        float height2 = ((float) bounds.height()) / 2.0f;
                        float f4 = width2 * min;
                        float f5 = min * height2;
                        canvas.translate(width2 - f4, height2 - f5);
                        canvas.scale(f3, f3, f4, f5);
                    }
                }
                this.a.reset();
                this.a.preScale(width, height);
                this.x.g(canvas, this.a, this.y);
                if (i2 > 0) {
                    canvas.restoreToCount(i2);
                }
            }
        } else if (this.x != null) {
            float f6 = this.f;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.b.b().width()), ((float) canvas.getHeight()) / ((float) this.b.b().height()));
            if (f6 > min2) {
                f2 = this.f / min2;
            } else {
                min2 = f6;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                i2 = canvas.save();
                float width3 = ((float) this.b.b().width()) / 2.0f;
                float height3 = ((float) this.b.b().height()) / 2.0f;
                float f7 = width3 * min2;
                float f8 = height3 * min2;
                float f9 = this.f;
                canvas.translate((width3 * f9) - f7, (f9 * height3) - f8);
                canvas.scale(f2, f2, f7, f8);
            }
            this.a.reset();
            this.a.preScale(min2, min2);
            this.x.g(canvas, this.a, this.y);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public void A() {
        this.p.clear();
        this.c.r();
    }

    public void B() {
        if (this.x == null) {
            this.p.add(new g());
            return;
        }
        if (this.n || t() == 0) {
            this.c.s();
        }
        if (!this.n) {
            H((int) (w() < 0.0f ? q() : p()));
            this.c.j();
        }
    }

    public void C() {
        this.c.removeAllListeners();
    }

    public void D() {
        if (this.x == null) {
            this.p.add(new h());
            return;
        }
        if (this.n || t() == 0) {
            this.c.v();
        }
        if (!this.n) {
            H((int) (w() < 0.0f ? q() : p()));
            this.c.j();
        }
    }

    public void E(boolean z2) {
        this.A = z2;
    }

    public boolean F(d dVar) {
        if (this.b == dVar) {
            return false;
        }
        this.C = false;
        g();
        this.b = dVar;
        e();
        this.c.w(dVar);
        T(this.c.getAnimatedFraction());
        this.f = this.f;
        b0();
        b0();
        Iterator it = new ArrayList(this.p).iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(dVar);
            it.remove();
        }
        this.p.clear();
        dVar.u(this.z);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void G(a aVar) {
        zb zbVar = this.v;
        if (zbVar != null) {
            zbVar.getClass();
        }
    }

    public void H(int i2) {
        if (this.b == null) {
            this.p.add(new c(i2));
        } else {
            this.c.x((float) i2);
        }
    }

    public void I(b bVar) {
        this.u = bVar;
        ac acVar = this.s;
        if (acVar != null) {
            acVar.d(bVar);
        }
    }

    public void J(String str) {
        this.t = str;
    }

    public void K(int i2) {
        if (this.b == null) {
            this.p.add(new k(i2));
        } else {
            this.c.y(((float) i2) + 0.99f);
        }
    }

    public void L(String str) {
        d dVar = this.b;
        if (dVar == null) {
            this.p.add(new n(str));
            return;
        }
        com.airbnb.lottie.model.g k2 = dVar.k(str);
        if (k2 != null) {
            K((int) (k2.b + k2.c));
            return;
        }
        throw new IllegalArgumentException(je.y0("Cannot find marker with name ", str, "."));
    }

    public void M(float f2) {
        d dVar = this.b;
        if (dVar == null) {
            this.p.add(new l(f2));
        } else {
            K((int) de.f(dVar.o(), this.b.f(), f2));
        }
    }

    public void N(int i2, int i3) {
        if (this.b == null) {
            this.p.add(new b(i2, i3));
        } else {
            this.c.z((float) i2, ((float) i3) + 0.99f);
        }
    }

    public void O(String str) {
        d dVar = this.b;
        if (dVar == null) {
            this.p.add(new a(str));
            return;
        }
        com.airbnb.lottie.model.g k2 = dVar.k(str);
        if (k2 != null) {
            int i2 = (int) k2.b;
            N(i2, ((int) k2.c) + i2);
            return;
        }
        throw new IllegalArgumentException(je.y0("Cannot find marker with name ", str, "."));
    }

    public void P(int i2) {
        if (this.b == null) {
            this.p.add(new i(i2));
        } else {
            this.c.A(i2);
        }
    }

    public void Q(String str) {
        d dVar = this.b;
        if (dVar == null) {
            this.p.add(new m(str));
            return;
        }
        com.airbnb.lottie.model.g k2 = dVar.k(str);
        if (k2 != null) {
            P((int) k2.b);
            return;
        }
        throw new IllegalArgumentException(je.y0("Cannot find marker with name ", str, "."));
    }

    public void R(float f2) {
        d dVar = this.b;
        if (dVar == null) {
            this.p.add(new j(f2));
        } else {
            P((int) de.f(dVar.o(), this.b.f(), f2));
        }
    }

    public void S(boolean z2) {
        this.z = z2;
        d dVar = this.b;
        if (dVar != null) {
            dVar.u(z2);
        }
    }

    public void T(float f2) {
        d dVar = this.b;
        if (dVar == null) {
            this.p.add(new d(f2));
            return;
        }
        this.c.x(de.f(dVar.o(), this.b.f(), f2));
        c.a("Drawable#setProgress");
    }

    public void U(int i2) {
        this.c.setRepeatCount(i2);
    }

    public void V(int i2) {
        this.c.setRepeatMode(i2);
    }

    public void W(boolean z2) {
        this.o = z2;
    }

    public void X(float f2) {
        this.f = f2;
        b0();
    }

    /* access modifiers changed from: package-private */
    public void Y(ImageView.ScaleType scaleType) {
        this.r = scaleType;
    }

    public void Z(float f2) {
        this.c.B(f2);
    }

    /* access modifiers changed from: package-private */
    public void a0(Boolean bool) {
        this.n = bool.booleanValue();
    }

    public void c(Animator.AnimatorListener animatorListener) {
        this.c.addListener(animatorListener);
    }

    public boolean c0() {
        return this.b.c().q() > 0;
    }

    public <T> void d(com.airbnb.lottie.model.d dVar, T t2, he<T> heVar) {
        List list;
        if (this.x == null) {
            this.p.add(new e(dVar, t2, heVar));
            return;
        }
        boolean z2 = true;
        if (dVar.d() != null) {
            dVar.d().c(t2, heVar);
        } else {
            if (this.x == null) {
                ae.c("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                this.x.d(dVar, 0, arrayList, new com.airbnb.lottie.model.d(new String[0]));
                list = arrayList;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((com.airbnb.lottie.model.d) list.get(i2)).d().c(t2, heVar);
            }
            z2 = true ^ list.isEmpty();
        }
        if (z2) {
            invalidateSelf();
            if (t2 == k.A) {
                T(s());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.C = false;
        if (this.o) {
            try {
                h(canvas);
            } catch (Throwable th) {
                ae.b("Lottie crashed in draw!", th);
            }
        } else {
            h(canvas);
        }
        c.a("Drawable#draw");
    }

    public void f() {
        this.p.clear();
        this.c.cancel();
    }

    public void g() {
        if (this.c.isRunning()) {
            this.c.cancel();
        }
        this.b = null;
        this.x = null;
        this.s = null;
        this.c.g();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        d dVar = this.b;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.b().height()) * this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        d dVar = this.b;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.b().width()) * this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i(boolean z2) {
        if (this.w != z2) {
            if (Build.VERSION.SDK_INT < 19) {
                ae.c("Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.w = z2;
            if (this.b != null) {
                e();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (!this.C) {
            this.C = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return y();
    }

    public boolean j() {
        return this.w;
    }

    public void k() {
        this.p.clear();
        this.c.j();
    }

    public d l() {
        return this.b;
    }

    public int m() {
        return (int) this.c.m();
    }

    public Bitmap n(String str) {
        ac acVar;
        if (getCallback() == null) {
            acVar = null;
        } else {
            ac acVar2 = this.s;
            if (acVar2 != null) {
                Drawable.Callback callback = getCallback();
                if (!acVar2.b((callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null)) {
                    this.s = null;
                }
            }
            if (this.s == null) {
                this.s = new ac(getCallback(), this.t, this.u, this.b.i());
            }
            acVar = this.s;
        }
        if (acVar != null) {
            return acVar.a(str);
        }
        return null;
    }

    public String o() {
        return this.t;
    }

    public float p() {
        return this.c.n();
    }

    public float q() {
        return this.c.o();
    }

    public o r() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.m();
        }
        return null;
    }

    public float s() {
        return this.c.k();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.y = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        ae.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        B();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.p.clear();
        this.c.j();
    }

    public int t() {
        return this.c.getRepeatCount();
    }

    public int u() {
        return this.c.getRepeatMode();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v() {
        return this.f;
    }

    public float w() {
        return this.c.p();
    }

    public Typeface x(String str, String str2) {
        zb zbVar;
        if (getCallback() == null) {
            zbVar = null;
        } else {
            if (this.v == null) {
                this.v = new zb(getCallback());
            }
            zbVar = this.v;
        }
        if (zbVar != null) {
            return zbVar.a(str, str2);
        }
        return null;
    }

    public boolean y() {
        be beVar = this.c;
        if (beVar == null) {
            return false;
        }
        return beVar.isRunning();
    }

    public boolean z() {
        return this.A;
    }
}

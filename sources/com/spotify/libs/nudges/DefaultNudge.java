package com.spotify.libs.nudges;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultNudge implements ov0 {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Runnable b = new b(this);
    private View c;
    private cmf<f> d;
    private nmf<? super ov0, f> e;
    private k f;
    private long g;
    private final l h;
    private final nmf<ov0, f> i;
    private nmf<? super ov0, f> j;
    private final int k;
    private final int l;

    static final class a implements View.OnClickListener {
        final /* synthetic */ DefaultNudge a;

        a(DefaultNudge defaultNudge, Rect rect, View view) {
            this.a = defaultNudge;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            nmf nmf = this.a.i;
            if (nmf != null) {
                f fVar = (f) nmf.invoke(this.a);
            }
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ DefaultNudge a;

        b(DefaultNudge defaultNudge) {
            this.a = defaultNudge;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nmf<? super ov0, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultNudge(l lVar, nmf<? super ov0, f> nmf, nmf<? super ov0, f> nmf2, int i2, int i3) {
        h.e(lVar, "popupFactory");
        this.h = lVar;
        this.i = nmf;
        this.j = nmf2;
        this.k = i2;
        this.l = i3;
    }

    /* access modifiers changed from: private */
    public final Rect g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    @Override // defpackage.ov0
    public void a(View view) {
        h.e(view, "anchorView");
        View view2 = this.c;
        if (!(view2 == null || view2.getParent() == null)) {
            View view3 = this.c;
            h.c(view3);
            ViewParent parent = view3.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.c);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        this.f = this.h.a(this.l);
        Rect g2 = g(view);
        k kVar = this.f;
        if (kVar != null) {
            kVar.c(this.c);
            View e2 = kVar.e();
            e2.setOnClickListener(new a(this, g2, view));
            kVar.a(new DefaultNudge$attachTo$$inlined$run$lambda$2(this, g2, view));
            kVar.d(new DefaultNudge$attachTo$$inlined$run$lambda$3(this, g2, view));
            Context context = e2.getContext();
            h.d(context, "container.context");
            int i2 = -(e2.getMeasuredHeight() + g2.height() + anf.b(context.getResources().getDimension(this.k)));
            int centerX = g2.centerX() - ((e2.getMeasuredWidth() / 2) + g2.left);
            long j2 = this.g;
            if (j2 > 0) {
                this.a.postDelayed(this.b, j2);
            }
            kVar.b(view, centerX, i2);
            nmf<? super ov0, f> nmf = this.e;
            if (nmf != null) {
                nmf.invoke(this);
            }
        }
    }

    @Override // defpackage.ov0
    public void b(cmf<f> cmf) {
        this.d = cmf;
    }

    @Override // defpackage.ov0
    public void c(nmf<? super ov0, f> nmf) {
        this.e = nmf;
    }

    @Override // defpackage.ov0
    public void dismiss() {
        k kVar = this.f;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.a.removeCallbacks(this.b);
        cmf<f> cmf = this.d;
        if (cmf != null) {
            cmf.invoke();
        }
    }

    public final void h(long j2) {
        this.g = j2;
    }

    public void i(View view) {
        h.e(view, "content");
        this.c = view;
    }
}

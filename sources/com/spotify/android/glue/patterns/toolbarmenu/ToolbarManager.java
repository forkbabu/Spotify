package com.spotify.android.glue.patterns.toolbarmenu;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.paste.app.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public class ToolbarManager implements u, m {
    private boolean a;
    private final i0 b;
    private final c c;
    private final Drawable f;
    private final Runnable n = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((v) ToolbarManager.this.b).c();
        }
    }

    @Deprecated
    public ToolbarManager(Activity activity, c cVar, View.OnClickListener onClickListener) {
        this.c = cVar;
        v vVar = new v(cVar, activity.getWindow(), onClickListener);
        this.b = vVar;
        vVar.e(false);
        Drawable a2 = d.a(activity);
        this.f = a2;
        View view = cVar.getView();
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        view.setBackground(a2);
        f();
        b(false);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.u
    public void a(float f2) {
        this.c.b0(ToolbarSide.START, f2);
        this.c.b0(ToolbarSide.END, f2);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.u
    public void b(boolean z) {
        this.c.getView().setVisibility(z ? 8 : 0);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.u
    public void c(float f2) {
        this.c.S1(f2);
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_DESTROY)
    public void cleanup() {
        ((v) this.b).f();
    }

    public c e() {
        return this.c;
    }

    public void f() {
        this.c.getView().removeCallbacks(this.n);
        View view = this.c.getView();
        Runnable runnable = this.n;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    public void g(boolean z) {
        ((v) this.b).e(z);
    }

    public void h(boolean z) {
        this.a = z;
        this.f.setAlpha(z ? 0 : BitmapRenderer.ALPHA_VISIBLE);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.u
    public void o(float f2) {
        this.c.o(f2);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.u
    public void setTitle(String str) {
        this.f.setAlpha(this.a ? 0 : BitmapRenderer.ALPHA_VISIBLE);
        c cVar = this.c;
        if (str == null) {
            str = "";
        }
        cVar.setTitle(str);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.u
    public void u(Drawable drawable) {
        this.c.u(drawable);
    }
}

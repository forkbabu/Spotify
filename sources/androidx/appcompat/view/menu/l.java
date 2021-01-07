package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import com.spotify.music.C0707R;

public class l {
    private final Context a;
    private final g b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g = 8388611;
    private boolean h;
    private m.a i;
    private k j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l = new a();

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.d();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.b = gVar;
        this.f = view;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    private void j(int i2, int i3, boolean z, boolean z2) {
        k b2 = b();
        b2.x(z2);
        if (z) {
            if ((e2.h(this.g, q4.o(this.f)) & 7) == 5) {
                i2 -= this.f.getWidth();
            }
            b2.v(i2);
            b2.y(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b2.s(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        b2.a();
    }

    public void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    public k b() {
        k kVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(C0707R.dimen.abc_cascading_menus_min_smallest_width)) {
                kVar = new d(this.a, this.f, this.d, this.e, this.c);
            } else {
                kVar = new q(this.a, this.b, this.f, this.d, this.e, this.c);
            }
            kVar.d(this.b);
            kVar.w(this.l);
            kVar.r(this.f);
            kVar.h(this.i);
            kVar.t(this.h);
            kVar.u(this.g);
            this.j = kVar;
        }
        return this.j;
    }

    public boolean c() {
        k kVar = this.j;
        return kVar != null && kVar.b();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e(View view) {
        this.f = view;
    }

    public void f(boolean z) {
        this.h = z;
        k kVar = this.j;
        if (kVar != null) {
            kVar.t(z);
        }
    }

    public void g(int i2) {
        this.g = i2;
    }

    public void h(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void i(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public boolean k() {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        j(0, 0, false, false);
        return true;
    }

    public boolean l(int i2, int i3) {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        j(i2, i3, true, true);
        return true;
    }
}

package com.spotify.android.glue.patterns.header.behavior;

import android.os.Build;
import android.view.View;
import android.widget.Scroller;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class d {
    private Runnable a;
    private Scroller b;
    private WeakReference<View> c;

    /* access modifiers changed from: private */
    public final class a implements Runnable {
        private final int a;
        private final int b;
        private final View c;
        private final b f;

        a(View view, int i, int i2, b bVar) {
            this.c = view;
            this.a = i;
            this.b = i2;
            this.f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c != null && d.this.b != null && d.this.b.computeScrollOffset()) {
                boolean z = false;
                int currY = d.this.b.getCurrY();
                int i = this.b;
                int i2 = 1;
                if (currY >= i) {
                    z = true;
                    i2 = -1;
                } else {
                    int currY2 = d.this.b.getCurrY();
                    i = this.a;
                    if (currY2 <= i) {
                        z = true;
                    } else {
                        i = d.this.b.getCurrY();
                    }
                }
                HeaderBehavior.a aVar = (HeaderBehavior.a) this.f;
                HeaderBehavior.this.u(aVar.a, aVar.b, i);
                if (!z) {
                    View view = this.c;
                    int i3 = q4.g;
                    int i4 = Build.VERSION.SDK_INT;
                    view.postOnAnimation(this);
                    return;
                }
                int abs = (int) (Math.abs(d.this.b.getCurrVelocity()) * ((float) i2));
                HeaderBehavior.a aVar2 = (HeaderBehavior.a) this.f;
                if (!HeaderBehavior.this.c(aVar2.a)) {
                    f.a(aVar2.a).a(abs);
                }
                d.this.b.abortAnimation();
            }
        }
    }

    public interface b {
    }

    d() {
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i, int i2, int i3, float f, b bVar) {
        c();
        if (this.b == null) {
            this.b = new Scroller(view.getContext(), b.a);
        }
        this.b.fling(0, i, 0, Math.round(f), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.b.computeScrollOffset()) {
            a aVar = new a(view, i2, i3, bVar);
            this.a = aVar;
            int i4 = q4.g;
            int i5 = Build.VERSION.SDK_INT;
            view.postOnAnimation(aVar);
            this.c = new WeakReference<>(view);
            return true;
        }
        this.a = null;
        return false;
    }

    public void c() {
        WeakReference<View> weakReference;
        View view;
        Scroller scroller = this.b;
        if (scroller != null) {
            scroller.forceFinished(true);
        }
        if (this.a != null && (weakReference = this.c) != null && (view = weakReference.get()) != null) {
            view.removeCallbacks(this.a);
        }
    }
}

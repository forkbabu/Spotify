package com.spotify.paste.widgets.internal;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;

public final class a {
    private final ViewGroup a;
    private View b;
    private boolean c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.paste.widgets.internal.a$a  reason: collision with other inner class name */
    public class RunnableC0363a implements Runnable {
        final /* synthetic */ View a;

        RunnableC0363a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.b != null) {
                Rect rect = new Rect();
                a.this.a.getHitRect(rect);
                int g = nud.g(24.0f, a.this.b.getResources());
                rect.top = 0;
                rect.left -= g;
                rect.bottom += g;
                rect.right += g;
                this.a.setTouchDelegate(new TouchDelegate(rect, a.this.b));
            }
        }
    }

    public a(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public ViewGroup c() {
        return this.a;
    }

    public View d() {
        return this.b;
    }

    public void e(boolean z) {
        this.c = z;
        this.a.setDuplicateParentStateEnabled(z);
        View view = this.b;
        if (view != null) {
            view.setDuplicateParentStateEnabled(z);
        }
    }

    public void f(View view) {
        View view2 = this.b;
        if (view2 != view) {
            if (view2 != null) {
                this.a.removeView(view2);
            }
            this.b = view;
            if (view == null) {
                this.a.setVisibility(8);
                return;
            }
            view.setDuplicateParentStateEnabled(this.c);
            this.a.addView(view);
            this.a.setVisibility(0);
            View view3 = (View) this.a.getParent();
            view3.post(new RunnableC0363a(view3));
        }
    }

    public void g() {
        View view = this.b;
        this.a.setVisibility(view != null ? view.getVisibility() : 8);
    }
}

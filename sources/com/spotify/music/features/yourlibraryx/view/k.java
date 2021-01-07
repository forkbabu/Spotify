package com.spotify.music.features.yourlibraryx.view;

import android.view.View;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class k {

    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;
        final /* synthetic */ nmf b;

        a(View view, nmf nmf) {
            this.a = view;
            this.b = nmf;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            View view2 = this.a;
            q4.P(view2, new l(this.b, view2));
            q4.F(view2);
            this.a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static final void a(View view, nmf<? super b5, f> nmf) {
        h.e(view, "view");
        h.e(nmf, "apply");
        if (q4.v(view)) {
            q4.P(view, new l(nmf, view));
            q4.F(view);
            return;
        }
        view.addOnAttachStateChangeListener(new a(view, nmf));
    }
}

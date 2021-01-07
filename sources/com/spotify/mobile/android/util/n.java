package com.spotify.mobile.android.util;

import android.view.View;
import android.view.animation.Animation;
import java.util.LinkedList;

public class n {
    LinkedList<b> a = new LinkedList<>();

    /* access modifiers changed from: package-private */
    public class a extends k62 {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b bVar = this.a;
            if (bVar.c) {
                bVar.a.setVisibility(8);
            }
            n.this.a.remove();
            if (n.this.a.size() >= 1) {
                n.this.c();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        View a;
        Animation b;
        boolean c;

        public b(View view, Animation animation, boolean z) {
            this.a = view;
            this.b = animation;
            this.c = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c() {
        b element = this.a.element();
        element.a.setVisibility(0);
        element.a.startAnimation(element.b);
        element.b.setAnimationListener(new a(element));
    }

    public void b(View view, Animation animation, boolean z) {
        this.a.add(new b(view, animation, z));
        if (this.a.size() == 1) {
            c();
        }
    }
}

package com.spotify.mobile.android.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.LinkedList;

public class o {
    LinkedList<b> a = new LinkedList<>();

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b.removeListener(this);
            b bVar = this.a;
            if (bVar.c) {
                bVar.a.setVisibility(8);
            }
            o.this.a.remove();
            if (o.this.a.size() >= 1) {
                o.this.c();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        View a;
        Animator b;
        boolean c;

        public b(View view, Animator animator, boolean z) {
            this.a = view;
            this.b = animator;
            this.c = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c() {
        b element = this.a.element();
        element.a.setVisibility(0);
        element.b.setTarget(element.a);
        element.b.cancel();
        element.b.start();
        element.b.addListener(new a(element));
    }

    public void b(View view, Animator animator, boolean z) {
        this.a.add(new b(view, animator, z));
        if (this.a.size() == 1) {
            c();
        }
    }
}

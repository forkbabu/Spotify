package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* access modifiers changed from: package-private */
public class a {
    private Animator a;

    a() {
    }

    public void a() {
        this.a = null;
    }

    public void b(Animator animator) {
        Animator animator2 = this.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.a = animator;
    }
}

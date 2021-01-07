package com.spotify.music.behindthelyrics.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class i {
    static final f a = new a();

    static class a extends f {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends AnimatorListenerAdapter {
        private final Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.run();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends f {
        private final ImageView a;
        private final f b;

        public c(ImageView imageView, f fVar) {
            this.a = imageView;
            this.b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends f {
        private final TextView a;
        private final CharSequence b;

        d(TextView textView, CharSequence charSequence) {
            this.a = textView;
            this.b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setText(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends f {
        private final Runnable[] a;

        e(Runnable... runnableArr) {
            this.a = runnableArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Runnable runnable : this.a) {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class f extends AnimatorListenerAdapter implements Runnable {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            run();
        }
    }
}

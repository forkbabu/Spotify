package com.spotify.music.features.wrapped2020.stories.templates;

import android.animation.Animator;
import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ex1;
import java.util.List;
import kotlin.jvm.internal.h;

public abstract class d implements hx1 {
    private mx1 a;
    private ix1 b;
    private Animator c;
    private final Activity d;
    private final jx1 e;
    private final int f;
    private final Uri g;
    private final String h;
    private final List<cmf<com.spotify.mobile.android.share.menu.preview.api.d>> i;

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Activity activity, jx1 jx1, int i2, Uri uri, String str, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list) {
        h.e(activity, "activity");
        h.e(jx1, "duration");
        h.e(str, "storyLoggingId");
        h.e(list, "storySharePayloads");
        this.d = activity;
        this.e = jx1;
        this.f = i2;
        this.g = uri;
        this.h = str;
        this.i = list;
    }

    @Override // defpackage.hx1
    public String a() {
        return this.h;
    }

    @Override // defpackage.hx1
    public List<cmf<com.spotify.mobile.android.share.menu.preview.api.d>> b() {
        return this.i;
    }

    @Override // defpackage.hx1
    public View c(mx1 mx1, ix1 ix1) {
        h.e(mx1, "storyPlayer");
        h.e(ix1, "storyContainerControl");
        this.a = mx1;
        this.b = ix1;
        View inflate = LayoutInflater.from(this.d).inflate(this.f, (ViewGroup) new FrameLayout(this.d), false);
        h.d(inflate, "view");
        i(inflate);
        this.c = h();
        return inflate;
    }

    @Override // defpackage.hx1
    public ex1 d() {
        return this.i.isEmpty() ? ex1.a.a : ex1.b.a;
    }

    @Override // defpackage.hx1
    public void dispose() {
        Animator animator = this.c;
        if (animator != null) {
            wz8.b(animator);
        }
        this.c = null;
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.hx1
    public jx1 e() {
        return this.e;
    }

    public final Activity f() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final ix1 g() {
        return this.b;
    }

    public Animator h() {
        return null;
    }

    public abstract void i(View view);

    public final void j(Uri uri) {
        mx1 mx1;
        if (uri != null && (mx1 = this.a) != null) {
            mx1.a(uri);
        }
    }

    @Override // defpackage.hx1
    public void pause() {
        Animator animator;
        if (Build.VERSION.SDK_INT >= 19 && (animator = this.c) != null) {
            animator.pause();
        }
    }

    @Override // defpackage.hx1
    public void resume() {
        Animator animator;
        if (Build.VERSION.SDK_INT >= 19 && (animator = this.c) != null) {
            animator.resume();
        }
    }

    @Override // defpackage.hx1
    public void start() {
        mx1 mx1;
        Animator animator = this.c;
        if (animator != null) {
            animator.start();
        }
        Uri uri = this.g;
        if (uri != null && (mx1 = this.a) != null) {
            mx1.a(uri);
        }
    }
}

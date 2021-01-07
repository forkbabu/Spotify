package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorQuadrantImageView;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: vz8  reason: default package */
public final class vz8 {
    private final View a;
    private final MirrorQuadrantImageView b;
    private final MirrorQuadrantImageView c;
    private final MirrorQuadrantImageView d;
    private final MirrorQuadrantImageView e;
    private final WrappedGradientView f;
    private final View g;
    private final TextView h;
    private final TextView i;
    private final TextView j;

    public vz8(View view, MirrorQuadrantImageView mirrorQuadrantImageView, MirrorQuadrantImageView mirrorQuadrantImageView2, MirrorQuadrantImageView mirrorQuadrantImageView3, MirrorQuadrantImageView mirrorQuadrantImageView4, WrappedGradientView wrappedGradientView, View view2, TextView textView, TextView textView2, TextView textView3) {
        h.e(view, "parentView");
        h.e(mirrorQuadrantImageView, "artistImageView1");
        h.e(mirrorQuadrantImageView2, "artistImageView2");
        h.e(mirrorQuadrantImageView3, "artistImageView3");
        h.e(mirrorQuadrantImageView4, "artistImageView4");
        h.e(wrappedGradientView, "gradient");
        h.e(view2, "rectangle");
        h.e(textView, "textViewTitle");
        h.e(textView2, "textViewTagline");
        h.e(textView3, "textViewPrompt");
        this.a = view;
        this.b = mirrorQuadrantImageView;
        this.c = mirrorQuadrantImageView2;
        this.d = mirrorQuadrantImageView3;
        this.e = mirrorQuadrantImageView4;
        this.f = wrappedGradientView;
        this.g = view2;
        this.h = textView;
        this.i = textView2;
        this.j = textView3;
    }

    public final MirrorQuadrantImageView a() {
        return this.b;
    }

    public final MirrorQuadrantImageView b() {
        return this.c;
    }

    public final MirrorQuadrantImageView c() {
        return this.d;
    }

    public final MirrorQuadrantImageView d() {
        return this.e;
    }

    public final WrappedGradientView e() {
        return this.f;
    }

    public final View f() {
        return this.a;
    }

    public final View g() {
        return this.g;
    }

    public final TextView h() {
        return this.j;
    }

    public final TextView i() {
        return this.i;
    }

    public final TextView j() {
        return this.h;
    }
}

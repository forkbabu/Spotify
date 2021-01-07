package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorQuadrantImageView;
import kotlin.jvm.internal.h;

/* renamed from: qz8  reason: default package */
final class qz8 {
    private final View a;
    private final WrappedGradientView b;
    private final MirrorQuadrantImageView c;
    private final MirrorQuadrantImageView d;
    private final MirrorQuadrantImageView e;
    private final MirrorQuadrantImageView f;
    private final WrappedGradientView g;
    private final View h;
    private final ImageView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;

    public qz8(View view, WrappedGradientView wrappedGradientView, MirrorQuadrantImageView mirrorQuadrantImageView, MirrorQuadrantImageView mirrorQuadrantImageView2, MirrorQuadrantImageView mirrorQuadrantImageView3, MirrorQuadrantImageView mirrorQuadrantImageView4, WrappedGradientView wrappedGradientView2, View view2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        h.e(view, "parentView");
        h.e(wrappedGradientView, "outerGradient");
        h.e(mirrorQuadrantImageView, "artistImageView1");
        h.e(mirrorQuadrantImageView2, "artistImageView2");
        h.e(mirrorQuadrantImageView3, "artistImageView3");
        h.e(mirrorQuadrantImageView4, "artistImageView4");
        h.e(wrappedGradientView2, "innerGradient");
        h.e(view2, "rectangle");
        h.e(imageView, "spotifyLogo");
        h.e(textView, "textViewTagline");
        h.e(textView2, "textViewTitle");
        h.e(textView3, "textViewLine1");
        h.e(textView4, "textViewLine2");
        this.a = view;
        this.b = wrappedGradientView;
        this.c = mirrorQuadrantImageView;
        this.d = mirrorQuadrantImageView2;
        this.e = mirrorQuadrantImageView3;
        this.f = mirrorQuadrantImageView4;
        this.g = wrappedGradientView2;
        this.h = view2;
        this.i = imageView;
        this.j = textView;
        this.k = textView2;
        this.l = textView3;
        this.m = textView4;
    }

    public final MirrorQuadrantImageView a() {
        return this.c;
    }

    public final MirrorQuadrantImageView b() {
        return this.d;
    }

    public final MirrorQuadrantImageView c() {
        return this.e;
    }

    public final MirrorQuadrantImageView d() {
        return this.f;
    }

    public final WrappedGradientView e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz8)) {
            return false;
        }
        qz8 qz8 = (qz8) obj;
        return h.a(this.a, qz8.a) && h.a(this.b, qz8.b) && h.a(this.c, qz8.c) && h.a(this.d, qz8.d) && h.a(this.e, qz8.e) && h.a(this.f, qz8.f) && h.a(this.g, qz8.g) && h.a(this.h, qz8.h) && h.a(this.i, qz8.i) && h.a(this.j, qz8.j) && h.a(this.k, qz8.k) && h.a(this.l, qz8.l) && h.a(this.m, qz8.m);
    }

    public final View f() {
        return this.a;
    }

    public final View g() {
        return this.h;
    }

    public final ImageView h() {
        return this.i;
    }

    public int hashCode() {
        View view = this.a;
        int i2 = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        WrappedGradientView wrappedGradientView = this.b;
        int hashCode2 = (hashCode + (wrappedGradientView != null ? wrappedGradientView.hashCode() : 0)) * 31;
        MirrorQuadrantImageView mirrorQuadrantImageView = this.c;
        int hashCode3 = (hashCode2 + (mirrorQuadrantImageView != null ? mirrorQuadrantImageView.hashCode() : 0)) * 31;
        MirrorQuadrantImageView mirrorQuadrantImageView2 = this.d;
        int hashCode4 = (hashCode3 + (mirrorQuadrantImageView2 != null ? mirrorQuadrantImageView2.hashCode() : 0)) * 31;
        MirrorQuadrantImageView mirrorQuadrantImageView3 = this.e;
        int hashCode5 = (hashCode4 + (mirrorQuadrantImageView3 != null ? mirrorQuadrantImageView3.hashCode() : 0)) * 31;
        MirrorQuadrantImageView mirrorQuadrantImageView4 = this.f;
        int hashCode6 = (hashCode5 + (mirrorQuadrantImageView4 != null ? mirrorQuadrantImageView4.hashCode() : 0)) * 31;
        WrappedGradientView wrappedGradientView2 = this.g;
        int hashCode7 = (hashCode6 + (wrappedGradientView2 != null ? wrappedGradientView2.hashCode() : 0)) * 31;
        View view2 = this.h;
        int hashCode8 = (hashCode7 + (view2 != null ? view2.hashCode() : 0)) * 31;
        ImageView imageView = this.i;
        int hashCode9 = (hashCode8 + (imageView != null ? imageView.hashCode() : 0)) * 31;
        TextView textView = this.j;
        int hashCode10 = (hashCode9 + (textView != null ? textView.hashCode() : 0)) * 31;
        TextView textView2 = this.k;
        int hashCode11 = (hashCode10 + (textView2 != null ? textView2.hashCode() : 0)) * 31;
        TextView textView3 = this.l;
        int hashCode12 = (hashCode11 + (textView3 != null ? textView3.hashCode() : 0)) * 31;
        TextView textView4 = this.m;
        if (textView4 != null) {
            i2 = textView4.hashCode();
        }
        return hashCode12 + i2;
    }

    public final TextView i() {
        return this.l;
    }

    public final TextView j() {
        return this.m;
    }

    public final TextView k() {
        return this.j;
    }

    public final TextView l() {
        return this.k;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Views(parentView=");
        V0.append(this.a);
        V0.append(", outerGradient=");
        V0.append(this.b);
        V0.append(", artistImageView1=");
        V0.append(this.c);
        V0.append(", artistImageView2=");
        V0.append(this.d);
        V0.append(", artistImageView3=");
        V0.append(this.e);
        V0.append(", artistImageView4=");
        V0.append(this.f);
        V0.append(", innerGradient=");
        V0.append(this.g);
        V0.append(", rectangle=");
        V0.append(this.h);
        V0.append(", spotifyLogo=");
        V0.append(this.i);
        V0.append(", textViewTagline=");
        V0.append(this.j);
        V0.append(", textViewTitle=");
        V0.append(this.k);
        V0.append(", textViewLine1=");
        V0.append(this.l);
        V0.append(", textViewLine2=");
        V0.append(this.m);
        V0.append(")");
        return V0.toString();
    }
}

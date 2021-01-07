package com.spotify.music.features.wrapped2020.stories.templates.storyofyoursong;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import kotlin.jvm.internal.h;

final class f {
    private final View a;
    private final TextView b;
    private final WrappedGradientView c;
    private final ImageView d;
    private final ImageView e;
    private final ImageView f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final StatisticView j;
    private final StatisticView k;
    private final StatisticView l;
    private final StatisticView m;

    public f(View view, TextView textView, WrappedGradientView wrappedGradientView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView2, TextView textView3, StatisticView statisticView, StatisticView statisticView2, StatisticView statisticView3, StatisticView statisticView4) {
        h.e(view, "background");
        h.e(textView, "intro");
        h.e(wrappedGradientView, "imageGradient");
        h.e(imageView, "mainImage");
        h.e(imageView2, "imageScaleA");
        h.e(imageView3, "imageScaleB");
        h.e(imageView4, "imageScaleC");
        h.e(textView2, AppProtocol.TrackData.TYPE_TRACK);
        h.e(textView3, "artist");
        h.e(statisticView, "statisticOne");
        h.e(statisticView2, "statisticTwo");
        h.e(statisticView3, "statisticThree");
        h.e(statisticView4, "statisticFour");
        this.a = view;
        this.b = textView;
        this.c = wrappedGradientView;
        this.d = imageView;
        this.e = imageView2;
        this.f = imageView3;
        this.g = imageView4;
        this.h = textView2;
        this.i = textView3;
        this.j = statisticView;
        this.k = statisticView2;
        this.l = statisticView3;
        this.m = statisticView4;
    }

    public final TextView a() {
        return this.i;
    }

    public final View b() {
        return this.a;
    }

    public final WrappedGradientView c() {
        return this.c;
    }

    public final ImageView d() {
        return this.e;
    }

    public final ImageView e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && h.a(this.b, fVar.b) && h.a(this.c, fVar.c) && h.a(this.d, fVar.d) && h.a(this.e, fVar.e) && h.a(this.f, fVar.f) && h.a(this.g, fVar.g) && h.a(this.h, fVar.h) && h.a(this.i, fVar.i) && h.a(this.j, fVar.j) && h.a(this.k, fVar.k) && h.a(this.l, fVar.l) && h.a(this.m, fVar.m);
    }

    public final ImageView f() {
        return this.g;
    }

    public final TextView g() {
        return this.b;
    }

    public final ImageView h() {
        return this.d;
    }

    public int hashCode() {
        View view = this.a;
        int i2 = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        TextView textView = this.b;
        int hashCode2 = (hashCode + (textView != null ? textView.hashCode() : 0)) * 31;
        WrappedGradientView wrappedGradientView = this.c;
        int hashCode3 = (hashCode2 + (wrappedGradientView != null ? wrappedGradientView.hashCode() : 0)) * 31;
        ImageView imageView = this.d;
        int hashCode4 = (hashCode3 + (imageView != null ? imageView.hashCode() : 0)) * 31;
        ImageView imageView2 = this.e;
        int hashCode5 = (hashCode4 + (imageView2 != null ? imageView2.hashCode() : 0)) * 31;
        ImageView imageView3 = this.f;
        int hashCode6 = (hashCode5 + (imageView3 != null ? imageView3.hashCode() : 0)) * 31;
        ImageView imageView4 = this.g;
        int hashCode7 = (hashCode6 + (imageView4 != null ? imageView4.hashCode() : 0)) * 31;
        TextView textView2 = this.h;
        int hashCode8 = (hashCode7 + (textView2 != null ? textView2.hashCode() : 0)) * 31;
        TextView textView3 = this.i;
        int hashCode9 = (hashCode8 + (textView3 != null ? textView3.hashCode() : 0)) * 31;
        StatisticView statisticView = this.j;
        int hashCode10 = (hashCode9 + (statisticView != null ? statisticView.hashCode() : 0)) * 31;
        StatisticView statisticView2 = this.k;
        int hashCode11 = (hashCode10 + (statisticView2 != null ? statisticView2.hashCode() : 0)) * 31;
        StatisticView statisticView3 = this.l;
        int hashCode12 = (hashCode11 + (statisticView3 != null ? statisticView3.hashCode() : 0)) * 31;
        StatisticView statisticView4 = this.m;
        if (statisticView4 != null) {
            i2 = statisticView4.hashCode();
        }
        return hashCode12 + i2;
    }

    public final StatisticView i() {
        return this.m;
    }

    public final StatisticView j() {
        return this.j;
    }

    public final StatisticView k() {
        return this.l;
    }

    public final StatisticView l() {
        return this.k;
    }

    public final TextView m() {
        return this.h;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Views(background=");
        V0.append(this.a);
        V0.append(", intro=");
        V0.append(this.b);
        V0.append(", imageGradient=");
        V0.append(this.c);
        V0.append(", mainImage=");
        V0.append(this.d);
        V0.append(", imageScaleA=");
        V0.append(this.e);
        V0.append(", imageScaleB=");
        V0.append(this.f);
        V0.append(", imageScaleC=");
        V0.append(this.g);
        V0.append(", track=");
        V0.append(this.h);
        V0.append(", artist=");
        V0.append(this.i);
        V0.append(", statisticOne=");
        V0.append(this.j);
        V0.append(", statisticTwo=");
        V0.append(this.k);
        V0.append(", statisticThree=");
        V0.append(this.l);
        V0.append(", statisticFour=");
        V0.append(this.m);
        V0.append(")");
        return V0.toString();
    }
}

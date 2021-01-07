package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class i {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final ChoiceViewWithGradient e;
    private final ChoiceViewWithGradient f;
    private final ChoiceViewWithGradient g;
    private final ChoiceViewWithGradient h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final WrappedGradientView l;
    private final ImageView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;

    public i(View view, TextView textView, TextView textView2, TextView textView3, ChoiceViewWithGradient choiceViewWithGradient, ChoiceViewWithGradient choiceViewWithGradient2, ChoiceViewWithGradient choiceViewWithGradient3, ChoiceViewWithGradient choiceViewWithGradient4, TextView textView4, TextView textView5, TextView textView6, WrappedGradientView wrappedGradientView, ImageView imageView, TextView textView7, TextView textView8, TextView textView9) {
        h.e(view, "background");
        h.e(textView, "introTitle");
        h.e(textView2, "introSubtitle");
        h.e(textView3, "prompt");
        h.e(choiceViewWithGradient, "choiceOne");
        h.e(choiceViewWithGradient2, "choiceTwo");
        h.e(choiceViewWithGradient3, "choiceThree");
        h.e(textView4, "responseText");
        h.e(textView5, "resultTitle");
        h.e(textView6, "resultAnswer");
        h.e(wrappedGradientView, "gradientBackground");
        h.e(imageView, "resultImage");
        h.e(textView7, "statistic");
        h.e(textView8, "sayThanksStatistic");
        h.e(textView9, "sayThanksButton");
        this.a = view;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = choiceViewWithGradient;
        this.f = choiceViewWithGradient2;
        this.g = choiceViewWithGradient3;
        this.h = choiceViewWithGradient4;
        this.i = textView4;
        this.j = textView5;
        this.k = textView6;
        this.l = wrappedGradientView;
        this.m = imageView;
        this.n = textView7;
        this.o = textView8;
        this.p = textView9;
    }

    public final View a() {
        return this.a;
    }

    public final List<ChoiceViewWithGradient> b() {
        ChoiceViewWithGradient choiceViewWithGradient = this.h;
        if (choiceViewWithGradient != null) {
            return d.u(this.e, this.f, this.g, choiceViewWithGradient);
        }
        return d.u(this.e, this.f, this.g);
    }

    public final WrappedGradientView c() {
        return this.l;
    }

    public final TextView d() {
        return this.c;
    }

    public final TextView e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.a(this.a, iVar.a) && h.a(this.b, iVar.b) && h.a(this.c, iVar.c) && h.a(this.d, iVar.d) && h.a(this.e, iVar.e) && h.a(this.f, iVar.f) && h.a(this.g, iVar.g) && h.a(this.h, iVar.h) && h.a(this.i, iVar.i) && h.a(this.j, iVar.j) && h.a(this.k, iVar.k) && h.a(this.l, iVar.l) && h.a(this.m, iVar.m) && h.a(this.n, iVar.n) && h.a(this.o, iVar.o) && h.a(this.p, iVar.p);
    }

    public final TextView f() {
        return this.d;
    }

    public final TextView g() {
        return this.i;
    }

    public final TextView h() {
        return this.k;
    }

    public int hashCode() {
        View view = this.a;
        int i2 = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        TextView textView = this.b;
        int hashCode2 = (hashCode + (textView != null ? textView.hashCode() : 0)) * 31;
        TextView textView2 = this.c;
        int hashCode3 = (hashCode2 + (textView2 != null ? textView2.hashCode() : 0)) * 31;
        TextView textView3 = this.d;
        int hashCode4 = (hashCode3 + (textView3 != null ? textView3.hashCode() : 0)) * 31;
        ChoiceViewWithGradient choiceViewWithGradient = this.e;
        int hashCode5 = (hashCode4 + (choiceViewWithGradient != null ? choiceViewWithGradient.hashCode() : 0)) * 31;
        ChoiceViewWithGradient choiceViewWithGradient2 = this.f;
        int hashCode6 = (hashCode5 + (choiceViewWithGradient2 != null ? choiceViewWithGradient2.hashCode() : 0)) * 31;
        ChoiceViewWithGradient choiceViewWithGradient3 = this.g;
        int hashCode7 = (hashCode6 + (choiceViewWithGradient3 != null ? choiceViewWithGradient3.hashCode() : 0)) * 31;
        ChoiceViewWithGradient choiceViewWithGradient4 = this.h;
        int hashCode8 = (hashCode7 + (choiceViewWithGradient4 != null ? choiceViewWithGradient4.hashCode() : 0)) * 31;
        TextView textView4 = this.i;
        int hashCode9 = (hashCode8 + (textView4 != null ? textView4.hashCode() : 0)) * 31;
        TextView textView5 = this.j;
        int hashCode10 = (hashCode9 + (textView5 != null ? textView5.hashCode() : 0)) * 31;
        TextView textView6 = this.k;
        int hashCode11 = (hashCode10 + (textView6 != null ? textView6.hashCode() : 0)) * 31;
        WrappedGradientView wrappedGradientView = this.l;
        int hashCode12 = (hashCode11 + (wrappedGradientView != null ? wrappedGradientView.hashCode() : 0)) * 31;
        ImageView imageView = this.m;
        int hashCode13 = (hashCode12 + (imageView != null ? imageView.hashCode() : 0)) * 31;
        TextView textView7 = this.n;
        int hashCode14 = (hashCode13 + (textView7 != null ? textView7.hashCode() : 0)) * 31;
        TextView textView8 = this.o;
        int hashCode15 = (hashCode14 + (textView8 != null ? textView8.hashCode() : 0)) * 31;
        TextView textView9 = this.p;
        if (textView9 != null) {
            i2 = textView9.hashCode();
        }
        return hashCode15 + i2;
    }

    public final ImageView i() {
        return this.m;
    }

    public final TextView j() {
        return this.j;
    }

    public final TextView k() {
        return this.p;
    }

    public final TextView l() {
        return this.o;
    }

    public final TextView m() {
        return this.n;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Views(background=");
        V0.append(this.a);
        V0.append(", introTitle=");
        V0.append(this.b);
        V0.append(", introSubtitle=");
        V0.append(this.c);
        V0.append(", prompt=");
        V0.append(this.d);
        V0.append(", choiceOne=");
        V0.append(this.e);
        V0.append(", choiceTwo=");
        V0.append(this.f);
        V0.append(", choiceThree=");
        V0.append(this.g);
        V0.append(", choiceFour=");
        V0.append(this.h);
        V0.append(", responseText=");
        V0.append(this.i);
        V0.append(", resultTitle=");
        V0.append(this.j);
        V0.append(", resultAnswer=");
        V0.append(this.k);
        V0.append(", gradientBackground=");
        V0.append(this.l);
        V0.append(", resultImage=");
        V0.append(this.m);
        V0.append(", statistic=");
        V0.append(this.n);
        V0.append(", sayThanksStatistic=");
        V0.append(this.o);
        V0.append(", sayThanksButton=");
        V0.append(this.p);
        V0.append(")");
        return V0.toString();
    }
}

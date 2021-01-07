package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import android.view.View;
import android.widget.TextView;

final class h {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final TopFiveRowView e;
    private final TopFiveRowView f;
    private final TopFiveRowView g;
    private final TopFiveRowView h;
    private final TopFiveRowView i;
    private final TextView j;

    public h(View view, TextView textView, TextView textView2, TextView textView3, TopFiveRowView topFiveRowView, TopFiveRowView topFiveRowView2, TopFiveRowView topFiveRowView3, TopFiveRowView topFiveRowView4, TopFiveRowView topFiveRowView5, TextView textView4) {
        kotlin.jvm.internal.h.e(view, "background");
        kotlin.jvm.internal.h.e(textView, "introTitle");
        kotlin.jvm.internal.h.e(textView2, "introSubtitle");
        kotlin.jvm.internal.h.e(textView3, "title");
        kotlin.jvm.internal.h.e(topFiveRowView, "rowOne");
        kotlin.jvm.internal.h.e(topFiveRowView2, "rowTwo");
        kotlin.jvm.internal.h.e(topFiveRowView3, "rowThree");
        kotlin.jvm.internal.h.e(topFiveRowView4, "rowFour");
        kotlin.jvm.internal.h.e(topFiveRowView5, "rowFive");
        kotlin.jvm.internal.h.e(textView4, "finalText");
        this.a = view;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = topFiveRowView;
        this.f = topFiveRowView2;
        this.g = topFiveRowView3;
        this.h = topFiveRowView4;
        this.i = topFiveRowView5;
        this.j = textView4;
    }

    public final View a() {
        return this.a;
    }

    public final TextView b() {
        return this.j;
    }

    public final TextView c() {
        return this.c;
    }

    public final TextView d() {
        return this.b;
    }

    public final TopFiveRowView e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.h.a(this.a, hVar.a) && kotlin.jvm.internal.h.a(this.b, hVar.b) && kotlin.jvm.internal.h.a(this.c, hVar.c) && kotlin.jvm.internal.h.a(this.d, hVar.d) && kotlin.jvm.internal.h.a(this.e, hVar.e) && kotlin.jvm.internal.h.a(this.f, hVar.f) && kotlin.jvm.internal.h.a(this.g, hVar.g) && kotlin.jvm.internal.h.a(this.h, hVar.h) && kotlin.jvm.internal.h.a(this.i, hVar.i) && kotlin.jvm.internal.h.a(this.j, hVar.j);
    }

    public final TopFiveRowView f() {
        return this.h;
    }

    public final TopFiveRowView g() {
        return this.e;
    }

    public final TopFiveRowView h() {
        return this.g;
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
        TopFiveRowView topFiveRowView = this.e;
        int hashCode5 = (hashCode4 + (topFiveRowView != null ? topFiveRowView.hashCode() : 0)) * 31;
        TopFiveRowView topFiveRowView2 = this.f;
        int hashCode6 = (hashCode5 + (topFiveRowView2 != null ? topFiveRowView2.hashCode() : 0)) * 31;
        TopFiveRowView topFiveRowView3 = this.g;
        int hashCode7 = (hashCode6 + (topFiveRowView3 != null ? topFiveRowView3.hashCode() : 0)) * 31;
        TopFiveRowView topFiveRowView4 = this.h;
        int hashCode8 = (hashCode7 + (topFiveRowView4 != null ? topFiveRowView4.hashCode() : 0)) * 31;
        TopFiveRowView topFiveRowView5 = this.i;
        int hashCode9 = (hashCode8 + (topFiveRowView5 != null ? topFiveRowView5.hashCode() : 0)) * 31;
        TextView textView4 = this.j;
        if (textView4 != null) {
            i2 = textView4.hashCode();
        }
        return hashCode9 + i2;
    }

    public final TopFiveRowView i() {
        return this.f;
    }

    public final TextView j() {
        return this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Views(background=");
        V0.append(this.a);
        V0.append(", introTitle=");
        V0.append(this.b);
        V0.append(", introSubtitle=");
        V0.append(this.c);
        V0.append(", title=");
        V0.append(this.d);
        V0.append(", rowOne=");
        V0.append(this.e);
        V0.append(", rowTwo=");
        V0.append(this.f);
        V0.append(", rowThree=");
        V0.append(this.g);
        V0.append(", rowFour=");
        V0.append(this.h);
        V0.append(", rowFive=");
        V0.append(this.i);
        V0.append(", finalText=");
        V0.append(this.j);
        V0.append(")");
        return V0.toString();
    }
}

package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.features.wrapped2020.stories.views.blobs.BlobView;
import com.spotify.music.features.wrapped2020.stories.views.diamond.DiamondView;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class g {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final DiamondView d;
    private final TextView e;
    private final TextView f;
    private final BlobView g;
    private final TextView h;
    private final TextView i;
    private final BlobView j;
    private final TextView k;
    private final TextView l;
    private final BlobView m;
    private final TextView n;
    private final TextView o;
    private final BlobView p;
    private final TextView q;
    private final TextView r;
    private final BlobView s;
    private final TextView t;
    private final TextView u;

    public g(View view, TextView textView, TextView textView2, DiamondView diamondView, TextView textView3, TextView textView4, BlobView blobView, TextView textView5, TextView textView6, BlobView blobView2, TextView textView7, TextView textView8, BlobView blobView3, TextView textView9, TextView textView10, BlobView blobView4, TextView textView11, TextView textView12, BlobView blobView5, TextView textView13, TextView textView14) {
        h.e(view, "background");
        h.e(textView, "introTitle");
        h.e(textView2, "introMessage");
        h.e(diamondView, "introDataBackground");
        h.e(textView3, "introData");
        h.e(textView4, "topFiveTitle");
        h.e(blobView, "blob1");
        h.e(textView5, "blob1TopLabel");
        h.e(textView6, "blob1BottomLabel");
        h.e(blobView2, "blob2");
        h.e(textView7, "blob2TopLabel");
        h.e(textView8, "blob2BottomLabel");
        h.e(blobView3, "blob3");
        h.e(textView9, "blob3TopLabel");
        h.e(textView10, "blob3BottomLabel");
        h.e(blobView4, "blob4");
        h.e(textView11, "blob4TopLabel");
        h.e(textView12, "blob4BottomLabel");
        h.e(blobView5, "blob5");
        h.e(textView13, "blob5TopLabel");
        h.e(textView14, "blob5BottomLabel");
        this.a = view;
        this.b = textView;
        this.c = textView2;
        this.d = diamondView;
        this.e = textView3;
        this.f = textView4;
        this.g = blobView;
        this.h = textView5;
        this.i = textView6;
        this.j = blobView2;
        this.k = textView7;
        this.l = textView8;
        this.m = blobView3;
        this.n = textView9;
        this.o = textView10;
        this.p = blobView4;
        this.q = textView11;
        this.r = textView12;
        this.s = blobView5;
        this.t = textView13;
        this.u = textView14;
    }

    public final View a() {
        return this.a;
    }

    public final BlobView b() {
        return this.g;
    }

    public final TextView c() {
        return this.i;
    }

    public final TextView d() {
        return this.h;
    }

    public final BlobView e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.a(this.a, gVar.a) && h.a(this.b, gVar.b) && h.a(this.c, gVar.c) && h.a(this.d, gVar.d) && h.a(this.e, gVar.e) && h.a(this.f, gVar.f) && h.a(this.g, gVar.g) && h.a(this.h, gVar.h) && h.a(this.i, gVar.i) && h.a(this.j, gVar.j) && h.a(this.k, gVar.k) && h.a(this.l, gVar.l) && h.a(this.m, gVar.m) && h.a(this.n, gVar.n) && h.a(this.o, gVar.o) && h.a(this.p, gVar.p) && h.a(this.q, gVar.q) && h.a(this.r, gVar.r) && h.a(this.s, gVar.s) && h.a(this.t, gVar.t) && h.a(this.u, gVar.u);
    }

    public final TextView f() {
        return this.l;
    }

    public final TextView g() {
        return this.k;
    }

    public final BlobView h() {
        return this.m;
    }

    public int hashCode() {
        View view = this.a;
        int i2 = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        TextView textView = this.b;
        int hashCode2 = (hashCode + (textView != null ? textView.hashCode() : 0)) * 31;
        TextView textView2 = this.c;
        int hashCode3 = (hashCode2 + (textView2 != null ? textView2.hashCode() : 0)) * 31;
        DiamondView diamondView = this.d;
        int hashCode4 = (hashCode3 + (diamondView != null ? diamondView.hashCode() : 0)) * 31;
        TextView textView3 = this.e;
        int hashCode5 = (hashCode4 + (textView3 != null ? textView3.hashCode() : 0)) * 31;
        TextView textView4 = this.f;
        int hashCode6 = (hashCode5 + (textView4 != null ? textView4.hashCode() : 0)) * 31;
        BlobView blobView = this.g;
        int hashCode7 = (hashCode6 + (blobView != null ? blobView.hashCode() : 0)) * 31;
        TextView textView5 = this.h;
        int hashCode8 = (hashCode7 + (textView5 != null ? textView5.hashCode() : 0)) * 31;
        TextView textView6 = this.i;
        int hashCode9 = (hashCode8 + (textView6 != null ? textView6.hashCode() : 0)) * 31;
        BlobView blobView2 = this.j;
        int hashCode10 = (hashCode9 + (blobView2 != null ? blobView2.hashCode() : 0)) * 31;
        TextView textView7 = this.k;
        int hashCode11 = (hashCode10 + (textView7 != null ? textView7.hashCode() : 0)) * 31;
        TextView textView8 = this.l;
        int hashCode12 = (hashCode11 + (textView8 != null ? textView8.hashCode() : 0)) * 31;
        BlobView blobView3 = this.m;
        int hashCode13 = (hashCode12 + (blobView3 != null ? blobView3.hashCode() : 0)) * 31;
        TextView textView9 = this.n;
        int hashCode14 = (hashCode13 + (textView9 != null ? textView9.hashCode() : 0)) * 31;
        TextView textView10 = this.o;
        int hashCode15 = (hashCode14 + (textView10 != null ? textView10.hashCode() : 0)) * 31;
        BlobView blobView4 = this.p;
        int hashCode16 = (hashCode15 + (blobView4 != null ? blobView4.hashCode() : 0)) * 31;
        TextView textView11 = this.q;
        int hashCode17 = (hashCode16 + (textView11 != null ? textView11.hashCode() : 0)) * 31;
        TextView textView12 = this.r;
        int hashCode18 = (hashCode17 + (textView12 != null ? textView12.hashCode() : 0)) * 31;
        BlobView blobView5 = this.s;
        int hashCode19 = (hashCode18 + (blobView5 != null ? blobView5.hashCode() : 0)) * 31;
        TextView textView13 = this.t;
        int hashCode20 = (hashCode19 + (textView13 != null ? textView13.hashCode() : 0)) * 31;
        TextView textView14 = this.u;
        if (textView14 != null) {
            i2 = textView14.hashCode();
        }
        return hashCode20 + i2;
    }

    public final TextView i() {
        return this.o;
    }

    public final TextView j() {
        return this.n;
    }

    public final BlobView k() {
        return this.p;
    }

    public final TextView l() {
        return this.r;
    }

    public final TextView m() {
        return this.q;
    }

    public final BlobView n() {
        return this.s;
    }

    public final TextView o() {
        return this.u;
    }

    public final TextView p() {
        return this.t;
    }

    public final TextView q() {
        return this.e;
    }

    public final DiamondView r() {
        return this.d;
    }

    public final TextView s() {
        return this.c;
    }

    public final TextView t() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Views(background=");
        V0.append(this.a);
        V0.append(", introTitle=");
        V0.append(this.b);
        V0.append(", introMessage=");
        V0.append(this.c);
        V0.append(", introDataBackground=");
        V0.append(this.d);
        V0.append(", introData=");
        V0.append(this.e);
        V0.append(", topFiveTitle=");
        V0.append(this.f);
        V0.append(", blob1=");
        V0.append(this.g);
        V0.append(", blob1TopLabel=");
        V0.append(this.h);
        V0.append(", blob1BottomLabel=");
        V0.append(this.i);
        V0.append(", blob2=");
        V0.append(this.j);
        V0.append(", blob2TopLabel=");
        V0.append(this.k);
        V0.append(", blob2BottomLabel=");
        V0.append(this.l);
        V0.append(", blob3=");
        V0.append(this.m);
        V0.append(", blob3TopLabel=");
        V0.append(this.n);
        V0.append(", blob3BottomLabel=");
        V0.append(this.o);
        V0.append(", blob4=");
        V0.append(this.p);
        V0.append(", blob4TopLabel=");
        V0.append(this.q);
        V0.append(", blob4BottomLabel=");
        V0.append(this.r);
        V0.append(", blob5=");
        V0.append(this.s);
        V0.append(", blob5TopLabel=");
        V0.append(this.t);
        V0.append(", blob5BottomLabel=");
        V0.append(this.u);
        V0.append(")");
        return V0.toString();
    }

    public final TextView u() {
        return this.f;
    }
}

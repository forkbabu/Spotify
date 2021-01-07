package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.a;
import com.spotify.music.marketingformats.constants.MarketingFormatsCustomKey;
import com.squareup.picasso.Picasso;
import defpackage.zib;
import kotlin.jvm.internal.h;

/* renamed from: jib  reason: default package */
public final class jib extends hib<s81> {
    private final ImageView I;
    private final TextView J;
    private final TextView K;
    private final TextView L;
    private final TextView M;
    private final ImageView N;
    private final CardView O;
    private String P;
    private final rhb Q;
    private final Picasso R;
    private final mhb S;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jib(android.view.ViewGroup r15, com.spotify.mobile.android.video.s r16, com.spotify.mobile.android.video.q r17, defpackage.sda r18, defpackage.rhb r19, com.squareup.picasso.Picasso r20, defpackage.mhb r21) {
        /*
            r14 = this;
            r9 = r14
            r0 = r15
            r10 = r19
            r11 = r20
            r12 = r21
            java.lang.String r1 = "parent"
            kotlin.jvm.internal.h.e(r15, r1)
            java.lang.String r1 = "betamaxPlayerBuilder"
            r4 = r16
            kotlin.jvm.internal.h.e(r4, r1)
            java.lang.String r1 = "videoCache"
            r5 = r17
            kotlin.jvm.internal.h.e(r5, r1)
            java.lang.String r1 = "dataSaverModeActiveUtils"
            r6 = r18
            kotlin.jvm.internal.h.e(r6, r1)
            java.lang.String r1 = "navigationActionHandler"
            kotlin.jvm.internal.h.e(r10, r1)
            java.lang.String r1 = "picasso"
            kotlin.jvm.internal.h.e(r11, r1)
            java.lang.String r1 = "logger"
            kotlin.jvm.internal.h.e(r12, r1)
            android.content.Context r1 = r15.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131624446(0x7f0e01fe, float:1.8876072E38)
            r3 = 0
            android.view.View r13 = r1.inflate(r2, r15, r3)
            java.lang.String r0 = "LayoutInflater.from(pare…ity_slide, parent, false)"
            kotlin.jvm.internal.h.d(r13, r0)
            com.spotify.music.marketingformats.constants.MarketingFormatsComponentId r0 = com.spotify.music.marketingformats.constants.MarketingFormatsComponentId.a
            java.lang.String r3 = r0.d()
            r2 = 2131431911(0x7f0b11e7, float:1.8485565E38)
            r7 = 0
            r8 = 64
            r0 = r14
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.Q = r10
            r9.R = r11
            r9.S = r12
            r0 = 2131427605(0x7f0b0115, float:1.847683E38)
            android.view.View r0 = defpackage.q4.G(r13, r0)
            java.lang.String r1 = "requireViewById(itemView, R.id.background)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.I = r0
            android.view.View r0 = r9.a
            r1 = 2131430196(0x7f0b0b34, float:1.8482086E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.label)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.J = r0
            android.view.View r0 = r9.a
            r1 = 2131431668(0x7f0b10f4, float:1.8485072E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.title)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.K = r0
            android.view.View r0 = r9.a
            r1 = 2131430435(0x7f0b0c23, float:1.848257E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.metadata)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.L = r0
            android.view.View r0 = r9.a
            r1 = 2131428152(0x7f0b0338, float:1.847794E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.description)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.M = r0
            android.view.View r0 = r9.a
            r1 = 2131428932(0x7f0b0644, float:1.8479522E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.icon)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.N = r0
            android.view.View r0 = r9.a
            r1 = 2131427832(0x7f0b01f8, float:1.8477291E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.card)"
            kotlin.jvm.internal.h.d(r0, r1)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r9.O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jib.<init>(android.view.ViewGroup, com.spotify.mobile.android.video.s, com.spotify.mobile.android.video.q, sda, rhb, com.squareup.picasso.Picasso, mhb):void");
    }

    public static final void w0(jib jib, String str) {
        mhb mhb = jib.S;
        String str2 = jib.P;
        if (str2 != null) {
            mhb.b(str2, "header-entity", jib.w(), str);
        } else {
            h.k("loggablePageUri");
            throw null;
        }
    }

    public final void B0(String str) {
        h.e(str, "pageUri");
        this.P = str;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(Object obj, int i) {
        String uri;
        s81 s81 = (s81) obj;
        h.e(s81, "data");
        View view = this.a;
        h.d(view, "itemView");
        Context context = view.getContext();
        zib.a aVar = zib.a;
        String a = aVar.a(s81);
        this.J.setTextColor(a.b(context, aVar.e(a)));
        this.K.setTextColor(a.b(context, aVar.h(a)));
        this.L.setTextColor(a.b(context, aVar.f(a)));
        this.M.setTextColor(a.b(context, aVar.g(a)));
        String b = aVar.b(s81);
        if (b != null) {
            this.R.m(b).n(this.I, null);
        }
        u0(aVar.c(s81));
        this.O.setCardBackgroundColor(Color.parseColor(s81.custom().string(MarketingFormatsCustomKey.KEY_ACCENT_COLOR.d())));
        w81 text = s81.text();
        this.K.setText(text.title());
        this.J.setText(text.accessory());
        this.L.setText(text.subtitle());
        this.M.setText(text.description());
        x81 main = s81.images().main();
        if (!(main == null || (uri = main.uri()) == null)) {
            this.R.m(uri).n(this.N, null);
        }
        h.e(s81, "data");
        String string = s81.metadata().string(MarketingFormatsCustomKey.KEY_URI.d());
        if (string != null) {
            this.O.setOnClickListener(new iib(string, this));
        }
    }
}

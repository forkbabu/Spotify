package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.squareup.picasso.Picasso;
import defpackage.zib;
import kotlin.jvm.internal.h;

/* renamed from: qib  reason: default package */
public final class qib extends hib<s81> {
    private final TextView I;
    private final TextView J;
    private final ImageView K;
    private final Picasso L;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qib(android.view.ViewGroup r13, com.spotify.mobile.android.video.s r14, com.spotify.mobile.android.video.q r15, defpackage.sda r16, com.squareup.picasso.Picasso r17) {
        /*
            r12 = this;
            r9 = r12
            r0 = r13
            r10 = r17
            java.lang.String r1 = "parent"
            kotlin.jvm.internal.h.e(r13, r1)
            java.lang.String r1 = "betamaxPlayerBuilder"
            r4 = r14
            kotlin.jvm.internal.h.e(r14, r1)
            java.lang.String r1 = "videoCache"
            r5 = r15
            kotlin.jvm.internal.h.e(r15, r1)
            java.lang.String r1 = "dataSaverModeActiveUtils"
            r6 = r16
            kotlin.jvm.internal.h.e(r6, r1)
            java.lang.String r1 = "picasso"
            kotlin.jvm.internal.h.e(r10, r1)
            android.content.Context r1 = r13.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131624452(0x7f0e0204, float:1.8876084E38)
            r3 = 0
            android.view.View r11 = r1.inflate(r2, r13, r3)
            java.lang.String r0 = "LayoutInflater.from(pare…nfo_slide, parent, false)"
            kotlin.jvm.internal.h.d(r11, r0)
            com.spotify.music.marketingformats.constants.MarketingFormatsComponentId r0 = com.spotify.music.marketingformats.constants.MarketingFormatsComponentId.c
            java.lang.String r3 = r0.d()
            r2 = 2131431911(0x7f0b11e7, float:1.8485565E38)
            r7 = 0
            r8 = 64
            r0 = r12
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.L = r10
            r0 = 2131431668(0x7f0b10f4, float:1.8485072E38)
            android.view.View r0 = defpackage.q4.G(r11, r0)
            java.lang.String r1 = "requireViewById(itemView, R.id.title)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.I = r0
            android.view.View r0 = r9.a
            r1 = 2131431559(0x7f0b1087, float:1.848485E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.subtitle)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.J = r0
            android.view.View r0 = r9.a
            r1 = 2131427605(0x7f0b0115, float:1.847683E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.background)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qib.<init>(android.view.ViewGroup, com.spotify.mobile.android.video.s, com.spotify.mobile.android.video.q, sda, com.squareup.picasso.Picasso):void");
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(Object obj, int i) {
        s81 s81 = (s81) obj;
        h.e(s81, "data");
        zib.a aVar = zib.a;
        String a = aVar.a(s81);
        View view = this.a;
        h.d(view, "itemView");
        Context context = view.getContext();
        this.I.setTextColor(a.b(context, aVar.h(a)));
        this.J.setTextColor(a.b(context, aVar.g(a)));
        w81 text = s81.text();
        this.I.setText(text.title());
        this.J.setText(text.subtitle());
        String b = aVar.b(s81);
        if (b != null) {
            this.L.m(b).n(this.K, null);
        }
        u0(aVar.c(s81));
    }
}

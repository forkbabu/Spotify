package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.music.marketingformats.constants.MarketingFormatsCustomKey;
import com.spotify.music.marketingformats.playbutton.PlayPauseImageButton;
import com.squareup.picasso.Picasso;
import defpackage.zib;
import kotlin.jvm.internal.h;

/* renamed from: nib  reason: default package */
public final class nib extends hib<s81> {
    private final TextView I;
    private final TextView J;
    private final ImageView K;
    private final PlayPauseImageButton L;
    private String M;
    private final Picasso N;
    private final thb O;
    private final dib P;
    private final mhb Q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nib(android.view.ViewGroup r16, com.spotify.mobile.android.video.s r17, com.spotify.mobile.android.video.q r18, defpackage.sda r19, com.squareup.picasso.Picasso r20, defpackage.thb r21, defpackage.dib r22, defpackage.mhb r23) {
        /*
            r15 = this;
            r9 = r15
            r0 = r16
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            java.lang.String r1 = "parent"
            kotlin.jvm.internal.h.e(r0, r1)
            java.lang.String r1 = "betamaxPlayerBuilder"
            r4 = r17
            kotlin.jvm.internal.h.e(r4, r1)
            java.lang.String r1 = "videoCache"
            r5 = r18
            kotlin.jvm.internal.h.e(r5, r1)
            java.lang.String r1 = "dataSaverModeActiveUtils"
            r6 = r19
            kotlin.jvm.internal.h.e(r6, r1)
            java.lang.String r1 = "picasso"
            kotlin.jvm.internal.h.e(r10, r1)
            java.lang.String r1 = "playbackActionHandler"
            kotlin.jvm.internal.h.e(r11, r1)
            java.lang.String r1 = "playerStateAwareViewManager"
            kotlin.jvm.internal.h.e(r12, r1)
            java.lang.String r1 = "logger"
            kotlin.jvm.internal.h.e(r13, r1)
            android.content.Context r1 = r16.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131624447(0x7f0e01ff, float:1.8876074E38)
            r3 = 0
            android.view.View r14 = r1.inflate(r2, r0, r3)
            java.lang.String r0 = "LayoutInflater.from(pare…rent,\n        false\n    )"
            kotlin.jvm.internal.h.d(r14, r0)
            com.spotify.music.marketingformats.constants.MarketingFormatsComponentId r0 = com.spotify.music.marketingformats.constants.MarketingFormatsComponentId.b
            java.lang.String r3 = r0.d()
            r2 = 2131431911(0x7f0b11e7, float:1.8485565E38)
            r7 = 0
            r8 = 64
            r0 = r15
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.N = r10
            r9.O = r11
            r9.P = r12
            r9.Q = r13
            r0 = 2131431431(0x7f0b1007, float:1.848459E38)
            android.view.View r0 = defpackage.q4.G(r14, r0)
            java.lang.String r1 = "requireViewById(itemView, R.id.slide_title)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.I = r0
            android.view.View r0 = r9.a
            r1 = 2131431913(0x7f0b11e9, float:1.8485569E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.video_title)"
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
            android.view.View r0 = r9.a
            r1 = 2131430864(0x7f0b0dd0, float:1.848344E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.play_button)"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.marketingformats.playbutton.PlayPauseImageButton r0 = (com.spotify.music.marketingformats.playbutton.PlayPauseImageButton) r0
            r9.L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nib.<init>(android.view.ViewGroup, com.spotify.mobile.android.video.s, com.spotify.mobile.android.video.q, sda, com.squareup.picasso.Picasso, thb, dib, mhb):void");
    }

    public static final void B0(nib nib) {
        mhb mhb = nib.Q;
        String str = nib.M;
        if (str != null) {
            mhb.c(str, "header-featured-video", nib.w());
        } else {
            h.k("loggablePageUri");
            throw null;
        }
    }

    public final void C0(String str) {
        h.e(str, "pageUri");
        this.M = str;
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
        this.J.setTextColor(a.b(context, aVar.h(a)));
        this.I.setText(s81.text().subtitle());
        this.J.setText(s81.text().title());
        String b = aVar.b(s81);
        if (b != null) {
            this.N.m(b).n(this.K, null);
        }
        u0(aVar.c(s81));
        String string = s81.custom().string(MarketingFormatsCustomKey.KEY_SECONDARY_ACCENT_COLOR.d());
        PlayPauseImageButton playPauseImageButton = this.L;
        View view2 = this.a;
        h.d(view2, "itemView");
        Context context2 = view2.getContext();
        h.d(context2, "itemView.context");
        playPauseImageButton.setBackground(new com.spotify.music.marketingformats.playbutton.a(context2, Color.parseColor(string)));
        this.L.setPlaybackState(false);
        String d = aVar.d(s81);
        if (d == null) {
            d = "";
        }
        this.L.setOnClickListener(new mib(this, d));
        this.P.a(this.L, d);
    }
}

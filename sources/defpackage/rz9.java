package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.common.base.Joiner;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: rz9  reason: default package */
public class rz9 extends tz9 {
    private final q C;
    private final Picasso D;
    private final a E;

    /* renamed from: rz9$a */
    public interface a {
        void e(h hVar, e eVar, int i);

        void g(h hVar, e eVar, int i);

        void k(h hVar, e eVar, int i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rz9(android.view.ViewGroup r4, defpackage.rz9.a r5, com.spotify.music.preview.q r6, com.squareup.picasso.Picasso r7, com.spotify.music.libs.assistedcuration.b r8) {
        /*
            r3 = this;
            ga0 r0 = defpackage.e90.d()
            android.content.Context r1 = r4.getContext()
            y90 r0 = r0.i(r1, r4)
            android.view.View r0 = r0.getView()
            r3.<init>(r0)
            r3.C = r6
            r3.D = r7
            java.lang.Class<y90> r6 = defpackage.y90.class
            g90 r6 = defpackage.l70.o(r0, r6)
            y90 r6 = (defpackage.y90) r6
            android.content.Context r7 = r4.getContext()
            android.widget.ImageButton r7 = defpackage.z42.g(r7)
            r6.z0(r7)
            android.view.View r7 = r6.W1()
            android.widget.ImageButton r7 = (android.widget.ImageButton) r7
            android.content.Context r0 = r4.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r8 = r8.i()
            android.content.Context r1 = r4.getContext()
            int r2 = com.spotify.encore.foundation.R.color.white
            android.content.res.ColorStateList r1 = androidx.core.content.a.c(r1, r2)
            android.graphics.drawable.Drawable r8 = defpackage.z42.f(r0, r8, r1)
            r7.setImageDrawable(r8)
            android.content.Context r8 = r4.getContext()
            r0 = 2132017352(0x7f1400c8, float:1.967298E38)
            java.lang.String r8 = r8.getString(r0)
            r7.setContentDescription(r8)
            android.widget.ImageView r6 = r6.getImageView()
            android.content.Context r4 = r4.getContext()
            r7 = 2132019329(0x7f140881, float:1.967699E38)
            java.lang.String r4 = r4.getString(r7)
            r6.setContentDescription(r4)
            r3.E = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz9.<init>(android.view.ViewGroup, rz9$a, com.spotify.music.preview.q, com.squareup.picasso.Picasso, com.spotify.music.libs.assistedcuration.b):void");
    }

    public void h0(h hVar, e eVar, int i, boolean z, boolean z2) {
        y90 y90 = (y90) l70.o(this.a, y90.class);
        y90.setTitle(eVar.getName());
        y90.setSubtitle(Joiner.on(", ").join(eVar.x1()));
        Uri parse = !TextUtils.isEmpty(eVar.getImageUri()) ? Uri.parse(eVar.getImageUri()) : Uri.EMPTY;
        ImageView imageView = y90.getImageView();
        Drawable o = yc0.o(this.a.getContext());
        z l = this.D.l(parse);
        l.t(o);
        l.g(o);
        l.o(t.b(imageView, this.C, eVar.getPreviewId(), dz9.a(eVar, hVar)));
        y90.getImageView().setOnClickListener(new nz9(this, hVar, eVar, i));
        this.a.setOnClickListener(new oz9(this, hVar, eVar, i));
        ((ImageButton) y90.W1()).setOnClickListener(new mz9(this, hVar, eVar, i));
        Context context = this.a.getContext();
        TextLabelUtil.a(context, y90.getSubtitleView(), eVar.h());
        TextLabelUtil.b(context, y90.getSubtitleView(), eVar.isExplicit());
        y90.setAppearsDisabled((z2 && eVar.h()) || (z && eVar.isExplicit()) || !eVar.i());
    }

    public /* synthetic */ void j0(h hVar, e eVar, int i, View view) {
        this.E.k(hVar, eVar, i);
    }

    public /* synthetic */ void l0(h hVar, e eVar, int i, View view) {
        this.E.g(hVar, eVar, i);
    }

    public /* synthetic */ void m0(h hVar, e eVar, int i, View view) {
        this.E.e(hVar, eVar, i);
    }
}

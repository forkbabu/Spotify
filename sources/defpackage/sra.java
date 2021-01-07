package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: sra  reason: default package */
public class sra extends yra implements rra {
    private final boolean p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sra(android.view.View r3, boolean r4) {
        /*
            r2 = this;
            ura r0 = defpackage.ura.a
            nra$b r0 = new nra$b
            r0.<init>()
            r1 = 2
            r0.b(r1)
            ura r0 = r0.a()
            r2.<init>(r3, r0)
            r2.p = r4
            android.widget.TextView r3 = r2.o
            r4 = 2132019514(0x7f14093a, float:1.9677365E38)
            r3.setText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sra.<init>(android.view.View, boolean):void");
    }

    public void c(SpotifyIconV2 spotifyIconV2) {
        Context context = this.a.getContext();
        this.o.setCompoundDrawablePadding(nud.g(8.0f, context.getResources()));
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) nud.g(16.0f, context.getResources()));
        if (this.p) {
            this.o.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, spotifyIconDrawable, (Drawable) null);
        } else {
            this.o.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // defpackage.asa, com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
    }
}

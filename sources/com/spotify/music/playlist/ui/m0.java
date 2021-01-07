package com.spotify.music.playlist.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.preview.q;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.squareup.picasso.Picasso;

public final class m0<T> implements l0<T> {
    private final Picasso a;
    private final h0 b;
    private final htc c;
    private final jtc d;
    private final boolean e;
    private final x<T> f;
    private final lbb g;
    private final d0 h;
    private final q i;

    /* access modifiers changed from: package-private */
    public class a implements l0.b {
        final /* synthetic */ boolean a;

        a(m0 m0Var, boolean z) {
            this.a = z;
        }

        @Override // com.spotify.music.playlist.ui.l0.b
        public boolean a() {
            return false;
        }

        @Override // com.spotify.music.playlist.ui.l0.b
        public boolean isActive() {
            return this.a;
        }
    }

    m0(Picasso picasso, h0 h0Var, htc htc, jtc jtc, boolean z, y<T> yVar, q qVar, lbb lbb, d0 d0Var, ajf<b4<T>> ajf) {
        this.a = picasso;
        this.b = h0Var;
        this.c = htc;
        this.d = jtc;
        this.e = z;
        this.f = yVar.a(ajf);
        this.g = lbb;
        this.h = d0Var;
        this.i = qVar;
    }

    private static String d(l lVar) {
        o g2 = lVar.g();
        Episode c2 = lVar.c();
        if (g2 != null) {
            return com.spotify.playlist.models.q.e(g2, Covers.Size.LARGE);
        }
        if (c2 == null) {
            return null;
        }
        Covers c3 = c2.c();
        Covers e2 = c2.e();
        Show w = c2.w();
        w.getClass();
        return com.spotify.playlist.models.q.f(c3, e2, w, Covers.Size.NORMAL);
    }

    private static String e(Context context, l lVar) {
        if (lVar.g() != null) {
            return context.getString(C0707R.string.playlist_ui_components_content_description_accessory_song);
        }
        return context.getString(C0707R.string.playlist_ui_components_content_description_accessory_episode);
    }

    private static String f(l lVar) {
        o g2 = lVar.g();
        if (g2 != null) {
            return g2.getPreviewId();
        }
        Episode c2 = lVar.c();
        if (c2 != null) {
            return c2.s();
        }
        return null;
    }

    private void r(View view, boolean z, T t, l lVar) {
        View e2 = this.f.e(t, e(view.getContext(), lVar), lVar.e());
        if (z) {
            int i2 = e90.i;
            ((com.spotify.music.playlist.ui.row.a) l70.o(view, com.spotify.music.playlist.ui.row.a.class)).z(ImmutableList.of(e2));
            return;
        }
        int i3 = e90.i;
        ((p90) l70.o(view, p90.class)).z0(e2);
    }

    public l0.c a(RecyclerView.b0 b0Var, ItemConfiguration itemConfiguration, l lVar, T t, l0.b bVar, boolean z, int i2) {
        Context context = b0Var.a.getContext();
        return b(b0Var, itemConfiguration, lVar, t, bVar, z, i2, yc0.o(context), yc0.g(context), yc0.k(context, SpotifyIcon.VIDEO_32, false, true));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: jtc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0294  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.playlist.ui.l0.c b(androidx.recyclerview.widget.RecyclerView.b0 r35, com.spotify.music.playlist.ui.ItemConfiguration r36, com.spotify.playlist.models.l r37, T r38, com.spotify.music.playlist.ui.l0.b r39, boolean r40, int r41, android.graphics.drawable.Drawable r42, android.graphics.drawable.Drawable r43, android.graphics.drawable.Drawable r44) {
        /*
        // Method dump skipped, instructions count: 1722
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.playlist.ui.m0.b(androidx.recyclerview.widget.RecyclerView$b0, com.spotify.music.playlist.ui.ItemConfiguration, com.spotify.playlist.models.l, java.lang.Object, com.spotify.music.playlist.ui.l0$b, boolean, int, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):com.spotify.music.playlist.ui.l0$c");
    }

    public l0.c c(RecyclerView.b0 b0Var, ItemConfiguration itemConfiguration, l lVar, T t, boolean z, boolean z2, int i2) {
        return a(b0Var, itemConfiguration, lVar, t, new a(this, z), z2, i2);
    }

    public /* synthetic */ void g(int i2, l lVar, View view) {
        this.h.h(i2, lVar);
    }

    public /* synthetic */ void h(boolean z, View.OnLongClickListener onLongClickListener, int i2, l lVar, View view) {
        if (z) {
            onLongClickListener.onLongClick(view);
        } else {
            this.h.d(i2, lVar);
        }
    }

    public /* synthetic */ void i(int i2, l lVar, boolean z, View view) {
        this.h.c(i2, lVar, z);
    }

    public /* synthetic */ void j(int i2, l lVar, View view) {
        this.h.a(i2, lVar);
    }

    public /* synthetic */ void k(int i2, l lVar, View view) {
        this.h.f(i2, lVar);
    }

    public /* synthetic */ void l(int i2, l lVar, View view) {
        this.h.f(i2, lVar);
    }

    public /* synthetic */ void m(int i2, l lVar, View view) {
        this.h.d(i2, lVar);
    }

    public /* synthetic */ void n(int i2, l lVar, View view) {
        this.h.b(i2, lVar);
    }

    public /* synthetic */ void o(int i2, l lVar, View view) {
        this.h.i(i2, lVar);
    }

    public /* synthetic */ void p(int i2, l lVar, View view) {
        this.h.g(i2, lVar);
    }

    public /* synthetic */ void q(int i2, l lVar, View view) {
        this.h.i(i2, lVar);
    }
}

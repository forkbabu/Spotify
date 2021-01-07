package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixImpressionLogger;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import defpackage.hm6;
import defpackage.sm6;
import java.util.List;

/* renamed from: lm6  reason: default package */
public class lm6 implements km6, wh6 {
    private static final int s = lm6.class.hashCode();
    private static final int t = (lm6.class.hashCode() + 1);
    private static final int u = (lm6.class.hashCode() + 2);
    private static final int v = (lm6.class.hashCode() + 3);
    private static final int w = (lm6.class.hashCode() + 4);
    private final Context a;
    private final hm6 b;
    private final sm6 c;
    private final w f;
    private final xk6 n;
    private final vk6 o;
    private final OfflineUserMixImpressionLogger p;
    private twd q;
    private boolean r;

    public lm6(Context context, hm6.a aVar, sm6.a aVar2, w wVar, xk6 xk6, vk6 vk6, OfflineUserMixImpressionLogger.a aVar3, ItemListConfiguration itemListConfiguration) {
        this.a = context;
        hm6 a2 = aVar.a(itemListConfiguration);
        this.b = a2;
        this.c = aVar2.a(a2, new zl6(this), this.r);
        this.f = wVar;
        this.n = xk6;
        this.o = vk6;
        this.p = aVar3.a(ViewUris.b0, PageIdentifiers.OFFLINE_MIX_ENTITY);
    }

    @Override // defpackage.uh6
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        this.q = twd;
        xk6 xk6 = this.n;
        Context context = this.a;
        am6 am6 = new am6(this);
        xk6.getClass();
        r90 a2 = Rows.a(context, viewGroup);
        ImageButton h = z42.h(context, (SpotifyIconDrawable) z42.e(context, SpotifyIconV2.X));
        h.setOnClickListener(am6);
        a2.z0(h);
        a2.setText(context.getString(C0707R.string.offline_user_mix_education_row));
        v02 v02 = new v02(a2.getView(), false);
        int i = t;
        twd.Z(v02, i);
        twd twd2 = this.q;
        Context context2 = this.a;
        vk6 vk6 = this.o;
        View inflate = View.inflate(context2, C0707R.layout.offline_user_mix_cta_view, null);
        ((Button) inflate.findViewById(C0707R.id.cta_button)).setOnClickListener(vk6);
        v02 v022 = new v02(inflate, false);
        int i2 = u;
        twd2.Z(v022, i2);
        twd twd3 = this.q;
        Context context3 = this.a;
        int dimension = (int) context3.getResources().getDimension(C0707R.dimen.std_24dp);
        LinearLayout linearLayout = new LinearLayout(context3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(dimension, 0, dimension, dimension);
        linearLayout.setLayoutParams(layoutParams);
        TextView f2 = c.f(context3);
        androidx.core.widget.c.n(f2, R.style.TextAppearance_Encore_BalladBold);
        f2.setText(context3.getString(C0707R.string.offline_user_mix_min_songs, 15));
        f2.setGravity(1);
        linearLayout.addView(f2);
        v02 v023 = new v02(linearLayout, false);
        int i3 = w;
        twd3.Z(v023, i3);
        twd twd4 = this.q;
        Context context4 = this.a;
        int dimension2 = (int) context4.getResources().getDimension(C0707R.dimen.std_24dp);
        FrameLayout frameLayout = new FrameLayout(context4);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setPadding(dimension2, 0, dimension2, dimension2);
        TextView f3 = c.f(context4);
        f3.setTextSize(2, 14.0f);
        f3.setTextColor(a.b(context4, C0707R.color.glue_row_subtitle_color));
        f3.setText(context4.getString(C0707R.string.offline_user_mix_max_songs, 30));
        f3.setGravity(1);
        frameLayout.addView(f3);
        v02 v024 = new v02(frameLayout, false);
        int i4 = v;
        twd4.Z(v024, i4);
        this.q.Z(this.c, s);
        this.q.i0(i, i2, i3, i4);
    }

    public /* synthetic */ void b(View view) {
        this.n.b();
        this.q.i0(t);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.b.j(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.b.k();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.b.j(this);
    }

    @Override // defpackage.wh6
    public void i(ItemConfiguration itemConfiguration) {
        ItemConfiguration.a m = itemConfiguration.m();
        m.b(this.r ? ItemConfiguration.PreviewOverlay.WITH_PLAY_ICON : ItemConfiguration.PreviewOverlay.NONE);
        this.c.b0(m.build(), this.r);
    }

    @Override // defpackage.wh6
    public void j(String str, boolean z) {
        this.c.j(str, z);
    }

    public /* synthetic */ b4 k() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.b.o(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.b.p();
    }

    /* access modifiers changed from: package-private */
    public void u(int i) {
        this.f.c(s, i);
    }

    public void w(j jVar, List<l> list) {
        this.c.Z(list);
        twd twd = this.q;
        if (twd != null) {
            twd.l0(s);
            twd twd2 = this.q;
            int i = u;
            twd2.l0(i);
            twd twd3 = this.q;
            int i2 = t;
            twd3.i0(i2);
            twd twd4 = this.q;
            int i3 = w;
            twd4.i0(i3);
            twd twd5 = this.q;
            int i4 = v;
            twd5.i0(i4);
            if (list.size() < 15) {
                this.q.l0(i3);
            } else if (list.size() == 30) {
                this.q.i0(i);
                this.q.l0(i4);
            } else if (!this.n.a()) {
                this.q.l0(i2);
            }
            if (this.q.j0(i2)) {
                this.p.d();
            }
        }
    }

    public void y(boolean z) {
        this.r = z;
    }
}

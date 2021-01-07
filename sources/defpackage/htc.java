package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.base.Joiner;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.n;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.q;
import defpackage.mpa;
import java.util.List;

/* renamed from: htc  reason: default package */
public class htc {
    private final Context a;
    private final apa b;

    public htc(Context context, apa apa) {
        this.a = context;
        this.b = apa;
    }

    public void a(uoc uoc, Episode episode) {
        if (TextUtils.isEmpty(episode.d())) {
            uoc.T();
            return;
        }
        uoc.n(qoc.b(episode.d()));
        uoc.y0();
    }

    public void b(String str, uoc uoc, a aVar, String str2) {
        vqc vqc;
        uoc.q0(false);
        uoc.x1(false);
        uoc.R(true);
        LottieAnimationView q2 = uoc.q2();
        Object tag = q2.getTag();
        if (tag instanceof vqc) {
            vqc = (vqc) tag;
        } else {
            vqc = this.b.a();
        }
        q2.setTag(vqc);
        mpa.a b2 = mpa.b();
        b2.e(aVar);
        b2.g(q2);
        b2.f(vqc);
        b2.b(str);
        b2.a(str2);
        lpa.a(b2.build());
    }

    public void c(uoc uoc, a aVar, String str) {
        aVar.getClass();
        boolean z = aVar instanceof a.b;
        boolean z2 = aVar instanceof a.h;
        boolean z3 = aVar instanceof a.C0377a;
        if (z || z2 || z3) {
            if (z) {
                uoc.q0(true);
            } else if (z2) {
                uoc.q0(true);
            } else {
                uoc.q0(false);
            }
            uoc.g2(this.a.getString(C0707R.string.content_description_download_episode_with_param_downloaded, str));
            Context context = this.a;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOADED, context.getResources().getDimension(C0707R.dimen.action_card_primary_action_height));
            spotifyIconDrawable.s(androidx.core.content.a.c(context, C0707R.color.cat_accessory_green));
            uoc.f2(spotifyIconDrawable);
            return;
        }
        uoc.q0(false);
        uoc.g2(this.a.getString(C0707R.string.content_description_download_episode_with_param, str));
        Context context2 = this.a;
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, SpotifyIconV2.DOWNLOAD, context2.getResources().getDimension(C0707R.dimen.action_card_primary_action_height));
        spotifyIconDrawable2.s(androidx.core.content.a.c(context2, C0707R.color.glue_button_text));
        uoc.f2(spotifyIconDrawable2);
    }

    public void d(uoc uoc, String str, boolean z) {
        if (z) {
            Context context = this.a;
            ColorStateList c = androidx.core.content.a.c(context, C0707R.color.btn_play_pause_dark);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, (float) nud.g(10.0f, context.getResources()));
            spotifyIconDrawable.s(c);
            c cVar = new c(spotifyIconDrawable, 0.5f);
            cVar.f(0.0f);
            cVar.c(androidx.core.content.a.c(context, C0707R.color.bg_primary_action_white));
            uoc.z2(cVar);
            uoc.x0(this.a.getString(C0707R.string.content_description_episode_card_action_pause_with_param, str));
            return;
        }
        Context context2 = this.a;
        ColorStateList c2 = androidx.core.content.a.c(context2, C0707R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, SpotifyIconV2.PLAY, (float) nud.g(10.0f, context2.getResources()));
        spotifyIconDrawable2.s(c2);
        c cVar2 = new c(spotifyIconDrawable2, 0.5f);
        cVar2.f(0.0f);
        cVar2.c(androidx.core.content.a.c(context2, C0707R.color.bg_primary_action_white));
        uoc.z2(cVar2);
        uoc.x0(this.a.getString(C0707R.string.content_description_episode_card_action_play_with_param, str));
    }

    public void e(uoc uoc, Episode episode) {
        String str;
        if (episode.g()) {
            n q = episode.q();
            if (q == null || q.a().isEmpty()) {
                str = this.a.getString(C0707R.string.music_and_talk_label);
            } else {
                List<String> a2 = q.a();
                str = Joiner.on(", ").join(a2.subList(0, Math.min(3, a2.size())));
            }
            uoc.l2(str);
            uoc.L(true);
            return;
        }
        uoc.L(false);
    }

    public void f(roc roc, int i, int i2, boolean z) {
        if (z && i == 0) {
            roc.O(1);
            roc.t0(1);
            roc.N();
        } else if (i <= 0 || i2 <= 0) {
            roc.Q();
        } else {
            roc.O(i2);
            roc.t0(i);
            roc.N();
        }
    }

    public void g(roc roc, Episode episode) {
        boolean E = episode.E();
        int j = episode.j();
        int intValue = ((Integer) x.n(episode.x(), Integer.valueOf(j))).intValue();
        if (intValue > j) {
            intValue = j;
        }
        f(roc, j - intValue, j, E);
    }

    public void h(roc roc, Episode episode, boolean z) {
        Covers.Size size = Covers.Size.NORMAL;
        Show w = episode.w();
        roc.H0(q.c((z || w == null) ? episode.c() : w.c(), size));
    }
}

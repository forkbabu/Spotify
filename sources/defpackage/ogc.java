package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;

@Deprecated
/* renamed from: ogc  reason: default package */
public class ogc implements ngc {
    private final b4<msc> a;
    private final boolean b;
    private final boolean c;
    private final htc d;
    private final etc e;
    private final jtc f;
    private final igc g;
    private final c h;
    private final j42 i;
    private boolean j;
    private boolean k;

    public ogc(b4<msc> b4Var, boolean z, boolean z2, htc htc, etc etc, jtc jtc, igc igc, c cVar, j42 j42) {
        this.b = z;
        this.c = z2;
        this.d = htc;
        this.e = etc;
        this.f = jtc;
        this.a = b4Var;
        this.g = igc;
        this.h = cVar;
        this.i = j42;
    }

    @Override // defpackage.ngc
    public void a() {
        this.g.a();
    }

    @Override // defpackage.ngc
    public void b(uoc uoc, Episode episode, Episode[] episodeArr, String str, boolean z) {
        int i2;
        boolean z2;
        Context context = uoc.getView().getContext();
        int i3 = 0;
        while (true) {
            if (i3 >= episodeArr.length) {
                i2 = -1;
                break;
            } else if (episode.getUri().equals(episodeArr[i3].getUri())) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        boolean e2 = this.e.e(episode);
        Show w = episode.w();
        String h2 = w != null ? w.h() : "";
        uoc.setActive(e2);
        this.d.d(uoc, episode.n(), this.e.a(episode));
        uoc.k0(new egc(this, episode, episodeArr, str, i2));
        uoc.setAppearsDisabled(this.e.b(episode));
        uoc.Z1(new ggc(this, episode, episodeArr, str, i2));
        uoc.setTitle(episode.n());
        uoc.setSubtitle(h2);
        if (h2.isEmpty()) {
            uoc.y();
        } else {
            uoc.G0();
        }
        this.d.getClass();
        if (episode.C()) {
            uoc.V0();
        } else {
            uoc.y1();
        }
        this.d.a(uoc, episode);
        uoc.n0(this.f.a(h2, episode, e2, false));
        this.d.h(uoc, episode, this.b);
        if (this.j) {
            uoc.i0(woc.a(context));
            uoc.D0(context.getString(C0707R.string.content_description_episode_card_action_mark_as_played_with_param, episode.n()));
            uoc.M(new hgc(this, episode, str, i2));
            uoc.j1(true);
        } else {
            uoc.j1(false);
        }
        if (this.c) {
            boolean F = episode.F();
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, F ? SpotifyIconV2.CHECK_ALT_FILL : SpotifyIconV2.PLUS_ALT, context.getResources().getDimension(C0707R.dimen.action_card_primary_action_height));
            if (F) {
                spotifyIconDrawable.r(a.b(context, C0707R.color.cat_accessory_green_focused));
            } else {
                spotifyIconDrawable.s(a.c(context, C0707R.color.glue_button_text));
            }
            uoc.O1(spotifyIconDrawable);
            uoc.U1(context.getString(C0707R.string.listen_later_button_content_description));
            uoc.D1(new fgc(this, episode, str, i2));
            uoc.A0(true);
        } else {
            uoc.A0(false);
        }
        if (z) {
            View.OnClickListener dgc = new dgc(this, episode, str, i2);
            if (this.k) {
                htc htc = this.d;
                boolean B = episode.B();
                htc.getClass();
                uoc.q2().setEnabled(B);
                this.d.getClass();
                uoc.q2().setOnClickListener(dgc);
                this.d.b(episode.getUri(), uoc, episode.o(), episode.n());
            } else {
                htc htc2 = this.d;
                boolean B2 = episode.B();
                htc2.getClass();
                uoc.t1(B2);
                uoc.k2(dgc);
                this.d.c(uoc, episode.o(), episode.n());
            }
            z2 = false;
        } else {
            z2 = false;
            uoc.x1(false);
            uoc.R(false);
        }
        String n = episode.n();
        String uri = episode.getUri();
        if (episode.l() == Episode.MediaType.VIDEO) {
            z2 = true;
        }
        msc msc = new msc(n, uri, str, z, i2, z2);
        View d2 = p42.d(context, this.a, msc, this.h, context.getString(C0707R.string.content_description_accessory_episode_type), episode.n());
        d2.setId(C0707R.id.context_menu_tag);
        uoc.z0(d2);
        uoc.getView().setOnLongClickListener(this.i);
        uoc.getView().setTag(C0707R.id.context_menu_tag, new i42(this.a, msc));
        if (e2) {
            this.d.f(uoc, this.e.c(), episode.j(), episode.E());
        } else {
            this.d.g(uoc, episode);
        }
        this.d.e(uoc, episode);
    }

    @Override // defpackage.ngc
    public void c(boolean z) {
        this.k = z;
    }

    @Override // defpackage.ngc
    public void d(boolean z) {
        this.j = z;
    }

    public /* synthetic */ void e(Episode episode, Episode[] episodeArr, String str, int i2, View view) {
        this.g.f(episode, episodeArr, str, i2);
    }

    public /* synthetic */ void f(Episode episode, Episode[] episodeArr, String str, int i2, View view) {
        this.g.c(episode, episodeArr, str, i2);
    }

    public /* synthetic */ void g(Episode episode, String str, int i2, View view) {
        this.g.b(episode.getUri(), str, i2);
    }

    public /* synthetic */ void h(Episode episode, String str, int i2, View view) {
        this.g.d(episode, this.h.toString(), str, i2);
    }

    public /* synthetic */ void i(Episode episode, String str, int i2, View view) {
        this.g.g(episode, str, i2);
    }
}

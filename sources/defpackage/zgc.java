package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;

/* renamed from: zgc  reason: default package */
public class zgc implements ygc {
    private final htc a;
    private final etc b;
    private final jtc c;
    private final tgc d;
    private final b4<msc> e;
    private final j42 f;

    public zgc(htc htc, etc etc, jtc jtc, tgc tgc, b4<msc> b4Var, j42 j42) {
        this.a = htc;
        this.b = etc;
        this.c = jtc;
        this.d = tgc;
        this.e = b4Var;
        this.f = j42;
    }

    private static int b(Episode[] episodeArr, Episode episode) {
        for (int i = 0; i < episodeArr.length; i++) {
            if (episode.getUri().equals(episodeArr[i].getUri())) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ygc
    public void a(roc roc, Episode episode, Episode[] episodeArr, String str, boolean z) {
        roc.p2(true);
        roc.F(true);
        Context context = roc.getView().getContext();
        int b2 = b(episodeArr, episode);
        roc.z2(woc.a(context));
        roc.x0(context.getString(C0707R.string.content_description_episode_card_action_mark_as_played_with_param, episode.n()));
        roc.k0(new rgc(this, episode, str, b2));
        int b3 = b(episodeArr, episode);
        boolean e2 = this.b.e(episode);
        Show w = episode.w();
        String h = w != null ? w.h() : "";
        roc.setActive(e2);
        roc.setAppearsDisabled(this.b.b(episode));
        if (b3 <= -1) {
            roc.Z1(new sgc(this, episode, str));
        } else {
            roc.Z1(new qgc(this, episode, episodeArr, str, b3));
        }
        roc.setTitle(episode.n());
        roc.setSubtitle(this.c.a(h, episode, e2, false));
        roc.getView().setOnLongClickListener(this.f);
        roc.getView().setTag(C0707R.id.context_menu_tag, new i42(this.e, new msc(episode.n(), episode.getUri(), str, z, b3, episode.l() == Episode.MediaType.VIDEO)));
        this.a.getClass();
        if (episode.C()) {
            roc.V0();
        } else {
            roc.y1();
        }
        this.a.h(roc, episode, true);
        this.a.g(roc, episode);
    }

    public /* synthetic */ void c(Episode episode, String str, int i, View view) {
        this.d.b(episode.getUri(), str, i);
    }

    public /* synthetic */ void d(Episode episode, String str, View view) {
        this.d.c(episode, new Episode[]{episode}, str, 0);
    }

    public /* synthetic */ void e(Episode episode, Episode[] episodeArr, String str, int i, View view) {
        this.d.c(episode, episodeArr, str, i);
    }
}

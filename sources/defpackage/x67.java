package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import kotlin.jvm.internal.h;

/* renamed from: x67  reason: default package */
public final class x67 implements ngc {
    private final ogc a;
    private final z67 b;

    /* renamed from: x67$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ x67 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ Episode f;

        a(x67 x67, Context context, String str, Episode episode) {
            this.a = x67;
            this.b = context;
            this.c = str;
            this.f = episode;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            z67 z67 = this.a.b;
            String string = this.b.getString(C0707R.string.share_episode_of_name, this.c);
            h.d(string, "context.getString(R.stri…ode_of_name, podcastName)");
            String uri = this.f.getUri();
            String n = this.f.n();
            h.d(n, "episode.name");
            z67.a(string, uri, n, this.c, this.f.c().d());
        }
    }

    public x67(ogc ogc, z67 z67) {
        h.e(ogc, "actionCardViewBinderImpl");
        h.e(z67, "shareClickListener");
        this.a = ogc;
        this.b = z67;
    }

    @Override // defpackage.ngc
    public void a() {
        this.a.a();
    }

    @Override // defpackage.ngc
    public void b(uoc uoc, Episode episode, Episode[] episodeArr, String str, boolean z) {
        String str2;
        h.e(uoc, "actionCard");
        h.e(episode, "episode");
        h.e(episodeArr, "episodes");
        h.e(str, "sectionName");
        Context context = uoc.getView().getContext();
        Show w = episode.w();
        if (w == null || (str2 = w.h()) == null) {
            str2 = "";
        }
        this.a.b(uoc, episode, episodeArr, str, z);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SHARE_ANDROID, context.getResources().getDimension(C0707R.dimen.action_card_primary_action_height));
        spotifyIconDrawable.s(androidx.core.content.a.c(context, C0707R.color.glue_button_text));
        uoc.i0(spotifyIconDrawable);
        uoc.M(new a(this, context, str2, episode));
        uoc.j1(true);
        uoc.w2(true);
    }

    @Override // defpackage.ngc
    public void c(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.ngc
    public void d(boolean z) {
        this.a.d(z);
    }
}

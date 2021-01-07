package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.episode.u0;
import com.spotify.music.libs.podcast.download.DownloadDialogLifecycleAwareUtil;
import com.spotify.music.spotlets.scannables.c;
import com.spotify.playlist.models.offline.a;
import defpackage.wd7;
import java.util.List;

/* renamed from: xd7  reason: default package */
public class xd7 implements wd7 {
    private final ajf<wd7.a> a;
    private final c b;
    private final Context c;
    private final h0 d;
    private final DownloadDialogLifecycleAwareUtil e;
    private qg0<a0> f;
    private final u0 g;

    public xd7(Context context, h0 h0Var, c cVar, ajf<wd7.a> ajf, DownloadDialogLifecycleAwareUtil downloadDialogLifecycleAwareUtil, u0 u0Var) {
        this.c = context;
        this.d = h0Var;
        this.b = cVar;
        this.a = ajf;
        this.e = downloadDialogLifecycleAwareUtil;
        this.g = u0Var;
    }

    @Override // defpackage.wd7
    public void a(rc7 rc7) {
        this.f = new jd7(this, rc7);
        this.a.get().i();
    }

    public /* synthetic */ void b(rc7 rc7) {
        this.a.get().c(rc7.f());
    }

    public /* synthetic */ void c(rc7 rc7) {
        this.a.get().e(rc7.f(), rc7.d());
    }

    public void d(a aVar, rc7 rc7) {
        this.e.b(aVar, rc7.f(), new kd7(this, rc7), new qd7(this, rc7));
    }

    public /* synthetic */ void e(rc7 rc7) {
        this.a.get().g(rc7.f());
    }

    public /* synthetic */ void f(rc7 rc7) {
        this.a.get().f(rc7.f());
    }

    @Override // defpackage.wd7
    public void g(a0 a0Var) {
        qg0<a0> qg0 = this.f;
        if (qg0 != null) {
            qg0.accept(a0Var);
        }
    }

    public /* synthetic */ void h(rc7 rc7) {
        this.a.get().d(rc7.m());
    }

    public /* synthetic */ void i(String str, String str2, String str3, String str4) {
        this.a.get().h(str, str2, str3, this.c.getString(C0707R.string.share_episode_of_name, str4));
    }

    public void j(rc7 rc7, a0 a0Var) {
        Runnable runnable;
        int i;
        Drawable drawable;
        a aVar;
        Drawable drawable2;
        int i2;
        c cVar = this.b;
        String f2 = rc7.f();
        f2.getClass();
        String a2 = cVar.a("", f2, true);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.PODCASTS;
        a0Var.a(a2, spotifyIconV2, false, true);
        u0 u0Var = this.g;
        u0Var.d(rc7.e() + " - " + rc7.l());
        a0Var.i(rc7.l());
        this.d.i(a0Var, new rd7(this, rc7));
        if (!rc7.g()) {
            if (rc7.c() == 3) {
                i2 = C0707R.string.options_menu_download;
                drawable2 = l70.i(this.c, SpotifyIconV2.DOWNLOAD);
                aVar = a.f.a;
            } else {
                drawable2 = l70.j(this.c, SpotifyIconV2.DOWNLOADED, androidx.core.content.a.b(this.c, C0707R.color.cat_accessory_green));
                aVar = a.C0377a.a;
                i2 = C0707R.string.options_menu_undownload;
            }
            a0Var.j(C0707R.id.options_menu_download, i2, drawable2).a(new od7(this, aVar, rc7));
        }
        if (rc7.p() == 2) {
            int b2 = androidx.core.content.a.b(this.c, C0707R.color.cat_accessory_green);
            i = C0707R.string.episode_context_menu_mark_as_unplayed;
            drawable = l70.j(this.c, SpotifyIconV2.CHECK_ALT_FILL, b2);
            runnable = new pd7(this, rc7);
        } else {
            i = C0707R.string.episode_context_menu_mark_as_played;
            drawable = l70.i(this.c, SpotifyIconV2.CHECK);
            runnable = new md7(this, rc7);
        }
        a0Var.j(C0707R.id.options_menu_mark_as_played, i, drawable).a(runnable);
        if (rc7.a()) {
            this.d.n(a0Var, new nd7(this, rc7));
        }
        this.d.p(a0Var, new ld7(this, rc7.f(), rc7.e(), rc7.o(), rc7.l()));
        a0Var.j(C0707R.id.options_menu_browse_show, rc7.i() ? C0707R.string.context_menu_browse_show_music_and_talk : C0707R.string.context_menu_browse_show, l70.i(this.c, spotifyIconV2)).a(new id7(this, rc7));
    }

    public /* synthetic */ void k(rc7 rc7) {
        this.a.get().a(rc7.f());
    }

    public /* synthetic */ void l(rc7 rc7, List list) {
        this.a.get().b(rc7.f(), list);
    }
}

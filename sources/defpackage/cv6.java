package defpackage;

import android.view.View;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.t;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import defpackage.eu6;
import io.reactivex.y;

/* renamed from: cv6  reason: default package */
public class cv6 implements eu6 {
    private final wt6 a;
    private final a b;
    private final y c;
    private final p d = new p();
    private final p e = new p();
    private oo6 f;
    private boolean g;

    /* renamed from: cv6$a */
    public static class a {
    }

    public cv6(wt6 wt6, a aVar, y yVar) {
        this.a = wt6;
        this.b = aVar;
        this.c = yVar;
    }

    @Override // defpackage.eu6
    public void a(a0 a0Var, h76 h76) {
        throw new UnsupportedOperationException("Use the other bind method instead.");
    }

    @Override // defpackage.eu6
    public boolean b(ar6 ar6, ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return ar6.j();
    }

    @Override // defpackage.eu6
    public void c(eu6.a aVar) {
        this.e.b(this.f.b().o0(this.c).subscribe(new tu6(this, aVar)));
    }

    @Override // defpackage.eu6
    public void d(a0 a0Var, ar6 ar6, h76 h76) {
        int i;
        SpotifyIconV2 spotifyIconV2;
        b66 b2 = ar6.b();
        boolean e2 = b2.e();
        boolean c2 = b2.c();
        if (e2 || !this.g) {
            spotifyIconV2 = SpotifyIconV2.PLAY;
            i = c2 ? C0707R.string.playlist_toolbar_actionbar_item_shuffle_play : C0707R.string.playlist_toolbar_actionbar_item_play;
        } else {
            spotifyIconV2 = SpotifyIconV2.PAUSE;
            i = C0707R.string.playlist_toolbar_actionbar_item_pause;
        }
        j l = h76.l();
        a aVar = this.b;
        vu6 vu6 = new vu6(this, l, b2);
        aVar.getClass();
        e0.g(a0Var, i, C0707R.id.toolbar_menu_play, spotifyIconV2, vu6);
    }

    public void e(j jVar, b66 b66, View view) {
        String str;
        io.reactivex.a aVar;
        String uri = jVar.getUri();
        boolean e2 = b66.e();
        boolean b2 = b66.b();
        if (e2) {
            String b3 = this.a.b(uri);
            p pVar = this.d;
            if (b2) {
                aVar = this.f.h(b3);
            } else {
                aVar = this.f.j(b3);
            }
            pVar.b(aVar.subscribe(su6.a, xu6.a));
            return;
        }
        if (this.g) {
            str = this.a.a(uri);
        } else {
            str = this.a.b(uri);
        }
        this.d.b(this.f.a(b2, str).subscribe(uu6.a, wu6.a));
    }

    @Override // defpackage.eu6
    public void f() {
        this.e.a();
    }

    public /* synthetic */ void g(eu6.a aVar, Boolean bool) {
        this.g = bool.booleanValue();
        ((st6) aVar).a();
    }

    @Override // defpackage.eu6
    public void l(t.b bVar) {
        this.f = bVar.b();
    }

    @Override // defpackage.eu6
    public void onStop() {
        this.d.a();
    }
}

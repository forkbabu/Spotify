package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.navigation.t;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import io.reactivex.a;
import io.reactivex.y;

/* renamed from: tw6  reason: default package */
public class tw6 implements gu6 {
    private final t a;
    private final wt6 b;
    private final y c;
    private final v d;
    private final g e;
    private final p f = new p();

    public tw6(t tVar, wt6 wt6, y yVar, v vVar, g gVar) {
        this.a = tVar;
        this.b = wt6;
        this.c = yVar;
        this.d = vVar;
        this.e = gVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        a0Var.j(C0707R.id.options_menu_delete_playlist, C0707R.string.context_menu_delete_playlist, l70.i(a0Var.getContext(), SpotifyIconV2.X)).a(new nv6(this, l.getUri(), a0Var, l.j()));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return h76.l().w();
    }

    public /* synthetic */ void c(String str, a0 a0Var, String str2) {
        this.b.q(str);
        Context context = a0Var.getContext();
        f c2 = this.e.c(context.getString(C0707R.string.playlist_confirm_deletion_playlist_title), context.getString(C0707R.string.playlist_confirm_deletion_body, str2));
        c2.f(context.getString(C0707R.string.playlist_confirm_deletion_button_delete), new mv6(this, str));
        c2.e(context.getString(C0707R.string.playlist_confirm_deletion_button_cancel), new kv6(this, str));
        c2.b().a();
    }

    public void d(String str, DialogInterface dialogInterface, int i) {
        this.b.v(str);
        p pVar = this.f;
        a A = this.d.d(str).A(this.c);
        t tVar = this.a;
        tVar.getClass();
        pVar.b(A.subscribe(new mw6(tVar), lv6.a));
    }

    public /* synthetic */ void e(String str, DialogInterface dialogInterface, int i) {
        this.b.e(str);
        dialogInterface.dismiss();
    }

    @Override // defpackage.gu6
    public /* synthetic */ void f() {
        fu6.b(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void h() {
        fu6.a(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void onStart() {
        fu6.c(this);
    }

    @Override // defpackage.gu6
    public void onStop() {
        this.f.a();
    }
}

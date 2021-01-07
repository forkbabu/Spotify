package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.core.content.a;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.b0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.t;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.eu6;
import io.reactivex.y;

/* renamed from: av6  reason: default package */
public class av6 implements eu6 {
    private final p a = new p();
    private final Picasso b;
    private final wt6 c;
    private final y d;
    private final ry6 e;
    private final oy6 f;
    private final g g;

    public av6(Picasso picasso, wt6 wt6, y yVar, ry6 ry6, oy6 oy6, g gVar) {
        this.b = picasso;
        this.c = wt6;
        this.d = yVar;
        this.e = ry6;
        this.f = oy6;
        this.g = gVar;
    }

    @Override // defpackage.eu6
    public void a(a0 a0Var, h76 h76) {
        Context context = a0Var.getContext();
        b0 e2 = a0Var.e(C0707R.id.toolbar_invite_friends, C0707R.string.playlist_toolbar_invite_friends);
        e2.setIcon(l70.j(context, SpotifyIconV2.ADDFOLLOW, a.b(context, R.color.white)));
        e2.a(new ru6(this, a0Var, h76));
    }

    @Override // defpackage.eu6
    public boolean b(ar6 ar6, ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return h76.l().w();
    }

    @Override // defpackage.eu6
    public /* synthetic */ void c(eu6.a aVar) {
        du6.b(this, aVar);
    }

    @Override // defpackage.eu6
    public /* synthetic */ void d(a0 a0Var, ar6 ar6, h76 h76) {
        du6.a(this, a0Var, ar6, h76);
    }

    public void e(a0 a0Var, h76 h76) {
        this.c.i();
        Context context = a0Var.getContext();
        j l = h76.l();
        if (l.r()) {
            this.e.a(context, l);
            return;
        }
        qu6 qu6 = new qu6(this, context, l);
        z k = this.b.k(C0707R.drawable.modal_illustration);
        String string = context.getString(C0707R.string.playlist_invite_flow_collaborative_dialog_title);
        String string2 = context.getString(C0707R.string.playlist_invite_flow_collaborative_dialog_body);
        String string3 = context.getString(C0707R.string.playlist_invite_flow_collaborative_dialog_button_positive);
        String string4 = context.getString(C0707R.string.playlist_invite_flow_collaborative_dialog_button_negative);
        f a2 = this.g.a(string, string2, k);
        a2.f(string3, qu6);
        a2.e(string4, qu6);
        a2.b().a();
        this.c.x();
    }

    @Override // defpackage.eu6
    public /* synthetic */ void f() {
        du6.c(this);
    }

    public /* synthetic */ void g(Context context, j jVar, DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.c.f();
            this.e.a(context, jVar);
            return;
        }
        this.c.h(jVar.getUri());
        this.a.b(this.f.b(jVar, true).A(this.d).subscribe(new pu6(this, context, jVar), ou6.a));
    }

    public /* synthetic */ void h(Context context, j jVar) {
        this.e.a(context, jVar);
    }

    @Override // defpackage.eu6
    public /* synthetic */ void l(t.b bVar) {
        du6.d(this, bVar);
    }

    @Override // defpackage.eu6
    public void onStop() {
        this.a.a();
    }
}

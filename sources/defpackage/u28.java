package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.scannables.c;

/* renamed from: u28  reason: default package */
public class u28 {
    private final c a;
    private final h0 b;
    private final vxc c;
    private final Context d;
    private final boolean e;

    public u28(boolean z, Context context, h0 h0Var, c cVar, vxc vxc) {
        this.e = z;
        this.d = context;
        h0Var.getClass();
        this.b = h0Var;
        this.a = cVar;
        this.c = vxc;
    }

    public /* synthetic */ void a() {
        this.c.a();
    }

    public void b(RadioStationModel radioStationModel, a0 a0Var) {
        if (this.e) {
            a0Var.a(this.a.a(radioStationModel.imageUri, radioStationModel.uri, true), SpotifyIconV2.RADIO, false, true);
            a0Var.h(radioStationModel.title);
            a0Var.i(agd.e(this.d, l0.z(agd.d(radioStationModel.uri))));
            this.b.l(a0Var, radioStationModel.uri, new t28(this));
        }
    }
}

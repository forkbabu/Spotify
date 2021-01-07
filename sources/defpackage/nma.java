package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.C0707R;
import defpackage.o1e;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: nma  reason: default package */
public class nma {
    private final z<HubsJsonViewModel> a;
    private final y b;
    private final Resources c;

    nma(Resources resources, z<HubsJsonViewModel> zVar, y yVar) {
        this.c = resources;
        this.a = zVar;
        this.b = yVar;
    }

    public s<b91> a() {
        s<U> r0 = this.a.P().h(b91.class).r0(new mma(this));
        o1e.b bVar = new o1e.b(t71.c(), this.b);
        bVar.b(300);
        return r0.q(bVar.a());
    }

    public /* synthetic */ b91 b(Throwable th) {
        return t71.a(SpotifyIconV2.WARNING, this.c.getString(C0707R.string.error_general_title), this.c.getString(C0707R.string.error_general_body));
    }
}

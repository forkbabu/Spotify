package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.connection.g;
import defpackage.xya;

/* renamed from: nya  reason: default package */
public final /* synthetic */ class nya implements ti0 {
    public final /* synthetic */ bza a;
    public final /* synthetic */ String b;

    public /* synthetic */ nya(bza bza, String str) {
        this.a = bza;
        this.b = str;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        g.b bVar = (g.b) obj;
        return e0.g(this.a, z42.l(new xya.f(this.b)));
    }
}

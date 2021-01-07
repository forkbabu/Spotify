package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.addtoplaylist.d;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.e4;
import java.util.Collections;

/* renamed from: r85  reason: default package */
public class r85 implements a71 {
    private final d a;
    private final p71 b;
    private final ere c;
    private final e4 f = new e4("");

    public r85(d dVar, ere ere, p71 p71) {
        dVar.getClass();
        this.a = dVar;
        p71.getClass();
        this.b = p71;
        this.c = ere;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string != null) {
            this.b.a(string, n61.d(), "add-to-playlist", null);
            this.c.a(this.f.b().a(ViewUris.T0.toString()));
            this.a.a(Collections.singletonList(string), "freetiertrack", string);
            return;
        }
        Assertion.g("URI for track cannot be null.");
    }
}

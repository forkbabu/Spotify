package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: j68  reason: default package */
public class j68 implements i68 {
    private final boolean a;

    public j68(boolean z) {
        this.a = z;
    }

    @Override // defpackage.i68
    public Optional<o81> a(String str, s81 s81) {
        boolean z = false;
        if (!ViewUris.F0.a(str)) {
            if (!(ViewUris.t.a(str) || ViewUris.g.b(str)) && !l0.b(str, LinkType.TOPIC) && !pqa.d(str) && !this.a) {
                z = true;
            }
        }
        if (z) {
            return Optional.of(b71.a(str, s81.text().title()));
        }
        return Optional.absent();
    }
}

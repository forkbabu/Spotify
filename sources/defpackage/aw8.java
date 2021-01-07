package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.cosmos.i;
import com.spotify.mobile.android.video.v;
import defpackage.v62;

/* renamed from: aw8  reason: default package */
public class aw8 {
    private final v62.a a;
    private Optional<i> b = Optional.absent();
    private boolean c;

    public aw8(v62.a aVar) {
        this.a = aVar;
    }

    public void a(p62 p62, boolean z) {
        if (!this.b.isPresent()) {
            i a2 = this.a.a(p62, z, this.c).a();
            a2.i();
            this.b = Optional.of(a2);
        }
    }

    public void b(boolean z) {
        if (this.b.isPresent()) {
            this.b.get().s(z);
        } else {
            this.c = z;
        }
    }

    public void c(v vVar) {
        if (this.b.isPresent()) {
            this.b.get().r(vVar);
            this.b = Optional.absent();
        }
    }
}

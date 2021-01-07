package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.rxjava2.q;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: l8a  reason: default package */
public class l8a implements m8a {
    private static final Set<LinkType> e = EnumSet.of(LinkType.PODCAST_EPISODE, LinkType.SHOW_EPISODE);
    private final m8a a;
    private final q b;
    private final ih0 c;
    private final rbb d;

    public l8a(m8a m8a, q qVar, ih0 ih0, rbb rbb) {
        this.b = qVar;
        this.a = m8a;
        this.c = ih0;
        this.d = rbb;
    }

    @Override // defpackage.m8a
    public void a(String str) {
        this.a.a(str);
        if (e.contains(l0.z(str).q())) {
            this.b.a(this.c.e(Collections.singletonList(str)).subscribe(new j8a(this, str), new i8a(this)));
        }
    }

    @Override // defpackage.m8a
    public void b(String str) {
        this.a.b(str);
    }

    public void c(String str) {
        this.d.b(str, c.a(str).toString());
    }

    public void d(Throwable th) {
        this.d.a();
    }
}

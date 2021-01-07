package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.playlist.models.o;
import defpackage.f1a;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: b1a  reason: default package */
public class b1a {
    private static final a c;
    public static final /* synthetic */ int d = 0;
    private final l31 a;
    private final g62<o> b;

    /* renamed from: b1a$a */
    public static abstract class a {

        /* renamed from: b1a$a$a  reason: collision with other inner class name */
        public interface AbstractC0057a {
        }

        public abstract String a();

        public abstract List<e> b();

        public abstract String c();
    }

    /* renamed from: b1a$b */
    public static abstract class b {

        /* renamed from: b1a$b$a */
        public interface a {
        }

        public abstract String a();

        public abstract List<String> b();
    }

    static {
        f1a.b bVar = new f1a.b();
        bVar.d("");
        bVar.b("");
        bVar.c(Collections.emptyList());
        c = bVar.a();
    }

    public b1a(l31 l31, g62<o> g62) {
        this.a = l31;
        this.b = g62;
    }

    public static z b(Throwable th) {
        Logger.e(th, "Assisted Curation Artist Loader failed.", new Object[0]);
        return z.z(c);
    }

    public s<a> a(String str, Set<String> set) {
        j0a j0a = j0a.a;
        l0 z = l0.z(str);
        if (z.q() == LinkType.TRACK) {
            return this.a.c(str).A(k0a.a).s(new o0a(this, set)).D(j0a).P();
        }
        if (z.q() == LinkType.ARTIST) {
            return z.z(str).s(new o0a(this, set)).D(j0a).P();
        }
        return s.P(new IllegalArgumentException(je.x0("Unsupported uri ", str)));
    }

    public d0 c(String str, b bVar) {
        List<String> b2 = bVar.b();
        if (b2.isEmpty()) {
            return z.z(c);
        }
        return this.b.a(str, (String[]) b2.toArray(new String[0])).j0(new l0a(str, bVar, b2)).T();
    }

    public d0 d(Set set, String str) {
        return this.a.b(str).A(new n0a(set)).s(new m0a(this, str));
    }
}

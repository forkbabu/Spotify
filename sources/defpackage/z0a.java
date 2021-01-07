package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.playlist.models.o;
import defpackage.d1a;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: z0a  reason: default package */
public class z0a {
    private static final a c;
    public static final /* synthetic */ int d = 0;
    private final l31 a;
    private final g62<o> b;

    /* renamed from: z0a$a */
    public static abstract class a {

        /* renamed from: z0a$a$a  reason: collision with other inner class name */
        public interface AbstractC0704a {
        }

        public abstract String a();

        public abstract List<e> b();

        public abstract String c();
    }

    /* renamed from: z0a$b */
    public static abstract class b {

        /* renamed from: z0a$b$a */
        public interface a {
        }

        public abstract String a();

        public abstract List<String> b();
    }

    static {
        d1a.b bVar = new d1a.b();
        bVar.d("");
        bVar.b("");
        bVar.c(Collections.emptyList());
        c = bVar.a();
    }

    public z0a(l31 l31, g62<o> g62) {
        this.a = l31;
        this.b = g62;
    }

    public static z d(Throwable th) {
        Logger.e(th, "Assisted Curation Album Loader failed.", new Object[0]);
        return z.z(c);
    }

    public s<a> a(String str, Set<String> set) {
        i0a i0a = i0a.a;
        l0 z = l0.z(str);
        if (z.q() == LinkType.TRACK) {
            return this.a.c(str).A(f0a.a).s(new e0a(this, set)).D(i0a).P();
        }
        if (z.q() == LinkType.ALBUM) {
            return z.z(str).s(new e0a(this, set)).D(i0a).P();
        }
        return s.P(new IllegalArgumentException(je.x0("Unsupported uri ", str)));
    }

    public d0 b(String str, b bVar) {
        List<String> b2 = bVar.b();
        if (b2.isEmpty()) {
            return z.z(c);
        }
        return this.b.a(str, (String[]) b2.toArray(new String[0])).j0(new d0a(str, bVar, b2)).T();
    }

    public d0 c(Set set, String str) {
        return this.a.d(str).A(new h0a(set)).s(new g0a(this, str));
    }
}

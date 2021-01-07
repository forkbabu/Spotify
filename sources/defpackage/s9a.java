package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.libs.collection.model.d;
import com.spotify.music.libs.collection.model.e;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import io.reactivex.v;

/* renamed from: s9a  reason: default package */
public class s9a {
    private final e a;
    private final p8a b;

    public s9a(p8a p8a) {
        this.b = p8a;
        this.a = e.a("@");
        Logger.b("Creating new AlbumsDataLoader", new Object[0]);
    }

    public e a() {
        return this.a;
    }

    public v b(Policy policy) {
        return this.b.a(this.a.c(), this.a.b().e(), policy).H(a.a()).A(d9a.a).P().o0(io.reactivex.android.schedulers.a.b());
    }

    public v c(Policy policy) {
        return this.b.b(this.a.c(), this.a.b().e(), policy).I0(a.a()).j0(d9a.a).o0(io.reactivex.android.schedulers.a.b());
    }

    public s<d> d(Policy policy) {
        return s.B(new e9a(this, policy));
    }

    public s9a(p8a p8a, String str) {
        this.b = p8a;
        this.a = e.a(str);
        Logger.b("Creating new AlbumsDataLoader", new Object[0]);
    }
}

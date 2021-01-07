package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import defpackage.ohf;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: phf  reason: default package */
public class phf<TRequest, TResponse> {
    private static final Pattern h = Pattern.compile("\\?.*");
    private static final Pattern i = Pattern.compile("^/+");
    private final Map<Uri, lhf<TResponse>> a = new HashMap(3);
    private final ohf<TRequest, TResponse> b;
    private final mhf<TRequest, TResponse> c;
    private final n1e<TResponse> d;
    private final io.reactivex.disposables.a e = new io.reactivex.disposables.a();
    private final y f;
    private final s<Boolean> g;

    /* JADX WARN: Field signature parse error: b */
    /* renamed from: phf$a */
    private final class a implements ohf.a {
        private final Uri a;
        private final Object b;

        a(Uri uri, TRequest trequest) {
            this.a = uri;
            this.b = trequest;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: ohf */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ohf.a
        public void a() {
            lhf lhf = (lhf) phf.this.a.get(this.a);
            if (lhf == null) {
                Logger.d("onPreparePlaySuccess called without a corresponding pending search response for uri = %s.", this.a);
                phf.this.a.remove(this.a);
                return;
            }
            Logger.b("onPreparePlaySuccess for uri = %s, requestedToPlay = %s.", this.a, Boolean.valueOf(lhf.c()));
            lhf.d(true);
            if (lhf.c()) {
                Object a2 = lhf.a();
                if (a2 != null) {
                    phf.this.b.c(this.b, a2);
                } else {
                    Logger.d("onPreparePlaySuccess got a null search response.", new Object[0]);
                }
                phf.this.a.remove(this.a);
            }
        }

        @Override // defpackage.ohf.a
        public void onPreparePlayFailed() {
            phf.this.a.remove(this.a);
        }
    }

    phf(mhf<TRequest, TResponse> mhf, ohf<TRequest, TResponse> ohf, s<Boolean> sVar, y yVar) {
        n1e<TResponse> n1e = new n1e<>(30, 4, 500);
        this.c = mhf;
        this.b = ohf;
        this.d = n1e;
        this.f = yVar;
        this.g = sVar;
    }

    public String c(Uri uri) {
        if (!"alexa".equals(uri.getScheme())) {
            return uri.toString();
        }
        String path = uri.getPath();
        if (path == null) {
            return h.matcher(uri.getSchemeSpecificPart()).replaceFirst("");
        }
        return i.matcher(path).replaceFirst("");
    }

    public d0 d(Object obj, Boolean bool) {
        mhf<TRequest, TResponse> mhf = this.c;
        boolean booleanValue = bool.booleanValue();
        mhf.getClass();
        return z.z(obj).A(new jhf(mhf)).s(new fhf(mhf, booleanValue)).A(new ehf(mhf)).f(this.d);
    }

    public /* synthetic */ void e(Uri uri, Object obj, Object obj2) {
        Logger.b("Response received for searchAndPrepare with uri = %s.", uri);
        lhf<TResponse> lhf = this.a.get(uri);
        if (lhf != null) {
            lhf.f(obj2);
        }
        this.b.b(obj2, new a(uri, obj));
    }

    public /* synthetic */ void f(Uri uri, Throwable th) {
        Logger.e(th, "Exception while calling search for searchAndPrepare.", new Object[0]);
        this.a.remove(uri);
        this.b.a();
    }

    public void g(Uri uri, TRequest trequest) {
        Logger.b("playPreparedUri with uri = %s.", uri);
        lhf<TResponse> lhf = this.a.get(uri);
        if (lhf == null) {
            Logger.n("playPreparedUri called without preceding searchAndPrepare. Will search and play once search returns.", new Object[0]);
            h(uri, trequest);
            lhf<TResponse> lhf2 = this.a.get(uri);
            if (lhf2 != null) {
                lhf2.e(true);
            }
        } else if (!lhf.b()) {
            Logger.n("playPreparedUri called before searchAndPrepare returned result. Will play once search returns.", new Object[0]);
            lhf.e(true);
        } else {
            TResponse a2 = lhf.a();
            if (a2 != null) {
                this.b.c(trequest, a2);
            } else {
                Logger.d("playPreparedUri got a null search response.", new Object[0]);
                this.b.a();
            }
            this.a.remove(uri);
        }
    }

    public void h(Uri uri, TRequest trequest) {
        Logger.b("searchAndPrepare with uri = %s.", uri);
        this.a.put(uri, new lhf<>());
        this.e.b(this.g.N0(1).a0(new ihf(this, trequest)).o0(this.f).subscribe(new hhf(this, uri, trequest), new ghf(this, uri)));
    }
}

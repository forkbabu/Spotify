package defpackage;

import android.content.Intent;
import com.spotify.intentrouter.h;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;
import io.reactivex.y;

/* renamed from: alb  reason: default package */
public class alb extends h<hlb> {
    private final y a;
    private final c<Intent, com.spotify.android.flags.c, SessionState, io.reactivex.a> b;
    private final String c;
    private final sg0<Intent, String> d;

    /* renamed from: alb$b */
    public static class b {
        private final y a;

        public b(y yVar) {
            this.a = yVar;
        }

        public alb a(glb.a<Intent, com.spotify.android.flags.c, SessionState> aVar, String str, sg0<Intent, String> sg0) {
            return new alb(this.a, new ukb(aVar), str, sg0, null);
        }

        public alb b(c<Intent, com.spotify.android.flags.c, SessionState, io.reactivex.a> cVar, String str, sg0<Intent, String> sg0) {
            return new alb(this.a, cVar, str, sg0, null);
        }
    }

    /* renamed from: alb$c */
    public interface c<T1, T2, T3, R> {
        R a(T1 t1, T2 t2, T3 t3);
    }

    alb(y yVar, c cVar, String str, sg0 sg0, a aVar) {
        this.a = yVar;
        this.b = cVar;
        this.c = str;
        this.d = sg0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.intentrouter.h
    public String a(hlb hlb) {
        return this.d.apply(hlb.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.intentrouter.h
    public io.reactivex.a b(hlb hlb) {
        hlb hlb2 = hlb;
        return this.b.a(hlb2.a(), hlb2.c(), hlb2.d()).A(this.a);
    }

    @Override // com.spotify.intentrouter.h
    public String c() {
        return this.c;
    }
}

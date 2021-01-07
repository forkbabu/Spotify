package defpackage;

import android.content.Context;
import com.spotify.accountrecovery.api.models.MagicLinkRequestBody;
import com.spotify.http.u;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.C0707R;
import defpackage.f11;
import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: g11  reason: default package */
public class g11 implements f11 {
    private final u a;
    private final o11 b;
    private final Context c;
    private final y d;
    private final io.reactivex.disposables.a e = new io.reactivex.disposables.a();

    /* renamed from: g11$a */
    class a implements b0<v<String>> {
        final /* synthetic */ f11.a a;

        a(f11.a aVar) {
            this.a = aVar;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.a.e();
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            g11.this.e.b(bVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.b0
        public void onSuccess(v<String> vVar) {
            v<String> vVar2 = vVar;
            if (vVar2.f()) {
                this.a.c();
            } else if (vVar2.b() == 429) {
                this.a.d();
            } else if (vVar2.b() == 404) {
                this.a.a();
            } else {
                this.a.b(vVar2.b());
            }
        }
    }

    public g11(Context context, y yVar, u uVar, o11 o11) {
        this.c = context;
        this.d = yVar;
        this.a = uVar;
        this.b = o11;
    }

    private z<v<String>> f(String str) {
        return ((k70) this.a.c(k70.class)).a(new MagicLinkRequestBody(str, "login-autosend"));
    }

    public z<Destination> b(String str) {
        if (str.isEmpty()) {
            return z.z(new Destination.a(null, false, null));
        }
        return f(str).B(this.d).A(new d11(this, str)).E(new e11(this, str));
    }

    public Destination c(String str, v vVar) {
        o11 o11 = this.b;
        Context context = this.c;
        h.e(vVar, "response");
        h.e(o11, "magicLinkInstrumentor");
        h.e(str, "emailOrUsername");
        h.e(context, "mContext");
        if (vVar.f()) {
            o11.a(i11.c(p11.f(), l11.d(), n11.b(), ""));
            return new Destination.a(str, true, null);
        } else if (vVar.b() == 429) {
            o11.a(i11.c(p11.f(), l11.d(), n11.b(), ""));
            return new Destination.a(str, false, context.getString(C0707R.string.magiclink_error_request_limited));
        } else if (vVar.b() == 404) {
            o11.a(i11.d(p11.f(), m11.i()));
            return new Destination.a(str, false, context.getString(C0707R.string.magiclink_error_request_user_not_found));
        } else {
            if (vVar.b() == 400) {
                o11.a(i11.d(p11.f(), m11.e()));
            } else {
                o11.a(i11.c(p11.f(), l11.c(), n11.b(), String.valueOf(vVar.b())));
            }
            return new Destination.a(str, false, context.getString(C0707R.string.magiclink_error_request_generic));
        }
    }

    public Destination d(String str, Throwable th) {
        o11 o11 = this.b;
        Context context = this.c;
        h.e(o11, "magicLinkInstrumentor");
        h.e(str, "emailOrUsername");
        h.e(context, "context");
        o11.a(i11.c(p11.f(), l11.a(), n11.b(), ""));
        return new Destination.a(str, false, context.getString(C0707R.string.magiclink_error_request_generic));
    }

    public void e() {
        this.e.f();
    }

    public void g(String str, f11.a aVar) {
        f(str).B(this.d).subscribe(new a(aVar));
    }
}

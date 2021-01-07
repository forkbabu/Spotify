package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.http.contentaccesstoken.c;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.employeepodcasts.api.ShelterLoginResponse;
import io.reactivex.functions.l;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: my4  reason: default package */
public final class my4 implements ly4 {
    private final oy4 a;
    private final c b;
    private final SnackbarManager c;
    private final y d;
    private final y e;

    /* renamed from: my4$a */
    static final class a<T, R> implements l<ShelterLoginResponse, elb> {
        final /* synthetic */ my4 a;

        a(my4 my4) {
            this.a = my4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public elb apply(ShelterLoginResponse shelterLoginResponse) {
            ShelterLoginResponse shelterLoginResponse2 = shelterLoginResponse;
            h.e(shelterLoginResponse2, "loginResponse");
            this.a.b.b(shelterLoginResponse2.getCart());
            my4.c(this.a);
            if (e.x(shelterLoginResponse2.getAppStartPage(), "spotify:", false, 2, null)) {
                return elb.c(l0.z(shelterLoginResponse2.getAppStartPage()));
            }
            return elb.a();
        }
    }

    /* renamed from: my4$b */
    static final class b<T, R> implements l<Throwable, elb> {
        final /* synthetic */ my4 a;

        b(my4 my4) {
            this.a = my4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public elb apply(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "throwable");
            Logger.e(th2, "Error while communicating with Shelter", new Object[0]);
            my4.b(this.a);
            return elb.a();
        }
    }

    public my4(oy4 oy4, c cVar, SnackbarManager snackbarManager, y yVar, y yVar2) {
        h.e(oy4, "shelterDataLoader");
        h.e(cVar, "contentAccessRefreshTokenStorage");
        h.e(snackbarManager, "snackbarManager");
        h.e(yVar, "mainThreadScheduler");
        h.e(yVar2, "ioScheduler");
        this.a = oy4;
        this.b = cVar;
        this.c = snackbarManager;
        this.d = yVar;
        this.e = yVar2;
    }

    public static final void b(my4 my4) {
        SnackbarManager snackbarManager = my4.c;
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.employee_podcasts_login_generic_error_message).build();
        h.d(build, "SnackbarConfiguration.bu…ic_error_message).build()");
        snackbarManager.show(build);
    }

    public static final void c(my4 my4) {
        my4.c.showOnNextAttach(SnackbarConfiguration.builder((int) C0707R.string.employee_podcasts_snackbar_message).build());
    }

    public z<elb> d(String str) {
        h.e(str, "authCode");
        z<R> E = this.a.a(str).H(this.e).B(this.d).A(new a(this)).E(new b(this));
        h.d(E, "shelterDataLoader.google…doNothing()\n            }");
        return E;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.C0707R;
import com.spotify.music.features.spoton.exceptions.SpotOnLoggedOutException;
import com.spotify.remoteconfig.x6;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import java.util.Locale;

/* renamed from: vd5  reason: default package */
public class vd5 {
    private final Context a;
    private final x6 b;
    private final yk8 c;

    public vd5(Context context, yk8 yk8, x6 x6Var) {
        this.a = context;
        this.c = yk8;
        this.b = x6Var;
    }

    public e a(a aVar) {
        return aVar.D(new pd5(this));
    }

    public e b(Throwable th) {
        a aVar;
        if (!(th instanceof SpotOnLoggedOutException)) {
            return a.t(th);
        }
        a C = a.x(new sd5(this)).C(rd5.a);
        if (this.b.i()) {
            yk8 yk8 = this.c;
            Context context = this.a;
            Uri uri = bf5.a;
            aVar = yk8.a(context.getString(C0707R.string.go_tts_logged_out), Locale.US).q(qd5.a).B();
        } else {
            aVar = b.a;
        }
        return a.z(C, aVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.a.startActivity(new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(bf5.a).addFlags(268435456));
    }
}

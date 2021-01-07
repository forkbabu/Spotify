package defpackage;

import io.reactivex.a0;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;

/* access modifiers changed from: package-private */
/* renamed from: zu1  reason: default package */
public class zu1 implements f {
    final /* synthetic */ a0 a;

    zu1(av1 av1, a0 a0Var) {
        this.a = a0Var;
    }

    @Override // okhttp3.f
    public void onFailure(e eVar, IOException iOException) {
        this.a.onError(iOException);
    }

    @Override // okhttp3.f
    public void onResponse(e eVar, d0 d0Var) {
        try {
            this.a.onSuccess(av1.a(d0Var));
        } catch (Exception e) {
            this.a.onError(e);
        }
    }
}

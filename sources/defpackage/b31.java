package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import defpackage.q21;
import io.reactivex.functions.l;

/* renamed from: b31  reason: default package */
public final /* synthetic */ class b31 implements l {
    public final /* synthetic */ q21.d a;

    public /* synthetic */ b31(q21.d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return r21.e(this.a.a(), PasswordValidator.PasswordValidation.NOT_VALIDATED);
    }
}

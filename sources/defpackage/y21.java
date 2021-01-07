package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import defpackage.q21;
import io.reactivex.functions.l;

/* renamed from: y21  reason: default package */
public final /* synthetic */ class y21 implements l {
    public final /* synthetic */ q21.d a;

    public /* synthetic */ y21(q21.d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return r21.e(this.a.a(), (PasswordValidator.PasswordValidation) obj);
    }
}

package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ske  reason: default package */
public final /* synthetic */ class ske implements w {
    public final /* synthetic */ PasswordValidator a;

    public /* synthetic */ ske(PasswordValidator passwordValidator) {
        this.a = passwordValidator;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.j0(new rke(this.a));
    }
}

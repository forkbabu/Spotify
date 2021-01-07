package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: x21  reason: default package */
public final /* synthetic */ class x21 implements w {
    public final /* synthetic */ PasswordValidator a;

    public /* synthetic */ x21(PasswordValidator passwordValidator) {
        this.a = passwordValidator;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new d31(this.a), false, Integer.MAX_VALUE);
    }
}

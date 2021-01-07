package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import defpackage.nke;
import io.reactivex.functions.l;

/* renamed from: rke  reason: default package */
public final /* synthetic */ class rke implements l {
    public final /* synthetic */ PasswordValidator a;

    public /* synthetic */ rke(PasswordValidator passwordValidator) {
        this.a = passwordValidator;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        nke.a aVar = (nke.a) obj;
        return oke.a(aVar.a(), this.a.a(aVar.a()));
    }
}

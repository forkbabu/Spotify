package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import defpackage.q21;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: d31  reason: default package */
public final /* synthetic */ class d31 implements l {
    public final /* synthetic */ PasswordValidator a;

    public /* synthetic */ d31(PasswordValidator passwordValidator) {
        this.a = passwordValidator;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        q21.d dVar = (q21.d) obj;
        return s.i0(this.a.a(dVar.a())).j0(new y21(dVar)).r0(new b31(dVar));
    }
}

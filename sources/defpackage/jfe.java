package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: jfe  reason: default package */
public final /* synthetic */ class jfe implements w {
    public final /* synthetic */ iae a;
    public final /* synthetic */ AgeValidator b;
    public final /* synthetic */ i31 c;

    public /* synthetic */ jfe(iae iae, AgeValidator ageValidator, i31 i31) {
        this.a = iae;
        this.b = ageValidator;
        this.c = i31;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new bge(this.a, this.b, this.c));
    }
}

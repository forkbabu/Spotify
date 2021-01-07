package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import defpackage.hee;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;

/* renamed from: bge  reason: default package */
public final /* synthetic */ class bge implements l {
    public final /* synthetic */ iae a;
    public final /* synthetic */ AgeValidator b;
    public final /* synthetic */ i31 c;

    public /* synthetic */ bge(iae iae, AgeValidator ageValidator, i31 i31) {
        this.a = iae;
        this.b = ageValidator;
        this.c = i31;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        iae iae = this.a;
        AgeValidator ageValidator = this.b;
        i31 i31 = this.c;
        rfe rfe = rfe.a;
        if (((hee.e) obj).c()) {
            return iae.b().P().N(new dge(ageValidator, i31)).W(rfe, false, Integer.MAX_VALUE).s0((R) iee.w());
        }
        return iae.b().P().q(new m1e()).N(new dge(ageValidator, i31)).W(rfe, false, Integer.MAX_VALUE).p0(o.a);
    }
}

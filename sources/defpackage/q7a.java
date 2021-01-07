package defpackage;

import defpackage.d7a;
import io.reactivex.functions.i;
import kotlin.jvm.internal.h;

/* renamed from: q7a  reason: default package */
final class q7a<T1, T2, T3, T4, R> implements i<d7a, Boolean, Boolean, Boolean, Boolean> {
    public static final q7a a = new q7a();

    q7a() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.i
    public Boolean a(d7a d7a, Boolean bool, Boolean bool2, Boolean bool3) {
        d7a d7a2 = d7a;
        Boolean bool4 = bool;
        Boolean bool5 = bool2;
        Boolean bool6 = bool3;
        h.e(d7a2, "carModeState");
        h.e(bool4, "isOptInAvailable");
        h.e(bool5, "isVoiceEnabled");
        h.e(bool6, "isLandscape");
        boolean z = false;
        boolean z2 = !(d7a2 instanceof d7a.c) && bool4.booleanValue() && !bool6.booleanValue();
        if (bool5.booleanValue() && !z2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

import com.spotify.allboarding.model.v1.proto.OnboardingResponse;
import com.spotify.libs.onboarding.allboarding.room.PickerStepData;
import com.spotify.libs.onboarding.allboarding.room.i;
import com.spotify.libs.onboarding.allboarding.room.s;
import defpackage.kw0;
import io.reactivex.functions.l;
import kotlin.Pair;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: lw0  reason: default package */
final class lw0<T, R> implements l<OnboardingResponse, f> {
    final /* synthetic */ kw0.b a;
    final /* synthetic */ Pair b;

    lw0(kw0.b bVar, Pair pair) {
        this.a = bVar;
        this.b = pair;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public f apply(OnboardingResponse onboardingResponse) {
        OnboardingResponse onboardingResponse2 = onboardingResponse;
        h.e(onboardingResponse2, "it");
        PickerStepData f = ((s) this.a.a.b.x()).f(((PickerStepData) this.b.c()).b());
        kw0.a(this.a.a, f, onboardingResponse2);
        ((i) this.a.a.b.t()).b(((PickerStepData) this.b.c()).g(), f.b());
        return f.a;
    }
}

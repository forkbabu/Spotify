package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.signup.splitflow.SignupActivity;
import kotlin.jvm.internal.h;

/* renamed from: oif  reason: default package */
public final class oif implements v01<Destination.h.c> {
    final /* synthetic */ boolean a;

    oif(boolean z) {
        this.a = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination, android.app.Activity] */
    @Override // defpackage.v01
    public Intent b(Destination.h.c cVar, Activity activity) {
        Destination.h.c cVar2 = cVar;
        h.e(cVar2, "destination");
        h.e(activity, "sourceActivity");
        Intent R0 = SignupActivity.R0(activity, this.a, cVar2.c(), cVar2.b(), cVar2.a());
        h.d(R0, "SignupActivity.createInt…rce\n                    )");
        return R0;
    }
}

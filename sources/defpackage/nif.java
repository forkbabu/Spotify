package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.signup.splitflow.SignupActivity;
import kotlin.jvm.internal.h;

/* renamed from: nif  reason: default package */
public final class nif implements v01<Destination.h.b> {
    final /* synthetic */ boolean a;

    nif(boolean z) {
        this.a = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination, android.app.Activity] */
    @Override // defpackage.v01
    public Intent b(Destination.h.b bVar, Activity activity) {
        Destination.h.b bVar2 = bVar;
        h.e(bVar2, "destination");
        h.e(activity, "sourceActivity");
        Intent P0 = SignupActivity.P0(activity, this.a, bVar2.a());
        h.d(P0, "SignupActivity.createInt…ser\n                    )");
        return P0;
    }
}

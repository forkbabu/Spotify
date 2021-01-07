package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.signup.splitflow.SignupActivity;
import kotlin.jvm.internal.h;

/* renamed from: mif  reason: default package */
public final class mif implements v01<Destination.h.a> {
    final /* synthetic */ boolean a;

    mif(boolean z) {
        this.a = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination, android.app.Activity] */
    @Override // defpackage.v01
    public Intent b(Destination.h.a aVar, Activity activity) {
        h.e(aVar, "destination");
        h.e(activity, "sourceActivity");
        Intent O0 = SignupActivity.O0(activity, this.a);
        h.d(O0, "SignupActivity.createInt…ild\n                    )");
        return O0;
    }
}

package defpackage;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.spotify.googleauth.GoogleLoginFragment;
import com.spotify.loginflow.navigation.Destination;
import kotlin.jvm.internal.h;

/* renamed from: pm0  reason: default package */
public final class pm0 implements w01<Destination.Google> {
    pm0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination] */
    @Override // defpackage.w01
    public DialogFragment a(Destination.Google google) {
        Destination.Google google2 = google;
        h.e(google2, "destination");
        Destination.Google.SupportedSourceScreen a = google2.a();
        h.e(a, "launchedFrom");
        GoogleLoginFragment googleLoginFragment = new GoogleLoginFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("launched_from_screen", a);
        googleLoginFragment.r4(bundle);
        return googleLoginFragment;
    }
}

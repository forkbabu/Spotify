package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.features.login.startview.WelcomeBackFragment;
import kotlin.jvm.internal.h;

/* renamed from: jo5  reason: default package */
public final class jo5 implements x01<Destination.j> {
    jo5() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination] */
    @Override // defpackage.x01
    public Fragment a(Destination.j jVar) {
        h.e(jVar, "destination");
        WelcomeBackFragment welcomeBackFragment = new WelcomeBackFragment();
        h.d(welcomeBackFragment, "WelcomeBackFragment.create()");
        return welcomeBackFragment;
    }
}

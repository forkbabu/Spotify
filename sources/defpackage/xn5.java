package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.features.login.LoginFragment;

/* renamed from: xn5  reason: default package */
public final /* synthetic */ class xn5 implements x01 {
    public static final /* synthetic */ xn5 a = new xn5();

    private /* synthetic */ xn5() {
    }

    @Override // defpackage.x01
    public final Fragment a(Destination destination) {
        Destination.e eVar = (Destination.e) destination;
        if (eVar.b() == null) {
            return new LoginFragment();
        }
        String b = eVar.b();
        String a2 = eVar.a();
        int i = LoginFragment.o0;
        Bundle F = je.F("EMAIL_OR_USERNAME", b, "DISPLAY_NAME", a2);
        LoginFragment loginFragment = new LoginFragment();
        loginFragment.r4(F);
        return loginFragment;
    }
}

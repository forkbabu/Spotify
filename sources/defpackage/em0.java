package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.facebook.authentication.signup.CreateAccountFragment;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.a;

/* renamed from: em0  reason: default package */
public final /* synthetic */ class em0 implements x01 {
    public static final /* synthetic */ em0 a = new em0();

    private /* synthetic */ em0() {
    }

    @Override // defpackage.x01
    public final Fragment a(Destination destination) {
        a a2 = ((Destination.b) destination).a();
        int i = CreateAccountFragment.p0;
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_FACEBOOK_USER", a2);
        CreateAccountFragment createAccountFragment = new CreateAccountFragment();
        createAccountFragment.r4(bundle);
        return createAccountFragment;
    }
}

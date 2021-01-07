package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.facebook.authentication.login.FacebookSSOFragment;
import com.spotify.loginflow.navigation.Destination;

/* renamed from: bm0  reason: default package */
public final /* synthetic */ class bm0 implements x01 {
    public static final /* synthetic */ bm0 a = new bm0();

    private /* synthetic */ bm0() {
    }

    @Override // defpackage.x01
    public final Fragment a(Destination destination) {
        Destination.c cVar = (Destination.c) destination;
        return new FacebookSSOFragment();
    }
}

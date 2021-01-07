package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.magiclink.request.MagicLinkRequestFragment;
import kotlin.jvm.internal.h;

/* renamed from: a11  reason: default package */
public final class a11 implements x01<Destination.a> {
    a11() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination] */
    @Override // defpackage.x01
    public Fragment a(Destination.a aVar) {
        Destination.a aVar2 = aVar;
        h.e(aVar2, "destination");
        String a = aVar2.a();
        boolean c = aVar2.c();
        String b = aVar2.b();
        MagicLinkRequestFragment magicLinkRequestFragment = new MagicLinkRequestFragment();
        Bundle bundle = new Bundle();
        bundle.putString("magiclink_email_or_username", a);
        bundle.putBoolean("magiclink_show_done_screen", c);
        bundle.putString("magiclink_initial_error_msg", b);
        magicLinkRequestFragment.r4(bundle);
        h.d(magicLinkRequestFragment, "MagicLinkRequestFragment…age\n                    )");
        return magicLinkRequestFragment;
    }
}

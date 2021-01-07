package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.sociallistening.models.b;
import kotlin.jvm.internal.h;

/* renamed from: j4d  reason: default package */
/* compiled from: SocialListeningConnectButtonHelper.kt */
public final /* synthetic */ class j4d {
    public static boolean a(GaiaDevice gaiaDevice, b bVar) {
        h.e(bVar, "socialListeningState");
        h.e(bVar, "socialListeningState");
        return gaiaDevice != null && bVar.d().size() >= 2;
    }
}

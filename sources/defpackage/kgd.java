package defpackage;

import com.spotify.music.spotlets.scannables.ScannablesActivity;
import com.spotify.music.spotlets.scannables.view.i;

/* renamed from: kgd  reason: default package */
public final class kgd {
    private final wlf<i> a;
    private final wlf<ScannablesActivity> b;

    public kgd(wlf<i> wlf, wlf<ScannablesActivity> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public jgd b(boolean z) {
        i iVar = this.a.get();
        a(iVar, 2);
        ScannablesActivity scannablesActivity = this.b.get();
        a(scannablesActivity, 3);
        return new jgd(z, iVar, scannablesActivity);
    }
}

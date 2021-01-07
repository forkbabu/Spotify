package defpackage;

import com.sensory.speech.snsr.BuildConfig;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.a;
import java.util.Collections;

/* renamed from: kw8  reason: default package */
public class kw8 implements fze {
    private final nfd a;
    private final faa b;

    public kw8(nfd nfd, gaa gaa) {
        faa b2 = gaa.b();
        this.a = nfd;
        this.b = b2;
    }

    public void a(l0 l0Var) {
        this.a.c(new String[]{l0Var.F()}, ViewUris.f2, false, true, -1, kfd.B1, bu9.A, null);
    }

    public a b(String str) {
        l0 z = l0.z(str);
        if (x.i(z)) {
            return a.u(new jw8(this, z));
        }
        if (x.e(z.q())) {
            return this.b.f(PreparePlayOptions.builder().build(), PlayOrigin.builder(kfd.B1.toString()).featureVersion(BuildConfig.VERSION_NAME).viewUri(ViewUris.f2.toString()).build(), Collections.emptyMap());
        }
        throw new IllegalArgumentException("Invalid link, isLegacyLink() should be updated");
    }
}

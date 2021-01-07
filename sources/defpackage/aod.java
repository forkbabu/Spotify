package defpackage;

import android.net.Uri;
import com.spotify.music.track.share.impl.video.service.TransformCanvasRequest;
import com.spotify.music.track.share.impl.video.service.TransformCanvasResponse;
import com.spotify.music.track.share.impl.video.service.a;
import com.spotify.remoteconfig.w7;
import defpackage.dod;
import io.reactivex.p;
import io.reactivex.z;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: aod  reason: default package */
public class aod implements znd {
    private final dod.a a;
    private final w7 b;
    private final a c;
    private final vnd d;

    public aod(dod.a aVar, w7 w7Var, a aVar2, vnd vnd) {
        this.a = aVar;
        this.b = w7Var;
        this.c = aVar2;
        this.d = vnd;
    }

    private File b(String str) {
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment != null) {
            return this.d.a(lastPathSegment);
        }
        throw new IllegalArgumentException(je.x0("Invalid videoUrl: ", str));
    }

    @Override // defpackage.znd
    public z<ynd> a(String str) {
        return z.z(Boolean.valueOf(this.b.a())).r(jnd.a).g(new knd(this, str)).g(new rnd(this)).s(10, TimeUnit.SECONDS).o(lnd.a).r(z.y(new mnd(this, str)).A(ond.a));
    }

    public /* synthetic */ Uri c(String str, v vVar) {
        return this.d.b(((e0) vVar.a()).a(), b(str));
    }

    public /* synthetic */ Uri d(String str) {
        return this.d.b(this.a.a(str), b(str));
    }

    public p e(String str, Boolean bool) {
        return this.c.a(TransformCanvasRequest.create(str)).O();
    }

    public p f(TransformCanvasResponse transformCanvasResponse) {
        String transformedCanvasUrl = transformCanvasResponse.transformedCanvasUrl();
        return this.c.b(transformedCanvasUrl).r(nnd.a).l(new qnd(this, transformedCanvasUrl)).l(pnd.a);
    }
}

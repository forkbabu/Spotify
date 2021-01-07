package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.spotify.mobile.android.video.offline.e0;
import com.spotify.mobile.android.video.u;
import com.spotify.mobile.android.video.x;

/* renamed from: f72  reason: default package */
public class f72 implements c72 {
    @Override // defpackage.c72
    public t a(x xVar, u uVar, e0 e0Var, e72 e72) {
        return new y.a(new FileDataSource.a()).a(Uri.parse(xVar.b()));
    }

    @Override // defpackage.c72
    public String b(x xVar) {
        return xVar.b();
    }

    @Override // defpackage.c72
    public boolean c(x xVar) {
        return xVar.b().startsWith("file:");
    }

    @Override // defpackage.c72
    public String getType() {
        return "file";
    }
}

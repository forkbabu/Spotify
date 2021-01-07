package defpackage;

import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.mobile.android.video.offline.d0;
import com.spotify.mobile.android.video.offline.f0;
import com.spotify.mobile.android.video.offline.logging.BetamaxDownloadSessionLogger;
import com.spotify.mobile.android.video.offline.r;
import com.spotify.mobile.android.video.offline.s;

/* renamed from: v72  reason: default package */
public final /* synthetic */ class v72 implements s {
    public final /* synthetic */ gl0 a;
    public final /* synthetic */ y b;

    public /* synthetic */ v72(gl0 gl0, y yVar) {
        this.a = gl0;
        this.b = yVar;
    }

    @Override // com.spotify.mobile.android.video.offline.s
    public final r a(d0 d0Var, f0 f0Var) {
        return new BetamaxDownloadSessionLogger(this.a, f0Var, this.b);
    }
}

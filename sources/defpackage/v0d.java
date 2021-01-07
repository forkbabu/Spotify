package defpackage;

import androidx.fragment.app.c;
import com.spotify.music.share.loadingview.ShareLoadingDialogFragment;
import com.spotify.music.share.logging.ShareMenuLogger;
import defpackage.xzc;
import io.reactivex.y;

/* renamed from: v0d  reason: default package */
public class v0d {
    private final x6e a;
    private final y b;
    private final xzc.a c;
    private final ShareMenuLogger d;

    public v0d(x6e x6e, y yVar, xzc.a aVar, ShareMenuLogger shareMenuLogger) {
        this.a = x6e;
        this.b = yVar;
        this.c = aVar;
        this.d = shareMenuLogger;
    }

    public u0d a(c cVar, t0d t0d, pzc pzc, z7e z7e, d8e d8e, a1d a1d, qzc qzc) {
        return new u0d(this.a, a1d, cVar, z7e, d8e, new ShareLoadingDialogFragment(), t0d, pzc, this.b, this.c.a(qzc), this.d);
    }
}

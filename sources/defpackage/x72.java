package defpackage;

import android.content.Context;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import io.reactivex.z;
import java.io.File;
import java.util.List;
import okhttp3.y;

/* renamed from: x72  reason: default package */
public interface x72 {

    /* renamed from: x72$a */
    public interface a {
        x72 a(Context context, gl0<u> gl0, y yVar, File file, y62 y62, z<p62> zVar, List<f> list, io.reactivex.y yVar2, cqe cqe, com.spotify.mobile.android.util.connectivity.y yVar3, boolean z, boolean z2);
    }

    BetamaxOfflineManager a();

    com.spotify.mobile.android.video.offline.z b();
}

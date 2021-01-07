package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.List;

/* renamed from: nhd  reason: default package */
public class nhd {
    private final List<mhd> a;

    public nhd(mhd... mhdArr) {
        this.a = Arrays.asList(mhdArr);
    }

    public void a(Uri uri, Uri uri2) {
        for (mhd mhd : this.a) {
            mhd.b(uri, uri2);
        }
    }

    public void b(Intent intent) {
        for (mhd mhd : this.a) {
            Logger.b("AttributionTracker(%s) is enabled, passing intent through", mhd.c());
            mhd.a(intent);
        }
    }
}

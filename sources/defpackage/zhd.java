package defpackage;

import android.net.Uri;
import com.adjust.sdk.OnDeeplinkResponseListener;

/* renamed from: zhd  reason: default package */
public final /* synthetic */ class zhd implements OnDeeplinkResponseListener {
    public final /* synthetic */ fid a;

    public /* synthetic */ zhd(fid fid) {
        this.a = fid;
    }

    @Override // com.adjust.sdk.OnDeeplinkResponseListener
    public final boolean launchReceivedDeeplink(Uri uri) {
        this.a.r(uri);
        return true;
    }
}

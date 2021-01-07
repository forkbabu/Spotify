package defpackage;

import android.net.Uri;

/* renamed from: ol4  reason: default package */
public class ol4 implements ll4 {
    @Override // defpackage.ll4
    public boolean a(Uri uri) {
        String path = uri.getPath();
        return path.contains("account/csi/end/") || path.contains("retailer/sony/response/success") || path.contains("/mobile/close/");
    }
}

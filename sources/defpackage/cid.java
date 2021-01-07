package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.adjust.sdk.Constants;

/* renamed from: cid  reason: default package */
public class cid implements mhd {
    private final hid a;

    cid(hid hid) {
        this.a = hid;
    }

    @Override // defpackage.mhd
    public void a(Intent intent) {
        this.a.a(intent.getData());
    }

    @Override // defpackage.mhd
    public void b(Uri uri, Uri uri2) {
    }

    @Override // defpackage.mhd
    public String c() {
        return Constants.LOGTAG;
    }
}

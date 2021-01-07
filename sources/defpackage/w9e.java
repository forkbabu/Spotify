package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.ShareCapability;

/* renamed from: w9e  reason: default package */
public interface w9e {
    Intent a(String str, Optional<Uri> optional, Uri uri, ShareCapability shareCapability);

    boolean b();

    String c();

    Intent d(String str, Uri uri, String str2, String str3);

    boolean e(PackageManager packageManager);

    String f();
}

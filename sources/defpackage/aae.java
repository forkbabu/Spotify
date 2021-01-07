package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.ShareCapability;

/* renamed from: aae  reason: default package */
public class aae implements w9e {
    @Override // defpackage.w9e
    public Intent a(String str, Optional<Uri> optional, Uri uri, ShareCapability shareCapability) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        if (shareCapability == ShareCapability.VIDEO_STORY) {
            intent.setDataAndType(uri, "video/mp4");
        } else {
            intent.setDataAndType(uri, "image/png");
        }
        if (optional.isPresent()) {
            intent.putExtra("interactive_asset_uri", optional.get());
        }
        intent.putExtra("content_url", str);
        return intent;
    }

    @Override // defpackage.w9e
    public boolean b() {
        return false;
    }

    @Override // defpackage.w9e
    public String c() {
        return "instagram";
    }

    @Override // defpackage.w9e
    public Intent d(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/png");
        intent.putExtra("interactive_asset_uri", uri);
        intent.putExtra("content_url", str);
        intent.putExtra("top_background_color", str2);
        intent.putExtra("bottom_background_color", str3);
        return intent;
    }

    @Override // defpackage.w9e
    public boolean e(PackageManager packageManager) {
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/*");
        if (packageManager.resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w9e
    public String f() {
        return "ig_stories";
    }
}

package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.ShareCapability;

/* renamed from: x9e  reason: default package */
public class x9e implements w9e {
    private final String a;

    public x9e(String str) {
        this.a = str;
    }

    @Override // defpackage.w9e
    public Intent a(String str, Optional<Uri> optional, Uri uri, ShareCapability shareCapability) {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        if (shareCapability == ShareCapability.VIDEO_STORY) {
            intent.setDataAndType(uri, "video/mp4");
        } else {
            intent.setDataAndType(uri, "image/png");
        }
        if (optional.isPresent()) {
            intent.putExtra("interactive_asset_uri", optional.get());
        }
        intent.putExtra("content_url", str);
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", this.a);
        return intent;
    }

    @Override // defpackage.w9e
    public boolean b() {
        return false;
    }

    @Override // defpackage.w9e
    public String c() {
        return "facebook";
    }

    @Override // defpackage.w9e
    public Intent d(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("image/png");
        intent.putExtra("interactive_asset_uri", uri);
        intent.putExtra("content_url", str);
        intent.putExtra("top_background_color", str2);
        intent.putExtra("bottom_background_color", str3);
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", this.a);
        return intent;
    }

    @Override // defpackage.w9e
    public boolean e(PackageManager packageManager) {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("image/*");
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", this.a);
        if (packageManager.resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w9e
    public String f() {
        return "fb_stories";
    }
}

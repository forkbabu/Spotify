package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.sharedata.ShareCapability;
import org.json.JSONObject;

/* renamed from: dae  reason: default package */
public class dae implements w9e {
    private final String a;

    public dae(String str) {
        this.a = str;
    }

    @Override // defpackage.w9e
    public Intent a(String str, Optional<Uri> optional, Uri uri, ShareCapability shareCapability) {
        Intent intent = new Intent();
        intent.setDataAndType(Uri.parse("snapchat://creativekit/preview/1"), "image/*");
        intent.putExtra("CLIENT_ID", this.a);
        if (optional.isPresent()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uri", optional.get());
                intent.putExtra("sticker", jSONObject.toString());
            } catch (Exception e) {
                Logger.d(e.getMessage(), new Object[0]);
            }
        }
        intent.setPackage("com.snapchat.android");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("attachmentUrl", str);
        return intent;
    }

    @Override // defpackage.w9e
    public boolean b() {
        return true;
    }

    @Override // defpackage.w9e
    public String c() {
        return "snapchat";
    }

    @Override // defpackage.w9e
    public Intent d(String str, Uri uri, String str2, String str3) {
        throw new IllegalArgumentException("SnapchatStoriesApi doesn't support background colors");
    }

    @Override // defpackage.w9e
    public boolean e(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setDataAndType(Uri.parse("snapchat://creativekit/preview/1"), "image/*");
        intent.setPackage("com.snapchat.android");
        if (packageManager.resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w9e
    public String f() {
        return "sc_stories";
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.spotify.music.C0707R;

/* renamed from: t7e  reason: default package */
public class t7e {
    private final Resources a;

    public t7e(Context context) {
        this.a = context.getResources();
    }

    public Intent a(Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.setPackage(this.a.getString(C0707R.string.share_twitter_package));
        intent.putExtra("android.intent.extra.STREAM", uri);
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        return intent;
    }
}

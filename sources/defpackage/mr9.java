package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.homething.view.HomethingActivity;

/* renamed from: mr9  reason: default package */
public class mr9 implements lr9 {
    @Override // defpackage.lr9
    public Intent a(Context context) {
        int i = HomethingActivity.I;
        return new Intent("com.spotify.music.features.homething.OPEN_SETTINGS", Uri.EMPTY, context, HomethingActivity.class);
    }

    @Override // defpackage.lr9
    public Intent b(Context context) {
        int i = HomethingActivity.I;
        return new Intent("com.spotify.music.features.homething.ADD_DEVICE", Uri.EMPTY, context, HomethingActivity.class);
    }
}

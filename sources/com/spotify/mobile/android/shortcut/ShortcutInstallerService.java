package com.spotify.mobile.android.shortcut;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.viewuri.c;
import dagger.android.f;

public class ShortcutInstallerService extends f {
    a a;

    public ShortcutInstallerService() {
        super("ShortcutInstallerService");
    }

    public static void a(Context context, String str, String str2, String str3, c cVar) {
        Intent intent = new Intent(context, ShortcutInstallerService.class);
        intent.setAction("install_shortcut");
        intent.putExtra("uri", str);
        intent.putExtra("title", str2);
        intent.putExtra("image_uri", str3);
        intent.putExtra("source_view_uri", cVar);
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent != null && "install_shortcut".equals(intent.getAction())) {
            this.a.b(intent.getStringExtra("uri"), intent.getStringExtra("title"), intent.getStringExtra("image_uri"), (c) intent.getParcelableExtra("source_view_uri"));
        }
    }
}

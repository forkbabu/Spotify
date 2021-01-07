package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.scannables.ScannablesActivity;
import kotlin.jvm.internal.h;

/* renamed from: h4d  reason: default package */
public final class h4d implements g4d {
    private final Fragment a;
    private final t b;

    public h4d(Fragment fragment, t tVar) {
        h.e(fragment, "fragment");
        h.e(tVar, "navigator");
        this.a = fragment;
        this.b = tVar;
    }

    @Override // defpackage.g4d
    public void a() {
        Fragment fragment = this.a;
        Context l4 = fragment.l4();
        int i = ScannablesActivity.K;
        Intent intent = new Intent(l4, ScannablesActivity.class);
        intent.putExtra("EXTRA_SOCIAL_LISTENING", true);
        fragment.H4(intent, ContentMediaFormat.FULL_CONTENT_GENERIC, null);
    }

    @Override // defpackage.g4d
    public void b(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1001) {
            h.c(intent);
            String stringExtra = intent.getStringExtra("com.spotify.music.spotlets.scannables.RESULT");
            Logger.b("social listening activity result handler: uri %s", stringExtra);
            if (stringExtra != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("from_scannable", true);
                this.b.f(stringExtra, bundle);
            }
        }
    }
}

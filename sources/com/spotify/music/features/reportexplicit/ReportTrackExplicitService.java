package com.spotify.music.features.reportexplicit;

import android.content.Intent;
import android.os.Handler;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import dagger.android.f;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class ReportTrackExplicitService extends f {
    private final Handler a = new Handler();
    d b;
    o0 c;

    public ReportTrackExplicitService() {
        super("Spotify Helper");
    }

    private void a(z<Boolean> zVar) {
        try {
            if (zVar.L(500, TimeUnit.MILLISECONDS, z.z(Boolean.FALSE)).d().booleanValue()) {
                this.a.post(new c(this, SpotifyIconV2.CHECK, C0707R.string.report_explicit_success));
                return;
            }
            this.a.post(new c(this, SpotifyIconV2.X, C0707R.string.report_explicit_error));
        } catch (Exception e) {
            this.a.post(new c(this, SpotifyIconV2.X, C0707R.string.report_explicit_error));
            Logger.e(e, "Error reporting track as explicit", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent != null && intent.hasExtra("TRACK_URI") && intent.hasExtra("IS_EXPLICIT")) {
            String stringExtra = intent.getStringExtra("TRACK_URI");
            String stringExtra2 = intent.getStringExtra("CONTEXT_URI");
            if (intent.getBooleanExtra("IS_EXPLICIT", false)) {
                a(this.b.b(stringExtra, stringExtra2));
            } else {
                a(this.b.a(stringExtra, stringExtra2));
            }
        }
    }
}

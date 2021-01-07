package com.spotify.music.features.voice;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.fragment.app.c;
import com.spotify.music.C0707R;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.a;
import com.spotify.music.libs.voice.e;
import io.reactivex.s;

public final class r implements v8f {
    private final c a;
    private final e b;
    private final w52 c;
    private final io.reactivex.subjects.c<Boolean> d;
    private final a e;

    r(c cVar, e eVar, w52 w52, io.reactivex.subjects.c<Boolean> cVar2, a aVar) {
        this.a = cVar;
        this.b = eVar;
        this.c = w52;
        this.d = cVar2;
        this.e = aVar;
    }

    @Override // defpackage.v8f
    public void a() {
        this.b.h(true);
    }

    @Override // defpackage.v8f
    public void b() {
        this.b.h(true);
        this.e.a(this.a, VoiceSourceElement.VOICE_ONBOARDING, kfd.B1, null);
        this.a.finish();
    }

    @Override // defpackage.v8f
    public s<Boolean> c() {
        return this.d;
    }

    @Override // defpackage.v8f
    public void d() {
        this.c.c(this.a, "android.permission.RECORD_AUDIO");
    }

    @Override // defpackage.v8f
    public void dismiss() {
        this.a.finish();
    }

    @Override // defpackage.v8f
    public void e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (this.a.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            Toast.makeText(this.a, (int) C0707R.string.error_could_not_open, 0).show();
        } else {
            this.a.startActivity(intent);
        }
    }
}

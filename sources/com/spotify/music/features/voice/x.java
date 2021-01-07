package com.spotify.music.features.voice;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.fragment.app.c;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.C0707R;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.VoiceSpeechLocale;
import com.spotify.music.libs.voice.b;
import com.spotify.music.libs.voice.e;
import io.reactivex.s;

public final class x implements tef {
    private final c a;
    private final e b;
    private final w52 c;
    private final io.reactivex.subjects.c<Boolean> d;
    private final b e;
    private final w f;
    private final boolean g;

    x(c cVar, e eVar, w52 w52, io.reactivex.subjects.c<Boolean> cVar2, b bVar, w wVar, boolean z) {
        this.a = cVar;
        this.b = eVar;
        this.c = w52;
        this.d = cVar2;
        this.e = bVar;
        this.f = wVar;
        this.g = z;
    }

    @Override // defpackage.tef
    public void a() {
        this.b.h(true);
    }

    @Override // defpackage.tef
    public void b() {
        this.b.h(true);
        this.e.b(this.a, VoiceSourceElement.VOICE_ONBOARDING, kfd.B1);
        this.a.finish();
    }

    @Override // defpackage.tef
    public s<Boolean> c() {
        return this.d;
    }

    @Override // defpackage.tef
    public void d() {
        this.c.c(this.a, "android.permission.RECORD_AUDIO");
    }

    @Override // defpackage.tef
    public void dismiss() {
        this.a.finish();
    }

    @Override // defpackage.tef
    public void e() {
        this.b.l(true);
    }

    @Override // defpackage.tef
    public boolean f() {
        return this.b.e();
    }

    @Override // defpackage.tef
    public s<String> g() {
        return this.f.a("country_code");
    }

    @Override // defpackage.tef
    public void h(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (this.a.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            Toast.makeText(this.a, (int) C0707R.string.error_could_not_open, 0).show();
        } else {
            this.a.startActivity(intent);
        }
    }

    @Override // defpackage.tef
    public void i() {
        this.b.k(true);
    }

    @Override // defpackage.tef
    public void j(String str) {
        if (this.g) {
            VoiceSpeechLocale voiceSpeechLocale = VoiceSpeechLocale.ENGLISH_USA;
            if (str.equals(voiceSpeechLocale.h())) {
                this.b.g(voiceSpeechLocale);
                return;
            }
            VoiceSpeechLocale voiceSpeechLocale2 = VoiceSpeechLocale.SPANISH_MEXICO;
            if (str.equals(voiceSpeechLocale2.h())) {
                this.b.g(voiceSpeechLocale2);
            } else {
                this.b.g(voiceSpeechLocale);
            }
        }
    }
}

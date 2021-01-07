package com.spotify.music.libs.voice;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Locale;

public class e {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("voice_onboarding_completed_2");
    private static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("voice_onboarding_completed_3");
    private static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.e("voice_wakeword_onboarding_completed");
    private static final SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("voice_mic_tooltip_1");
    static final SpSharedPreferences.b<Object, String> f = SpSharedPreferences.b.e("voice_tts_option");
    static final SpSharedPreferences.b<Object, String> g = SpSharedPreferences.b.e("voice_locale");
    public static final SpSharedPreferences.b<Object, Boolean> h = SpSharedPreferences.b.e("voice_ww_enabled");
    public static final SpSharedPreferences.b<Object, String> i = SpSharedPreferences.b.c("voice_backend_endpoint");
    private final SpSharedPreferences<Object> a;

    e(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public String a(cmf<String> cmf) {
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, String> bVar = f;
        if (spSharedPreferences.m(bVar, null) == null) {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.f(bVar, cmf.invoke());
            b2.i();
        }
        String l = this.a.l(bVar);
        l.getClass();
        return l;
    }

    @Deprecated
    public boolean b() {
        return this.a.d(b, false);
    }

    public boolean c() {
        return this.a.d(c, false);
    }

    public boolean d() {
        return this.a.d(h, false);
    }

    public boolean e() {
        return this.a.d(d, false);
    }

    public VoiceSpeechLocale f() {
        String m = this.a.m(g, "");
        if (!MoreObjects.isNullOrEmpty(m)) {
            return VoiceSpeechLocale.g(m);
        }
        Locale locale = Locale.getDefault();
        String str = locale.getLanguage() + '-' + locale.getCountry();
        VoiceSpeechLocale voiceSpeechLocale = VoiceSpeechLocale.ENGLISH_USA;
        if (str.equals(voiceSpeechLocale.h())) {
            return voiceSpeechLocale;
        }
        VoiceSpeechLocale voiceSpeechLocale2 = VoiceSpeechLocale.SPANISH_MEXICO;
        return str.equals(voiceSpeechLocale2.h()) ? voiceSpeechLocale2 : voiceSpeechLocale;
    }

    public void g(VoiceSpeechLocale voiceSpeechLocale) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(g, voiceSpeechLocale.h());
        b2.i();
    }

    public void h(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.i();
    }

    public void i(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(e, z);
        b2.i();
    }

    public void j(String str) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(f, str);
        b2.i();
    }

    public void k(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(h, z);
        b2.i();
    }

    public void l(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(d, z);
        b2.i();
    }

    public boolean m() {
        return !this.a.d(e, false);
    }
}

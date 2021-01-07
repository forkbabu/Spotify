package com.spotify.voice.experience;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.remoteconfig.AndroidLibsVoiceProperties;
import com.spotify.voice.v1.VoiceInteractionManagerFeature;
import java.util.Map;

public final class l implements fjf<Map<String, String>> {
    private final wlf<VoiceFragment> a;
    private final wlf<AndroidLibsVoiceProperties> b;
    private final wlf<Supplier<Boolean>> c;
    private final wlf<SpSharedPreferences<Object>> d;
    private final wlf<com.spotify.voice.api.l> e;
    private final wlf<Boolean> f;
    private final wlf<String> g;

    public l(wlf<VoiceFragment> wlf, wlf<AndroidLibsVoiceProperties> wlf2, wlf<Supplier<Boolean>> wlf3, wlf<SpSharedPreferences<Object>> wlf4, wlf<com.spotify.voice.api.l> wlf5, wlf<Boolean> wlf6, wlf<String> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static l a(wlf<VoiceFragment> wlf, wlf<AndroidLibsVoiceProperties> wlf2, wlf<Supplier<Boolean>> wlf3, wlf<SpSharedPreferences<Object>> wlf4, wlf<com.spotify.voice.api.l> wlf5, wlf<Boolean> wlf6, wlf<String> wlf7) {
        return new l(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        String m;
        VoiceFragment voiceFragment = this.a.get();
        AndroidLibsVoiceProperties androidLibsVoiceProperties = this.b.get();
        Supplier<Boolean> supplier = this.c.get();
        SpSharedPreferences<Object> spSharedPreferences = this.d.get();
        com.spotify.voice.api.l lVar = this.e.get();
        boolean booleanValue = this.f.get().booleanValue();
        String str = this.g.get();
        SpSharedPreferences.b<Object, String> b2 = SpSharedPreferences.b.b("voice_locale");
        String str2 = "en-US";
        if (!(b2 == null || (m = spSharedPreferences.m(b2, str2)) == null)) {
            str2 = m;
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("iid", lVar.b());
        builder.mo51put("asr-hints", lVar.a());
        boolean Y = voiceFragment.Y();
        StringBuilder sb = new StringBuilder(62);
        if (supplier.get().booleanValue()) {
            sb.append(VoiceInteractionManagerFeature.ACCESSIBILITY_SERVICES);
            sb.append(',');
        }
        if (booleanValue) {
            sb.append(VoiceInteractionManagerFeature.TTS);
            sb.append(',');
        }
        if (Y) {
            sb.append(VoiceInteractionManagerFeature.CAR_MODE);
            sb.append(',');
        } else {
            if (androidLibsVoiceProperties.d()) {
                sb.append(VoiceInteractionManagerFeature.GUESSING_DIALOG);
                sb.append(',');
            }
            if (androidLibsVoiceProperties.c()) {
                sb.append(VoiceInteractionManagerFeature.FAVORITES_DIALOG);
                sb.append(',');
            }
            if (androidLibsVoiceProperties.j()) {
                sb.append(VoiceInteractionManagerFeature.UMM_DIALOG);
                sb.append(',');
            }
            if (androidLibsVoiceProperties.e()) {
                sb.append(VoiceInteractionManagerFeature.INTRODUCER);
                sb.append(',');
            }
            if (androidLibsVoiceProperties.f()) {
                sb.append(VoiceInteractionManagerFeature.PLAY_SOMETHING_DIALOG);
                sb.append(',');
            }
        }
        if (androidLibsVoiceProperties.g()) {
            sb.append(VoiceInteractionManagerFeature.RECOMMEND);
            sb.append(',');
        }
        builder.mo51put("enabled_features", sb.toString());
        builder.mo51put("language", str2);
        builder.mo51put("enable_tts", String.valueOf(booleanValue));
        if (booleanValue) {
            builder.mo51put("tts_voice", str);
        }
        builder.mo51put("asr", androidLibsVoiceProperties.a().value());
        builder.mo51put("limit", "16");
        ImmutableMap build = builder.build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}

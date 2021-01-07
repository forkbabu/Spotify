package com.spotify.music.libs.voice;

import com.spotify.music.C0707R;
import java.util.NoSuchElementException;

public enum VoiceSpeechLocale {
    ENGLISH_USA(C0707R.string.settings_voice_language_english, "en-US"),
    SPANISH_MEXICO(C0707R.string.settings_voice_language_spanish, "es-MX");
    
    public static final VoiceSpeechLocale[] c;
    private final int mDisplayRes;
    private final String mLocale;

    static {
        VoiceSpeechLocale voiceSpeechLocale;
        VoiceSpeechLocale voiceSpeechLocale2;
        c = new VoiceSpeechLocale[]{voiceSpeechLocale, voiceSpeechLocale2};
    }

    private VoiceSpeechLocale(int i, String str) {
        this.mDisplayRes = i;
        this.mLocale = str;
    }

    static VoiceSpeechLocale g(String str) {
        VoiceSpeechLocale[] voiceSpeechLocaleArr = c;
        for (VoiceSpeechLocale voiceSpeechLocale : voiceSpeechLocaleArr) {
            if (voiceSpeechLocale.mLocale.equals(str)) {
                return voiceSpeechLocale;
            }
        }
        throw new NoSuchElementException("Locale not found!");
    }

    public int d() {
        return this.mDisplayRes;
    }

    public String h() {
        return this.mLocale;
    }
}

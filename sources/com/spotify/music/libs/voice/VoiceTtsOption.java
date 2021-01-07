package com.spotify.music.libs.voice;

import android.content.Context;
import com.spotify.music.C0707R;
import java.util.Random;

public enum VoiceTtsOption {
    VOICE_ONE("voice1", C0707R.string.settings_voice_tts_option_1),
    VOICE_TWO("voice2", C0707R.string.settings_voice_tts_option_2);
    
    private static final VoiceTtsOption[] c = values();
    private final String mKey;
    private final int mStringRes;

    private VoiceTtsOption(String str, int i) {
        this.mKey = str;
        this.mStringRes = i;
    }

    public static String[] d(Context context) {
        VoiceTtsOption[] voiceTtsOptionArr = c;
        String[] strArr = new String[voiceTtsOptionArr.length];
        int length = voiceTtsOptionArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr[i2] = context.getString(voiceTtsOptionArr[i].mStringRes);
            i++;
            i2++;
        }
        return strArr;
    }

    public static VoiceTtsOption g(int i) {
        return c[i];
    }

    public static String h(Random random) {
        values();
        return c[random.nextInt(2)].mKey;
    }

    public static int k(String str) {
        VoiceTtsOption[] voiceTtsOptionArr = c;
        for (VoiceTtsOption voiceTtsOption : voiceTtsOptionArr) {
            if (voiceTtsOption.mKey.equals(str)) {
                return voiceTtsOption.ordinal();
            }
        }
        return 0;
    }

    public String i() {
        return this.mKey;
    }
}

package com.spotify.music.libs.podcast.download;

import android.icu.text.BreakIterator;
import android.os.Build;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import java.util.Locale;

public final class f0 {
    public static String a(String str) {
        String str2;
        if (MoreObjects.isNullOrEmpty(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            str2 = str.substring(0, characterInstance.next());
        } else {
            str2 = str.substring(0, str.offsetByCodePoints(0, 1));
        }
        return str2.toUpperCase(Locale.getDefault());
    }

    public static boolean b(c cVar) {
        return ((Boolean) cVar.M0(rna.c)).booleanValue();
    }

    public static boolean c(c cVar) {
        return ((Boolean) cVar.M0(rna.c)).booleanValue();
    }
}

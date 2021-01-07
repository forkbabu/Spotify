package com.spotify.music.podcast.episode.util;

import android.content.res.Resources;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import java.util.Locale;

public class c implements DurationFormatter {
    private final Resources a;

    public c(Resources resources) {
        this.a = resources;
    }

    private static String b(Resources resources, int i, boolean z) {
        int i2;
        int i3;
        int i4 = i / 3600;
        if (z) {
            float f = (float) (i - (i4 * 3600));
            i2 = (int) Math.floor((double) (f / 60.0f));
            i3 = (int) Math.ceil((double) (f - (((float) i2) * 60.0f)));
        } else {
            i2 = (int) Math.ceil((double) (((float) (i - (i4 * 3600))) / 60.0f));
            i3 = 0;
        }
        StringBuilder sb = new StringBuilder(0);
        if (i4 > 0) {
            sb.append(resources.getQuantityString(C0707R.plurals.time_format_hours, i4, Integer.valueOf(i4)));
        }
        if (i4 > 0 && i2 > 0) {
            sb.append(' ');
        }
        if (i2 > 0) {
            sb.append(resources.getQuantityString(C0707R.plurals.time_format_min, i2, Integer.valueOf(i2)));
        }
        if ((i4 > 0 || i2 > 0) && i3 > 0) {
            sb.append(' ');
        }
        if (i3 > 0) {
            sb.append(resources.getQuantityString(C0707R.plurals.time_format_sec, i3, Integer.valueOf(i3)));
        }
        return sb.toString().toUpperCase(Locale.getDefault());
    }

    @Override // com.spotify.music.podcast.episode.util.DurationFormatter
    public String a(DurationFormatter.Format format, int i) {
        int ordinal = format.ordinal();
        if (ordinal == 1) {
            return b(this.a, i, true);
        }
        if (ordinal != 2) {
            return String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
        }
        return b(this.a, i, false);
    }
}

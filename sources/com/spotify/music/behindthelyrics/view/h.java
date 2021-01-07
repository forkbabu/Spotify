package com.spotify.music.behindthelyrics.view;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class h implements sg0<String, CharSequence> {
    private static final Pattern b = Pattern.compile("\\[(.*?)\\]", 40);
    private final int a;

    public h(int i) {
        this.a = i;
    }

    /* renamed from: a */
    public CharSequence apply(String str) {
        Pattern pattern = b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            int i2 = i * 2;
            int start = matcher.start() - i2;
            int end = matcher.end() - i2;
            int i3 = start + 1;
            int i4 = end - 1;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.a), i3, i4, 0);
            spannableStringBuilder.delete(start, i3);
            spannableStringBuilder.delete(end - 2, i4);
            i++;
        }
        return spannableStringBuilder;
    }
}

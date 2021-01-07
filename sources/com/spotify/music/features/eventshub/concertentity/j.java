package com.spotify.music.features.eventshub.concertentity;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class j {
    public static Date a(String str, String str2, Locale locale, Calendar calendar) {
        calendar.setTime(new Date(Long.MIN_VALUE));
        Date time = calendar.getTime();
        if (str == null) {
            return time;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, locale);
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            Logger.o(e, "Failed to parse date [%s] with formatter [%s]", str, simpleDateFormat);
            return time;
        }
    }

    public static String b(String str, Date date, Calendar calendar, Locale locale) {
        String str2;
        calendar.setTime(date);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            int i = calendar.get(12);
            str2 = new SimpleDateFormat("EEE, h:mm a", locale).format(date);
            if (i == 0) {
                str2 = DateFormat.format("EEE, h a", date).toString();
            }
        } else {
            str2 = je.y0(calendar.getDisplayName(7, 1, locale), ", ", java.text.DateFormat.getTimeInstance(3, locale).format(date));
        }
        return TextUtils.join(" • ", new String[]{str2, str});
    }

    public static String c(Date date, Calendar calendar, Locale locale) {
        calendar.setTime(date);
        if (!locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            return java.text.DateFormat.getTimeInstance(3, locale).format(date);
        }
        int i = calendar.get(12);
        String format = new SimpleDateFormat("h:mm a", locale).format(date);
        if (i == 0) {
            return DateFormat.format("h a", date).toString();
        }
        return format;
    }

    public static String d(String str, String str2, boolean z) {
        if (str == null && str2 == null) {
            return "";
        }
        if (str == null) {
            return str2;
        }
        return (str2 != null && !z) ? je.y0(str, ", ", str2) : str;
    }

    public static void e(TextView textView, Context context, int i) {
        textView.setTextSize(context.getResources().getDimension(C0707R.dimen.concert_entity_subtitle_text));
        nud.p(context, textView, C0707R.attr.pasteTextAppearanceArticle);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setTextColor(i);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }
}

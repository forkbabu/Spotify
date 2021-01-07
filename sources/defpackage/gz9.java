package defpackage;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import com.spotify.localization.SpotifyLocale;

/* renamed from: gz9  reason: default package */
public final class gz9 {
    private static final String[] a = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};

    public static CharSequence a(int i) {
        if (!"en".equals(SpotifyLocale.e())) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        int length = sb.length();
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                sb.append("th");
                break;
            default:
                sb.append(a[i % 10]);
                break;
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new RelativeSizeSpan(0.5f), length, sb.length(), 0);
        return spannableString;
    }
}

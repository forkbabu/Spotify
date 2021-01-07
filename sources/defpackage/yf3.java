package defpackage;

import android.text.SpannableString;
import com.spotify.music.navigation.t;

/* renamed from: yf3  reason: default package */
public class yf3 {
    private final t a;
    private final uk9 b;

    public yf3(t tVar, uk9 uk9) {
        this.a = tVar;
        this.b = uk9;
    }

    public SpannableString a(String str, String str2, String str3, boolean z) {
        int i;
        tf3 tf3 = new tf3(str3, this.a, this.b);
        if (z) {
            i = str.indexOf("%1$s");
            if (i != -1) {
                str = String.format(str, str2);
            }
        } else {
            i = str.indexOf(str2);
        }
        SpannableString spannableString = new SpannableString(str);
        int length = str2.length() + i;
        if (i != -1) {
            spannableString.setSpan(tf3, i, length, 33);
        }
        return spannableString;
    }
}

package com.spotify.base.java.logging;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class a implements d {
    private static final Pattern a = Pattern.compile("spotify:user:([^:|\" ]+)");
    private static final Pattern b = Pattern.compile("spotify%3Auser%3A([^\\%]+)");
    private static final Pattern c = Pattern.compile("searchview/.*username=([^&]+)");

    private String b(String str, String str2, Pattern pattern, String str3) {
        if (str.contains(str2)) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                try {
                    str = str.replaceAll(matcher.group(1), str3);
                } catch (PatternSyntaxException unused) {
                }
            }
        }
        return str;
    }

    @Override // com.spotify.base.java.logging.d
    public String a(String str, Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            String valueOf = String.valueOf(obj);
            String b2 = b(b(b(valueOf, "spotify:user:", a, "AnonymizedMarvin"), "spotify%3Auser%3A", b, "AnonymizedMarvin"), "username=", c, "AnonymizedMarvin");
            if (b2.equals(valueOf)) {
                objArr[i] = obj;
            } else {
                objArr[i] = b2;
            }
        }
        return String.format(Locale.US, str, objArr);
    }
}

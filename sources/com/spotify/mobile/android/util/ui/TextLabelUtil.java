package com.spotify.mobile.android.util.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import java.util.Locale;

public final class TextLabelUtil {

    /* access modifiers changed from: package-private */
    public enum Type {
        UNKNOWN,
        EXPLICIT,
        AGE_RESTRICTION_19,
        PREMIUM,
        LYRICS
    }

    public static void a(Context context, TextView textView, boolean z) {
        if (z) {
            e(context, textView, "19", Type.AGE_RESTRICTION_19);
        }
    }

    public static void b(Context context, TextView textView, boolean z) {
        if (z) {
            e(context, textView, i(context), Type.EXPLICIT);
        }
    }

    public static CharSequence c(Context context, CharSequence charSequence, int i) {
        return f(context, charSequence, i(context), i, Type.EXPLICIT);
    }

    public static void d(Context context, TextView textView, String str) {
        Type type = Type.PREMIUM;
        Type type2 = Type.UNKNOWN;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.US);
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -2034443276:
                    if (upperCase.equals("LYRICS")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1146464716:
                    if (upperCase.equals("EXPLICIT")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1576:
                    if (upperCase.equals("19")) {
                        c = 2;
                        break;
                    }
                    break;
                case 399530551:
                    if (upperCase.equals("PREMIUM")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    type2 = Type.LYRICS;
                    break;
                case 1:
                    type2 = Type.EXPLICIT;
                    break;
                case 2:
                    type2 = Type.AGE_RESTRICTION_19;
                    break;
                case 3:
                    type2 = type;
                    break;
            }
        }
        int ordinal = type2.ordinal();
        if (ordinal == 1) {
            b(context, textView, true);
        } else if (ordinal == 2) {
            a(context, textView, true);
        } else if (ordinal != 3) {
            e(context, textView, str, type2);
        } else {
            e(context, textView, "PREMIUM", type);
        }
    }

    private static void e(Context context, TextView textView, String str, Type type) {
        if (str != null && !TextUtils.isEmpty(str)) {
            textView.setText(f(context, textView.getText(), str, 0, type));
        }
    }

    static CharSequence f(Context context, CharSequence charSequence, String str, int i, Type type) {
        uc0 uc0;
        MoreObjects.checkArgument(i == 0 || i <= charSequence.length(), "Label position is outside of text bounds");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence j = j(charSequence.subSequence(0, i));
        CharSequence j2 = j(charSequence.subSequence(i, charSequence.length()));
        if (!TextUtils.isEmpty(j)) {
            spannableStringBuilder.append(j);
            spannableStringBuilder.append(' ');
        }
        spannableStringBuilder.append((CharSequence) str);
        if (!TextUtils.isEmpty(j2)) {
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(j2);
        }
        if (type != Type.AGE_RESTRICTION_19) {
            uc0 = new uc0(context, C0707R.attr.pasteTextStyleLabel, nud.g(3.0f, context.getResources()));
        } else {
            uc0 = new uc0(context, C0707R.attr.pasteTextStyleAgeRestrictionLabel, nud.g(4.0f, context.getResources()));
        }
        spannableStringBuilder.setSpan(uc0, i, str.length() + i, 33);
        return spannableStringBuilder;
    }

    public static void g(Context context, TextView textView, boolean z, String str) {
        if (z) {
            e(context, textView, str, Type.LYRICS);
        }
    }

    public static void h(Context context, TextView textView, boolean z) {
        if (z) {
            e(context, textView, "PREMIUM", Type.PREMIUM);
        }
    }

    private static String i(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled() ? "EXPLICIT" : "E";
    }

    public static CharSequence j(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean isWhitespace = Character.isWhitespace(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!isWhitespace) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!isWhitespace) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}

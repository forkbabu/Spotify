package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: h52  reason: default package */
public final class h52 {
    public static boolean a(String str, String[] strArr) {
        boolean z;
        boolean z2;
        if (str.startsWith("spotify:")) {
            str = str.substring(8);
        }
        String[] split = str.split(":");
        if (split.length != strArr.length) {
            return false;
        }
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (String str2 : split) {
            if (str2.isEmpty()) {
                builder.mo53add((ImmutableList.Builder) c52.c(""));
            } else if (str2.charAt(0) == '{' && str2.endsWith("as Base62}")) {
                builder.mo53add((ImmutableList.Builder) b52.b);
            } else if (str2.charAt(0) == '{' && str2.endsWith("as Hex64}")) {
                builder.mo53add((ImmutableList.Builder) e52.b);
            } else if (str2.charAt(0) == '{' && str2.endsWith("as text}")) {
                builder.mo53add((ImmutableList.Builder) g52.b);
            } else if (str2.charAt(0) == '{' && str2.endsWith("as Username}")) {
                builder.mo53add((ImmutableList.Builder) k52.b);
            } else if (str2.charAt(0) == '{' && str2.endsWith("as GidID}")) {
                builder.mo53add((ImmutableList.Builder) d52.b);
            } else if (str2.charAt(0) == '{' && str2.endsWith("as Query}")) {
                builder.mo53add((ImmutableList.Builder) f52.b);
            } else if (str2.charAt(0) == '{' && str2.endsWith("as URL}")) {
                builder.mo53add((ImmutableList.Builder) j52.b);
            } else if (str2.charAt(0) != '{' || !str2.endsWith("}")) {
                builder.mo53add((ImmutableList.Builder) c52.c(str2));
            } else {
                builder.mo53add((ImmutableList.Builder) i52.a);
            }
        }
        ImmutableList build = builder.build();
        int i2 = 0;
        while (true) {
            if (i2 >= strArr.length) {
                z = true;
                break;
            } else if (!((i52) build.get(i2)).a(strArr[i2])) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            return false;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= strArr.length) {
                z2 = true;
                break;
            } else if (!((i52) build.get(i3)).b(strArr[i3])) {
                z2 = false;
                break;
            } else {
                i3++;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }
}

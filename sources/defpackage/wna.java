package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: wna  reason: default package */
public final class wna {
    private static final s52 a;
    private static final s52 b;
    private static final s52 c;
    private static final s52 d;
    private static final s52 e;

    static {
        s52 a2 = t52.a(LinkType.SHOW_SHOW);
        a2.getClass();
        a = a2;
        s52 a3 = t52.a(LinkType.SHOW_EPISODE);
        a3.getClass();
        b = a3;
        s52 a4 = t52.a(LinkType.SHOW_PODCAST);
        a4.getClass();
        c = a4;
        s52 a5 = t52.a(LinkType.PODCAST_EPISODE);
        a5.getClass();
        d = a5;
        s52 a6 = t52.a(LinkType.HOME_ROOT);
        a6.getClass();
        e = a6;
    }

    private static String a(LinkType linkType, String str) {
        s52 a2 = t52.a(linkType);
        a2.getClass();
        String[] split = s52.k.split(str);
        String[] split2 = a2.b().get(0).split(String.valueOf(':'));
        String str2 = split[2];
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < split2.length - 1; i++) {
            sb.append(split2[i]);
            sb.append(':');
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String b(String str) {
        if (a.c(str)) {
            return a(LinkType.SHOW_PODCAST, str);
        }
        if (b.c(str)) {
            return a(LinkType.PODCAST_EPISODE, str);
        }
        Assertion.p(String.format("Unexpected uri:%s", str));
        return e.toString();
    }

    public static String c(String str) {
        if (c.c(str) || d.c(str)) {
            s52 s52 = b;
            String[] split = s52.k.split(str);
            String str2 = split[split.length - 1];
            String[] split2 = s52.b().get(0).split(String.valueOf(':'));
            StringBuilder sb = new StringBuilder(50);
            for (int i = 0; i < split2.length - 1; i++) {
                sb.append(split2[i]);
                sb.append(':');
            }
            sb.append(str2);
            return sb.toString();
        }
        Assertion.p(String.format("Unexpected uri:%s", str));
        return e.toString();
    }
}

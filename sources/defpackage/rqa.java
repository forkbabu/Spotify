package defpackage;

import com.spotify.mobile.android.util.x;
import defpackage.s81;

/* renamed from: rqa  reason: default package */
public final class rqa {
    public static p81 a(String str) {
        return z81.a().p("searchTerm", str).d();
    }

    public static s81.a b(s81.a aVar, String str) {
        return aVar.k("preview_key", str);
    }

    public static String c(String str, String str2) {
        if (str == null) {
            return "";
        }
        StringBuilder V0 = je.V0(str);
        V0.append((String) x.n(str2, ""));
        return V0.toString();
    }

    public static int d(b91 b91) {
        b91.getClass();
        return b91.custom().intValue("lastOffset", 0);
    }

    public static int e(s81 s81) {
        s81.getClass();
        return s81.logging().intValue("ui:index_in_block", -1);
    }

    public static String f(b91 b91) {
        b91.getClass();
        return b91.custom().string("searchTerm", "");
    }

    public static String g(s81 s81) {
        return s81.logging().string("ui:source", "");
    }

    public static String h(s81 s81) {
        o81 o81 = (o81) s81.events().get("click");
        if (o81 == null) {
            return null;
        }
        if (o81.data().string("uri") != null) {
            return o81.data().string("uri");
        }
        return o81.data().string("trackUri");
    }

    public static boolean i(b91 b91) {
        return n(b91, "search-error-empty-view");
    }

    public static boolean j(b91 b91) {
        b91.getClass();
        return ((Boolean) x.n(b91.custom().boolValue("isLastPage"), Boolean.TRUE)).booleanValue();
    }

    public static boolean k(b91 b91) {
        return n(b91, "search-no-results-empty-view");
    }

    public static boolean l(b91 b91) {
        return n(b91, "search-offline-view");
    }

    public static boolean m(b91 b91) {
        return b91 != null && b91.custom().boolValue("isOnlineResults", false);
    }

    private static boolean n(b91 b91, String str) {
        int i = t71.c;
        if (!"hubs/placeholder".equals(b91.id()) || b91.overlays().isEmpty()) {
            return false;
        }
        s81 s81 = (s81) b91.overlays().get(0);
        s81.getClass();
        if (str.equals(s81.custom().string("tag"))) {
            return true;
        }
        return false;
    }
}

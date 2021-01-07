package com.spotify.mobile.android.util;

import android.content.UriMatcher;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class l0 {
    private static final UriMatcher e = t52.b();
    private static final Pattern f = Pattern.compile("user:([^:]+)");
    private static final Map<String, l0> g = gf0.b();
    public static final /* synthetic */ int h = 0;
    public final Uri a;
    private final String b;
    private final LinkType c;
    private final String d;

    private l0(String str) {
        String str2 = null;
        if (str == null) {
            this.a = Uri.EMPTY;
            this.c = LinkType.DUMMY;
            this.d = null;
            this.b = null;
            return;
        }
        boolean z = false;
        if (str.startsWith("spotify://")) {
            this.d = "spotify://";
        } else if (str.startsWith("spotify:")) {
            this.d = "spotify:";
        } else if (str.startsWith("http://open.spotify.com/")) {
            this.d = "http://open.spotify.com/";
        } else if (str.startsWith("https://open.spotify.com/")) {
            this.d = "https://open.spotify.com/";
        } else if (str.startsWith("https://r.spotify.com/")) {
            int indexOf = str.indexOf("/app_android/");
            if (indexOf > 0) {
                str2 = str.substring(indexOf + 13).replaceFirst("([^/?]+).*", "$1");
                str = str.substring(0, indexOf);
            }
            this.d = "https://r.spotify.com/";
        } else {
            this.d = null;
        }
        this.b = str2;
        String str3 = this.d;
        if (str3 == null) {
            this.a = Uri.EMPTY;
            this.c = LinkType.DUMMY;
            return;
        }
        String replaceAll = s52.k.matcher(str.substring(str3.length())).replaceAll("/");
        this.a = (Uri) x.n(Uri.parse(replaceAll), Uri.EMPTY);
        String str4 = s52.l.split(replaceAll, 0)[0];
        int match = e.match((Uri) x.n(Uri.parse(str4), Uri.EMPTY));
        if (match != -1) {
            String[] split = s52.m.split(str4, 0)[0].split("/");
            Iterator<String> it = t52.a(LinkType.d(match)).b().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (h52.a(it.next(), split)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                this.c = LinkType.d(match);
                return;
            }
        }
        this.c = LinkType.DUMMY;
    }

    public static l0 A(String str) {
        return z("spotify:playlist:" + str);
    }

    private String E(int i, String str) {
        StringBuilder V0 = je.V0("spotify:");
        List<String> pathSegments = this.a.getPathSegments();
        for (int i2 = 0; i2 < pathSegments.size(); i2++) {
            if (V0.charAt(V0.length() - 1) != ':') {
                V0.append(':');
            }
            if (i2 == i) {
                V0.append(Uri.encode(str));
            }
            V0.append(Uri.encode(pathSegments.get(i2)));
        }
        if (i >= pathSegments.size()) {
            V0.append(':');
            V0.append(Uri.encode(str));
        }
        return V0.toString();
    }

    public static l0 I(String str) {
        MoreObjects.checkArgument(str.length() == 22);
        return z("spotify:track:" + str);
    }

    public static l0 J(String str) {
        StringBuilder V0 = je.V0("spotify:user:");
        V0.append(Uri.encode(str));
        return z(V0.toString());
    }

    public static l0 a(String str) {
        StringBuilder V0 = je.V0("spotify:user:");
        V0.append(Uri.encode(str));
        V0.append(':');
        V0.append("collection");
        return z(V0.toString());
    }

    public static boolean b(String str, LinkType linkType) {
        return z(str).c == linkType;
    }

    public static boolean c(String str, LinkType... linkTypeArr) {
        l0 z = z(str);
        for (LinkType linkType : linkTypeArr) {
            if (z.c == linkType) {
                return true;
            }
        }
        return false;
    }

    private String d(int i) {
        String o = o(i);
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        StringBuilder V0 = je.V0("spotify:episode:");
        V0.append(Uri.encode(o));
        return V0.toString();
    }

    private String f(int i) {
        String o = o(i);
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        StringBuilder V0 = je.V0("spotify:track:");
        V0.append(Uri.encode(o));
        return V0.toString();
    }

    private String l(int i, int i2) {
        String o = o(i);
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if (o.equals("episode")) {
            return d(i2);
        }
        if (o.equals(AppProtocol.TrackData.TYPE_TRACK)) {
            return f(i2);
        }
        return null;
    }

    private String m(int i, int i2, int i3) {
        String o = o(i);
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if (o.equals("episode") || o.equals(AppProtocol.TrackData.TYPE_TRACK)) {
            return H(i2, i3);
        }
        return null;
    }

    public static boolean x(String str) {
        return z(str).c != LinkType.DUMMY;
    }

    public static l0 z(String str) {
        Map<String, l0> map = g;
        l0 l0Var = map.get(str);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(str);
        map.put(str, l0Var2);
        return l0Var2;
    }

    public String B() {
        if (Uri.EMPTY.equals(this.a)) {
            return null;
        }
        StringBuilder V0 = je.V0("spotify:");
        V0.append(this.a.getEncodedPath().replace('/', ':'));
        return V0.toString();
    }

    public String C() {
        int ordinal = this.c.ordinal();
        if (ordinal == 6) {
            return E(2, "play");
        }
        if (ordinal == 14) {
            return E(2, "play");
        }
        if (ordinal == 185) {
            return E(2, "play");
        }
        if (ordinal == 210) {
            return E(4, "play");
        }
        if (ordinal == 237) {
            return E(2, "play");
        }
        if (ordinal != 273) {
            return B();
        }
        return E(2, "play");
    }

    public String D(String str) {
        int ordinal = this.c.ordinal();
        if (ordinal != 6 && ordinal != 14 && ordinal != 185 && ordinal != 210) {
            return B();
        }
        return F() + ":play:" + str.replace("spotify:", "");
    }

    public String F() {
        int ordinal = this.c.ordinal();
        if (ordinal == 7) {
            String m = m(3, 2, 4);
            if (!TextUtils.isEmpty(m)) {
                return m;
            }
            return H(2, 3);
        } else if (ordinal == 18) {
            String m2 = m(3, 2, 4);
            if (!TextUtils.isEmpty(m2)) {
                return m2;
            }
            return H(2, 3);
        } else if (ordinal == 115) {
            return H(2, 2);
        } else {
            if (ordinal == 125) {
                return H(7, 9);
            }
            if (ordinal == 129) {
                return H(7, 9);
            }
            if (ordinal == 180) {
                String m3 = m(5, 4, 6);
                if (!TextUtils.isEmpty(m3)) {
                    return m3;
                }
                return H(4, 5);
            } else if (ordinal == 186) {
                String m4 = m(3, 2, 4);
                if (!TextUtils.isEmpty(m4)) {
                    return m4;
                }
                return H(2, 3);
            } else if (ordinal == 238) {
                return H(0, 2);
            } else {
                if (ordinal != 274) {
                    return B();
                }
                return H(2, 2);
            }
        }
    }

    public String G() {
        int ordinal = this.c.ordinal();
        if (ordinal == 54) {
            StringBuilder V0 = je.V0("spotify:album:");
            V0.append(i());
            return V0.toString();
        } else if (ordinal != 56) {
            return B();
        } else {
            StringBuilder V02 = je.V0("spotify:artist:");
            V02.append(i());
            return V02.toString();
        }
    }

    public String H(int i, int i2) {
        StringBuilder V0 = je.V0("spotify:");
        List<String> pathSegments = this.a.getPathSegments();
        for (int i3 = 0; i3 < pathSegments.size(); i3++) {
            if (i3 < i || i3 > i2) {
                if (V0.charAt(V0.length() - 1) != ':') {
                    V0.append(':');
                }
                V0.append(Uri.encode(pathSegments.get(i3)));
            }
        }
        return V0.toString();
    }

    public String e() {
        int ordinal = this.c.ordinal();
        if (ordinal == 7) {
            String l = l(3, 4);
            if (!TextUtils.isEmpty(l)) {
                return l;
            }
            return f(3);
        } else if (ordinal == 18) {
            String l2 = l(3, 4);
            if (!TextUtils.isEmpty(l2)) {
                return l2;
            }
            return f(3);
        } else if (ordinal == 115) {
            return d(5);
        } else {
            if (ordinal == 125) {
                return f(9);
            }
            if (ordinal == 180) {
                String l3 = l(5, 6);
                if (!TextUtils.isEmpty(l3)) {
                    return l3;
                }
                return f(5);
            } else if (ordinal != 186) {
                return null;
            } else {
                String l4 = l(3, 4);
                if (!TextUtils.isEmpty(l4)) {
                    return l4;
                }
                return f(3);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!rw.equal(this.a, l0Var.a) || !rw.equal(this.b, l0Var.b)) {
            return false;
        }
        return true;
    }

    public String g() {
        if (this.c == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            return o(3);
        }
        throw new UnsupportedOperationException("URI is not a folder");
    }

    public l0 h() {
        String str;
        String queryParameter = this.a.getQueryParameter("context");
        String lastPathSegment = this.a.getLastPathSegment();
        List<String> pathSegments = this.a.getPathSegments();
        if (!pathSegments.isEmpty()) {
            str = pathSegments.get(0);
            if (!str.equals("episode") && !str.equals(AppProtocol.TrackData.TYPE_TRACK)) {
                str = null;
            }
        } else {
            str = "";
        }
        if (queryParameter == null) {
            return null;
        }
        String replaceAll = s52.n.matcher(queryParameter).replaceAll(String.valueOf(':'));
        StringBuilder sb = new StringBuilder();
        sb.append(replaceAll);
        sb.append(':');
        sb.append("play");
        sb.append(':');
        if (!TextUtils.isEmpty(str)) {
            lastPathSegment = str + ':' + lastPathSegment;
        }
        sb.append(lastPathSegment);
        return z(sb.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String i() {
        int ordinal = this.c.ordinal();
        if (ordinal != 6) {
            if (ordinal != 7) {
                if (!(ordinal == 49 || ordinal == 50 || ordinal == 273 || ordinal == 274)) {
                    switch (ordinal) {
                        case 2:
                        case 14:
                        case 54:
                        case 56:
                        case 134:
                        case 185:
                        case 201:
                        case 210:
                        case 237:
                        case 246:
                            break;
                        case 18:
                        case 27:
                        case 239:
                            break;
                        case 85:
                            return this.a.getLastPathSegment();
                        default:
                            throw new UnsupportedOperationException("URI is does not contain an ID");
                    }
                }
            }
            if (this.a.getPathSegments().size() >= 1) {
                return this.a.getPathSegments().get(1);
            }
            throw new UnsupportedOperationException("URI is does not contain an ID");
        }
        return this.a.getLastPathSegment();
    }

    public String j(int i, String str) {
        if (e.match(this.a) == -1 || i < 0 || i >= this.a.getPathSegments().size()) {
            return null;
        }
        String[] split = this.a.getEncodedPath().split("/");
        String[] strArr = (String[]) Arrays.copyOfRange(split, i, split.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = gf0.c(strArr[i2], Charsets.UTF_8);
        }
        return TextUtils.join(str, strArr);
    }

    public String k() {
        return this.a.getLastPathSegment();
    }

    public Uri n() {
        if (this.c.ordinal() != 213) {
            return null;
        }
        return Uri.parse(o(2));
    }

    public String o(int i) {
        if (e.match(this.a) == -1 || i < 0 || i >= this.a.getPathSegments().size()) {
            return null;
        }
        return gf0.c(this.a.getEncodedPath().split("/")[i], Charsets.UTF_8);
    }

    public int p() {
        return this.a.getPathSegments().size();
    }

    public LinkType q() {
        return this.c;
    }

    public String r() {
        String B = B();
        if (B == null) {
            return null;
        }
        Matcher matcher = f.matcher(B);
        if (matcher.find()) {
            return Uri.decode(matcher.group(1));
        }
        return null;
    }

    public boolean s() {
        int ordinal = this.c.ordinal();
        return ordinal == 7 || ordinal == 18 || ordinal == 115 || ordinal == 125 || ordinal == 129 || ordinal == 180 || ordinal == 186 || ordinal == 274;
    }

    public boolean t() {
        return "http://open.spotify.com/".equals(this.d) || "https://open.spotify.com/".equals(this.d) || "spotify://".equals(this.d);
    }

    public String toString() {
        return this.a.toString();
    }

    public boolean u() {
        return !TextUtils.isEmpty(this.a.getQueryParameter("si"));
    }

    public boolean v() {
        return !TextUtils.isEmpty(this.b);
    }

    public boolean w() {
        return !TextUtils.isEmpty(this.a.getQueryParameter("utm_campaign")) || !TextUtils.isEmpty(this.a.getQueryParameter("utm_source")) || !TextUtils.isEmpty(this.a.getQueryParameter("utm_medium"));
    }

    public boolean y() {
        int ordinal = this.c.ordinal();
        return ordinal == 80 || ordinal == 81;
    }
}

package com.spotify.common.uri;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpotifyUri implements Comparable<SpotifyUri> {
    private final Kind a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final long o;
    private final Kind p;
    private final List<String> q;
    private final String r;

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:333:0x046b */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SpotifyUri(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 1979
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.common.uri.SpotifyUri.<init>(java.lang.String):void");
    }

    public static String d(String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            return encode.indexOf(42) != -1 ? encode.replace("*", "%2A") : encode;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String g(String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            if (encode.indexOf(42) != -1) {
                encode = encode.replace("*", "%2A");
            }
            return encode.indexOf("%7E") != -1 ? encode.replace("%7E", "~") : encode;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private int l(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(SpotifyUri spotifyUri) {
        SpotifyUri spotifyUri2 = spotifyUri;
        Kind kind = this.a;
        Kind kind2 = spotifyUri2.a;
        if (kind != kind2) {
            return kind.compareTo(kind2);
        }
        Kind kind3 = this.p;
        Kind kind4 = spotifyUri2.p;
        if (kind3 != kind4) {
            return kind3.compareTo(kind4);
        }
        int l = l(this.b, spotifyUri2.b);
        return (l == 0 && (l = l(this.c, spotifyUri2.c)) == 0 && (l = l(this.f, spotifyUri2.f)) == 0 && (l = l(this.n, spotifyUri2.n)) == 0) ? new Long(this.o).compareTo(Long.valueOf(spotifyUri2.o)) : l;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SpotifyUri.class != obj.getClass()) {
            return false;
        }
        SpotifyUri spotifyUri = (SpotifyUri) obj;
        if (this.o != spotifyUri.o) {
            return false;
        }
        String str = this.c;
        if (str == null ? spotifyUri.c != null : !str.equals(spotifyUri.c)) {
            return false;
        }
        if (this.a != spotifyUri.a || this.p != spotifyUri.p) {
            return false;
        }
        String str2 = this.n;
        if (str2 == null ? spotifyUri.n != null : !str2.equals(spotifyUri.n)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null ? spotifyUri.f != null : !str3.equals(spotifyUri.f)) {
            return false;
        }
        String str4 = this.b;
        String str5 = spotifyUri.b;
        return str4 == null ? str5 == null : str4.equals(str5);
    }

    public String h() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.p.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.n;
        if (str4 != null) {
            i = str4.hashCode();
        }
        long j = this.o;
        return ((hashCode4 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public Kind i() {
        return this.a;
    }

    public boolean k(SpotifyUri spotifyUri) {
        Kind kind;
        Kind kind2;
        if (equals(spotifyUri)) {
            return true;
        }
        Kind kind3 = this.a;
        Kind kind4 = spotifyUri.a;
        Kind kind5 = Kind.PLAYLIST;
        if ((kind3 == kind5 || kind3 == Kind.PLAYLIST_V2) && (kind4 == kind5 || kind4 == Kind.PLAYLIST_V2)) {
            return this.c.equals(spotifyUri.c);
        }
        Kind kind6 = Kind.STATION;
        if (kind3 == kind6 && (((kind = this.p) == kind5 || kind == Kind.PLAYLIST_V2) && kind4 == kind6 && ((kind2 = spotifyUri.p) == kind5 || kind2 == Kind.PLAYLIST_V2))) {
            return this.c.equals(spotifyUri.c);
        }
        Kind kind7 = Kind.DAILYMIX;
        if (kind3 != kind7 && (kind3 != kind6 || this.p != Kind.CLUSTER)) {
            return false;
        }
        if (kind4 == kind7 || (kind4 == kind6 && spotifyUri.p == Kind.CLUSTER)) {
            return this.c.equals(spotifyUri.c);
        }
        return false;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder("spotify:");
        switch (this.a.ordinal()) {
            case 1:
                sb.append("artist:");
                sb.append(this.c);
                break;
            case 2:
                sb.append("artist:");
                sb.append(this.c);
                sb.append(":concerts");
                break;
            case 3:
                sb.append("album:");
                sb.append(this.c);
                break;
            case 4:
                sb.append("search:");
                sb.append(g(this.c));
                break;
            case 5:
                sb.append("track:");
                sb.append(this.c);
                break;
            case 6:
                sb.append("audio:");
                sb.append(this.c);
                break;
            case 7:
                sb.append("work:");
                sb.append(this.c);
                break;
            case 8:
                sb.append("genre:");
                sb.append(this.c);
                break;
            case 9:
                sb.append("user:");
                je.z(this.b, sb, ":playlist:");
                sb.append(this.c);
                break;
            case 10:
                sb.append("playlist:");
                sb.append(this.c);
                break;
            case 11:
                sb.append("playlists");
                break;
            case 12:
                sb.append("activate");
                break;
            case 13:
            case 25:
            case 27:
            case 28:
            case 43:
            case 49:
            default:
                StringBuilder V0 = je.V0("Unknown Spotify uri kind: ");
                V0.append(this.a);
                throw new RuntimeException(V0.toString());
            case 14:
                sb.append("internal:");
                sb.append(this.c);
                break;
            case 15:
                sb.append("local:");
                sb.append(d(this.f));
                sb.append(":");
                sb.append(d(this.n));
                sb.append(":");
                sb.append(d(this.c));
                long j = this.o;
                if (j < 0) {
                    if (j != -1) {
                        sb.append(":");
                        break;
                    }
                } else {
                    sb.append(":");
                    sb.append(this.o);
                    break;
                }
                break;
            case 16:
                sb.append("user:");
                sb.append(g(this.b));
                break;
            case 17:
                sb.append("user:");
                je.z(this.b, sb, ":starred");
                break;
            case 18:
                sb.append("ad:");
                sb.append(this.c);
                break;
            case 19:
                sb.append("interruption:");
                sb.append(this.c);
                break;
            case 20:
                sb.append("user:");
                je.z(this.b, sb, ":toplist");
                break;
            case 21:
                sb.append("user:");
                je.z(this.b, sb, ":recent");
                break;
            case 22:
                sb.append("radio");
                for (String str : this.q) {
                    sb.append(":");
                    sb.append(g(str));
                }
                break;
            case 23:
                sb.append("station:");
                int ordinal = this.p.ordinal();
                if (!(ordinal == 1 || ordinal == 3 || ordinal == 5)) {
                    if (ordinal != 57) {
                        switch (ordinal) {
                            case 8:
                                break;
                            case 9:
                                sb.append("user:");
                                je.z(this.b, sb, ":playlist:");
                                break;
                            case 10:
                                sb.append("playlist:");
                                break;
                            default:
                                StringBuilder V02 = je.V0("unexpected station kind ");
                                V02.append(this.p);
                                throw new RuntimeException(V02.toString());
                        }
                    } else {
                        sb.append("user:");
                        je.z(this.b, sb, ":cluster:");
                    }
                    sb.append(this.c);
                    break;
                }
                sb.append(this.p.d());
                sb.append(':');
                sb.append(this.c);
            case 24:
                sb.append("image:");
                sb.append(this.c);
                break;
            case 26:
                sb.append("trackset:");
                sb.append(g(this.c));
                break;
            case 29:
                sb.append("app:");
                sb.append(this.c);
                break;
            case 30:
                sb.append("user:facebook:");
                sb.append(this.c);
                break;
            case 31:
                sb.append("user:");
                je.z(this.b, sb, ":collectionrootlist");
                break;
            case 32:
                sb.append("user:");
                je.z(this.b, sb, ":collectiontracklist:");
                sb.append(this.c);
                break;
            case 33:
                sb.append("user:");
                je.z(this.b, sb, ":publishedrootlist");
                break;
            case 34:
                sb.append("user:");
                je.z(this.b, sb, ":profilecontainer");
                break;
            case 35:
                sb.append("user:");
                je.z(this.b, sb, ":inbox");
                break;
            case 36:
                sb.append("user:");
                je.z(this.b, sb, ":rootlist");
                break;
            case 37:
                sb.append("user:");
                je.z(this.b, sb, ":purchaselist");
                break;
            case 38:
                sb.append("user:");
                je.z(this.b, sb, ":publishedstarred");
                break;
            case 39:
                sb.append("user:");
                je.z(this.b, sb, ":maskedstarred");
                break;
            case 40:
                sb.append("user:");
                je.z(this.b, sb, ":topfriends");
                break;
            case 41:
                sb.append("user:");
                je.z(this.b, sb, ":maskedtoplist");
                break;
            case 42:
                sb.append("user:");
                je.z(this.b, sb, ":outbox");
                break;
            case 44:
                sb.append("start-group:");
                sb.append(this.c);
                if (this.f != null) {
                    sb.append(":");
                    sb.append(g(this.f));
                    break;
                }
                break;
            case 45:
                sb.append("end-group:");
                sb.append(this.c);
                break;
            case 46:
                sb.append("video:");
                sb.append(this.c);
                break;
            case 47:
                sb.append("recording:");
                sb.append(this.c);
                break;
            case 48:
                sb.append("canvas:");
                sb.append(this.c);
                break;
            case 50:
                sb.append("user:");
                je.z(this.b, sb, ":top:tracks");
                break;
            case 51:
                sb.append("show:");
                sb.append(this.c);
                break;
            case 52:
                sb.append("episode:");
                sb.append(this.c);
                break;
            case 53:
                sb.append("adspace:");
                sb.append(this.c);
                break;
            case 54:
                sb.append("chart:");
                sb.append(this.c);
                break;
            case 55:
                sb.append("party:");
                sb.append(this.c);
                break;
            case 56:
                sb.append("running:");
                sb.append(this.c);
                break;
            case 57:
                sb.append("user:");
                je.z(this.b, sb, ":cluster:");
                sb.append(this.c);
                break;
            case 58:
                sb.append("dailymix:");
                sb.append(this.c);
                break;
            case 59:
                sb.append("link:");
                sb.append(this.c);
                break;
            case 60:
                sb.append("imageset:");
                sb.append(this.c);
                break;
            case 61:
                sb.append("space:");
                sb.append(this.c);
                break;
            case 62:
                sb.append("concert:");
                sb.append(this.c);
                break;
            case 63:
                sb.append("mosaic:");
                sb.append(h.a(":", this.q));
                break;
            case 64:
                if (this.b != null) {
                    sb.append("user:");
                    sb.append(g(this.b));
                    sb.append(':');
                }
                sb.append("collection");
                if (this.c != null) {
                    sb.append(':');
                    sb.append(this.c);
                    break;
                }
                break;
            case 65:
                sb.append("user:");
                je.z(this.b, sb, ":collection:album:");
                sb.append(this.c);
                break;
            case 66:
                sb.append("user:");
                je.z(this.b, sb, ":collection:artist:");
                sb.append(this.c);
                break;
            case 67:
                sb.append("premium-destination");
                break;
            case 68:
                sb.append("upsell:");
                sb.append(this.c);
                break;
            case 69:
                sb.append("devicepreset:");
                sb.append(this.r);
                sb.append(":");
                sb.append(this.c);
                break;
            case 70:
                sb.append("together:");
                sb.append(g(this.b));
                break;
            case 71:
                sb.append("socialsession:");
                sb.append(this.c);
                break;
            case 72:
                sb.append("licensor:");
                sb.append(this.c);
                break;
            case 73:
                sb.append("station:");
                sb.append(this.c);
                break;
            case 74:
                sb.append("zerotap:");
                sb.append(this.c);
                break;
            case 75:
                sb.append("home");
                break;
            case 76:
                sb.append("song:");
                sb.append(this.c);
                break;
            case 77:
                sb.append("user:");
                je.z(this.b, sb, ":folder:");
                sb.append(this.c);
                break;
        }
        return sb.toString();
    }

    public enum Kind {
        EMPTY,
        ARTIST,
        ARTIST_CONCERTS,
        ALBUM,
        SEARCH,
        TRACK,
        AUDIO,
        WORK,
        GENRE,
        PLAYLIST,
        PLAYLIST_V2,
        PLAYLISTS,
        ACTIVATE,
        INTERNAL_VIEW,
        INTERNAL,
        LOCAL_TRACK("local"),
        USER,
        STARRED,
        AD,
        INTERRUPTION,
        TOPLIST,
        RECENTLY_PLAYED,
        RADIO,
        STATION,
        IMAGE,
        PARTNER,
        TRACK_SET,
        AUTOSTART,
        LOGIN_DELAY,
        APPLICATION,
        FACEBOOK_USER("facebook"),
        COLLECTION_ROOT("collectionrootlist"),
        COLLECTION_TRACKLIST("collectiontracklist"),
        PUBLISHED_ROOT("publishedrootlist"),
        PROFILE_CONTAINER,
        INBOX_PLAYLIST("inbox"),
        PLAYLIST_ROOT("rootlist"),
        PURCHASE_PLAYLIST("purchaselist"),
        PUBLISHED_STARRED,
        MASKED_STARRED,
        TOPFRIENDS,
        MASKED_TOPLIST,
        OUTBOX_PLAYLIST("outbox"),
        LIBRARY,
        STARTGROUP("start-group"),
        ENDGROUP("end-group"),
        VIDEO,
        RECORDING,
        CANVAS,
        UNKNOWN,
        TOPTRACKS,
        SHOW,
        EPISODE,
        ADSPACE,
        CHART,
        PARTY,
        RUNNING,
        CLUSTER,
        DAILYMIX,
        LINK,
        IMAGESET,
        SPACE,
        CONCERT,
        MOSAIC,
        COLLECTION,
        COLLECTION_ALBUM,
        COLLECTION_ARTIST,
        PREMIUM_DESTINATION,
        UPSELL,
        DEVICEPRESET,
        TOGETHER,
        SOCIALSESSION,
        LICENSOR,
        CUSTOM_STATION("station"),
        ZEROTAP,
        HOME,
        SONG,
        FOLDER;
        
        private static Map<String, Kind> J0 = new HashMap();
        private String name;

        static {
            Kind[] values = values();
            for (int i = 0; i < 78; i++) {
                Kind kind = values[i];
                J0.put(kind.name, kind);
            }
        }

        private Kind() {
            this.name = toString().toLowerCase();
        }

        public String d() {
            return this.name;
        }

        private Kind(String str) {
            this.name = str;
        }
    }

    public SpotifyUri(Kind kind, String str, String str2) {
        Kind kind2 = Kind.UNKNOWN;
        ArrayList arrayList = new ArrayList();
        this.a = kind;
        this.c = str;
        this.b = null;
        this.f = null;
        this.n = null;
        this.o = -1;
        this.p = kind2;
        this.q = arrayList;
        this.r = null;
    }
}

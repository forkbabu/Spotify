package com.spotify.libs.onboarding.allboarding;

import kotlin.jvm.internal.f;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class EntryPoint extends Enum<EntryPoint> {
    public static final EntryPoint a;
    public static final EntryPoint b;
    public static final EntryPoint c;
    public static final EntryPoint f;
    private static final /* synthetic */ EntryPoint[] n;
    public static final a o = new a(null);
    private final String endpointPath;
    private final String label;
    private final String uriSegment;

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        EntryPoint entryPoint = new EntryPoint("SIGNUP", 0, "SIGNUP", "signup", null, 4);
        a = entryPoint;
        EntryPoint entryPoint2 = new EntryPoint("HOME_ARTIST_HEADER", 1, "HOME_ARTIST_HEADER", "home-artist-header", null, 4);
        b = entryPoint2;
        EntryPoint entryPoint3 = new EntryPoint("LIBRARY_ADD_ARTISTS", 2, "LIBRARY_ADD_ARTISTS", "library-add-artists", null, 4);
        c = entryPoint3;
        EntryPoint entryPoint4 = new EntryPoint("DEFAULT", 3, "DEFAULT", "default", null, 4);
        f = entryPoint4;
        n = new EntryPoint[]{entryPoint, entryPoint2, entryPoint3, entryPoint4, new EntryPoint("DEBUG_ARTIST", 4, "DEFAULT", "debug-artist", null, 4), new EntryPoint("DEBUG_LANGUAGE_ONBOARDING", 5, "DEFAULT", "debug-language", "language"), new EntryPoint("DEBUG_LANGUAGE_ARTIST_ONBOARDING", 6, "DEFAULT", "debug-language-artist", "language_artist"), new EntryPoint("DEBUG_OPTIN_SHOW", 7, "DEFAULT", "debug-opt-in-po", "artist_optin_show")};
    }

    private EntryPoint(String str, int i, String str2, String str3, String str4) {
        this.label = str2;
        this.uriSegment = str3;
        this.endpointPath = str4;
    }

    public static EntryPoint valueOf(String str) {
        return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
    }

    public static EntryPoint[] values() {
        return (EntryPoint[]) n.clone();
    }

    public final String d() {
        return this.endpointPath;
    }

    public final String g() {
        return this.label;
    }

    public final String h() {
        return this.uriSegment;
    }

    EntryPoint(String str, int i, String str2, String str3, String str4, int i2) {
        String str5 = (i2 & 4) != 0 ? "" : null;
        this.label = str2;
        this.uriSegment = str3;
        this.endpointPath = str5;
    }
}

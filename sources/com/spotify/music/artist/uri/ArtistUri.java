package com.spotify.music.artist.uri;

import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArtistUri {
    private static final Map<Type, Pattern> d = new EnumMap(Type.class);
    private final String a;
    private String b;
    private String c;

    public enum Type {
        ARTIST(""),
        ABOUT(":about"),
        BIOGRAPHY(":biography"),
        CONCERT(":concert"),
        GALLERY(":gallery"),
        PLAYLISTS(":playlists"),
        RELATED(":related");
        
        public static final Type[] q = values();
        private final String mSuffix;

        private Type(String str) {
            this.mSuffix = str;
        }

        public String d() {
            return this.mSuffix;
        }
    }

    static {
        Type[] typeArr = Type.q;
        for (Type type : typeArr) {
            Map<Type, Pattern> map = d;
            StringBuilder V0 = je.V0("(spotify:artist:([a-zA-Z0-9]+))");
            V0.append(type.d());
            map.put(type, Pattern.compile(V0.toString()));
        }
    }

    public ArtistUri(String str) {
        str.getClass();
        this.a = str;
        for (Type type : Type.q) {
            Matcher matcher = d.get(type).matcher(str);
            if (matcher.find()) {
                this.c = matcher.group(1);
                this.b = matcher.group(2);
            }
        }
        this.c.getClass();
    }

    public String a() {
        return this.b;
    }

    public String b(Type type) {
        return this.c + type.d();
    }

    public String toString() {
        return this.a;
    }
}

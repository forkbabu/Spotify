package com.spotify.music.builtinauth.model;

import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.List;
import java.util.Map;

public abstract class a {
    public static a a(String str, Map<String, String> map, List<String> list) {
        return new b(str, map, list, null);
    }

    public static a b(String str, Map<String, String> map, List<String> list, ClientIdentity clientIdentity) {
        return new b(str, map, list, clientIdentity);
    }

    public abstract List<String> c();

    public abstract String d();

    public abstract ClientIdentity e();

    public abstract Map<String, String> f();
}

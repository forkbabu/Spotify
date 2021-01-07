package com.facebook.appevents.codeless.internal;

import org.json.JSONObject;

public final class PathComponent {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        private MatchBitmaskType(int i) {
            this.value = i;
        }

        public int d() {
            return this.value;
        }
    }

    PathComponent(JSONObject jSONObject) {
        this.a = jSONObject.getString("class_name");
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        this.d = jSONObject.optString("text");
        this.e = jSONObject.optString("tag");
        this.f = jSONObject.optString("description");
        this.g = jSONObject.optString("hint");
        this.h = jSONObject.optInt("match_bitmask");
    }
}

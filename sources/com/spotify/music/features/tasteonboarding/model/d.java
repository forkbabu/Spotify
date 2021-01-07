package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.tasteonboarding.model.a;

public abstract class d implements Parcelable {

    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);
    }

    public static a a() {
        return new a.b();
    }

    @JsonCreator
    public static d create(@JsonProperty("section") String str, @JsonProperty("content_source") String str2) {
        return new c(str, str2, null);
    }

    public abstract String b();

    public abstract String c();

    public abstract String e();

    /* access modifiers changed from: package-private */
    public abstract a f();

    public d g(String str) {
        a f = f();
        f.c(str);
        return f.a();
    }

    public d h(String str) {
        a f = f();
        f.d(str);
        return f.a();
    }
}

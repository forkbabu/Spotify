package com.spotify.voice.results.model;

import android.os.Parcelable;
import java.util.List;

public abstract class e implements Parcelable {

    public static abstract class a implements Parcelable {
        public static a b(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, boolean z3) {
            return new d(str, str2, str3, str4, z, str5, z2, z3);
        }

        public abstract boolean a();

        public abstract boolean c();

        public abstract String e();

        public abstract boolean f();

        public abstract String g();

        public abstract String h();

        public abstract String i();

        public abstract String j();

        public a k(boolean z) {
            return b(j(), e(), h(), g(), z, i(), c(), f());
        }
    }

    public static e a(String str, List<a> list) {
        return new c(str, list, "");
    }

    public static e b(String str, List<a> list, String str2) {
        return new c(str, list, str2);
    }

    public abstract List<a> c();

    public abstract String e();

    public abstract String f();
}

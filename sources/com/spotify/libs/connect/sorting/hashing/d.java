package com.spotify.libs.connect.sorting.hashing;

import com.adjust.sdk.Constants;
import kotlin.jvm.internal.f;

public abstract class d {
    private final String a;

    public static final class a extends d {
        public static final a b = new a();

        private a() {
            super(Constants.SHA256, null);
        }
    }

    public d(String str, f fVar) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}

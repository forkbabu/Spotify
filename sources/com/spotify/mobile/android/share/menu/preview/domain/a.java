package com.spotify.mobile.android.share.menu.preview.domain;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class a {

    /* renamed from: com.spotify.mobile.android.share.menu.preview.domain.a$a  reason: collision with other inner class name */
    public static final class C0186a extends a {
        public static final C0186a a = new C0186a();

        private C0186a() {
            super(null);
        }
    }

    public static final class b extends a {
        private final List<com.spotify.mobile.android.share.menu.preview.api.a> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<com.spotify.mobile.android.share.menu.preview.api.a> list) {
            super(null);
            h.e(list, "shareDestinations");
            this.a = list;
        }

        public final List<com.spotify.mobile.android.share.menu.preview.api.a> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<com.spotify.mobile.android.share.menu.preview.api.a> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Loaded(shareDestinations="), this.a, ")");
        }
    }

    public static final class c extends a {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private a() {
    }

    public a(f fVar) {
    }
}

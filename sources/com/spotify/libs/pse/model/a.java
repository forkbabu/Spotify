package com.spotify.libs.pse.model;

import com.spotify.libs.pse.model.b;
import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.Header;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class a {
    private final b a;
    private final String b;

    public a(b bVar, String str, f fVar) {
        this.a = bVar;
        this.b = str;
    }

    public final b b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    a(b bVar, String str, int i) {
        this.a = (i & 1) != 0 ? b.C0167b.a : null;
        this.b = str;
    }

    /* renamed from: com.spotify.libs.pse.model.a$a  reason: collision with other inner class name */
    public static final class C0166a extends a implements d, c {
        private final Authentication c;
        private final Header d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0166a() {
            super((b) null, (String) null, 1);
            Authentication m = Authentication.m();
            h.d(m, "Authentication.getDefaultInstance()");
            h.e(m, "authentication");
            this.c = m;
            this.d = null;
        }

        @Override // com.spotify.libs.pse.model.c
        public Authentication a() {
            return this.c;
        }

        @Override // com.spotify.libs.pse.model.d
        public Header getHeader() {
            return this.d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0166a(Authentication authentication, Header header, String str) {
            super((b) null, str, 1);
            h.e(authentication, "authentication");
            this.c = authentication;
            this.d = header;
        }
    }

    public static final class c extends a implements d, c {
        private final Authentication c;
        private final Header d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c() {
            super((b) null, (String) null, 1);
            Authentication m = Authentication.m();
            h.d(m, "Authentication.getDefaultInstance()");
            h.e(m, "authentication");
            this.c = m;
            this.d = null;
        }

        @Override // com.spotify.libs.pse.model.c
        public Authentication a() {
            return this.c;
        }

        @Override // com.spotify.libs.pse.model.d
        public Header getHeader() {
            return this.d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Authentication authentication, Header header, String str) {
            super((b) null, str, 1);
            h.e(authentication, "authentication");
            this.c = authentication;
            this.d = header;
        }
    }

    public static final class b extends a implements d, c {
        private final Authentication c;
        private final Header d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b() {
            super(new b.a(3), (String) null, (f) null);
            Authentication m = Authentication.m();
            h.d(m, "Authentication.getDefaultInstance()");
            h.e(m, "authentication");
            this.c = m;
            this.d = null;
        }

        @Override // com.spotify.libs.pse.model.c
        public Authentication a() {
            return this.c;
        }

        public List<AuthMethod> d() {
            List<AuthMethod> l = a().l();
            h.d(l, "authentication.authMethodsList");
            return l;
        }

        @Override // com.spotify.libs.pse.model.d
        public Header getHeader() {
            return this.d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Authentication authentication, Header header, String str) {
            super(new b.a(3), str, (f) null);
            h.e(authentication, "authentication");
            this.c = authentication;
            this.d = header;
        }
    }
}

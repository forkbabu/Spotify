package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.i;
import java.util.Set;

public final class a<O extends d> {
    private final AbstractC0094a<?, O> a;
    private final g<?> b;
    private final String c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0094a<T extends f, O> extends e<T, O> {
        @RecentlyNonNull
        @Deprecated
        public T a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull com.google.android.gms.common.internal.c cVar, @RecentlyNonNull O o, @RecentlyNonNull c.a aVar, @RecentlyNonNull c.b bVar) {
            return b(context, looper, cVar, o, aVar, bVar);
        }

        @RecentlyNonNull
        public T b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull com.google.android.gms.common.internal.c cVar, @RecentlyNonNull O o, @RecentlyNonNull com.google.android.gms.common.api.internal.f fVar, @RecentlyNonNull n nVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {
        @RecentlyNonNull
        public static final c e = new c(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface AbstractC0095a extends d {
            @RecentlyNonNull
            Account G1();
        }

        public interface b extends d {
            @RecentlyNullable
            GoogleSignInAccount d0();
        }

        public static final class c implements d {
            private c() {
            }

            c(k kVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(@RecentlyNonNull String str);

        @RecentlyNonNull
        String b();

        void c(@RecentlyNonNull b.c cVar);

        void d();

        boolean e();

        boolean f();

        boolean h();

        Set<Scope> i();

        void j(i iVar, Set<Scope> set);

        void k(@RecentlyNonNull b.e eVar);

        int l();

        @RecentlyNonNull
        com.google.android.gms.common.c[] m();

        @RecentlyNullable
        String n();

        boolean s();
    }

    public static final class g<C extends f> extends c<C> {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(@RecentlyNonNull String str, @RecentlyNonNull AbstractC0094a<C, O> aVar, @RecentlyNonNull g<C> gVar) {
        com.google.android.exoplayer2.util.g.k(aVar, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.exoplayer2.util.g.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    @RecentlyNonNull
    public final AbstractC0094a<?, O> a() {
        return this.a;
    }

    @RecentlyNonNull
    public final String b() {
        return this.c;
    }
}

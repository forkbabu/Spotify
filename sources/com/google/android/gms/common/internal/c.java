package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class c {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<com.google.android.gms.common.api.a<?>, b> d;
    private final String e;
    private final String f;
    private final xu g;
    private Integer h;

    public static final class a {
        private Account a;
        private o1<Scope> b;
        private String c;
        private String d;
        private xu e = xu.a;

        @RecentlyNonNull
        public final c a() {
            return new c(this.a, this.b, null, 0, null, this.c, this.d, this.e);
        }

        @RecentlyNonNull
        public final a b(@RecentlyNonNull String str) {
            this.c = str;
            return this;
        }

        @RecentlyNonNull
        public final a c(Account account) {
            this.a = account;
            return this;
        }

        @RecentlyNonNull
        public final a d(@RecentlyNonNull String str) {
            this.d = str;
            return this;
        }

        @RecentlyNonNull
        public final a e(@RecentlyNonNull Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new o1<>();
            }
            this.b.addAll(collection);
            return this;
        }
    }

    public static final class b {
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/accounts/Account;Ljava/util/Set<Lcom/google/android/gms/common/api/Scope;>;Ljava/util/Map<Lcom/google/android/gms/common/api/a<*>;Lcom/google/android/gms/common/internal/c$b;>;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lxu;Z)V */
    public c(Account account, @RecentlyNonNull Set set, @RecentlyNonNull Map map, int i, @RecentlyNonNull View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull xu xuVar) {
        this.a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        Map<com.google.android.gms.common.api.a<?>, b> emptyMap = Collections.emptyMap();
        this.d = emptyMap;
        this.e = str;
        this.f = str2;
        this.g = xuVar;
        HashSet hashSet = new HashSet(emptySet);
        for (b bVar : emptyMap.values()) {
            bVar.getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    @RecentlyNullable
    public final Account a() {
        return this.a;
    }

    @RecentlyNullable
    @Deprecated
    public final String b() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @RecentlyNonNull
    public final Account c() {
        Account account = this.a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    @RecentlyNonNull
    public final Set<Scope> d() {
        return this.c;
    }

    @RecentlyNonNull
    public final Set<Scope> e(@RecentlyNonNull com.google.android.gms.common.api.a<?> aVar) {
        if (this.d.get(aVar) == null) {
            return this.b;
        }
        throw null;
    }

    @RecentlyNullable
    public final String f() {
        return this.e;
    }

    @RecentlyNonNull
    public final Set<Scope> g() {
        return this.b;
    }

    public final void h(@RecentlyNonNull Integer num) {
        this.h = num;
    }

    @RecentlyNullable
    public final String i() {
        return this.f;
    }

    @RecentlyNonNull
    public final xu j() {
        return this.g;
    }

    @RecentlyNullable
    public final Integer k() {
        return this.h;
    }
}

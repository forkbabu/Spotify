package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;

public abstract class c {
    public static final /* synthetic */ int a = 0;

    public static abstract class a {
        public abstract c a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract a h(long j);
    }

    static {
        a.b bVar = new a.b();
        bVar.h(0);
        bVar.g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        bVar.c(0);
        bVar.a();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract PersistedInstallation.RegistrationStatus f();

    public abstract long g();

    public boolean h() {
        return f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public boolean i() {
        return f() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public boolean j() {
        return f() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    public boolean k() {
        return f() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    public abstract a l();
}

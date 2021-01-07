package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.libs.mediabrowserservice.q1;

public abstract class RootHintsParams {

    public enum Mode {
        NONE,
        DRIVING
    }

    public interface a {
        a a(boolean z);

        a b(String str);

        RootHintsParams build();

        a c(String str);
    }

    public static RootHintsParams a(String str) {
        q1.b bVar = (q1.b) b();
        bVar.b(str);
        bVar.c(null);
        bVar.f(null);
        bVar.a(false);
        bVar.d(Mode.NONE);
        return bVar.build();
    }

    public static a b() {
        q1.b bVar = new q1.b();
        bVar.a(false);
        q1.b bVar2 = bVar;
        bVar2.e(false);
        q1.b bVar3 = bVar2;
        bVar3.d(Mode.NONE);
        return bVar3;
    }

    public abstract String c();

    public abstract Mode d();

    public abstract String e();

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();
}

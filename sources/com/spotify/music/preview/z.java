package com.spotify.music.preview;

import android.text.TextUtils;
import com.spotify.music.preview.o;

public abstract class z {
    public static final z a;
    public static final z b;

    public interface a {
    }

    static {
        o.b bVar = new o.b();
        bVar.f("");
        o.b bVar2 = bVar;
        bVar2.g("");
        o.b bVar3 = bVar2;
        bVar3.e(0L);
        o.b bVar4 = bVar3;
        bVar4.b(0L);
        o.b bVar5 = bVar4;
        bVar5.d(false);
        o.b bVar6 = bVar5;
        bVar6.c(false);
        o.b bVar7 = bVar6;
        bVar7.h(0L);
        a = bVar7.a();
        o.b bVar8 = new o.b();
        bVar8.f("");
        o.b bVar9 = bVar8;
        bVar9.g("");
        o.b bVar10 = bVar9;
        bVar10.e(0L);
        o.b bVar11 = bVar10;
        bVar11.b(0L);
        o.b bVar12 = bVar11;
        bVar12.d(false);
        o.b bVar13 = bVar12;
        bVar13.c(true);
        o.b bVar14 = bVar13;
        bVar14.h(0L);
        b = bVar14.a();
    }

    public abstract Long a();

    public boolean b() {
        return !TextUtils.isEmpty(g()) && a().longValue() > 0 && f().equals(a());
    }

    public abstract boolean c();

    public abstract boolean d();

    public boolean e() {
        return !TextUtils.isEmpty(g()) && (a().longValue() == 0 || !f().equals(a()));
    }

    public abstract Long f();

    public abstract String g();

    public abstract String h();

    public abstract Long i();

    public abstract a j();
}

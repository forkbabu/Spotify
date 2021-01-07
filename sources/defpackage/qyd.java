package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.i;
import defpackage.iyd;
import java.util.List;

/* renamed from: qyd  reason: default package */
public abstract class qyd implements i<Episode> {

    /* renamed from: qyd$a */
    public interface a {
        a a(List<Episode> list);

        a b(int i);

        qyd build();

        a c(boolean z);

        a d(int i);

        a e(pyd pyd);

        a f(lyd lyd);

        a g(syd syd);

        a h(Show show);

        a i(myd myd);

        a j(nyd nyd);
    }

    public static a a() {
        iyd.b bVar = new iyd.b();
        bVar.h(Show.a().b());
        iyd.b bVar2 = bVar;
        bVar2.a(ImmutableList.of());
        iyd.b bVar3 = bVar2;
        bVar3.c(false);
        iyd.b bVar4 = bVar3;
        bVar4.d(0);
        iyd.b bVar5 = bVar4;
        bVar5.b(0);
        iyd.b bVar6 = bVar5;
        bVar6.f(null);
        iyd.b bVar7 = bVar6;
        bVar7.i(null);
        iyd.b bVar8 = bVar7;
        bVar8.j(null);
        iyd.b bVar9 = bVar8;
        bVar9.e(null);
        iyd.b bVar10 = bVar9;
        bVar10.g(null);
        return bVar10;
    }

    public static a b() {
        return new iyd.b();
    }

    public abstract lyd c();

    public abstract Show d();

    public abstract myd e();

    public abstract nyd f();

    public abstract pyd g();

    public abstract syd h();
}

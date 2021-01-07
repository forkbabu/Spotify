package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import defpackage.s81;

/* renamed from: e64  reason: default package */
public class e64 {
    private final boolean a;
    private final j64 b;

    public e64(boolean z, j64 j64) {
        this.a = z;
        this.b = j64;
    }

    public s81 a(String str, String str2, String str3, boolean z) {
        s81.a aVar;
        if (this.a) {
            str.getClass();
            aVar = z81.c().o("find:textHeader", HubsComponentCategory.HEADER.d()).y(z81.h().a(str));
        } else {
            str.getClass();
            aVar = z81.c().o("find:header", HubsComponentCategory.HEADER.d()).y(z81.h().a(str));
        }
        return aVar.m(ImmutableList.of(this.b.a(str2, str3, z))).l();
    }
}

package com.spotify.music.features.profile.profilelist;

import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import defpackage.lt7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final /* synthetic */ class f implements g0 {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // com.spotify.mobius.g0
    public final e0 a(Object obj, Object obj2) {
        Object obj3;
        lt7 lt7 = (lt7) obj2;
        ht7 ht7 = ht7.a;
        gt7 gt7 = new gt7((mt7) obj);
        it7 it7 = it7.a;
        ft7 ft7 = ft7.a;
        lt7.getClass();
        h.e(ht7, "i");
        h.e(gt7, "dl");
        h.e(it7, "lic");
        h.e(ft7, "lifbc");
        if (lt7 instanceof lt7.b) {
            obj3 = ht7.invoke(lt7);
        } else if (lt7 instanceof lt7.a) {
            obj3 = gt7.invoke(lt7);
        } else if (lt7 instanceof lt7.c) {
            obj3 = it7.invoke(lt7);
        } else if (lt7 instanceof lt7.d) {
            obj3 = ft7.invoke(lt7);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (e0) obj3;
    }
}

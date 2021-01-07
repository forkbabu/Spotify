package defpackage;

import com.google.common.base.Optional;

/* renamed from: bla  reason: default package */
public abstract class bla {
    public static bla a(boolean z, boolean z2) {
        return new zka(z, z2);
    }

    public abstract boolean b();

    public abstract boolean c();

    public bla d(Optional<Boolean> optional, Optional<Boolean> optional2) {
        return new zka(optional.isPresent() ? optional.get().booleanValue() : b(), optional2.isPresent() ? optional2.get().booleanValue() : c());
    }
}

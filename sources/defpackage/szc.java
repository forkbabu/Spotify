package defpackage;

import android.os.Parcelable;
import com.google.common.base.Optional;
import defpackage.pzc;

/* renamed from: szc  reason: default package */
public abstract class szc implements Parcelable {

    /* access modifiers changed from: package-private */
    /* renamed from: szc$a */
    public static class a extends pzc.e<l8e> {
        a() {
        }

        public Parcelable.Creator<? extends l8e> a() {
            return l8e.b();
        }
    }

    public static szc b(m8e m8e, l8e l8e) {
        return new bzc(m8e, Optional.fromNullable(l8e));
    }

    public abstract m8e a();

    public abstract Optional<l8e> c();
}

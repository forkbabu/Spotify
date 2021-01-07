package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.share.sharedata.ShareCapability;
import defpackage.q8e;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: r8e  reason: default package */
public final class r8e extends q8e {
    private final int a;
    private final int b;
    private final Drawable c;
    private final int d;
    private final ImmutableList<ShareCapability> e;
    private final Optional<String> f;

    /* access modifiers changed from: package-private */
    /* renamed from: r8e$b */
    public static final class b implements q8e.a {
        private Integer a;
        private Integer b;
        private Drawable c;
        private Integer d;
        private ImmutableList<ShareCapability> e;
        private Optional<String> f = Optional.absent();

        b() {
        }

        @Override // defpackage.q8e.a
        public q8e.a a(ImmutableList<ShareCapability> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null shareCapabilities");
        }

        public q8e.a b(Drawable drawable) {
            if (drawable != null) {
                this.c = drawable;
                return this;
            }
            throw new NullPointerException("Null icon");
        }

        @Override // defpackage.q8e.a
        public q8e build() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " titleResId");
            }
            if (this.c == null) {
                str = je.x0(str, " icon");
            }
            if (this.d == null) {
                str = je.x0(str, " logId");
            }
            if (this.e == null) {
                str = je.x0(str, " shareCapabilities");
            }
            if (str.isEmpty()) {
                return new r8e(this.a.intValue(), this.b.intValue(), this.c, this.d.intValue(), this.e, this.f, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public q8e.a c(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public q8e.a d(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public q8e.a e(Optional<String> optional) {
            this.f = optional;
            return this;
        }

        public q8e.a f(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    r8e(int i, int i2, Drawable drawable, int i3, ImmutableList immutableList, Optional optional, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = drawable;
        this.d = i3;
        this.e = immutableList;
        this.f = optional;
    }

    @Override // defpackage.q8e, defpackage.o8e
    public int a() {
        return this.d;
    }

    @Override // defpackage.q8e, defpackage.o8e
    public List b() {
        return this.e;
    }

    @Override // defpackage.q8e, defpackage.o8e
    public int c() {
        return this.b;
    }

    @Override // defpackage.q8e, defpackage.o8e
    public Optional<String> d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q8e)) {
            return false;
        }
        q8e q8e = (q8e) obj;
        if (this.a != q8e.id() || this.b != q8e.c() || !this.c.equals(q8e.icon()) || this.d != q8e.a() || !this.e.equals(q8e.b()) || !this.f.equals(q8e.d())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.q8e
    public ImmutableList<ShareCapability> f() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // defpackage.q8e, defpackage.o8e
    public Drawable icon() {
        return this.c;
    }

    @Override // defpackage.q8e, defpackage.o8e
    public int id() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AppShareDestinationImpl{id=");
        V0.append(this.a);
        V0.append(", titleResId=");
        V0.append(this.b);
        V0.append(", icon=");
        V0.append(this.c);
        V0.append(", logId=");
        V0.append(this.d);
        V0.append(", shareCapabilities=");
        V0.append(this.e);
        V0.append(", packageName=");
        return je.F0(V0, this.f, "}");
    }
}

package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import defpackage.lo0;

/* renamed from: go0  reason: default package */
final class go0 extends lo0 {
    private final mo0 b;
    private final ImmutableList<FormatType> c;
    private final ImmutableList<ActionType> d;
    private final ImmutableList<TriggerType> e;
    private final ho0 f;

    /* renamed from: go0$b */
    static final class b extends lo0.a {
        private mo0 a;
        private ImmutableList<FormatType> b;
        private ImmutableList<ActionType> c;
        private ImmutableList<TriggerType> d;
        private ho0 e;

        b() {
        }

        @Override // defpackage.lo0.a
        public lo0.a a(ImmutableList<ActionType> immutableList) {
            if (immutableList != null) {
                this.c = immutableList;
                return this;
            }
            throw new NullPointerException("Null actionCapabilities");
        }

        @Override // defpackage.lo0.a
        public lo0 b() {
            String str = this.a == null ? " triggerListState" : "";
            if (this.b == null) {
                str = je.x0(str, " formatCapabilities");
            }
            if (this.c == null) {
                str = je.x0(str, " actionCapabilities");
            }
            if (this.d == null) {
                str = je.x0(str, " triggerTypes");
            }
            if (str.isEmpty()) {
                return new go0(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.lo0.a
        public lo0.a c(ImmutableList<FormatType> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null formatCapabilities");
        }

        @Override // defpackage.lo0.a
        public lo0.a d(ho0 ho0) {
            this.e = ho0;
            return this;
        }

        @Override // defpackage.lo0.a
        public lo0.a e(mo0 mo0) {
            if (mo0 != null) {
                this.a = mo0;
                return this;
            }
            throw new NullPointerException("Null triggerListState");
        }

        @Override // defpackage.lo0.a
        public lo0.a f(ImmutableList<TriggerType> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null triggerTypes");
        }

        b(lo0 lo0, a aVar) {
            this.a = lo0.e();
            this.b = lo0.b();
            this.c = lo0.a();
            this.d = lo0.f();
            this.e = lo0.c();
        }
    }

    go0(mo0 mo0, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ho0 ho0, a aVar) {
        this.b = mo0;
        this.c = immutableList;
        this.d = immutableList2;
        this.e = immutableList3;
        this.f = ho0;
    }

    @Override // defpackage.lo0
    public ImmutableList<ActionType> a() {
        return this.d;
    }

    @Override // defpackage.lo0
    public ImmutableList<FormatType> b() {
        return this.c;
    }

    @Override // defpackage.lo0
    public ho0 c() {
        return this.f;
    }

    @Override // defpackage.lo0
    public lo0.a d() {
        return new b(this, null);
    }

    @Override // defpackage.lo0
    public mo0 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lo0)) {
            return false;
        }
        lo0 lo0 = (lo0) obj;
        if (this.b.equals(lo0.e()) && this.c.equals(lo0.b()) && this.d.equals(lo0.a()) && this.e.equals(lo0.f())) {
            ho0 ho0 = this.f;
            if (ho0 == null) {
                if (lo0.c() == null) {
                    return true;
                }
            } else if (ho0.equals(lo0.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lo0
    public ImmutableList<TriggerType> f() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        ho0 ho0 = this.f;
        return hashCode ^ (ho0 == null ? 0 : ho0.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("TriggerEngineModel{triggerListState=");
        V0.append(this.b);
        V0.append(", formatCapabilities=");
        V0.append(this.c);
        V0.append(", actionCapabilities=");
        V0.append(this.d);
        V0.append(", triggerTypes=");
        V0.append(this.e);
        V0.append(", pendingTrigger=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }
}

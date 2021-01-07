package com.spotify.remoteconfig.runtime.model;

import com.spotify.remoteconfig.runtime.model.PropertyModel;
import com.spotify.remoteconfig.runtime.model.b;

/* access modifiers changed from: package-private */
public final class a extends b {
    private final String a;
    private final String b;
    private final PropertyModel.PropertyModelType c;
    private final s0e d;
    private final String e;

    /* access modifiers changed from: package-private */
    public static final class b extends b.a {
        private String a;
        private String b;
        private PropertyModel.PropertyModelType c;
        private s0e d;
        private String e;

        b() {
        }

        public PropertyModel a() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " componentId");
            }
            if (this.c == null) {
                str = je.x0(str, " type");
            }
            if (this.d == null) {
                str = je.x0(str, " validator");
            }
            if (this.e == null) {
                str = je.x0(str, " value");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public b.a b(String str) {
            this.b = str;
            return this;
        }

        public b.a c(String str) {
            this.a = str;
            return this;
        }

        public b.a d(PropertyModel.PropertyModelType propertyModelType) {
            this.c = propertyModelType;
            return this;
        }

        public b.a e(s0e s0e) {
            this.d = s0e;
            return this;
        }

        public b.a f(String str) {
            this.e = str;
            return this;
        }
    }

    a(String str, String str2, PropertyModel.PropertyModelType propertyModelType, s0e s0e, String str3, C0386a aVar) {
        this.a = str;
        this.b = str2;
        this.c = propertyModelType;
        this.d = s0e;
        this.e = str3;
    }

    @Override // com.spotify.remoteconfig.runtime.model.b
    public String b() {
        return this.e;
    }

    public s0e c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a.equals(((a) bVar).a)) {
            a aVar = (a) bVar;
            if (this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    @Override // com.spotify.remoteconfig.runtime.model.PropertyModel
    public String name() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EnumPropertyModel{name=");
        V0.append(this.a);
        V0.append(", componentId=");
        V0.append(this.b);
        V0.append(", type=");
        V0.append(this.c);
        V0.append(", validator=");
        V0.append(this.d);
        V0.append(", value=");
        return je.I0(V0, this.e, "}");
    }

    @Override // com.spotify.remoteconfig.runtime.model.PropertyModel
    public Object value() {
        return this.e;
    }
}

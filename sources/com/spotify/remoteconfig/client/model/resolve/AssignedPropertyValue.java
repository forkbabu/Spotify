package com.spotify.remoteconfig.client.model.resolve;

import com.google.protobuf.GeneratedMessageLite;
import com.spotify.rcs.model.GranularConfiguration;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class AssignedPropertyValue {
    private final String a;
    private final String b;
    private final Boolean c;
    private final Integer d;
    private final String e;
    private final long f;

    public enum ValueType {
        BOOL_VALUE,
        INT_VALUE,
        ENUM_VALUE,
        NOT_SET
    }

    public AssignedPropertyValue(String str, String str2, Boolean bool, Integer num, String str3, long j, f fVar) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = num;
        this.e = str3;
        this.f = j;
    }

    public static final AssignedPropertyValue a(GranularConfiguration.AssignedPropertyValue assignedPropertyValue) {
        Boolean bool;
        Integer num;
        h.f(assignedPropertyValue, "proto");
        String str = null;
        if (assignedPropertyValue.v() == GranularConfiguration.AssignedPropertyValue.StructuredValueCase.BOOL_VALUE) {
            GranularConfiguration.AssignedPropertyValue.BoolValue p = assignedPropertyValue.p();
            h.b(p, "proto.boolValue");
            bool = Boolean.valueOf(p.l());
        } else {
            bool = null;
        }
        if (assignedPropertyValue.v() == GranularConfiguration.AssignedPropertyValue.StructuredValueCase.INT_VALUE) {
            GranularConfiguration.AssignedPropertyValue.IntValue t = assignedPropertyValue.t();
            h.b(t, "proto.intValue");
            num = Integer.valueOf(t.l());
        } else {
            num = null;
        }
        if (assignedPropertyValue.v() == GranularConfiguration.AssignedPropertyValue.StructuredValueCase.ENUM_VALUE) {
            GranularConfiguration.AssignedPropertyValue.EnumValue r = assignedPropertyValue.r();
            h.b(r, "proto.enumValue");
            str = r.l();
        }
        String u = assignedPropertyValue.u();
        h.b(u, "proto.name");
        String q = assignedPropertyValue.q();
        h.b(q, "proto.componentId");
        return new AssignedPropertyValue(u, q, bool, num, str, assignedPropertyValue.s(), null);
    }

    public final Boolean b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    public final long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssignedPropertyValue)) {
            return false;
        }
        AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) obj;
        return h.a(this.a, assignedPropertyValue.a) && h.a(this.b, assignedPropertyValue.b) && h.a(this.c, assignedPropertyValue.c) && h.a(this.d, assignedPropertyValue.d) && h.a(this.e, assignedPropertyValue.e) && this.f == assignedPropertyValue.f;
    }

    public final Integer f() {
        return this.d;
    }

    public final String g() {
        return this.a;
    }

    public final ValueType h() {
        if (this.c != null) {
            return ValueType.BOOL_VALUE;
        }
        if (this.d != null) {
            return ValueType.INT_VALUE;
        }
        if (this.e != null) {
            return ValueType.ENUM_VALUE;
        }
        return ValueType.NOT_SET;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode4 + i) * 31) + e.a(this.f);
    }

    public final GranularConfiguration.AssignedPropertyValue i() {
        GranularConfiguration.AssignedPropertyValue.a w = GranularConfiguration.AssignedPropertyValue.w();
        w.r(this.a);
        w.n(this.b);
        w.p(this.f);
        if (this.c != null) {
            GranularConfiguration.AssignedPropertyValue.BoolValue.a m = GranularConfiguration.AssignedPropertyValue.BoolValue.m();
            m.m(this.c.booleanValue());
            w.m(m);
        } else if (this.d != null) {
            GranularConfiguration.AssignedPropertyValue.IntValue.a m2 = GranularConfiguration.AssignedPropertyValue.IntValue.m();
            m2.m(this.d.intValue());
            w.q(m2);
        } else if (this.e != null) {
            GranularConfiguration.AssignedPropertyValue.EnumValue.a m3 = GranularConfiguration.AssignedPropertyValue.EnumValue.m();
            m3.m(this.e);
            w.o(m3);
        }
        GeneratedMessageLite build = w.build();
        h.b(build, "propBuilder.build()");
        return (GranularConfiguration.AssignedPropertyValue) build;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AssignedPropertyValue(name=");
        V0.append(this.a);
        V0.append(", componentId=");
        V0.append(this.b);
        V0.append(", boolValue=");
        V0.append(this.c);
        V0.append(", intValue=");
        V0.append(this.d);
        V0.append(", enumValue=");
        V0.append(this.e);
        V0.append(", groupId=");
        return je.E0(V0, this.f, ")");
    }
}

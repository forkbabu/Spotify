package com.spotify.remoteconfig.client.cosmos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class CosmosPropertyValue {
    public static final a f = new a(null);
    @d20("name")
    private final String a;
    @d20("componentId")
    private final String b;
    @d20("boolValue")
    private final Boolean c;
    @d20("intValue")
    private final Integer d;
    @d20("enumValue")
    private final String e;

    public static final class a {
        private a() {
        }

        @JsonCreator
        public final CosmosPropertyValue create(AssignedPropertyValue assignedPropertyValue) {
            String str;
            Integer num;
            Boolean bool;
            h.f(assignedPropertyValue, "assignedPropertyValue");
            int ordinal = assignedPropertyValue.h().ordinal();
            if (ordinal == 0) {
                bool = assignedPropertyValue.b();
                num = null;
                str = null;
            } else if (ordinal == 1) {
                num = assignedPropertyValue.f();
                bool = null;
                str = null;
            } else if (ordinal == 2) {
                str = assignedPropertyValue.d();
                bool = null;
                num = null;
            } else {
                throw new IllegalArgumentException("Property must be one of [bool, int, enum]");
            }
            return new CosmosPropertyValue(assignedPropertyValue.g(), assignedPropertyValue.c(), bool, num, str);
        }

        public a(f fVar) {
        }
    }

    public CosmosPropertyValue(String str, String str2, Boolean bool, Integer num, String str3) {
        h.f(str, "name");
        h.f(str2, "componentId");
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = num;
        this.e = str3;
    }

    @JsonCreator
    public static final CosmosPropertyValue create(AssignedPropertyValue assignedPropertyValue) {
        return f.create(assignedPropertyValue);
    }

    public final CosmosPropertyValue copy(String str, String str2, Boolean bool, Integer num, String str3) {
        h.f(str, "name");
        h.f(str2, "componentId");
        return new CosmosPropertyValue(str, str2, bool, num, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosPropertyValue)) {
            return false;
        }
        CosmosPropertyValue cosmosPropertyValue = (CosmosPropertyValue) obj;
        return h.a(this.a, cosmosPropertyValue.a) && h.a(this.b, cosmosPropertyValue.b) && h.a(this.c, cosmosPropertyValue.c) && h.a(this.d, cosmosPropertyValue.d) && h.a(this.e, cosmosPropertyValue.e);
    }

    @JsonProperty("boolValue")
    public final Boolean getBoolValue() {
        return this.c;
    }

    @JsonProperty("componentId")
    public final String getComponentId() {
        return this.b;
    }

    @JsonProperty("enumValue")
    public final String getEnumValue() {
        return this.e;
    }

    @JsonProperty("intValue")
    public final Integer getIntValue() {
        return this.d;
    }

    @JsonProperty("name")
    public final String getName() {
        return this.a;
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
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CosmosPropertyValue(name=");
        V0.append(this.a);
        V0.append(", componentId=");
        V0.append(this.b);
        V0.append(", boolValue=");
        V0.append(this.c);
        V0.append(", intValue=");
        V0.append(this.d);
        V0.append(", enumValue=");
        return je.I0(V0, this.e, ")");
    }
}

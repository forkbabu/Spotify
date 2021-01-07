package com.spotify.remoteconfig.client.cosmos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class CoreConfigurationRequest {
    public static final a c = new a(null);
    @d20("configurationAssignmentId")
    private final String a;
    @d20("properties")
    private final List<CosmosPropertyValue> b;

    public static final class a {
        private a() {
        }

        @JsonCreator
        public final CoreConfigurationRequest create(com.spotify.remoteconfig.client.model.resolve.a aVar) {
            h.f(aVar, "granularConfiguration");
            String c = aVar.c();
            List<AssignedPropertyValue> d = aVar.d();
            ArrayList arrayList = new ArrayList(d.e(d, 10));
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                arrayList.add(CosmosPropertyValue.f.create(it.next()));
            }
            return new CoreConfigurationRequest(c, arrayList);
        }

        public a(f fVar) {
        }
    }

    public CoreConfigurationRequest(String str, List<CosmosPropertyValue> list) {
        h.f(str, "assignmentId");
        h.f(list, "properties");
        this.a = str;
        this.b = list;
    }

    @JsonCreator
    public static final CoreConfigurationRequest create(com.spotify.remoteconfig.client.model.resolve.a aVar) {
        return c.create(aVar);
    }

    public final String a() {
        return this.a;
    }

    public final CoreConfigurationRequest copy(String str, List<CosmosPropertyValue> list) {
        h.f(str, "assignmentId");
        h.f(list, "properties");
        return new CoreConfigurationRequest(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreConfigurationRequest)) {
            return false;
        }
        CoreConfigurationRequest coreConfigurationRequest = (CoreConfigurationRequest) obj;
        return h.a(this.a, coreConfigurationRequest.a) && h.a(this.b, coreConfigurationRequest.b);
    }

    @JsonProperty("configurationAssignmentId")
    public final String getAssignmentId() {
        return this.a;
    }

    @JsonProperty("properties")
    public final List<CosmosPropertyValue> getProperties() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<CosmosPropertyValue> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CoreConfigurationRequest(assignmentId=");
        V0.append(this.a);
        V0.append(", properties=");
        return je.L0(V0, this.b, ")");
    }
}

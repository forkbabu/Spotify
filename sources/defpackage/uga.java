package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: uga  reason: default package */
public final class uga {
    private final List<tga> a;

    public uga(@JsonProperty("partnerIntegrations") List<tga> list) {
        h.e(list, "partnerIntegrations");
        this.a = list;
    }

    public final List<tga> a() {
        return this.a;
    }

    public final uga copy(@JsonProperty("partnerIntegrations") List<tga> list) {
        h.e(list, "partnerIntegrations");
        return new uga(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof uga) && h.a(this.a, ((uga) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<tga> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("IntegrationsResponse(partnerIntegrations="), this.a, ")");
    }
}

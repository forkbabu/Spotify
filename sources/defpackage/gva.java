package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.assistedcuration.proto.DrillDownViewResponse;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* renamed from: gva  reason: default package */
public abstract class gva {
    public static gva a(String str, String str2, EntityType entityType, Optional<Integer> optional, DrillDownViewResponse drillDownViewResponse) {
        return new eva(str, str2, entityType, optional, drillDownViewResponse);
    }

    public abstract EntityType b();

    public abstract Optional<Integer> c();

    public abstract String d();

    public abstract String e();

    public abstract DrillDownViewResponse f();
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.assistedcuration.proto.DrillDownViewResponse;
import com.spotify.searchview.assistedcuration.proto.EntityType;
import io.reactivex.functions.l;

/* renamed from: l5b  reason: default package */
public final /* synthetic */ class l5b implements l {
    public final /* synthetic */ s7b a;
    public final /* synthetic */ String b;

    public /* synthetic */ l5b(s7b s7b, String str) {
        this.a = s7b;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        EntityType entityType;
        Optional<Integer> optional;
        s7b s7b = this.a;
        String str = this.b;
        DrillDownViewResponse drillDownViewResponse = (DrillDownViewResponse) obj;
        String d = s7b.d();
        String a2 = s7b.a();
        str.hashCode();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1415163932:
                if (str.equals("albums")) {
                    c = 0;
                    break;
                }
                break;
            case -865716088:
                if (str.equals("tracks")) {
                    c = 1;
                    break;
                }
                break;
            case -732362228:
                if (str.equals("artists")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                entityType = EntityType.ENTITY_TYPE_ALBUM;
                break;
            case 1:
                entityType = EntityType.ENTITY_TYPE_TRACK;
                break;
            case 2:
                entityType = EntityType.ENTITY_TYPE_ARTIST;
                break;
            default:
                je.p("Could not resolve entity type for ", str);
                entityType = EntityType.ENTITY_TYPE_UNKNOWN;
                break;
        }
        if (s7b instanceof t7b) {
            optional = ((t7b) s7b).f();
        } else {
            Assertion.g("Request is not a drilldown request to parse the next offset: " + s7b);
            optional = Optional.absent();
        }
        return gva.a(d, a2, entityType, optional, drillDownViewResponse);
    }
}

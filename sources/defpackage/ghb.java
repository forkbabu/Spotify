package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.b;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.marketingformats.constants.MarketingFormatsComponentId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: ghb  reason: default package */
public final class ghb extends b<e<s81>> {
    private final List<s81> c;
    private final String f;
    private final uib n;
    private final rib o;
    private final kib p;
    private final xib q;
    private final oib r;

    public ghb(List<? extends s81> list, String str, uib uib, rib rib, kib kib, xib xib, oib oib) {
        h.e(list, "children");
        h.e(str, "loggablePageUri");
        h.e(uib, "slideHeaderIntroViewHolderFactory");
        h.e(rib, "slideHeaderInfoViewHolderFactory");
        h.e(kib, "slideHeaderEntityViewHolderFactory");
        h.e(xib, "slideHeaderPlayableEntityViewHolderFactory");
        h.e(oib, "slideHeaderFeaturedVideoViewHolderFactory");
        this.f = str;
        this.n = uib;
        this.o = rib;
        this.p = kib;
        this.q = xib;
        this.r = oib;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String id = t.componentId().id();
            h.e(id, "id");
            MarketingFormatsComponentId[] values = MarketingFormatsComponentId.values();
            boolean z = false;
            for (int i = 0; i < 8; i++) {
                MarketingFormatsComponentId marketingFormatsComponentId = values[i];
                if (kotlin.text.e.f(id, marketingFormatsComponentId.d(), true)) {
                    int ordinal = marketingFormatsComponentId.ordinal();
                    if ((ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) ? true : z) {
                        arrayList.add(t);
                    }
                }
            }
            throw new IllegalArgumentException(je.x0("No such id for Marketing Formats components. Id received: ", id));
        }
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        e eVar = (e) b0Var;
        h.e(eVar, "holder");
        eVar.h0(this.c.get(i), i);
        int w = w(i);
        if (w == 3) {
            ((wib) eVar).E0(this.f);
        } else if (w == 4) {
            ((jib) eVar).B0(this.f);
        } else if (w == 5) {
            ((nib) eVar).C0(this.f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        if (i == 1) {
            tib b = this.n.b(viewGroup);
            h.d(b, "slideHeaderIntroViewHolderFactory.create(parent)");
            return b;
        } else if (i == 2) {
            qib b2 = this.o.b(viewGroup);
            h.d(b2, "slideHeaderInfoViewHolderFactory.create(parent)");
            return b2;
        } else if (i == 3) {
            wib b3 = this.q.b(viewGroup);
            h.d(b3, "slideHeaderPlayableEntit…derFactory.create(parent)");
            return b3;
        } else if (i == 4) {
            jib b4 = this.p.b(viewGroup);
            h.d(b4, "slideHeaderEntityViewHolderFactory.create(parent)");
            return b4;
        } else if (i == 5) {
            nib b5 = this.r.b(viewGroup);
            h.d(b5, "slideHeaderFeaturedVideo…derFactory.create(parent)");
            return b5;
        } else {
            throw new IllegalArgumentException(je.p0("Unrecognized view type: ", i));
        }
    }

    public final String Z(int i) {
        int w = w(i);
        if (w == 1) {
            return "header-intro";
        }
        if (w == 2) {
            return "header-info";
        }
        if (w == 3) {
            return "header-playable-entity";
        }
        if (w == 4) {
            return "header-entity";
        }
        if (w == 5) {
            return "header-featured-video";
        }
        throw new IllegalArgumentException(je.p0("Unrecognized view type: ", w));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        s81 s81 = this.c.get(i);
        String id = s81.componentId().id();
        h.e(id, "id");
        MarketingFormatsComponentId[] values = MarketingFormatsComponentId.values();
        for (int i2 = 0; i2 < 8; i2++) {
            MarketingFormatsComponentId marketingFormatsComponentId = values[i2];
            if (kotlin.text.e.f(id, marketingFormatsComponentId.d(), true)) {
                int ordinal = marketingFormatsComponentId.ordinal();
                if (ordinal == 2) {
                    return 4;
                }
                if (ordinal == 3) {
                    return 5;
                }
                if (ordinal == 4) {
                    return 2;
                }
                if (ordinal == 5) {
                    return 1;
                }
                if (ordinal == 6) {
                    return 3;
                }
                StringBuilder V0 = je.V0("Unexpected componentId from model: ");
                V0.append(s81.componentId().id());
                throw new IllegalArgumentException(V0.toString());
            }
        }
        throw new IllegalArgumentException(je.x0("No such id for Marketing Formats components. Id received: ", id));
    }
}

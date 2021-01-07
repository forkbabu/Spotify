package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.spotify.share.sharedata.ShareCapability;
import defpackage.h2d;
import defpackage.i2d;
import defpackage.q8e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: q2d  reason: default package */
public final class q2d {
    private final Comparator<o8e> a = new a(this);
    private final c2d b;
    private final List<Integer> c;
    private final Map<Integer, Integer> d;
    private final Map<Integer, Drawable> e;

    /* renamed from: q2d$a */
    static final class a<T> implements Comparator<o8e> {
        final /* synthetic */ q2d a;

        a(q2d q2d) {
            this.a = q2d;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(o8e o8e, o8e o8e2) {
            return h.g(this.a.c.indexOf(Integer.valueOf(o8e.id())), this.a.c.indexOf(Integer.valueOf(o8e2.id())));
        }
    }

    public q2d(c2d c2d, List<Integer> list, Map<Integer, Integer> map, Map<Integer, Drawable> map2) {
        h.e(c2d, "destinationsProvider");
        h.e(list, "destinationsOrder");
        h.e(map, "destinationNamesOverride");
        h.e(map2, "destinationIconsOverride");
        this.b = c2d;
        this.c = list;
        this.d = map;
        this.e = map2;
    }

    public final i2d.a b(h2d.b bVar) {
        h.e(bVar, "effect");
        List<o8e> b2 = this.b.b(bVar.a(), bVar.b());
        h.d(b2, "destinationsProvider.get…ffect.shareData\n        )");
        List J = d.J(b2, this.a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            if (this.c.contains(Integer.valueOf(((o8e) obj).id()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(d.e(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o8e o8e = (o8e) it.next();
            Integer num = this.d.get(Integer.valueOf(o8e.id()));
            if (num != null) {
                int intValue = num.intValue();
                h.d(o8e, "destination");
                q8e.a e2 = q8e.e(o8e.id(), intValue, o8e.a(), o8e.icon(), new ShareCapability[0]);
                e2.a(ImmutableList.copyOf((Collection) o8e.b()));
                o8e = e2.build();
            }
            arrayList2.add(o8e);
        }
        ArrayList arrayList3 = new ArrayList(d.e(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            o8e o8e2 = (o8e) it2.next();
            Drawable drawable = this.e.get(Integer.valueOf(o8e2.id()));
            if (drawable != null) {
                h.d(o8e2, "destination");
                q8e.a e3 = q8e.e(o8e2.id(), o8e2.c(), o8e2.a(), drawable, new ShareCapability[0]);
                e3.a(ImmutableList.copyOf((Collection) o8e2.b()));
                o8e2 = e3.build();
            }
            arrayList3.add(o8e2);
        }
        return new i2d.a(d.Q(arrayList3));
    }
}

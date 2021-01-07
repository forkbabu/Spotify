package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: l6  reason: default package */
public final class l6 {
    final List<i6> a;
    final boolean b;

    /* renamed from: l6$a */
    public static final class a {
        private List<i6> a;

        public a a(i6 i6Var) {
            if (i6Var != null) {
                List<i6> list = this.a;
                if (list == null) {
                    this.a = new ArrayList();
                } else if (list.contains(i6Var)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                this.a.add(i6Var);
                return this;
            }
            throw new IllegalArgumentException("route must not be null");
        }

        public l6 b() {
            return new l6(this.a, false);
        }
    }

    l6(List<i6> list, boolean z) {
        this.a = list == null ? Collections.emptyList() : list;
        this.b = z;
    }

    public static l6 a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList2.add(bundle2 != null ? new i6(bundle2) : null);
            }
            arrayList = arrayList2;
        }
        return new l6(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public boolean b() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            i6 i6Var = this.a.get(i);
            if (i6Var == null || !i6Var.q()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("MediaRouteProviderDescriptor{ ", "routes=");
        Z0.append(Arrays.toString(this.a.toArray()));
        Z0.append(", isValid=");
        Z0.append(b());
        Z0.append(" }");
        return Z0.toString();
    }
}

package defpackage;

import com.google.protobuf.u;
import com.spotify.instrumentation.navigation.logger.c;
import com.spotify.instrumentation.navigation.logger.d;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.instrumentation.navigation.logger.h;
import com.spotify.messages.UbiExpr2PageView;
import com.spotify.remoteconfig.fc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: cw9  reason: default package */
public final class cw9 {
    private final gl0<u> a;
    private final Set<mm0> b;
    private final fc c;

    public cw9(gl0<u> gl0, Set<mm0> set, fc fcVar) {
        h.e(gl0, "eventPublisher");
        h.e(set, "pageViewObservers");
        h.e(fcVar, "properties");
        this.a = gl0;
        this.b = set;
        this.c = fcVar;
    }

    private final String b(f fVar) {
        if (fVar instanceof f.g) {
            StringBuilder V0 = je.V0("user_interaction(");
            V0.append(((f.g) fVar).b().a());
            V0.append(')');
            return V0.toString();
        } else if (h.a(fVar, f.a.a)) {
            return "back";
        } else {
            if (h.a(fVar, f.e.a)) {
                return "launcher";
            }
            if (h.a(fVar, f.d.a)) {
                return "deep_link";
            }
            if (h.a(fVar, f.c.a)) {
                return "client_lost_focus";
            }
            if (h.a(fVar, f.b.a)) {
                return "client_gained_focus";
            }
            if (h.a(fVar, f.C0160f.a)) {
                return "unknown";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public void a(d dVar, d dVar2, f fVar, List<? extends com.spotify.instrumentation.navigation.logger.h> list, List<c> list2) {
        String str;
        String str2;
        String b2;
        String a2;
        String c2;
        String d;
        String b3;
        String a3;
        String c3;
        String d2;
        h.e(fVar, "action");
        h.e(list, "errors");
        h.e(list2, "recentInteractions");
        if (this.c.a()) {
            UbiExpr2PageView.b u = UbiExpr2PageView.u();
            boolean z = false;
            if (!(dVar == null || (d2 = dVar.d()) == null)) {
                if (!(d2.length() == 0)) {
                    u.w(d2);
                }
            }
            if (!(dVar == null || (c3 = dVar.c()) == null)) {
                if (!(c3.length() == 0)) {
                    u.v(c3);
                }
            }
            if (!(dVar == null || (a3 = dVar.a()) == null)) {
                if (!(a3.length() == 0)) {
                    u.o(a3);
                }
            }
            if (!(dVar == null || (b3 = dVar.b()) == null)) {
                if (!(b3.length() == 0)) {
                    u.u(b3);
                }
            }
            if (!(dVar2 == null || (d = dVar2.d()) == null)) {
                if (!(d.length() == 0)) {
                    u.s(d);
                }
            }
            if (!(dVar2 == null || (c2 = dVar2.c()) == null)) {
                if (!(c2.length() == 0)) {
                    u.r(c2);
                }
            }
            if (!(dVar2 == null || (a2 = dVar2.a()) == null)) {
                if (!(a2.length() == 0)) {
                    u.p(a2);
                }
            }
            if (!(dVar2 == null || (b2 = dVar2.b()) == null)) {
                if (b2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    u.q(b2);
                }
            }
            u.t(b(fVar));
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            u.n(arrayList);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.d.e(list, 10));
            for (T t : list) {
                if (t instanceof h.e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("navigation_interrupted_by_new_action");
                    sb.append('(');
                    T t2 = t;
                    int ordinal = t2.b().ordinal();
                    if (ordinal == 0) {
                        str2 = "waiting_for_location_change";
                    } else if (ordinal == 1) {
                        str2 = "waiting_for_completion";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    sb.append(str2);
                    sb.append(", ");
                    str = je.H0(sb, b(t2.a()), ')');
                } else if (kotlin.jvm.internal.h.a(t, h.c.a)) {
                    str = "location_changing_without_request";
                } else if (kotlin.jvm.internal.h.a(t, h.a.a)) {
                    str = "location_change_is_missing_action";
                } else if (kotlin.jvm.internal.h.a(t, h.d.a)) {
                    str = "missing_location_changing";
                } else if (t instanceof h.b) {
                    str = je.H0(je.V0("location_changing_more_than_once("), b(t.a()), ')');
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(str);
            }
            u.m(arrayList2);
            UbiExpr2PageView ubiExpr2PageView = (UbiExpr2PageView) u.build();
            kotlin.jvm.internal.h.d(ubiExpr2PageView, "createPageView(\n        …actions\n                )");
            Iterator<T> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().a(ubiExpr2PageView);
            }
            this.a.c(ubiExpr2PageView);
        }
    }
}

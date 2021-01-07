package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.spotify.hubs.view.proto.Command;
import com.spotify.hubs.view.proto.Component;
import com.spotify.hubs.view.proto.ImageData;
import com.spotify.hubs.view.proto.Images;
import com.spotify.hubs.view.proto.Text;
import com.spotify.hubs.view.proto.UIComponent;
import com.spotify.hubs.view.proto.View;
import defpackage.b91;
import defpackage.p81;
import defpackage.r81;
import defpackage.s81;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kha  reason: default package */
public final class kha {
    private static p81 a(Struct struct) {
        p81.a a = z81.a();
        for (Map.Entry<String, Value> entry : struct.i().entrySet()) {
            a = e(a, entry.getKey(), entry.getValue());
        }
        return a.d();
    }

    private static s81 b(Component component) {
        s81.a r = z81.c().s(MoreObjects.emptyToNull(component.p())).r(MoreObjects.emptyToNull(component.o()));
        UIComponent i = component.i();
        s81.a n = r.n(z81.d(i.l(), i.h()));
        Text t = component.t();
        s81.a z = n.z(z81.h().a(MoreObjects.emptyToNull(t.n())).d(MoreObjects.emptyToNull(t.m())).c(MoreObjects.emptyToNull(t.l())).e(MoreObjects.emptyToNull(t.h())).build());
        Images q = component.q();
        x81 x81 = null;
        r81.a g = z81.f().e(MoreObjects.nullToEmpty(q.m())).g(q.n().equals(ImageData.i()) ? null : c(q.n()));
        if (!q.h().equals(ImageData.i())) {
            x81 = c(q.h());
        }
        r81.a a = g.a(x81);
        Map<String, ImageData> i2 = q.i();
        HashMap newHashMapWithExpectedSize = Collections2.newHashMapWithExpectedSize(i2.size());
        for (Map.Entry<String, ImageData> entry : i2.entrySet()) {
            if (entry.getValue() != ImageData.i()) {
                newHashMapWithExpectedSize.put(entry.getKey(), c(entry.getValue()));
            }
        }
        s81.a u = z.u(a.c(newHashMapWithExpectedSize).b());
        List<Component> h = component.h();
        ArrayList arrayList = new ArrayList(h.size());
        for (Component component2 : h) {
            arrayList.add(b(component2));
        }
        s81.a w = u.m(arrayList).p(a(component.l())).v(a(component.r())).w(a(component.s()));
        Map<String, Command> n2 = component.n();
        HashMap newHashMapWithExpectedSize2 = Collections2.newHashMapWithExpectedSize(n2.size());
        for (Map.Entry<String, Command> entry2 : n2.entrySet()) {
            if (entry2.getValue() != Command.i()) {
                String key = entry2.getKey();
                Command value = entry2.getValue();
                newHashMapWithExpectedSize2.put(key, z81.b().e(value.l()).a(a(value.h())).c());
            }
        }
        return w.q(newHashMapWithExpectedSize2).l();
    }

    private static x81 c(ImageData imageData) {
        return z81.e().g(MoreObjects.emptyToNull(imageData.m())).f(MoreObjects.emptyToNull(imageData.l())).d(a(imageData.h())).c();
    }

    public static b91 d(View view) {
        s81 s81;
        b91.a m = z81.i().k(MoreObjects.emptyToNull(view.n())).m(MoreObjects.emptyToNull(view.o()));
        if (view.m().equals(Component.m())) {
            s81 = null;
        } else {
            s81 = b(view.m());
        }
        b91.a j = m.j(s81);
        List<Component> h = view.h();
        int size = h.size();
        s81[] s81Arr = new s81[size];
        for (int i = 0; i < size; i++) {
            s81Arr[i] = b(h.get(i));
        }
        return j.f(s81Arr).i(MoreObjects.emptyToNull(view.l())).h(a(view.i())).g();
    }

    private static p81.a e(p81.a aVar, String str, Value value) {
        int ordinal = value.l().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return aVar.p(str, value.o());
            }
            if (ordinal == 3) {
                return aVar.b(str, value.h());
            }
            if (ordinal == 4) {
                Map<String, Value> i = value.p().i();
                p81.a a = z81.a();
                for (Map.Entry<String, Value> entry : i.entrySet()) {
                    a = e(a, entry.getKey(), entry.getValue());
                }
                return aVar.e(str, a.d());
            } else if (ordinal != 5) {
                return aVar;
            } else {
                List<Value> i2 = value.m().i();
                if (i2.isEmpty()) {
                    return aVar;
                }
                int i3 = 0;
                Value value2 = i2.get(0);
                int ordinal2 = value2.l().ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        int size = i2.size();
                        String[] strArr = new String[size];
                        for (int i4 = 0; i4 < size; i4++) {
                            strArr[i4] = i2.get(0).o();
                        }
                        return aVar.q(str, strArr);
                    } else if (ordinal2 == 3) {
                        int size2 = i2.size();
                        boolean[] zArr = new boolean[size2];
                        while (i3 < size2) {
                            zArr[i3] = i2.get(i3).h();
                            i3++;
                        }
                        return aVar.c(str, zArr);
                    } else if (ordinal2 != 4) {
                        return aVar;
                    } else {
                        int size3 = i2.size();
                        p81[] p81Arr = new p81[size3];
                        while (i3 < size3) {
                            p81Arr[i3] = e(z81.a(), str, i2.get(i3)).d();
                            i3++;
                        }
                        return aVar.f(str, p81Arr);
                    }
                } else if (value2.n() % 1.0d == 0.0d) {
                    int size4 = i2.size();
                    double[] dArr = new double[size4];
                    while (i3 < size4) {
                        dArr[i3] = i2.get(i3).n();
                        i3++;
                    }
                    return aVar.g(str, dArr);
                } else {
                    int size5 = i2.size();
                    int[] iArr = new int[size5];
                    while (i3 < size5) {
                        iArr[i3] = (int) i2.get(i3).n();
                        i3++;
                    }
                    return aVar.k(str, iArr);
                }
            }
        } else if (value.n() % 1.0d == 0.0d) {
            return aVar.j(str, (int) value.n());
        } else {
            return aVar.h(str, value.n());
        }
    }
}

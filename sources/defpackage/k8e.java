package defpackage;

import java.util.List;

/* renamed from: k8e  reason: default package */
public abstract class k8e implements m8e {
    public static k8e a(List<String> list) {
        if (!list.isEmpty()) {
            return new h8e(list);
        }
        throw new IllegalArgumentException("Color list can't be empty in GradientShareMedia");
    }

    public abstract List<String> b();
}

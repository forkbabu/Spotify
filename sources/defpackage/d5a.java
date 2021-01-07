package defpackage;

import io.reactivex.functions.l;

/* renamed from: d5a  reason: default package */
public final /* synthetic */ class d5a implements l {
    public static final /* synthetic */ d5a a = new d5a();

    private /* synthetic */ d5a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return v4a.b("car_debug");
        }
        return v4a.c("car_debug");
    }
}

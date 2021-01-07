package defpackage;

import android.content.pm.ServiceInfo;
import com.google.common.base.Function;

/* renamed from: dg0  reason: default package */
public final /* synthetic */ class dg0 implements Function {
    public static final /* synthetic */ dg0 a = new dg0();

    private /* synthetic */ dg0() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ServiceInfo) obj).name;
    }
}

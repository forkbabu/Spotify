package defpackage;

import com.google.common.base.Function;
import java.io.File;

/* renamed from: gy0  reason: default package */
public final /* synthetic */ class gy0 implements Function {
    public static final /* synthetic */ gy0 a = new gy0();

    private /* synthetic */ gy0() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return new File((String) obj, "pses_configuration");
    }
}

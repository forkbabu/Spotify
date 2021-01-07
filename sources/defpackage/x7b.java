package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: x7b  reason: default package */
public final /* synthetic */ class x7b implements l {
    public static final /* synthetic */ x7b a = new x7b();

    private /* synthetic */ x7b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        b91 b91 = (b91) obj;
        if (b91.body().isEmpty()) {
            return b91;
        }
        if (!je.B((s81) b91.body().get(0), HubsGlueComponent.BACKGROUND.id())) {
            return b91;
        }
        List<? extends s81> children = ((s81) b91.body().get(0)).children();
        return b91.toBuilder().e(children).a(b91.body().subList(1, b91.body().size())).d("lastTopResultItemPosition", Integer.valueOf(children.size() - 1)).g();
    }
}

package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v75  reason: default package */
public final /* synthetic */ class v75 implements l {
    public static final /* synthetic */ v75 a = new v75();

    private /* synthetic */ v75() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        b91 b91 = (b91) obj;
        s81 header = b91.header();
        if (header == null) {
            return b91;
        }
        List<? extends s81> children = header.children();
        ArrayList arrayList = new ArrayList(children.size());
        for (s81 s81 : children) {
            if (je.B(s81, HubsGlueComponent.SHUFFLE_BUTTON.id())) {
                arrayList.add(s81.toBuilder().o("button:fixedSizeShuffleButton", s81.componentId().category()).l());
            } else {
                arrayList.add(s81);
            }
        }
        return b91.toBuilder().j(header.toBuilder().m(arrayList).l()).g();
    }
}

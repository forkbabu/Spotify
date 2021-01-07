package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import defpackage.k91;
import defpackage.s81;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ex3  reason: default package */
public final /* synthetic */ class ex3 implements k91.a {
    public static final /* synthetic */ ex3 a = new ex3();

    private /* synthetic */ ex3() {
    }

    @Override // defpackage.k91.a
    public final s81 a(s81 s81) {
        if (!je.B(s81, "freetier:entityTopContainer")) {
            return s81;
        }
        s81.a builder = s81.toBuilder();
        List<? extends s81> children = s81.children();
        ArrayList arrayList = new ArrayList(children.size());
        for (s81 s812 : children) {
            if (je.B(s812, HubsGlueComponent.SHUFFLE_BUTTON.id())) {
                arrayList.add(s812.toBuilder().o("button:fixedSizeShuffleButton", s812.componentId().category()).l());
            } else {
                arrayList.add(s812);
            }
        }
        return builder.m(arrayList).l();
    }
}

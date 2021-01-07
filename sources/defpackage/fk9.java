package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;

/* renamed from: fk9  reason: default package */
public final /* synthetic */ class fk9 implements Function {
    public static final /* synthetic */ fk9 a = new fk9();

    private /* synthetic */ fk9() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        s81 s81 = (s81) obj;
        String id = HubsGlueComponent.SHUFFLE_BUTTON.id();
        s81.getClass();
        return !id.equals(s81.componentId().id()) ? s81 : s81.toBuilder().o("playButton:RoundShuffle", s81.componentId().category()).l();
    }
}

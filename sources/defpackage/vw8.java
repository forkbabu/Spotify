package defpackage;

import com.google.common.base.Function;
import com.spotify.voiceassistant.player.models.metadata.MetadataItem;

/* renamed from: vw8  reason: default package */
public final /* synthetic */ class vw8 implements Function {
    public static final /* synthetic */ vw8 a = new vw8();

    private /* synthetic */ vw8() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((MetadataItem) obj).error();
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import defpackage.k91;

/* renamed from: ye7  reason: default package */
public final /* synthetic */ class ye7 implements k91.a {
    public final /* synthetic */ kf7 a;

    public /* synthetic */ ye7(kf7 kf7) {
        this.a = kf7;
    }

    @Override // defpackage.k91.a
    public final s81 a(s81 s81) {
        kf7 kf7 = this.a;
        if (!je.B(s81, HubsGlue2Row.IMAGE_ROW.id())) {
            return null;
        }
        return s81.toBuilder().d("active", Boolean.valueOf(af7.a(s81).transform(new ze7(kf7)).or((Optional<V>) ((V) Boolean.FALSE)).booleanValue())).l();
    }
}

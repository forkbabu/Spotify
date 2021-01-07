package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import defpackage.b91;
import kotlin.jvm.internal.h;

/* renamed from: e91  reason: default package */
public class e91 extends d91<b91> implements b91 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e91(b91 b91) {
        super(b91);
        h.e(b91, "model");
    }

    @Override // defpackage.b91
    public p81 custom() {
        return ((b91) a()).custom();
    }

    @Override // defpackage.b91
    public String extension() {
        return ((b91) a()).extension();
    }

    @Override // defpackage.b91
    public String id() {
        return ((b91) a()).id();
    }

    @Override // defpackage.b91
    public String title() {
        return ((b91) a()).title();
    }

    @Override // defpackage.b91
    public b91.a toBuilder() {
        return HubsImmutableViewModel.Companion.c(this).toBuilder();
    }
}

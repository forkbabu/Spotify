package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import defpackage.s81;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: c91  reason: default package */
public class c91 extends d91<s81> implements s81 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c91(s81 s81) {
        super(s81);
        h.e(s81, "inner");
    }

    @Override // defpackage.s81
    public List<s81> childGroup(String str) {
        return v81.b(children(), str);
    }

    @Override // defpackage.s81
    public List<s81> children() {
        throw null;
    }

    @Override // defpackage.s81
    public q81 componentId() {
        return ((s81) a()).componentId();
    }

    @Override // defpackage.s81
    public p81 custom() {
        return ((s81) a()).custom();
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends o81>, java.util.Map<java.lang.String, o81> */
    @Override // defpackage.s81
    public Map<String, o81> events() {
        return ((s81) a()).events();
    }

    @Override // defpackage.s81
    public String group() {
        return ((s81) a()).group();
    }

    @Override // defpackage.s81
    public String id() {
        return ((s81) a()).id();
    }

    @Override // defpackage.s81
    public r81 images() {
        return ((s81) a()).images();
    }

    @Override // defpackage.s81
    public p81 logging() {
        return ((s81) a()).logging();
    }

    @Override // defpackage.s81
    public p81 metadata() {
        return ((s81) a()).metadata();
    }

    @Override // defpackage.s81
    public a91 target() {
        return ((s81) a()).target();
    }

    @Override // defpackage.s81
    public w81 text() {
        return ((s81) a()).text();
    }

    @Override // defpackage.s81
    public s81.a toBuilder() {
        return HubsImmutableComponentModel.Companion.c(this).toBuilder();
    }
}

package defpackage;

import com.google.common.base.Predicate;

/* renamed from: dac  reason: default package */
public final /* synthetic */ class dac implements Predicate {
    public static final /* synthetic */ dac a = new dac();

    private /* synthetic */ dac() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        s81 s81 = (s81) obj;
        return s81 != null && (s81.componentId().id().equals("onDemandSharingPlayback:shuffleButton") || s81.componentId().id().equals("onDemandSharingPlayback:roundButton"));
    }
}

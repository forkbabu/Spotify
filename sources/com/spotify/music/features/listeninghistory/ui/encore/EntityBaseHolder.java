package com.spotify.music.features.listeninghistory.ui.encore;

import android.view.View;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import defpackage.s51;
import kotlin.jvm.internal.h;

public final class EntityBaseHolder<T> extends s51.c.a<View> {
    private s81 b = HubsImmutableComponentModel.Companion.a().l();
    private final Component<T, Events> c;
    private final vd3 f;
    private final smf<String, String, String, T> n;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: smf<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntityBaseHolder(Component<T, Events> component, vd3 vd3, smf<? super String, ? super String, ? super String, ? extends T> smf) {
        super(component.getView());
        h.e(component, "row");
        h.e(vd3, "listener");
        h.e(smf, "modelProvider");
        this.c = component;
        this.f = vd3;
        this.n = smf;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c.a
    public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        je.h(s81, "model", aVar, "action", iArr, "indexPath");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c.a
    public void z(s81 s81, w51 w51, s51.b bVar) {
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        this.b = s81;
        Component<T, Events> component = this.c;
        smf<String, String, String, T> smf = this.n;
        String title = s81.text().title();
        String str = "";
        if (title == null) {
            title = str;
        }
        String string = this.b.metadata().string("creator_name");
        if (string == null) {
            string = str;
        }
        x81 main = this.b.images().main();
        String uri = main != null ? main.uri() : null;
        if (uri != null) {
            str = uri;
        }
        component.render(smf.c(title, string, str));
        this.c.onEvent(new EntityBaseHolder$onBind$1(this, s81));
    }
}

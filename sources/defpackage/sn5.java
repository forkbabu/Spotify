package defpackage;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: sn5  reason: default package */
public final class sn5 {
    private final AuthenticationButton.Model a;
    private final nmf<AuthenticationButton.Events, f> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nmf<? super com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton$Events, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public sn5(AuthenticationButton.Model model, nmf<? super AuthenticationButton.Events, f> nmf) {
        h.e(model, "buttonModel");
        h.e(nmf, "event");
        this.a = model;
        this.b = nmf;
    }

    public final AuthenticationButton.Model a() {
        return this.a;
    }

    public final nmf<AuthenticationButton.Events, f> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn5)) {
            return false;
        }
        sn5 sn5 = (sn5) obj;
        return h.a(this.a, sn5.a) && h.a(this.b, sn5.b);
    }

    public int hashCode() {
        AuthenticationButton.Model model = this.a;
        int i = 0;
        int hashCode = (model != null ? model.hashCode() : 0) * 31;
        nmf<AuthenticationButton.Events, f> nmf = this.b;
        if (nmf != null) {
            i = nmf.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AuthenticationModel(buttonModel=");
        V0.append(this.a);
        V0.append(", event=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}

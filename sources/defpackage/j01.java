package defpackage;

import com.spotify.cosmos.session.model.LoginOptions;

/* access modifiers changed from: package-private */
/* renamed from: j01  reason: default package */
public class j01 implements wlf<LoginOptions> {
    j01() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wlf
    public LoginOptions get() {
        return LoginOptions.builder().build();
    }
}

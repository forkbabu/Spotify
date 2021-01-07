package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import defpackage.ve6;
import io.reactivex.functions.c;
import java.util.List;

/* renamed from: te6  reason: default package */
public class te6 implements c<h76, SessionState, ve6> {
    private final HomeMixFormatListAttributesHelper a;

    public te6(HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper) {
        this.a = homeMixFormatListAttributesHelper;
    }

    /* renamed from: b */
    public ve6 a(h76 h76, SessionState sessionState) {
        HomeMix c = this.a.c(h76.l());
        if (c == null) {
            return new ve6.b();
        }
        if (c.isFamilyMember()) {
            if (c.needsTasteOnboarding()) {
                if (c.isUserEnabled()) {
                    return new ve6.a();
                }
                return new ve6.d();
            } else if (!c.isUserEnabled()) {
                if (h76.n()) {
                    return new ve6.c();
                }
                return new ve6.f(c.planType());
            } else if (c.needsWelcome()) {
                return new ve6.i();
            } else {
                if (c.isAlone()) {
                    return new ve6.h();
                }
                List<HomeMixUser> users = c.users();
                String currentUser = sessionState.currentUser();
                boolean z = true;
                for (HomeMixUser homeMixUser : users) {
                    if (!homeMixUser.getUsername().equals(currentUser) && !homeMixUser.needsTasteOnboarding()) {
                        z = false;
                    }
                }
                if (z) {
                    return new ve6.g();
                }
            }
        }
        if (h76.n()) {
            return new ve6.b();
        }
        return new ve6.e();
    }
}

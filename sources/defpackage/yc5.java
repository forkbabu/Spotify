package defpackage;

import com.spotify.music.libs.fullscreen.story.domain.OverlayModel;
import com.spotify.music.libs.fullscreen.story.domain.c;
import com.spotify.music.libs.fullscreen.story.domain.m;

/* renamed from: yc5  reason: default package */
public final /* synthetic */ class yc5 implements gj0 {
    public static final /* synthetic */ yc5 a = new yc5();

    private /* synthetic */ yc5() {
    }

    @Override // defpackage.gj0
    public final boolean a(Object obj, Object obj2) {
        c cVar;
        c cVar2;
        OverlayModel overlayModel;
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        if (mVar.c() != mVar2.c()) {
            return true;
        }
        if (!(mVar.h() == null && mVar2.h() == null)) {
            OverlayModel overlayModel2 = null;
            if (mVar.h() == null) {
                cVar = null;
            } else {
                cVar = mVar.h().b().get(mVar.c());
            }
            if (mVar2.h() == null) {
                cVar2 = null;
            } else {
                cVar2 = mVar2.h().b().get(mVar2.c());
            }
            if (cVar == null) {
                overlayModel = null;
            } else {
                overlayModel = cVar.c();
            }
            if (cVar2 != null) {
                overlayModel2 = cVar2.c();
            }
            if (!(overlayModel == null && overlayModel2 == null)) {
                return true ^ rw.equal(overlayModel, overlayModel2);
            }
        }
        return false;
    }
}

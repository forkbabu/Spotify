package com.spotify.music.libs.restrictedcontent.transformer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import io.reactivex.disposables.b;

public class ContentRestrictedHelperImpl implements d {
    private final AgeRestrictedContentFacade a;
    private boolean b;
    private b c;

    public ContentRestrictedHelperImpl(AgeRestrictedContentFacade ageRestrictedContentFacade, final n nVar) {
        this.a = ageRestrictedContentFacade;
        nVar.A().a(new m() {
            /* class com.spotify.music.libs.restrictedcontent.transformer.ContentRestrictedHelperImpl.AnonymousClass1 */

            @w(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                nVar.A().c(this);
            }

            @w(Lifecycle.Event.ON_START)
            public void onStart() {
                ContentRestrictedHelperImpl contentRestrictedHelperImpl = ContentRestrictedHelperImpl.this;
                contentRestrictedHelperImpl.c = contentRestrictedHelperImpl.a.c().r0(a.a).subscribe(new b(ContentRestrictedHelperImpl.this));
            }

            @w(Lifecycle.Event.ON_STOP)
            public void onStop() {
                ContentRestrictedHelperImpl.this.c.dispose();
            }
        });
    }

    static void f(ContentRestrictedHelperImpl contentRestrictedHelperImpl, boolean z) {
        contentRestrictedHelperImpl.b = z;
    }

    @Override // com.spotify.music.libs.restrictedcontent.transformer.d
    public void a(String str, String str2) {
        this.a.d(str, null);
    }

    @Override // com.spotify.music.libs.restrictedcontent.transformer.d
    public boolean b(s81 s81) {
        if (!this.b || !s81.metadata().boolValue("is19plus", false)) {
            return true;
        }
        return false;
    }
}

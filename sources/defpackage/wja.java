package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.C0707R;

/* renamed from: wja  reason: default package */
public final class wja implements prd {
    private final Application a;

    public wja(Application application) {
        this.a = application;
    }

    @Override // defpackage.prd
    public XmlResourceParser get() {
        return this.a.getResources().getXml(C0707R.xml.allowed_media_browser_callers);
    }
}

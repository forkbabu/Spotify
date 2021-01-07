package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.C0707R;

/* renamed from: yja  reason: default package */
public class yja implements prd {
    private final Application a;

    public yja(Application application) {
        this.a = application;
    }

    @Override // defpackage.prd
    public XmlResourceParser get() {
        return this.a.getResources().getXml(C0707R.xml.allowed_media_browser_callers_v2);
    }
}

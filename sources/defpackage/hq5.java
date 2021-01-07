package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.C0707R;

/* renamed from: hq5  reason: default package */
public class hq5 implements prd {
    private final Application a;

    public hq5(Application application) {
        this.a = application;
    }

    @Override // defpackage.prd
    public XmlResourceParser get() {
        return this.a.getResources().getXml(C0707R.xml.waze_package_validator_allow_list);
    }
}

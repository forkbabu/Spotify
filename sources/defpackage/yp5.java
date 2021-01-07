package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.C0707R;

/* renamed from: yp5  reason: default package */
public class yp5 implements prd {
    private final Application a;

    public yp5(Application application) {
        this.a = application;
    }

    @Override // defpackage.prd
    public XmlResourceParser get() {
        return this.a.getResources().getXml(C0707R.xml.facebook_package_validator_allow_list);
    }
}

package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.C0707R;

/* renamed from: w04  reason: default package */
public class w04 implements prd {
    private final Application a;

    public w04(Application application) {
        this.a = application;
    }

    @Override // defpackage.prd
    public XmlResourceParser get() {
        return this.a.getResources().getXml(C0707R.xml.android_wear_package_validator_allow_list);
    }
}

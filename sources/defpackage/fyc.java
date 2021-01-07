package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.C0707R;

/* renamed from: fyc  reason: default package */
public class fyc implements prd {
    private final Application a;

    public fyc(Application application) {
        this.a = application;
    }

    @Override // defpackage.prd
    public XmlResourceParser get() {
        return this.a.getResources().getXml(C0707R.xml.samsung_packages_validator_allow_list);
    }
}

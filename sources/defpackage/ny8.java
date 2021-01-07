package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.C0707R;

/* renamed from: ny8  reason: default package */
public class ny8 implements prd {
    private final Application a;

    public ny8(Application application) {
        this.a = application;
    }

    @Override // defpackage.prd
    public XmlResourceParser get() {
        return this.a.getResources().getXml(C0707R.xml.voice_assistant_package_validator_allow_list);
    }
}

package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;

/* renamed from: up4  reason: default package */
public class up4 implements tp4 {
    @Override // defpackage.tp4
    public void a(xp4 xp4, String str) {
        sp4 sp4 = (sp4) xp4;
        sp4.d(C0707R.color.bg_picker);
        sp4.e();
        sp4.g(0.0f);
        sp4.f(str);
    }

    @Override // defpackage.tp4
    public void b(String str, int i, String str2, xp4 xp4) {
        if (str.equalsIgnoreCase("tag_device_fragment")) {
            if (i == 2) {
                ((sp4) xp4).g(1.0f);
            } else {
                ((sp4) xp4).g(0.0f);
            }
            sp4 sp4 = (sp4) xp4;
            sp4.i();
            sp4.j(SpotifyIconV2.X);
        } else if (str.equalsIgnoreCase("tag_education_steps_fragment")) {
            sp4 sp42 = (sp4) xp4;
            sp42.c();
            sp42.g(1.0f);
            sp42.j(SpotifyIconV2.ARROW_LEFT);
        }
        ((sp4) xp4).f(str2);
    }
}

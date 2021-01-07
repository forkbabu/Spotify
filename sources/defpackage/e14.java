package defpackage;

import android.animation.Animator;
import android.view.View;
import com.spotify.music.C0707R;

/* renamed from: e14  reason: default package */
public class e14 {
    private final Animator a;
    private final Animator b;
    private final Animator c;
    private final Animator d;
    private final Animator e;
    private final Animator f;

    public e14(View view) {
        View findViewById = view.findViewById(C0707R.id.artistspick_metadata);
        findViewById.getClass();
        View findViewById2 = view.findViewById(C0707R.id.artistspick_comment_image_w_bg);
        findViewById2.getClass();
        View findViewById3 = view.findViewById(C0707R.id.artistspick_comment_w_caret);
        findViewById3.getClass();
        this.a = uud.a(new i14(findViewById2));
        this.b = uud.a(new g14(findViewById2));
        this.c = uud.a(new f14(findViewById3));
        this.d = uud.a(new h14(findViewById3));
        this.e = uud.a(new f14(findViewById));
        this.f = uud.a(new h14(findViewById));
    }
}

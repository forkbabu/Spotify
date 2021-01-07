package com.spotify.music.features.connectui.picker.frictionlessjoin.ui;

import android.widget.CompoundButton;
import kotlin.jvm.internal.f;

public interface a {

    /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0219a {

        /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a$a$a  reason: collision with other inner class name */
        public static final class C0220a extends AbstractC0219a {
            public static final C0220a a = new C0220a();

            private C0220a() {
                super(null);
            }
        }

        /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a$a$b */
        public static final class b extends AbstractC0219a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public AbstractC0219a(f fVar) {
        }
    }

    void a();

    void b();

    void d(String str);

    void j(AbstractC0219a aVar);

    void setGroupSessionOn(boolean z);

    void setOnGroupSessionLeaveClickListener(cmf<kotlin.f> cmf);

    void setOnGroupSessionSwitchListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    void x(String str);
}

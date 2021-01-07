package com.spotify.music.features.yourlibraryx.view;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;

public final class b0 implements g<f, YourLibraryXEvent> {
    private final ImageView a;
    private com.spotify.music.features.yourlibraryx.domain.g b;
    private final lqa c;

    public static final class a implements h<f> {
        final /* synthetic */ b0 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b0 b0Var) {
            this.a = b0Var;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f fVar = (f) obj;
            kotlin.jvm.internal.h.e(fVar, "model");
            if (!kotlin.jvm.internal.h.a(fVar.l(), this.a.b)) {
                this.a.c.a(this.a.d(), fVar.l().c(), fVar.l().e(), fVar.l().a(), false, null);
                this.a.b = fVar.l();
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public b0(Context context, lqa lqa) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(lqa, "profilePictureLoader");
        this.c = lqa;
        this.a = new AppCompatImageView(context);
    }

    public final ImageView d() {
        return this.a;
    }

    @Override // com.spotify.mobius.g
    public h<f> t(da2<YourLibraryXEvent> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a(this);
    }
}

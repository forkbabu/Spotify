package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.headers.v2.a;

/* renamed from: mc0  reason: default package */
public class mc0 extends LayerDrawable implements a {
    mc0(Drawable[] drawableArr) {
        super(drawableArr);
        MoreObjects.checkArgument(drawableArr.length == 2);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.v2.a
    public void a(int i, float f) {
        if (getDrawable(0) instanceof a) {
            ((a) getDrawable(0)).a(i, f);
        }
        if (getDrawable(1) instanceof a) {
            ((a) getDrawable(1)).a(i, f);
        }
    }
}

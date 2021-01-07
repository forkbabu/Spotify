package defpackage;

import android.graphics.Bitmap;
import com.spotify.mobile.android.util.Assertion;
import com.squareup.picasso.f;

/* renamed from: pwd  reason: default package */
public class pwd implements f {
    private final f a;

    public pwd(f fVar) {
        this.a = fVar;
    }

    @Override // com.squareup.picasso.f
    public int a() {
        return this.a.a();
    }

    @Override // com.squareup.picasso.f
    public void b(String str, Bitmap bitmap) {
        this.a.b(str, bitmap);
    }

    @Override // com.squareup.picasso.f
    public void c(String str) {
        this.a.c(str);
    }

    @Override // com.squareup.picasso.f
    public Bitmap get(String str) {
        Bitmap bitmap = this.a.get(str);
        if (bitmap == null) {
            return null;
        }
        if (!bitmap.isRecycled()) {
            return bitmap;
        }
        Assertion.g("Bitmap for: (" + str + ") recycled while in mem cache.");
        return null;
    }

    @Override // com.squareup.picasso.f
    public int size() {
        return this.a.size();
    }
}

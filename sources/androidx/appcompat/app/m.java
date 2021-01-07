package androidx.appcompat.app;

import androidx.appcompat.widget.ContentFrameLayout;

/* access modifiers changed from: package-private */
public class m implements ContentFrameLayout.a {
    final /* synthetic */ j a;

    m(j jVar) {
        this.a = jVar;
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.a
    public void a() {
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.a
    public void onDetachedFromWindow() {
        this.a.I();
    }
}

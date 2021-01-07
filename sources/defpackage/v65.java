package defpackage;

import android.view.View;
import com.spotify.music.C0707R;

/* renamed from: v65  reason: default package */
final class v65 extends z3 {
    final /* synthetic */ boolean a;

    v65(boolean z) {
        this.a = z;
    }

    @Override // defpackage.z3
    public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
        super.onInitializeAccessibilityNodeInfo(view, d5Var);
        String string = view.getContext().getString(C0707R.string.entity_page_accessibility_currently_playing);
        if (!this.a) {
            string = "";
        }
        d5Var.V(string);
    }
}

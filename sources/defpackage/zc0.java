package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/* renamed from: zc0  reason: default package */
public class zc0 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if ((view instanceof TextView) && !TextUtils.isEmpty(((TextView) view).getText())) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationOnScreen(iArr);
        view.getWindowVisibleDisplayFrame(rect);
        Context context = view.getContext();
        int width = view.getWidth();
        int height = view.getHeight();
        int i = (height / 2) + iArr[1];
        int i2 = (width / 2) + iArr[0];
        if (q4.o(view) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        Toast makeText = Toast.makeText(context, view.getContentDescription(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }
}

package com.spotify.inappmessaging.display;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.json.JSONArray;
import org.json.JSONObject;

public class TouchBoundaryFrameLayout extends FrameLayout {
    private p[] a;
    private boolean b;

    public TouchBoundaryFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static p[] b(String str, float f) {
        JSONArray jSONArray = new JSONArray(str);
        p[] pVarArr = new p[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            pVarArr[i] = new d(((float) jSONObject.getInt("mXPos")) * f, ((float) jSONObject.getInt("mYPos")) * f, ((float) jSONObject.getInt("mHeight")) * f, ((float) jSONObject.getInt("mWidth")) * f);
        }
        return pVarArr;
    }

    public void a() {
        this.b = true;
    }

    public void c(p[] pVarArr) {
        this.a = pVarArr;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.b) {
            p[] pVarArr = this.a;
            if (pVarArr != null) {
                int length = pVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    p pVar = pVarArr[i];
                    if (motionEvent.getY() > pVar.e() && motionEvent.getX() > pVar.c()) {
                        if (motionEvent.getY() < pVar.a() + pVar.e()) {
                            if (motionEvent.getX() < pVar.b() + pVar.c()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
            }
            return !z;
        }
        z = true;
        return !z;
    }

    public TouchBoundaryFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

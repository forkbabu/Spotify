package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.f;
import com.comscore.streaming.WindowState;
import com.spotify.music.C0707R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class p {
    private final MotionLayout a;
    f b = null;
    b c = null;
    private boolean d = false;
    private ArrayList<b> e = new ArrayList<>();
    private b f = null;
    private ArrayList<b> g = new ArrayList<>();
    private SparseArray<androidx.constraintlayout.widget.b> h = new SparseArray<>();
    private HashMap<String, Integer> i = new HashMap<>();
    private SparseIntArray j = new SparseIntArray();
    private int k = WindowState.NORMAL;
    private int l = 0;
    private MotionEvent m;
    private boolean n = false;
    private boolean o = false;
    private MotionLayout.e p;
    private boolean q;
    float r;
    float s;

    public class a implements Interpolator {
        final /* synthetic */ x1 a;

        a(p pVar, x1 x1Var) {
            this.a = x1Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.a.a((double) f);
        }
    }

    p(Context context, MotionLayout motionLayout, int i2) {
        b bVar = null;
        this.a = motionLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c2 = 1;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                x(context, xml);
                                continue;
                            case 1:
                                ArrayList<b> arrayList = this.e;
                                b bVar2 = new b(this, context, xml);
                                arrayList.add(bVar2);
                                if (this.c == null && !bVar2.b) {
                                    this.c = bVar2;
                                    if (bVar2.l != null) {
                                        this.c.l.n(this.q);
                                    }
                                }
                                if (bVar2.b) {
                                    if (bVar2.c == -1) {
                                        this.f = bVar2;
                                    } else {
                                        this.g.add(bVar2);
                                    }
                                    this.e.remove(bVar2);
                                }
                                bVar = bVar2;
                                continue;
                            case 2:
                                if (bVar == null) {
                                    context.getResources().getResourceEntryName(i2);
                                    xml.getLineNumber();
                                }
                                bVar.l = new s(context, this.a, xml);
                                continue;
                            case 3:
                                bVar.t(context, xml);
                                continue;
                            case 4:
                                this.b = new f(context, xml);
                                continue;
                            case 5:
                                w(context, xml);
                                continue;
                            case 6:
                                bVar.k.add(new g(context, xml));
                                continue;
                            default:
                                continue;
                        }
                    }
                    eventType = xml.next();
                } else {
                    this.h.put(C0707R.id.motion_base, new androidx.constraintlayout.widget.b());
                    this.i.put("motion_base", Integer.valueOf((int) C0707R.id.motion_base));
                    return;
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    private int m(Context context, String str) {
        int i2;
        if (str.contains("/")) {
            i2 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            return i2;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i2;
    }

    private void w(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.E(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlPullParser.getAttributeName(i4);
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i3 = m(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i2 = m(context, attributeValue);
                HashMap<String, Integer> hashMap = this.i;
                int indexOf = attributeValue.indexOf(47);
                if (indexOf >= 0) {
                    attributeValue = attributeValue.substring(indexOf + 1);
                }
                hashMap.put(attributeValue, Integer.valueOf(i2));
            }
        }
        if (i2 != -1) {
            int i5 = this.a.mDebugPath;
            bVar.z(context, xmlPullParser);
            if (i3 != -1) {
                this.j.put(i2, i3);
            }
            this.h.put(i2, bVar);
        }
    }

    private void x(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.k = obtainStyledAttributes.getInt(index, this.k);
            } else if (index == 1) {
                this.l = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void z(int i2) {
        int i3 = this.j.get(i2);
        if (i3 > 0) {
            z(this.j.get(i2));
            androidx.constraintlayout.widget.b bVar = this.h.get(i2);
            androidx.constraintlayout.widget.b bVar2 = this.h.get(i3);
            if (bVar2 == null) {
                StringBuilder V0 = je.V0("ERROR! invalid deriveConstraintsFrom: @id/");
                V0.append(g0.b(this.a.getContext(), i3));
                Log.e("MotionScene", V0.toString());
                return;
            }
            bVar.B(bVar2);
            this.j.put(i2, -1);
        }
    }

    public void A(MotionLayout motionLayout) {
        boolean z;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            int keyAt = this.h.keyAt(i2);
            int i3 = this.j.get(keyAt);
            int size = this.j.size();
            while (true) {
                if (i3 <= 0) {
                    z = false;
                    break;
                } else if (i3 == keyAt) {
                    break;
                } else {
                    int i4 = size - 1;
                    if (size < 0) {
                        break;
                    }
                    i3 = this.j.get(i3);
                    size = i4;
                }
            }
            z = true;
            if (z) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                z(keyAt);
            }
        }
        for (int i5 = 0; i5 < this.h.size(); i5++) {
            this.h.valueAt(i5).A(motionLayout);
        }
    }

    public void B(int i2, androidx.constraintlayout.widget.b bVar) {
        this.h.put(i2, bVar);
    }

    public void C(int i2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.C(i2);
        } else {
            this.k = i2;
        }
    }

    public void D(boolean z) {
        this.q = z;
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.n(this.q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.f r0 = r6.b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.b(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.f r2 = r6.b
            int r2 = r2.b(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p$b> r3 = r6.e
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.p$b r4 = (androidx.constraintlayout.motion.widget.p.b) r4
            int r5 = androidx.constraintlayout.motion.widget.p.b.a(r4)
            if (r5 != r2) goto L_0x0036
            int r5 = androidx.constraintlayout.motion.widget.p.b.c(r4)
            if (r5 == r0) goto L_0x0042
        L_0x0036:
            int r5 = androidx.constraintlayout.motion.widget.p.b.a(r4)
            if (r5 != r8) goto L_0x001e
            int r5 = androidx.constraintlayout.motion.widget.p.b.c(r4)
            if (r5 != r7) goto L_0x001e
        L_0x0042:
            r6.c = r4
            if (r4 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.s r7 = androidx.constraintlayout.motion.widget.p.b.m(r4)
            if (r7 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.p$b r7 = r6.c
            androidx.constraintlayout.motion.widget.s r7 = androidx.constraintlayout.motion.widget.p.b.m(r7)
            boolean r8 = r6.q
            r7.n(r8)
        L_0x0057:
            return
        L_0x0058:
            androidx.constraintlayout.motion.widget.p$b r7 = r6.f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p$b> r3 = r6.g
            java.util.Iterator r3 = r3.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.p$b r4 = (androidx.constraintlayout.motion.widget.p.b) r4
            int r5 = androidx.constraintlayout.motion.widget.p.b.a(r4)
            if (r5 != r8) goto L_0x0060
            r7 = r4
            goto L_0x0060
        L_0x0074:
            androidx.constraintlayout.motion.widget.p$b r8 = new androidx.constraintlayout.motion.widget.p$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.p.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.p.b.b(r8, r2)
            if (r0 == r1) goto L_0x0086
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p$b> r7 = r6.e
            r7.add(r8)
        L_0x0086:
            r6.c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.p.E(int, int):void");
    }

    public void F(b bVar) {
        this.c = bVar;
        if (bVar != null && bVar.l != null) {
            this.c.l.n(this.q);
        }
    }

    public boolean G() {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return false;
        }
        return true;
    }

    public void e(MotionLayout motionLayout, int i2) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.m.size() > 0) {
                Iterator it2 = next.m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).b(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.m.size() > 0) {
                Iterator it4 = next2.m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).b(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.m.size() > 0) {
                Iterator it6 = next3.m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, i2, next3);
                }
            }
        }
        Iterator<b> it7 = this.g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.m.size() > 0) {
                Iterator it8 = next4.m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, i2, next4);
                }
            }
        }
    }

    public boolean f(MotionLayout motionLayout, int i2) {
        MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
        MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.MOVING;
        MotionLayout.TransitionState transitionState3 = MotionLayout.TransitionState.SETUP;
        if ((this.p != null) || this.d) {
            return false;
        }
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (!(next.n == 0 || this.c == next)) {
                if (i2 == next.d && (next.n == 4 || next.n == 2)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.n == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        motionLayout.setState(transitionState);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                } else if (i2 == next.c && (next.n == 3 || next.n == 1)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.n == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        motionLayout.setState(transitionState);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void g(boolean z) {
        this.d = z;
    }

    public androidx.constraintlayout.widget.b h(int i2) {
        int b2;
        f fVar = this.b;
        if (!(fVar == null || (b2 = fVar.b(i2, -1, -1)) == -1)) {
            i2 = b2;
        }
        if (this.h.get(i2) != null) {
            return this.h.get(i2);
        }
        StringBuilder V0 = je.V0("Warning could not find ConstraintSet id/");
        V0.append(g0.b(this.a.getContext(), i2));
        V0.append(" In MotionScene");
        Log.e("MotionScene", V0.toString());
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] i() {
        int size = this.h.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.h.keyAt(i2);
        }
        return iArr;
    }

    public ArrayList<b> j() {
        return this.e;
    }

    public int k() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.h;
        }
        return this.k;
    }

    public int l() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public Interpolator n() {
        int i2 = this.c.e;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i2 == -1) {
            return new a(this, x1.c(this.c.f));
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new AnticipateInterpolator();
        }
        if (i2 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public void o(m mVar) {
        b bVar = this.c;
        if (bVar == null) {
            b bVar2 = this.f;
            if (bVar2 != null) {
                Iterator it = bVar2.k.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).a(mVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.k.iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).a(mVar);
        }
    }

    public float p() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.d();
    }

    public float q() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.e();
    }

    public int r() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    public b s(int i2) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a == i2) {
                return next;
            }
        }
        return null;
    }

    public List<b> t(int i2) {
        int b2;
        f fVar = this.b;
        if (!(fVar == null || (b2 = fVar.b(i2, -1, -1)) == -1)) {
            i2 = b2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == i2 || next.c == i2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int u(String str) {
        return this.i.get(str).intValue();
    }

    public String v(int i2) {
        for (Map.Entry<String, Integer> entry : this.i.entrySet()) {
            if (entry.getValue().intValue() == i2) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void y(MotionEvent motionEvent, int i2, MotionLayout motionLayout) {
        MotionLayout.e eVar;
        MotionLayout.e eVar2;
        MotionEvent motionEvent2;
        b bVar;
        RectF h2;
        RectF rectF = new RectF();
        if (this.p == null) {
            this.p = this.a.obtainVelocityTracker();
        }
        VelocityTracker velocityTracker = ((MotionLayout.f) this.p).a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i2 != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.r = motionEvent.getRawX();
                this.s = motionEvent.getRawY();
                this.m = motionEvent;
                this.n = false;
                if (this.c.l != null) {
                    RectF c2 = this.c.l.c(this.a, rectF);
                    if (c2 == null || c2.contains(this.m.getX(), this.m.getY())) {
                        RectF h3 = this.c.l.h(this.a, rectF);
                        if (h3 == null || h3.contains(this.m.getX(), this.m.getY())) {
                            this.o = false;
                        } else {
                            this.o = true;
                        }
                        this.c.l.m(this.r, this.s);
                        return;
                    }
                    this.m = null;
                    this.n = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.n) {
                float rawY = motionEvent.getRawY() - this.s;
                float rawX = motionEvent.getRawX() - this.r;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.m) != null) {
                    if (i2 != -1) {
                        List<b> t = t(i2);
                        float f2 = 0.0f;
                        RectF rectF2 = new RectF();
                        Iterator it = ((ArrayList) t).iterator();
                        bVar = null;
                        while (it.hasNext()) {
                            b bVar2 = (b) it.next();
                            if (!bVar2.o && bVar2.l != null) {
                                bVar2.l.n(this.q);
                                RectF h4 = bVar2.l.h(this.a, rectF2);
                                if ((h4 == null || h4.contains(motionEvent2.getX(), motionEvent2.getY())) && ((h2 = bVar2.l.h(this.a, rectF2)) == null || h2.contains(motionEvent2.getX(), motionEvent2.getY()))) {
                                    float a2 = bVar2.l.a(rawX, rawY) * (bVar2.c == i2 ? -1.0f : 1.1f);
                                    if (a2 > f2) {
                                        f2 = a2;
                                        bVar = bVar2;
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = this.c;
                    }
                    if (bVar != null) {
                        motionLayout.setTransition(bVar);
                        RectF h5 = this.c.l.h(this.a, rectF);
                        if (h5 != null && !h5.contains(this.m.getX(), this.m.getY())) {
                            z = true;
                        }
                        this.o = z;
                        this.c.l.o(this.r, this.s);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.n) {
            b bVar3 = this.c;
            if (!(bVar3 == null || bVar3.l == null || this.o)) {
                this.c.l.j(motionEvent, this.p);
            }
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (eVar = this.p) != null) {
                MotionLayout.f fVar = (MotionLayout.f) eVar;
                VelocityTracker velocityTracker2 = fVar.a;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    eVar2 = null;
                    fVar.a = null;
                } else {
                    eVar2 = null;
                }
                this.p = eVar2;
                int i3 = motionLayout.mCurrentState;
                if (i3 != -1) {
                    f(motionLayout, i3);
                }
            }
        }
    }

    public static class b {
        private int a = -1;
        private boolean b = false;
        private int c = -1;
        private int d = -1;
        private int e = 0;
        private String f = null;
        private int g = -1;
        private int h = WindowState.NORMAL;
        private float i = 0.0f;
        private final p j;
        private ArrayList<g> k = new ArrayList<>();
        private s l = null;
        private ArrayList<a> m = new ArrayList<>();
        private int n = 0;
        private boolean o = false;
        private int p = -1;
        private int q = 0;
        private int r = 0;

        public static class a implements View.OnClickListener {
            private final b a;
            int b = -1;
            int c = 17;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.s);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                    } else if (index == 0) {
                        this.c = obtainStyledAttributes.getInt(index, this.c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(androidx.constraintlayout.motion.widget.MotionLayout r6, int r7, androidx.constraintlayout.motion.widget.p.b r8) {
                /*
                    r5 = this;
                    int r0 = r5.b
                    r1 = -1
                    if (r0 != r1) goto L_0x0006
                    goto L_0x000a
                L_0x0006:
                    android.view.View r6 = r6.findViewById(r0)
                L_0x000a:
                    if (r6 != 0) goto L_0x0021
                    java.lang.String r6 = "OnClick could not find id "
                    java.lang.StringBuilder r6 = defpackage.je.V0(r6)
                    int r7 = r5.b
                    r6.append(r7)
                    java.lang.String r6 = r6.toString()
                    java.lang.String r7 = "MotionScene"
                    android.util.Log.e(r7, r6)
                    return
                L_0x0021:
                    int r0 = androidx.constraintlayout.motion.widget.p.b.c(r8)
                    int r8 = androidx.constraintlayout.motion.widget.p.b.a(r8)
                    if (r0 != r1) goto L_0x002f
                    r6.setOnClickListener(r5)
                    return
                L_0x002f:
                    int r1 = r5.c
                    r2 = r1 & 1
                    r3 = 0
                    if (r2 == 0) goto L_0x003a
                    if (r7 != r0) goto L_0x003a
                    r2 = 1
                    goto L_0x003b
                L_0x003a:
                    r2 = 0
                L_0x003b:
                    r4 = r1 & 256(0x100, float:3.59E-43)
                    if (r4 == 0) goto L_0x0043
                    if (r7 != r0) goto L_0x0043
                    r4 = 1
                    goto L_0x0044
                L_0x0043:
                    r4 = 0
                L_0x0044:
                    r2 = r2 | r4
                    r4 = r1 & 1
                    if (r4 == 0) goto L_0x004d
                    if (r7 != r0) goto L_0x004d
                    r0 = 1
                    goto L_0x004e
                L_0x004d:
                    r0 = 0
                L_0x004e:
                    r0 = r0 | r2
                    r2 = r1 & 16
                    if (r2 == 0) goto L_0x0057
                    if (r7 != r8) goto L_0x0057
                    r2 = 1
                    goto L_0x0058
                L_0x0057:
                    r2 = 0
                L_0x0058:
                    r0 = r0 | r2
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x0060
                    if (r7 != r8) goto L_0x0060
                    r3 = 1
                L_0x0060:
                    r7 = r0 | r3
                    if (r7 == 0) goto L_0x0067
                    r6.setOnClickListener(r5)
                L_0x0067:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.p.b.a.a(androidx.constraintlayout.motion.widget.MotionLayout, int, androidx.constraintlayout.motion.widget.p$b):void");
            }

            public void b(MotionLayout motionLayout) {
                int i = this.b;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        StringBuilder V0 = je.V0(" (*)  could not find id ");
                        V0.append(this.b);
                        Log.e("MotionScene", V0.toString());
                        return;
                    }
                    findViewById.setOnClickListener(null);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.a.j.a;
                if (motionLayout.isInteractionEnabled()) {
                    if (this.a.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.transitionToState(this.a.c);
                            return;
                        }
                        b bVar = new b(this.a.j, this.a);
                        bVar.d = currentState;
                        bVar.c = this.a.c;
                        motionLayout.setTransition(bVar);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    b bVar2 = this.a.j.c;
                    int i = this.c;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        b bVar3 = this.a.j.c;
                        b bVar4 = this.a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z2 = false;
                        } else {
                            z3 = false;
                        }
                    }
                    b bVar5 = this.a;
                    if (bVar5 != bVar2) {
                        int i2 = bVar5.c;
                        int i3 = this.a.d;
                        if (i3 != -1) {
                        }
                    }
                    z = true;
                    if (!z) {
                        return;
                    }
                    if (z2 && (this.c & 1) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.transitionToEnd();
                    } else if (z3 && (this.c & 16) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.transitionToStart();
                    } else if (z2 && (this.c & 256) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.setProgress(1.0f);
                    } else if (z3 && (this.c & 4096) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        b(p pVar, b bVar) {
            this.j = pVar;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        public boolean A() {
            return !this.o;
        }

        public boolean B(int i2) {
            return (i2 & this.r) != 0;
        }

        public void C(int i2) {
            this.h = i2;
        }

        public void D(boolean z) {
            this.o = !z;
        }

        public void t(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new a(context, this, xmlPullParser));
        }

        public String u(Context context) {
            String str;
            if (this.d == -1) {
                str = "null";
            } else {
                str = context.getResources().getResourceEntryName(this.d);
            }
            if (this.c == -1) {
                return je.x0(str, " -> null");
            }
            StringBuilder Z0 = je.Z0(str, " -> ");
            Z0.append(context.getResources().getResourceEntryName(this.c));
            return Z0.toString();
        }

        public int v() {
            return this.n;
        }

        public int w() {
            return this.c;
        }

        public int x() {
            return this.q;
        }

        public int y() {
            return this.d;
        }

        public s z() {
            return this.l;
        }

        b(p pVar, Context context, XmlPullParser xmlPullParser) {
            this.h = pVar.k;
            this.q = pVar.l;
            this.j = pVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.c))) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        bVar.y(context, this.c);
                        pVar.h.append(this.c, bVar);
                    }
                } else if (index == 3) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.d))) {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        bVar2.y(context, this.d);
                        pVar.h.append(this.d, bVar2);
                    }
                } else if (index == 6) {
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i3 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string.indexOf("/") > 0) {
                            this.g = obtainStyledAttributes.getResourceId(index, -1);
                            this.e = -2;
                        } else {
                            this.e = -1;
                        }
                    } else {
                        this.e = obtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == 4) {
                    this.h = obtainStyledAttributes.getInt(index, this.h);
                } else if (index == 8) {
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                } else if (index == 1) {
                    this.n = obtainStyledAttributes.getInteger(index, this.n);
                } else if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 9) {
                    this.o = obtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == 7) {
                    this.p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}

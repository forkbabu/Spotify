package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class s {
    private static final Class<?>[] b = {Context.class, AttributeSet.class};
    private static final m1<String, Constructor<?>> c = new m1<>();
    private final Context a;

    private s(Context context) {
        this.a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue != null) {
            try {
                m1<String, Constructor<?>> m1Var = c;
                synchronized (m1Var) {
                    Constructor<?> orDefault = m1Var.getOrDefault(attributeValue, null);
                    if (orDefault == null && (asSubclass = Class.forName(attributeValue, false, this.a.getClassLoader()).asSubclass(cls)) != null) {
                        orDefault = asSubclass.getConstructor(b);
                        orDefault.setAccessible(true);
                        m1Var.put(attributeValue, orDefault);
                    }
                    newInstance = orDefault.newInstance(this.a, attributeSet);
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        } else {
            throw new InflateException(je.x0(str, " tag must have a 'class' attribute"));
        }
    }

    private Transition b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) {
        Transition transition2;
        int i;
        int i2;
        int depth = xmlPullParser.getDepth();
        TransitionSet transitionSet = transition instanceof TransitionSet ? (TransitionSet) transition : null;
        loop0:
        while (true) {
            transition2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            transition2 = new Fade(this.a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            transition2 = new ChangeBounds(this.a, attributeSet);
                        } else if ("slide".equals(name)) {
                            transition2 = new Slide(this.a, attributeSet);
                        } else if ("explode".equals(name)) {
                            transition2 = new Explode(this.a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            transition2 = new ChangeImageTransform(this.a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            transition2 = new ChangeTransform(this.a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            transition2 = new ChangeClipBounds(this.a, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            transition2 = new AutoTransition(this.a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            transition2 = new ChangeScroll(this.a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            transition2 = new TransitionSet(this.a, attributeSet);
                        } else if ("transition".equals(name)) {
                            transition2 = (Transition) a(attributeSet, Transition.class, "transition");
                        } else if ("targets".equals(name)) {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if ((next2 == 3 && xmlPullParser.getDepth() <= depth2) || next2 == 1) {
                                    break;
                                } else if (next2 == 2) {
                                    if (xmlPullParser.getName().equals("target")) {
                                        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(attributeSet, p.a);
                                        if (!i2.n(xmlPullParser, "targetId")) {
                                            i = 0;
                                        } else {
                                            i = obtainStyledAttributes.getResourceId(1, 0);
                                        }
                                        if (i != 0) {
                                            transition.c(i);
                                        } else {
                                            if (!i2.n(xmlPullParser, "excludeId")) {
                                                i2 = 0;
                                            } else {
                                                i2 = obtainStyledAttributes.getResourceId(2, 0);
                                            }
                                            if (i2 != 0) {
                                                transition.u(i2, true);
                                            } else {
                                                String m = i2.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                                                if (m != null) {
                                                    transition.f(m);
                                                } else {
                                                    String m2 = i2.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                                    if (m2 != null) {
                                                        transition.x(m2, true);
                                                    } else {
                                                        String m3 = i2.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                                        if (m3 != null) {
                                                            try {
                                                                transition.w(Class.forName(m3), true);
                                                            } catch (ClassNotFoundException e) {
                                                                obtainStyledAttributes.recycle();
                                                                throw new RuntimeException(je.x0("Could not create ", m3), e);
                                                            }
                                                        } else {
                                                            String m4 = i2.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                                            if (m4 != null) {
                                                                transition.e(Class.forName(m4));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obtainStyledAttributes.recycle();
                                    } else {
                                        StringBuilder V0 = je.V0("Unknown scene name: ");
                                        V0.append(xmlPullParser.getName());
                                        throw new RuntimeException(V0.toString());
                                    }
                                }
                            }
                        } else if ("arcMotion".equals(name)) {
                            if (transition != null) {
                                transition.W(new ArcMotion(this.a, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (transition != null) {
                                transition.W((PathMotion) a(attributeSet, PathMotion.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if (!"patternPathMotion".equals(name)) {
                            StringBuilder V02 = je.V0("Unknown scene name: ");
                            V02.append(xmlPullParser.getName());
                            throw new RuntimeException(V02.toString());
                        } else if (transition != null) {
                            transition.W(new PatternPathMotion(this.a, attributeSet));
                        } else {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        if (transition2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                b(xmlPullParser, attributeSet, transition2);
                            }
                            if (transitionSet != null) {
                                break;
                            } else if (transition != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            transitionSet.c0(transition2);
        }
        return transition2;
    }

    public static s c(Context context) {
        return new s(context);
    }

    public Transition d(int i) {
        XmlResourceParser xml = this.a.getResources().getXml(i);
        try {
            Transition b2 = b(xml, Xml.asAttributeSet(xml), null);
            xml.close();
            return b2;
        } catch (XmlPullParserException e) {
            throw new InflateException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new InflateException(xml.getPositionDescription() + ": " + e2.getMessage(), e2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}

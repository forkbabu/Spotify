package retrofit2;

import java.lang.annotation.Annotation;

/* access modifiers changed from: package-private */
public final class z implements y {
    private static final y a = new z();

    z() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (a0.j(annotationArr, y.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return y.class;
    }

    @Override // java.lang.annotation.Annotation, java.lang.Object
    public boolean equals(Object obj) {
        return obj instanceof y;
    }

    @Override // java.lang.annotation.Annotation, java.lang.Object
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation, java.lang.Object
    public String toString() {
        return je.l0(y.class, je.V0("@"), "()");
    }
}

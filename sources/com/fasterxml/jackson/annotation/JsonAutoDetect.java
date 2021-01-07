package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAutoDetect {

    public static class Value implements Object<JsonAutoDetect> {
        protected static final Value DEFAULT;
        protected static final Value NO_OVERRIDES;
        private static final long serialVersionUID = 1;
        protected final Visibility _creatorVisibility;
        protected final Visibility _fieldVisibility;
        protected final Visibility _getterVisibility;
        protected final Visibility _isGetterVisibility;
        protected final Visibility _setterVisibility;

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            DEFAULT = new Value(visibility, visibility, visibility, Visibility.ANY, visibility);
            Visibility visibility2 = Visibility.DEFAULT;
            NO_OVERRIDES = new Value(visibility2, visibility2, visibility2, visibility2, visibility2);
        }

        private Value(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this._fieldVisibility = visibility;
            this._getterVisibility = visibility2;
            this._isGetterVisibility = visibility3;
            this._setterVisibility = visibility4;
            this._creatorVisibility = visibility5;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (this._fieldVisibility == value._fieldVisibility && this._getterVisibility == value._getterVisibility && this._isGetterVisibility == value._isGetterVisibility && this._setterVisibility == value._setterVisibility && this._creatorVisibility == value._creatorVisibility) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return ((this._fieldVisibility.ordinal() + 1) ^ ((this._setterVisibility.ordinal() * 11) + ((this._getterVisibility.ordinal() * 3) - (this._isGetterVisibility.ordinal() * 7)))) ^ (this._creatorVisibility.ordinal() * 13);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (r4 == r0._creatorVisibility) goto L_0x0031;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object readResolve() {
            /*
                r6 = this;
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r0 = r6._fieldVisibility
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = r6._getterVisibility
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r2 = r6._isGetterVisibility
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r3 = r6._setterVisibility
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r4 = r6._creatorVisibility
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY
                if (r0 != r5) goto L_0x0021
                com.fasterxml.jackson.annotation.JsonAutoDetect$Value r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.Value.DEFAULT
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r5 = r0._getterVisibility
                if (r1 != r5) goto L_0x0030
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = r0._isGetterVisibility
                if (r2 != r1) goto L_0x0030
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = r0._setterVisibility
                if (r3 != r1) goto L_0x0030
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = r0._creatorVisibility
                if (r4 != r1) goto L_0x0030
                goto L_0x0031
            L_0x0021:
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT
                if (r0 != r5) goto L_0x0030
                if (r1 != r5) goto L_0x0030
                if (r2 != r5) goto L_0x0030
                if (r3 != r5) goto L_0x0030
                if (r4 != r5) goto L_0x0030
                com.fasterxml.jackson.annotation.JsonAutoDetect$Value r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.Value.NO_OVERRIDES
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                if (r0 != 0) goto L_0x0034
                r0 = r6
            L_0x0034:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonAutoDetect.Value.readResolve():java.lang.Object");
        }

        @Override // java.lang.Object
        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
        }
    }

    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal == 1) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    Visibility creatorVisibility() default Visibility.DEFAULT;

    Visibility fieldVisibility() default Visibility.DEFAULT;

    Visibility getterVisibility() default Visibility.DEFAULT;

    Visibility isGetterVisibility() default Visibility.DEFAULT;

    Visibility setterVisibility() default Visibility.DEFAULT;
}

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("[ChainedTransformer(");
            V0.append(this._t1);
            V0.append(", ");
            V0.append(this._t2);
            V0.append(")]");
            return V0.toString();
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    protected static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        protected NopTransformer() {
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    protected NameTransformer() {
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = true;
        boolean z2 = str != null && str.length() > 0;
        if (str2 == null || str2.length() <= 0) {
            z = false;
        }
        if (z2) {
            if (z) {
                return new NameTransformer() {
                    /* class com.fasterxml.jackson.databind.util.NameTransformer.AnonymousClass1 */

                    public String toString() {
                        StringBuilder V0 = je.V0("[PreAndSuffixTransformer('");
                        V0.append(str);
                        V0.append("','");
                        return je.I0(V0, str2, "')]");
                    }

                    @Override // com.fasterxml.jackson.databind.util.NameTransformer
                    public String transform(String str) {
                        return str + str + str2;
                    }
                };
            }
            return new NameTransformer() {
                /* class com.fasterxml.jackson.databind.util.NameTransformer.AnonymousClass2 */

                public String toString() {
                    return je.I0(je.V0("[PrefixTransformer('"), str, "')]");
                }

                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String transform(String str) {
                    return je.I0(new StringBuilder(), str, str);
                }
            };
        } else if (z) {
            return new NameTransformer() {
                /* class com.fasterxml.jackson.databind.util.NameTransformer.AnonymousClass3 */

                public String toString() {
                    return je.I0(je.V0("[SuffixTransformer('"), str2, "')]");
                }

                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String transform(String str) {
                    StringBuilder V0 = je.V0(str);
                    V0.append(str2);
                    return V0.toString();
                }
            };
        } else {
            return NOP;
        }
    }

    public abstract String transform(String str);
}

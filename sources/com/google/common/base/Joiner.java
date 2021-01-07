package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class Joiner {
    private final String separator;

    /* renamed from: com.google.common.base.Joiner$1  reason: invalid class name */
    class AnonymousClass1 extends Joiner {
    }

    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        MapJoiner(Joiner joiner2, String str, AnonymousClass1 r3) {
            this.joiner = joiner2;
            str.getClass();
            this.keyValueSeparator = str;
        }

        public <A extends Appendable> A appendTo(A a, Iterator<? extends Map.Entry<?, ?>> it) {
            a.getClass();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                a.append(this.joiner.toString(entry.getKey()));
                a.append(this.keyValueSeparator);
                a.append(this.joiner.toString(entry.getValue()));
                while (it.hasNext()) {
                    a.append(this.joiner.separator);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    a.append(this.joiner.toString(entry2.getKey()));
                    a.append(this.keyValueSeparator);
                    a.append(this.joiner.toString(entry2.getValue()));
                }
            }
            return a;
        }
    }

    private Joiner(String str) {
        str.getClass();
        this.separator = str;
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    public <A extends Appendable> A appendTo(A a, Iterator<?> it) {
        a.getClass();
        if (it.hasNext()) {
            a.append(toString(it.next()));
            while (it.hasNext()) {
                a.append(this.separator);
                a.append(toString(it.next()));
            }
        }
        return a;
    }

    public final String join(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            appendTo(sb, it);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public Joiner skipNulls() {
        return new Joiner(this) {
            /* class com.google.common.base.Joiner.AnonymousClass2 */

            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a, Iterator<?> it) {
                MoreObjects.checkNotNull(a, "appendable");
                MoreObjects.checkNotNull(it, "parts");
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            a.append(Joiner.this.toString(next));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a.append(Joiner.this.separator);
                        a.append(Joiner.this.toString(next2));
                    }
                }
                return a;
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    /* access modifiers changed from: package-private */
    public CharSequence toString(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(this, str, null);
    }

    public static Joiner on(char c) {
        return new Joiner(String.valueOf(c));
    }

    Joiner(Joiner joiner, AnonymousClass1 r2) {
        this.separator = joiner.separator;
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public final String join(final Object obj, final Object obj2, final Object... objArr) {
        return join(new AbstractList<Object>() {
            /* class com.google.common.base.Joiner.AnonymousClass3 */

            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                if (i == 0) {
                    return obj;
                }
                if (i != 1) {
                    return objArr[i - 2];
                }
                return obj2;
            }

            @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
            public int size() {
                return objArr.length + 2;
            }
        });
    }
}

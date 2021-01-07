package com.google.common.base;

import com.google.common.base.CharMatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    /* access modifiers changed from: private */
    public static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        /* access modifiers changed from: package-private */
        public abstract int separatorEnd(int i);

        /* access modifiers changed from: package-private */
        public abstract int separatorStart(int i);
    }

    /* access modifiers changed from: private */
    public interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy2, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = strategy2;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    static Iterator access$000(Splitter splitter, CharSequence charSequence) {
        return splitter.strategy.iterator(splitter, charSequence);
    }

    public static Splitter on(final String str) {
        MoreObjects.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new Strategy() {
            /* class com.google.common.base.Splitter.AnonymousClass2 */

            @Override // com.google.common.base.Splitter.Strategy
            public Iterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    /* class com.google.common.base.Splitter.AnonymousClass2.AnonymousClass1 */

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i) {
                        return str.length() + i;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i) {
                        int length = str.length();
                        int length2 = this.toSplit.length() - length;
                        while (i <= length2) {
                            for (int i2 = 0; i2 < length; i2++) {
                                if (this.toSplit.charAt(i2 + i) != str.charAt(i2)) {
                                    i++;
                                }
                            }
                            return i;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public Splitter limit(int i) {
        MoreObjects.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public Iterable<String> split(final CharSequence charSequence) {
        charSequence.getClass();
        return new Iterable<String>() {
            /* class com.google.common.base.Splitter.AnonymousClass5 */

            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return Splitter.access$000(Splitter.this, charSequence);
            }

            @Override // java.lang.Object
            public String toString() {
                Joiner on = Joiner.on(", ");
                StringBuilder S0 = je.S0('[');
                try {
                    on.appendTo(S0, iterator());
                    S0.append(']');
                    return S0.toString();
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
        };
    }

    public List<String> splitToList(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> it = this.strategy.iterator(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        CharMatcher.Whitespace whitespace = CharMatcher.Whitespace.INSTANCE;
        whitespace.getClass();
        return new Splitter(this.strategy, this.omitEmptyStrings, whitespace, this.limit);
    }

    public static Splitter on(char c) {
        final CharMatcher.Is is = new CharMatcher.Is(c);
        return new Splitter(new Strategy() {
            /* class com.google.common.base.Splitter.AnonymousClass1 */

            @Override // com.google.common.base.Splitter.Strategy
            public Iterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    /* class com.google.common.base.Splitter.AnonymousClass1.AnonymousClass1 */

                    /* access modifiers changed from: package-private */
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i) {
                        return i + 1;
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i) {
                        return CharMatcher.this.indexIn(this.toSplit, i);
                    }
                };
            }
        });
    }

    private Splitter(Strategy strategy2) {
        CharMatcher.None none = CharMatcher.None.INSTANCE;
        this.strategy = strategy2;
        this.omitEmptyStrings = false;
        this.trimmer = none;
        this.limit = Integer.MAX_VALUE;
    }
}

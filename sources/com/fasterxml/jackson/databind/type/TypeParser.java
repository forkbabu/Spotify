package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeFactory _factory;

    /* access modifiers changed from: package-private */
    public static final class MyTokenizer extends StringTokenizer {
        protected int _index;
        protected final String _input;
        protected String _pushbackToken;

        public MyTokenizer(String str) {
            super(str, "<,>", true);
            this._input = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this._pushbackToken != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this._pushbackToken;
            if (str != null) {
                this._pushbackToken = null;
                return str;
            }
            String nextToken = super.nextToken();
            this._index = nextToken.length() + this._index;
            return nextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    /* access modifiers changed from: protected */
    public IllegalArgumentException _problem(MyTokenizer myTokenizer, String str) {
        String str2 = myTokenizer._input;
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", str2, str2.substring(myTokenizer._index), str));
    }

    /* access modifiers changed from: protected */
    public JavaType parseType(MyTokenizer myTokenizer) {
        if (myTokenizer.hasMoreTokens()) {
            String nextToken = myTokenizer.nextToken();
            try {
                Class<?> findClass = this._factory.findClass(nextToken);
                if (myTokenizer.hasMoreTokens()) {
                    String nextToken2 = myTokenizer.nextToken();
                    if ("<".equals(nextToken2)) {
                        ArrayList arrayList = new ArrayList();
                        while (myTokenizer.hasMoreTokens()) {
                            arrayList.add(parseType(myTokenizer));
                            if (!myTokenizer.hasMoreTokens()) {
                                break;
                            }
                            String nextToken3 = myTokenizer.nextToken();
                            if (">".equals(nextToken3)) {
                                return this._factory._fromClass(null, findClass, TypeBindings.create(findClass, arrayList));
                            } else if (!",".equals(nextToken3)) {
                                throw _problem(myTokenizer, je.y0("Unexpected token '", nextToken3, "', expected ',' or '>')"));
                            }
                        }
                        throw _problem(myTokenizer, "Unexpected end-of-string");
                    }
                    myTokenizer._pushbackToken = nextToken2;
                }
                return this._factory._fromClass(null, findClass, TypeBindings.emptyBindings());
            } catch (Exception e) {
                ClassUtil.throwIfRTE(e);
                throw _problem(myTokenizer, "Cannot locate class '" + nextToken + "', problem: " + e.getMessage());
            }
        } else {
            throw _problem(myTokenizer, "Unexpected end-of-string");
        }
    }
}

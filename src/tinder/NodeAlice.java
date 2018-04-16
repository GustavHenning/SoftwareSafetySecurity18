package tinder;

public class NodeAlice {
    public jif.lang.Principal user;
    public int distance;
    public NodeAlice next;
    
    public NodeAlice tinder$NodeAlice$(final jif.lang.Principal user,
                                       final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeAlice node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeAlice n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeAlice append(final NodeAlice a, final NodeAlice b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1523888844000L;
    public static final String jlc$ClassType$jif =
      ("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");
    
    public NodeAlice() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523888844000L;
    public static final String jlc$ClassType$jl =
      ("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" +
       "3kY3FmulRN4VsDiTIdKhRIEe4/DJsKnO");
    public static final String jlc$ClassType$jl$1 =
      ("VXaXq6CqWYuDvU5lz6d2nOytikU+XQzLWopnfZ4msJOEscPpQ9kICKtMq5iB" +
       "IjOp3fUguKs+FmxYpfJoanE1NJ7W3BRSuF0YgIuCrp/3ZumQsHRKIwg4djB2" +
       "6MGnDSnW1gnFsbFto4R3AgGc8M5JIuipSu29ea0sJWiuY0tsZq50aorCQ+2I" +
       "5CzZLRaLy1/mf+r23/eXrrGBB089zoF76ZCuf7B3bxfOuP6evQ34f+S2fOmR" +
       "cMYj8cHRJWbzI+/0NuMar/nWX3jzm/b+747v3gYZyWr0nirNvhQ5jRM9Aupp" +
       "AOmTT0DaXt+jPIwXfnv73d/YfNb663dHTz0I9b3lWcvjk157PMD33sKp6iJR" +
       "Hgvz/dDjgaA/d1O5I942/O6jgaCHgYl3igJdpvzObfmvnmTbw8Dr3SvVdy+f" +
       "s0u2uIKO3yU8e32o4YMdvXnFcO/BK4Z7D5FyHyflRZDAx53v3Zbf+f8j5TLl" +
       "27fl33lnUu7chM9vROqSN+9CxTXLq9FThm2/bfinSQP7CVpeuMx+FaRXgDR+" +
       "+bZ85R1oeTJ2dmXxZy7ZvnucxA/eQvrkbfny/9NufeAhnX/xXej82Uv2RjV6" +
       "1sgyJ7HfcYteuo/N/bIaffmtryl+7JW8Nsogr9PK+VxWBA1ofOXCqVeAQt8L" +
       "kqD63Odf+elXfuIn5Vfe+PyDpxdvy4871ei5WwgP+TG6v+WPoXLp/ctZ9i5U" +
       "/vy79P21S/aVavT8fRQv30MH9P+B5F4eMnz0Lc/xbh6NWb/0zRee/8g3D//2" +
       "+srlwcOuZ/nR824dRY9G7R+pP5sVjhtc13/2JoZ/w4yvg5240ZvL1zeytwmN" +
       "3jwi6P4PDaXFPSYoAAA=");
}

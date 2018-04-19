package tinder;

public class NodeChuck {
    public jif.lang.Principal user;
    public int distance;
    public NodeChuck next;
    
    public NodeChuck tinder$NodeChuck$(final jif.lang.Principal user,
                                       final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeChuck node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeChuck n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeChuck append(final NodeChuck a, final NodeChuck b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1524128073000L;
    public static final String jlc$ClassType$jif =
      ("H4sIAAAAAAAAAK1aC3QV1bne55AHQSThHSDACUQQkBzxgbWRhxxEgkdJSbA1" +
       "FI6TOfskQ+bMTGbmJCdYWr13tdhqWV1cEFgqV7u09UHF3lsrq4p19QVC22Vb" +
       "W+jDx+rjXm9tFO29t3W11u7/33vek5jm3qx19p7s2f+//8f3///eM3N0iFRa" +
       "Jpm7Uyk024MGtZo3KYU2ybRovk1XBzvYUE5+98Hv5w/dYryaJFWdZLxibdUs" +
       "qUCzpEYq2T26qdiDNqnL7pT6pXTJVtR0VrHsliy5QNY1yzYlRbOtPvJJksiS" +
       "OoWNSJqtSDbNbzD1ok0aswZbqFvV7TQt22lDMqViGkVJt2VUybIYpyocdZiM" +
       "N0y9X8lT0ybzs0xwMVuVuqiabhP3svBfS9kkKYe90I8rh5y5dgeWpfcf3FH3" +
       "b+NIbSepVbR2W7IVOaNrNpOnk0ws0mIXNa1r83ma7ySTNUrz7dRUJFXZxSbq" +
       "WieZYindmmSXTGptoZau9sPEKVbJYCLCms5glkzkJinJtm466lQVFKrmnf8q" +
       "C6rUbdlkhmcWrt4GGGe2mMDMSc2CJFOHpKJX0fJgixCFq2PTDWwCI60uUuYv" +
       "d6kKTWIDZAr3nCpp3el221S0bja1Ui/ZYODZwzJtAUdIcq/UTXM2qQ/Pa+O3" +
       "2KwaNASQ2GR6eBpyYl6aHfKSzz9DN12z9zZto5ZEmfNUVkH+8YxoXohoCy1Q" +
       "k2oy5YQTl2bvkWacuDNJCJs8PTSZz3n6E2+vvWTe86f4nDkxczZ37aSynZMf" +
       "6pr0o4bMkqvHcQjqlgLOD2iO4G8Td1rKBgusGS5HuNns3Hx+y/duuf0x+kaS" +
       "TGglVbKulooMR5NlvWgoKjWvpxo1IURaSQ3V8hm830qq2XVW0Sgf3VwoWNRu" +
       "JRUqDlXp+D8zUYGxABNVs2tFK+jOtSHZPXhdNggh1exHZrLfOPa7WPT1Nmmw" +
       "THk5RhUDDTXTN+l5mukpyb3NbNCwSSbdoxdpuljS0t2KnW7XC/aAZNJ2lhHs" +
       "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" +
       "dh7enK1+/2PuFyOxkYrJvO7vOt7+zJcuAAA=");
    
    public NodeChuck() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524128073000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJV6W8zj2HmYZnZ3dr1eey+tL3HWm4k9NmwzHt5FKps0oSiJ" +
       "IsWrKFIUnWTLq0TxKt7JdAunRWq3AZxe1m4KNA4QOEASODFQIOhDayAvaRMk" +
       "KNCi6AVomjwUaIvUBfLQ9qVtSun/Z/6Z2dltK4DnHJ5zvu9893MOP337e6Pn" +
       "inx0N0ujbh+l5f2yy7zivmzlhefSkVUUm6HjLefrAPjO3/2pV/7BM6OXzdHL" +
       "QaKWVhk4dJqUXluao5diL7a9vKBc13PN0auJ57mqlwdWFPTDxDQxR68VwT6x" +
       "yir3irVXpFF9nvhaUWVeflnzQSc/eslJk6LMK6dM86IcvcIfrdoCqzKIQD4o" +
       "yjf50R0/8CK3OI3+8ugWP3rOj6z9MPGj/AMuwAtGcHHuH6a/GAxk5r7leA9A" +
       "ng2DxC1HP/AkxEOO762GCQPo87FXHtKHSz2bWEPH6LUrkiIr2YNqmQfJfpj6" +
       "XFoNq5SjT7wn0mHSC5nlhNbee6scffzJefLV0DDrAxexnEHK0UeenHbB1Oaj" +
       "Tzyhs0e09T3xR77208kyuX2h2fWc6Ez/cwPQG08ArT3fy73E8a4AX/oC/w3r" +
       "o9/96u3RaJj8kScmX835h3/pT3/8h9747d+9mvP9T5kj2UfPKd9yvmV/+J+/" +
       "Tn9+8syZjBeytAjOpvAY5xetytcjb7bZYIsffYjxPHj/weBvr//J7su/7v3J" +
       "7dGL7OiOk0ZVPFjVq04aZ0Hk5YyXeLlVei47+oCXuPRlnB09P7T5IPGueiXf" +
       "L7ySHT0bXbrupJf3QUT+gOIsomeHdpD46YN2ZpWHS7vNRqPR88Mz+tjwPDM8" +
       "n7uuP16OXi9y54vHwAfLwWi8HBRT16MPlRPeHzqzckSDhzT2wLhKwH1Qgmrq" +
       "l42Ve6rle2Wnek6VB2UHk+D7oWnPZHyouXVrkNDrT3prNJj2Mo0GoLecd6rp" +
       "/E9/863fv/3QXq8ZGDzpCvH9h4hHt25dEP75szlfiXsQVjg44eBnL31e/Unu" +
       "L371UwOTbdY8O7B6nnrvSau78VV2aFmDKb3lvPyV//Tfv/ONt9Mb+ytH997l" +
       "Fu+GPJv1p55kLk8dzx3Cxg36L9y1fuut77597/ZZRx8YokVpDfocXO+NJ9d4" +
       "zLzffBAqzgK5zY8+6Kd5bEXnoQf+/WJ5yNPmpuci9Q9e2h/+s+F3a3j+9/k5" +
       "W8K541wP8YC+tsK7D80wy640dpbuExxdwtKPqtkv/pt/9p/R22dKHkSwlx8J" +
       "dapXvvmI15yRvXTxj1dvlLXJPW+Y94e/IP+dr3/vK1+6aGqY8emnLXjvXJ7p" +
       "tAb60vxnf/f0b//o33/rX96+0W45upNVdhQ4F8oHox599mapwaGiwakHSop7" +
       "WhKnbuAHlh15Z0v5ny9/Bv6t//K1V67UHQ09V8LLRz/0f0dw0/9909GXf/+n" +
       "/scbFzS3nHNAvxHHzbSrKPHnbjBTeW51Zzran/kXn/x7/9T6xSHeDD5eBL13" +
       "cdvRhb3RhSvgosvPXsovPDH2xXPx/e1l7COX/jvFuyPm4rz13NiiCX7773+C" +
       "/gt/ciH6xhbPOD7RvttVdesRN0F+Pf5vtz9153duj543R69cdj0rKXUrqs5a" +
       "NYd9q6CvO/nRhx4bf3wPugq4bz70tdef9INHln3SC25CxNA+zz63n3/U8AdB" +
       "vHAW0meH5yyV9XWNnUdfyc7lq+2t0aWBXkDeOBefegh9a3QdPM9Q6HX9xUeg" +
       "y9GzVTEcH84vrw2sDfHu/pmxwfmDxAkyK7rypXMJPk7UveF57qzB6/onnkLU" +
       "D78vUWeoL13X2mNEveAGVzJ7ihkMlMWDY9bXG6f31Xf+xp/d/9o7tx85XXz6" +
       "XRv8ozBXJ4yLnF+8+Fs7rPKD77fKBWLxH7/z9j/61be/crX7vvb4XjlPqvg3" +
       "/tX/+oP7v/DHv/eU+P/McA56T0GetXtneH7puv6Zpwhy8b6CPEN9+bruH9du" +
       "MpwSLys/svwV07eGsPMceh+/D53fV1cLXMofPBf3Ln74zLn5mSE+FZdj5wDh" +
       "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" +
       "emVS57J+Hy4uxakcPWO57lNTAnUauE/w");
    public static final String jlc$ClassType$jl$1 =
      ("8vIZ+v7w3B0k9u+u6+++By9P5lMuIv7MuZDax1n88DWmf3xdf+f/SVsfuuHz" +
       "r74Pnz97Lt4uR3esLPMS9z1V9OoDah7U5ejH3p1h/+G7p8oqglOVlt7nsjyo" +
       "h867Z0ndHRz6XpAE5ec+f/en737pJ9W7b3/+YTr+qfK4VY6ev8ZwI4/RA5U/" +
       "Rsp59K9n2ftw+fPvM/a3zsVXytELD0g8v/ft4P8PLfec3P74u/6OdfWnIec3" +
       "v/nyCx/7pvavL/98ePjHnjv86AW/iqJHM7mPtO9kuecHl/XvXOV1r4Tx9UET" +
       "V35zfvtG9pR02VViuf0/HMG4ByYmAAA=");
}

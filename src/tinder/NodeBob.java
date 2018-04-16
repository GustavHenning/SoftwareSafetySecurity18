package tinder;

public class NodeBob {
    public jif.lang.Principal user;
    public int distance;
    public NodeBob next;
    
    public NodeBob tinder$NodeBob$(final jif.lang.Principal user,
                                   final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeBob node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeBob n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeBob append(final NodeBob a, final NodeBob b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1523885572000L;
    public static final String jlc$ClassType$jif =
      ("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");
    
    public NodeBob() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523885572000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJV6Xezs2H3Q3Lu7dzebzX7BJmmabG+TmyiJm2vPeDwedwnF" +
       "9tie8dhjjz1je1zaxd/jb4+/7bJQQGUDldJCd0OLaMRDkEoVUgmp4gFV6gvQ" +
       "qlUlECrwAO0DEqCShz4AL0DxzP9/7//eu3cXGMnnHJ9zfr/z+z5nzs/f/f7o" +
       "uSIf3c3SqPOitLxfdplT3BeNvHBsMjKKYjd0vG29D4Dv/Z2ffPUfPzN6RR+9" +
       "4idyaZS+RaZJ6bSlPnopdmLTyQvcth1bH72WOI4tO7lvRH4/TEwTffR64XuJ" +
       "UVa5U0hOkUb1eeLrRZU5+WXNB53c6CUrTYoyr6wyzYty9CoXGLUBVqUfgZxf" +
       "lG9xozuu70R2cRr9pdEtbvScGxneMPGT3AMuwAtGkD73D9Nf9Acyc9ewnAcg" +
       "z4Z+YpejH3oS4iHH99bDhAH0+dgpj+nDpZ5NjKFj9PoVSZGReKBc5n7iDVOf" +
       "S6thlXL0mQ9FOkx6ITOs0PCct8vRp5+cJ14NDbM+dhHLGaQcvfHktAumNh99" +
       "5gmdPaKt72/+zDd/Klkmty80244Vnel/bgB68wkgyXGd3Eks5wrwpa9y3zI+" +
       "+RvfuD0aDZPfeGLy1Zx/8hf/+M/9yJu/+VtXc37wKXMEM3Cs8m3rO+bL//Kz" +
       "5FewZ85kvJClhX82hcc4v2hVvB55q80GW/zkQ4znwfsPBn9T+ueHn/5V549u" +
       "j15cje5YaVTFg1W9ZqVx5kdOzjiJkxulY69GH3MSm7yMr0bPD23OT5yrXsF1" +
       "C6dcjZ6NLl130sv7ICJ3QHEW0bND20/c9EE7M8rjpd1mo9Ho+eEZvTE8zwzP" +
       "l67rTw8aL3Lra4HvguVgNE4OblLbIVLz/tCVlaM9aLgFGJbH+4UDHtPYAT3w" +
       "CHpHJ0kGwwE9vwTl1C0bI3dkw3XKTnasKvfLbjwHPxxxeybrE82tW4PEPvuk" +
       "90aDqS/TaAB523qvIqg//t7bv3P7of1eM1SOXr5Ce/8a7ejWrQu6P3027ivh" +
       "D6ILB5ccvO6lr8g/wf6Fb3x+YLnNmmcHxs9T7z1pgzeeuxpaxmBYb1uvvPuf" +
       "//uvfeud9MYay9G9DzjJByHPRv75J1nLU8uxhyByg/6rd41ff/s33rl3+6yx" +
       "jw2xozQG7Q6O+OaTazxm7G89CBxncdzmRh930zw2ovPQA29/sTzmaXPTc5H5" +
       "xy/tl/9k+N0anv99fs52ce4410N0IK9t8u5Do8yyK32dpfsER5cg9XU5++V/" +
       "+3v/Bb59puRBPHvlkcAnO+Vbj/jQGdlLF2957UZZu9xxhnn//hfFX3j/++/+" +
       "+EVTw4wvPG3Be+fyTKcx0JfmP/Nbp3/3B//hO//69o12y9GdrDIj37pQ/tkB" +
       "0ZdulhrcKxpcfKCkuLdP4tT2Xd8wI+dsKf/zlS+Of/2/fvPVK3VHQ8+V8PLR" +
       "j/zfEdz0/wAx+unf+cn/8eYFzS3rHN5vxHEz7Spm/KkbzHieG92Zjvav/KvP" +
       "/dK/MH55iD6Dxxd+71yceHRhb3ThCrjo8kuX8qtPjH3tXPxgexl749J/p/hg" +
       "/KTPG9GNLergd//eZ8g/+0cXom9s8YzjM+0HHVUxHnGTya/G/+325+/8s9uj" +
       "5/XRq5c90EhKxYiqs1b1YRcryOtObvSJx8Yf35Guwu9bD33ts0/6wSPLPukF" +
       "NwFiaJ9nn9vPP2r4gyBeOAvpC8Nzlgp/XU/Oo69m5/K19tbo0oAvIG+ei88/" +
       "hL41ug6lZ6jxdQ08Al2Onq2K4TBxfnl9YG2IdvfPjA3O7yeWnxnRlS+dS/Bx" +
       "ou4Oz3PDk17X6lOI+tGPJOoMpVzX4mNEvWD7VzJ7ihkMlMWDY9bX26jzjff+" +
       "5p/c/+Z7tx85a3zhA9v9ozBX542LnF+8+Fs7rPLDH7XKBYL+T7/2zj/9lXfe" +
       "vdqLX39856SSKv5Hv/+/fvf+L/7hbz8l+j8znIo+UpB3hufnr+v2KYKkP1KQ" +
       "Z6jmuj49rt1kODNeVn5k+Sumbw1h5zn4PnIfOr+vrxa4lD98Lu5d/PCZc/OL" +
       "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" +
       "eXV4hpdb6HUN/v8xcga5f11/+cMZuXWV");
    public static final String jlc$ClassType$jl$1 =
      ("aL0yqHNZfwQPl+JUjp4xbPupiYI69e0neHnlDP3lq2zO7e9d1+9/CC9PZlku" +
       "Av7iuRDax1l8+RrTe9f1u/9PuvrEDZ9/7SP4/Jlz8U45umNkmZPYH6qi1x5Q" +
       "86AuRz/2wbz7j949VUbhn6q0dL6c5X49dN49S+ru4M73/MQvv/yVuz9198d/" +
       "Qr77zlceJumfKo9b5ej5aww38hg9UPljpJxH/0aWfQSXP/cRY3/rXLxbjl54" +
       "QOL5vW+H5a/t9pzw/vQHPti6+qzI+t63X3nhU9/e/5vL1xAPP/25w41ecKso" +
       "ejS7+0j7TpY7rn9Z/c5VrvdKFO8PerjymfPbt7KnpNCuks3t/wEKpTFcSCYA" + "AA==");
}

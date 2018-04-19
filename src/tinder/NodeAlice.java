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
    public static final long jlc$SourceLastModified$jif = 1524128073000L;
    public static final String jlc$ClassType$jif =
      ("H4sIAAAAAAAAAK1aDZAUxRXu3ftH4I7j74ADluOA8OOt+IOaExEWEHD1Lhxo" +
       "PJRlbnb2GJidGWZm7/YwRJNUgtGEVBlQJHoJVVpRQ9BYsUxETcokgvEnMZpo" +
       "JBrLVCUmeoliYmIlavq97vnrnVvPS65qu+d6+r1+P997/XpmjgyRKtsiM3eo" +
       "uTZnwFTstg1qrlOybCXbaWgDm+hQRn7v8FPZg1eav4+T6m5Sq9qbdVvKKWlS" +
       "JxWc7YalOgMOaUjvkPqkZMFRtWRatZ32NDlNNnTbsSRVd+xd5LMkliYNKh2R" +
       "dEeVHCW71jLyDpmTNulCvZrhJJWikzQlS8onUZRkZ0qTbJtyqsZRl0mtaRl9" +
       "alaxHDI7TQXnszWpR9GSnfxeGv5rL1ok4bLn+jHlkDPT7sDi5P5btjbcX0Hq" +
       "u0m9qnc5kqPKKUN3qDzdZGxeyfcolr0ym1Wy3WSCrijZLsVSJU3dTScaejdp" +
       "tNVeXXIKlmJvVGxD64OJjXbBpCLCmu5gmoxlJinIjmG56lTnVEXLuv9V5TSp" +
       "13bIFN8sTL21ME5tMYaaU7Fykqy4JJU7VT0LthAoPB1bL6ETKGlNXqH+8paq" +
       "1CU6QBqZ5zRJ7012OZaq99KpVUbBAQNPH5ZpOzhCkndKvUrGIU3ivE52i86q" +
       "Q0MAiUMmi9OQE/XSdMFLAf8MXXbBvmv0dXocZc4qsgby11KiWQLRRiWnWIou" +
       "K4xw7KL0zdKUR66PE0InTxYmszkPfubti5bM+vEJNmdGxJyOnh2K7GTkO3rG" +
       "P9ucWnh+BYOgYavg/JDmCP5Ofqe9aNLAmuJxhJtt7s0fb3z8yuvuUd6IkzHr" +
       "SbVsaIU8xdEE2cibqqZYFyu6YkGIrCd1ip5N4f31pIZep1VdYaMduZytOOtJ" +
       "pYZD1Qb+T02UoyzARDX0WtVzhnttSs52vC6ahJAa+iNT6K+C/hbwvskhzbYl" +
       "n45RRUGjWMnLjKyyUlNlpY0Omg5JJbcbeSWZL+jJXtVJdhk5p1+ylC6aEZyB" +
       "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" +
       "gq9cYjtu7UjXfPjp8l+eYDJv+C9gJh434y4AAA==");
    
    public NodeAlice() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524128073000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJV6a8zs6HnQnLO7ZzebTfYCuTTdbE+Tk5DEyfHM2B7bXUI6" +
       "47HHY3t8n7FnQrv4OuP7/VoWAqgktFJaYBOKRCMhBVGqkEpIFT9Kpf4ptGqF" +
       "BEJchEr7AwlQyY/+AP4AxTPfd853ztmzC4z0Xvxenve5v4/9zPd+MHquyEd3" +
       "0yTsjmFS3i+71Cnui0ZeODYRGkWhDgNvWd8CwHf+1k++8o+eGb18GL3sxUpp" +
       "lJ5FJHHptOVh9FLkRKaTF3PbduzD6NXYcWzFyT0j9PphYRIfRq8V3jE2yip3" +
       "CtkpkrA+L3ytqFInv5z5YJAbvWQlcVHmlVUmeVGOXuF8ozbAqvRCkPOK8k1u" +
       "dMf1nNAustFfGN3iRs+5oXEcFn6Ue0AFeIEIUufxYfmL3oBm7hqW82DLs4EX" +
       "2+XoR57c8ZDie+ywYNj6fOSUp+ThUc/GxjAweu0KpdCIj6BS5l58HJY+l1TD" +
       "KeXoE+8JdFj0QmpYgXF03ipHH39ynXg1Naz6wIUt5y3l6CNPLrtAavPRJ56Q" +
       "2SPS+gH/p7/5UzEd377gbDtWeMb/uWHTG09skh3XyZ3Ycq42vvQF7tvGR3/9" +
       "G7dHo2HxR55YfLXmH//5P/rxL77xG791teaHn7JGMH3HKt+yvmt++F+8Tnwe" +
       "f+aMxgtpUnhnVXiM8otUxeuZN9t00MWPPoR4nrz/YPI35H+6/9ovO394e/Ti" +
       "enTHSsIqGrTqVSuJUi908pUTO7lROvZ69AEntonL/Hr0/NDnvNi5GhVct3DK" +
       "9ejZ8DJ0J7k8DyxyBxBnFj079L3YTR70U6M8XfptOhqNnh/K6KNDeWYof+q6" +
       "/Xg5er3IrS/5nguWg9I4OcgntjMPPcu5Pwym5YgAT0nkgFEVg0evBJXELRsj" +
       "dxTDdcpOcawq98pugoHvB6Y9o/Gh5tatgUOvP2mt4aDadBIOm96y3qkW5B99" +
       "/63fuf1QX68JGCzpCvD9h4BHt25dAP7JszpfsXtgVjAY4WBnL31e+Qnmz33j" +
       "UwORbdo8O5B6XnrvSa27sdX10DMGVXrLevnr//m//8q3305u9K8c3XuXWbx7" +
       "51mtP/UkcXliOfbgNm7Af+Gu8atv/frb926fZfSBwVuUxiDPwfTeePKMx9T7" +
       "zQeu4syQ29zog26SR0Z4nnpg3y+WpzxpbkYuXP/gpf/hPx5+t4byv8/lrAnn" +
       "gXM7+APiWgvvPlTDNL2S2Jm7T1B0cUtfVtJf/Lf//L9At8+YPPBgLz/i6hSn" +
       "fPMRqzkDe+liH6/eCEvNHWdY93u/IP7Nb/3g61+9SGpY8emnHXjvXJ/xNAb8" +
       "kvynfyv7d7//H777r27fSLcc3Ukrc9CLC+aDUo8+e3PUYFDhYNQDJsW9bRwl" +
       "tud6hhk6Z035ny9/ZvKr//Wbr1yJOxxGrpiXj774fwdwM/5Di9HXfucn/8cb" +
       "FzC3rLNDv2HHzbIrL/EnbiDP89zozni0f+lffvJv/zPjFwd/M9h44fXOxWxH" +
       "F/JGF6qAiyw/e6m/8MTcl87VD7eXuY9cxu8U7/aY1PnqudHFA/i9v/MJ4s/8" +
       "4QXpG108w/hE+25T3RmPmMn0l6P/dvtTd37z9uj5w+iVy61nxOXOCKuzVA/D" +
       "vVUQ14Pc6EOPzT9+B1053Dcf2trrT9rBI8c+aQU3LmLon1ef+88/qvgDI144" +
       "M+mzQzlzRbpuofPsK+m5frW9Nbp0oMuWN87Vpx7uvjW6dp7nXdPr9ouP7C5H" +
       "z1bFED6cH14bSBv83f0zYYPxe7HlpUZ4ZUvnGnwcqXtDee4sx+v2q09B6sfe" +
       "F6nzrsN1qz6G1Au2d8Wzp6jBgFk0GGZ9fXE633jnZ/74/jffuf1IdPHpd13w" +
       "j+65ijAufH7xYm/tcMqPvt8plx3Uf/qVt3/tl97++tXt+9rjdyUZV9E//Nf/" +
       "63fv/8If/PZT/P8zQxz0now8S/fOUL5z3X7tKYyk3peR511/8brtHpduPESJ" +
       "l5MfOf6K6FuD23kOuo/cH5+f2asDLvWPnqt7Fzt85tz9zOCfikvYOexwvdgI" +
       "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" +
       "Sp3r+n2ouFRZOXrGsO2npgXqxLOfoOXl");
    public static final String jlc$ClassType$jl$1 =
      ("8+77Q7k7cOzfX7f/5D1oeTKncmHxZ86V0D5O4oevIf3adfv9/ydpfeiGzr/y" +
       "PnT+9Ll6uxzdMdLUie33FNGrD7B50Jajr7w7y/5jd7PKKLysSkrnc2nu1cPg" +
       "3TOn7g4Gfc+LvfJzn7/7U3e/+hPK3bc//zAl/1R+3CpHz19DuOHH6IHIH0Pl" +
       "PPvX0vR9qPy595n76+fq6+XohQconp/7drD/h5p7TnB//F1/ybr645D1/e+8" +
       "/MLHvrP9N5d/Pzz8c88dbvSCW4Xho9ncR/p30txxvcv5d65yu1fM+NYgiSu7" +
       "OT99O31Kyuwqudz+HzXoefMqJgAA");
}

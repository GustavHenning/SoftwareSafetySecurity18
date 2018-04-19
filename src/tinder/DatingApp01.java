package tinder;

public class DatingApp01 {
    private double aX;
    private double aY;
    private String aP;
    private double maxDistAlice;
    private double bX;
    private double bY;
    private String bP;
    private double maxDistBob;
    private double cX;
    private double cY;
    private String cP;
    private double maxDistChuck;
    private NodeAlice aliceLikes;
    private NodeBob bobLikes;
    private NodeChuck chuckLikes;
    
    public void updateAlice(final double x, final double y, final String Phone,
                            final double maxDistAlice) {
        this.aX = x;
        this.aY = y;
        this.aP = Phone;
        this.maxDistAlice = maxDistAlice;
    }
    
    public void updateBob(final double x, final double y, final String Phone,
                          final double maxDistBob) {
        this.bX = x;
        this.bY = y;
        this.bP = Phone;
        this.maxDistBob = maxDistBob;
    }
    
    public void updateChuck(final double x, final double y, final String Phone,
                            final double maxDistChuck) {
        this.cX = x;
        this.cY = y;
        this.cP = Phone;
        this.maxDistChuck = maxDistChuck;
    }
    
    public NodeAlice findAliceNeighbours() {
        NodeAlice na = null;
        int distanceBob = new Double((this.aX - this.bX) * (this.aX - this.bX) +
                                         (this.aY - this.bY) *
                                         (this.aY - this.bY)).intValue();
        int publicDistanceBob = distanceBob;
        if (publicDistanceBob <= this.maxDistAlice * this.maxDistAlice) {
            na =
              new NodeAlice().tinder$NodeAlice$(
                                jif.principals.Bob.getInstance(),
                                publicDistanceBob);
        }
        int distanceChuck = new Double((this.aX - this.cX) *
                                           (this.aX - this.cX) +
                                           (this.aY - this.cY) *
                                           (this.aY - this.cY)).intValue();
        int publicDistanceChuck = distanceChuck;
        if (publicDistanceChuck <= this.maxDistAlice * this.maxDistAlice) {
            NodeAlice toAdd =
              new NodeAlice().tinder$NodeAlice$(
                                jif.principals.Chuck.getInstance(),
                                publicDistanceChuck);
            na = NodeAlice.append(na, toAdd);
        }
        return na;
    }
    
    public void addAliceLike(final jif.lang.Principal user) {
        NodeAlice nodes = this.findAliceNeighbours();
        if (nodes == null) { return; }
        do  {
            if (nodes.user == user) {
                NodeAlice toAdd =
                  new NodeAlice().tinder$NodeAlice$(nodes.user, nodes.distance);
                this.aliceLikes = NodeAlice.append(this.aliceLikes, toAdd);
                return;
            }
            nodes = nodes.next;
        }while(nodes != null && nodes.next != null); 
    }
    
    private boolean isAliceInBobLikes() {
        NodeBob nodes = this.bobLikes;
        if (nodes == null) { return false; }
        while (nodes != null) {
            jif.lang.Principal user = nodes.user;
            if (user == jif.principals.Alice.getInstance()) {
                return true;
            } else {
                nodes = nodes.next;
            }
        }
        return false;
    }
    
    public boolean isAliceInChuckLikes() {
        NodeChuck nodes = this.chuckLikes;
        if (nodes == null) { return false; }
        while (nodes != null) {
            jif.lang.Principal user = nodes.user;
            if (user == jif.principals.Alice.getInstance()) {
                return true;
            } else {
                nodes = nodes.next;
            }
        }
        return false;
    }
    
    public String discloseNumberToAlice(final jif.lang.Principal user) {
        NodeAlice nodes = this.aliceLikes;
        while (nodes != null) {
            if (nodes.user == user) {
                if (user == jif.principals.Bob.getInstance()) {
                    if (this.isAliceInBobLikes()) { return this.bP; }
                } else
                    if (user == jif.principals.Chuck.getInstance()) {
                        if (this.isAliceInChuckLikes()) { return this.cP; }
                    }
            } else {
                nodes = nodes.next;
            }
        }
        return null;
    }
    
    public DatingApp01 tinder$DatingApp01$() {
        this.jif$init();
        {  }
        return this;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1524130761000L;
    public static final String jlc$ClassType$jif =
      ("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" +
       "vfgHCjy/UIDbUf3nNprtMsDtrt5A1YKh");
    public static final String jlc$ClassType$jif$1 =
      ("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" +
       "sH7/B50rvT51fAAA");
    
    public DatingApp01() { super(); }
    
    public void jif$invokeDefConstructor() { this.tinder$DatingApp01$(); }
    
    private void jif$init() {
        aliceLikes = null;
        bobLikes = null;
        chuckLikes = null;
    }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524130761000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK28Ccwsa3YY9L83M+/N8jxrZmyPx5Pn8ctoxmW/rrWrO2MH" +
       "d1V1VdfaXVVda0iGWruqa98XMyGJFGwR5BA8NnawLZEYKSROrIQkEIEjKyyO" +
       "cYTAsoAAxkEKEORYIoiwCIKp/u//7vbuu5OJ6HvrO9X1fec7y3e+c853b53+" +
       "+d+++0BT371ZFul0SYv27XYqg+btk1M3gU+mTtOclwdf9X4cWH39X/uDH//L" +
       "77v7mH33sThXW6eNPbLI22Bs7bs3siBzg7rZ+X7g23efyIPAV4M6dtJ4XgYW" +
       "uX33ySa+5E7b1UGjBE2R9reBn2y6Mqjvab7zULh7wyvypq07ry3qpr37uHB1" +
       "emfVtXG6EuKm/Ypw91oYB6nfVHd/6O4V4e4DYepcloGfEd6RYnU/44q+PV+G" +
       "fzhe2KxDxwveQXl/Eud+e/e7n8d4LPFb/DJgQX09C9qoeEzq/bmzPLj75COW" +
       "Uie/rNS2jvPLMvQDRbdQae8++56TLoM+WDpe4lyCr7Z33/b8uNOjrmXUh+7V" +
       "ckNp7z79/LD7mcb67rPPrdlTq/Xb0vf/6A/lh/zVe579wEtv/H9gQfr8c0hK" +
       "EAZ1kHvBI8Q3vkf4Ceczv/gjr97dLYM//dzgR2P+nX/+H/7g937+l/7WozHf" +
       "8YIxR/caeO1XvZ9zP/qff4788vZ9NzY+WBZNfDOFZyS/X9XTQ89XxnKxxc88" +
       "nvHW+fY7nb+k/MfWH/5zwW+9evdh9u41r0i7bLGqT3hFVsZpUDNBHtROG/js" +
       "3YeC3Cfv+9m715d7Ic6DR0+PYdgELXv3/vT+0WvF/fdFReEyxU1F71/u4zws" +
       "3rkvnTa6vx/Lu7u715fr7tuW6wPLBTzAz7Z3+1VUZMEq6/LVJW5XahG2g1MH" +
       "qhMG7aQGXlfH7QRtVk3tfd81DlftYltBvaKWnZFfdmUJQm8vj8v/vyYabxx/" +
       "y/DKK4syP/f8xk6XXXAo0gXtq97XO2L/D//iV3/11cem/SDrYuGPpn77qanv" +
       "XnnlfsrfdbP9R2uzaDZZduyyKd/4svoHuH/uR77wvsUoyuH9i15uQ9963kSf" +
       "bGx2uXMWu/uq97Ef/vv/+y/8xNeKJ8ba3r31rj30bszbHvjC8+LVhRf4i495" +
       "Mv33vOn81a/+4tfeevW2oB9aXEvrLIu/7NPPP0/jmb3wlXf8yk0lrwp3HwmL" +
       "OnPSW9c7zuDDbVQXw5Mn93r/yP39R39n+byyXP/v7bqZze3BDS6qJR9M9s3H" +
       "NluWj9bspt3nJLr3YT+glj/zX/2n/zPy6o2Td9zdx57yi2rQfuWpLXab7I37" +
       "zfSJJ4t1roNgGfcbP3n6sR//7R/+/fcrtYz47hcRfOvW3vh0Fv6K+o/9rerv" +
       "/OZ/93O//uqT1W3vXis7N429e84/t0z0xSeklt2XLh5g4aR5S8uzwo/D2HHT" +
       "4GYp/8/Hfg/0V//Bj3780XKny5NHyqvvvvcbT/Dk+bcTd3/4V//g//H5+2le" +
       "8W7e/4k6ngx75FI+9WTmXV07042P8Y/82nf+1C87P7M4p8UhNPEc3O/xu3vx" +
       "7u6lAu7X8ov37fc81/d9t+Y7xvu+T98//1TzbvdK3+LUE1u0Vz//058lf99v" +
       "3TP9xBZvc3x2fPdm1Z2ntgn857J/9OoXXvuPXr173b77+H2IdPJWd9Lutqr2" +
       "EuQa8uGhcPctz/Q/G7AeeeevPN5rn3t+HzxF9vld8MRJLPe30bf71582/EUR" +
       "H7op6QvL9dpy5Q9Qu/V+vLy1nxhfubu/Qe5RPn/ffteteesd23q9rON+2Rnj" +
       "40lfuU36wYfJzg9QfGrS9u5Vx3zBEpzqOFs2Rf8Q4YIf+fq/9Dtv/+jXX30q" +
       "Dfjud0Xip3EepQL3Mn743tbHhcp3vYzKPQb9P/3C1/69P/u1H34UJj/5bFDb" +
       "5132F/6Lf/y33/7Jv/srL/C+r/nFsreCRz7h1q7erdxbMPqTD3B8gXJ3j5R7" +
       "a9bv1uINa3iA5XNatG533/9S4rcp/soD/NdfQJx+KfHb9ace4I89R/x0P/yT" +
       "S9p3v2dvFvv2oxTrPRn63oeb//4B/o0XMCS+lKEb1i8+wL/2DENvZM5ILd5i" +
       "t3i64OV6+fxyfWSZ9NVH8O63X8CG8lI2blj/4AH+D8/qxTW/MfE3lqm+6wG+" +
       "8QLixkuJ37A+8gDf/xzxb2ARN+LfsqD94AMEXkD8n30p8RvW9zzA736O+Ol2" +
       "x78n8S8u1/LllcsD5F5A3Hkp8RsW+wCJZ4h/+GH1icL9xnvi4wv6v/wAmxcw" +
       "Eb6UiRtW/QCTZzXgfYO1vxH/xIL2Cw/wJ15APHkp8RvWjz/AH32O+D+BN/jk" +
       "gvZrD/Cvv4B4+VLiN6x/9wH+peeIf4O1v+38Ty1ov/MA/9sXEO9eSvyG9d88" +
       "wF9/4c4no85LXq4DdLk+fXf36voBfuQFbMwvZeOG9eEH+L5nTdC5eR4hToLm" +
       "sWd8yM2lwg8e+6X31M9nlim9B/iDL2Dsj7yUsRvWP/MAN88w9kG3cJ9h66NP" +
       "sfWwYd5TW9+6TPeTDzB7AVM/8lKmbljpAwye1ZZ3W6331NbjtXxg7NZ8bnxl" +
       "STg+gLyNvQ3evv+JFycl96vye5bQ3Nz/y8eCEca5kz7Kftu7b72m3lvvJPZ6" +
       "UDdL7vnWchZ73n7fobikEB99EuCEIr985Y//vX/lb/+J7/7NJR3g7j7Q3/K2" +
       "JW94KgpK3e2fWP7Fn//x7/zI1//uH79PxReduL+x/5Uv3Wa93/V/sr377I0T" +
       "tejqxWqcphXvc+fAvzFzz8LvfcTC/f0PtEsGXjwTWh+r5M27A9qwu3c+ou6T" +
       "dqSNrgH0Hsg0GTBRRaPumXB/clhSRImLUsYDb0gX/JgBw3wG/ZMPImPCUKzV" +
       "uJdLsourYsMLynY7jEKzSYRmT+80QwJG17PSKdiXOsvW60u9WZceHlRd7q+N" +
       "FPBwrFkjptlXy9/VAfCNDPdhPGzBicdqyk5Uhx+HNA5AU9TtyXKc9cnOiXV/" +
       "VgNzhnV76zIUBMCcC1VycD4WtK+XnJV7PS13cHU1Hd5U9Eoscw20pgFulQ2s" +
       "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" +
       "+fzsL45PpNN9a+K+rg+ofKRR6hKgFAHh");
    public static final String jlc$ClassType$jl$1 =
      ("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" +
       "fQ5REblg1gZuyWVXX1eonjGrzWYFXOUVsIPcthf7WNgWwsoEwDIcj74zXauK" +
       "cdcnTOGXA5BF9is9yNcwHx6u5WoCefTqb/keppMAajuJ7KetE0pSaLtMW0H5" +
       "fJ1XzXjCZiiirSYvyHyqFS2T9GY4nLMLtRKWk6C4UmeB58tihSEwhqRLwrRS" +
       "L1fu6PSZVB9Lz+0Dqo/FY56TJbwKaDA01lXbH6cxRvrtkrfZJaZlXn6cl/yC" +
       "CvNuveSQgLI9bHeoO1i4a1zn6rpT/TTYT47bw0kanMyVMpjeGl8RmN3kqX5e" +
       "nTQMKvoi5S50c7g9B+v+jEHhbre7pUD/xkPC9Kl3JUxvQU9SpvHJ+61fePx+" +
       "6/3nVtZyKyv89gf4qafeb32q2OjuVoTyne9VAXpfgPJzf/TrP+sf/03o1Yf6" +
       "kN/X3n2oLcrvS4M+SJ+a6iPLTL/7uZnE+6rXJ8VH/5b487/CfNH7V1+9e9/j" +
       "uqF3Fc8+i/SVZ6uFPlwHbVfn52dqhr79sey313rvSysXuV/9tx/gn3n6zeAn" +
       "qeZzart/Lfj1B5Q//QB/+nm1Paniev+91O9//Er39z9elu+/J/KXX1L19Vdu" +
       "zV9o7z7Slb7TPnr7+oVv1fZF/Kho+M8/K+JnluvNu7v3/dkH+Ke+ORFvKD/1" +
       "AH/sn17Ev/ESEX/p1vz1xVYeifjwJvdfe5Ewt/X64kLnjz3A7psT5obSPsD8" +
       "n16YX36JML9ya/7m4/V6/P73C8W5vZj+fcuu+6kHmH1z4txQ0gcYvrc4T7P3" +
       "n72k79duza8ujiRc9vK9oUlBfIncoqvvx/8LLxLh5jX2y/2vP8D/4JsT4Yby" +
       "Nx/gv//eIrzyUOB7+/7J9u6Ti3N79Ir6qY5zLy4fXov/Oy+R7jduza+3d284" +
       "/iPhbu/sv2hl7ksGoOXS7+4+/DMP8GWG9oJ6gRtK+wCz9xbraf7+3kv6/sdb" +
       "85vLmThu7llnc+LpUojnXMHrblGkgZO/aLng5bre3b3xyw/wZ7655bqh/PQD" +
       "/Il/Mrn+l5f0/a+35rcWi3ssF/m4muLW9fffS4Q/dHf30X/0AH/1mxPhhvKf" +
       "PMD/8Bta3O3rf30/6//1Ejn+71vzv7V3n/bjxkuLJnhUOXEuHhfL8M9Jgt89" +
       "NLeIy70D3yXJrXnzvQm/cveSvldvD//xotxH5ShvPVVY/9YTNT1h6f63Br74" +
       "jqrege2d/+7q8d/7ZtU5TVx1RRt86VFR9pu3+PPmLemI8345sFJB+FQF/Ze+" +
       "/OYPtVHcvP0CXr705a987cuP69FfsHT3n9eeZ+wm4mtl+RIFfPglfbdqxVeW" +
       "WPBt78Xxe/rsT7xbQz/5jTT0qLT4aRXF7U0lb/7+oHfSLz0puPohJ3O/9uYP" +
       "vJl3afrlr3zvm/fd75Q9vbDzSfnRs91/QH3zRVpdP6vV11+k1Y+/VKu/6yV9" +
       "n7k1H23vPviOkPdaHJdo+NSC38rjv+1dv/7y6DdKvL/4sx/74Lf+rPZf3v92" +
       "wuPfEXlNuPtguIj1dC34U/evlXUQxveivvaoMvxe7lc+29699sjgbt++o3xc" +
       "oPWkxOlRafr4/wEdvpLBlUYAAA==");
}
